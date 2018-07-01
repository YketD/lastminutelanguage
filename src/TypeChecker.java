import Model.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.LinkedHashMap;

/**
 * Created by yketd on 21-3-2017.
 */
public class TypeChecker extends LastMinuteBaseVisitor<Types>
{
    private int scopecount = 1;
    private LinkedHashMap<String, Function> funcmap = new LinkedHashMap<>();
    private ParseTreeProperty scopeTree, funcTree, expressionTree;
    private Scope scope, currentScope;

    public TypeChecker()
    {
        scope = new Scope("global");
        currentScope = scope;

        scopeTree = new ParseTreeProperty();
        funcTree = new ParseTreeProperty();
        expressionTree = new ParseTreeProperty();

        // Reserved functions
        Function reserved_Print = new Function("print");
        funcmap.put("print", reserved_Print);
        currentScope.declareFunction(reserved_Print);

        Function reserved_Rand = new Function("rand");
        reserved_Rand.setReturnType(Types.INT, -1);
        funcmap.put("rand", reserved_Rand);
        currentScope.declareFunction(reserved_Rand);
    }

    public ParseTreeProperty getScopeTree()
    {
        return scopeTree;
    }

    public ParseTreeProperty getFuncTree()
    {
        return funcTree;
    }

    public ParseTreeProperty getExpressionTree()
    {
        return expressionTree;
    }

    public Scope getScope()
    {
        return scope;
    }

    private void newScope(String scopeName, ParserRuleContext ctx)
    {
        Scope newScope = new Scope(scopeName, currentScope);
        currentScope.addChild(newScope);
        currentScope = newScope;
        scopeTree.put(ctx, currentScope);
    }

    private void newFuncScope(String funcName, Function func, ParserRuleContext ctx)
    {
        FuncScope newScope = new FuncScope(funcName, func, currentScope);
        currentScope.addChild(newScope);
        currentScope = newScope;
        scopeTree.put(ctx, currentScope);
    }

    private void closeScope(String scopeName)
    {
        currentScope = currentScope.getParentScope();
        currentScope.removeChild(scopeName);
    }

    @Override
    public Types visitCalcMore(LastMinuteParser.CalcMoreContext ctx) {
        scopeTree.put( ctx, currentScope);
        System.out.println("test to see it goes through in time");
        return super.visitCalcMore(ctx);
    }

    @Override
    public Types visitFuncdecl(LastMinuteParser.FuncdeclContext ctx)
    {
        scopeTree.put(ctx, currentScope);

        // Get function name
        String funcName = ctx.identifier().getText();

        if (currentScope.lookupFunction(funcName) != null)
        {
            throw new KeyAlreadyExistsException("Function " + funcName + " duplicate method entry");
        }

        Function func = new Function(funcName);

        // Check if has parameters
        if (ctx.params().children != null)
        {
            // Loop through parameters
            for (int i = 0; i < ctx.params().children.size(); i++)
            {
                String paramName = ctx.params().children.get(i).getText();

                for (int j = 0; j < ctx.params().children.size(); j++)
                {
                    if (func.hasParam(paramName))
                        throw new IllegalArgumentException("Function " + funcName + " duplicate parameter entry " + paramName);
                }

                // Only get identifier contexts, skipping the ',' separator chars
                if (ctx.params().children.get(i) instanceof LastMinuteParser.IdentifierContext)
                {
                    // Found one param
                    Symbol symbol = new Symbol(paramName, Types.UNASSIGNED);
                    func.addParam(symbol);
                    symbol.incCount();

                }
            }
        }

        currentScope.declareFunction(func);
        newFuncScope(funcName, func, ctx);

        funcmap.put(func.getName(), func);
        funcTree.put(ctx, func);

        for(LastMinuteParser.FuncbodyContext body : ctx.funcbody())
            visit(body);

        // Return statement
        Types returnType = Types.FUNCTION;
        int returnId = -1;
        func.setReturnType(returnType, returnId);

        if (ctx.funcreturn() != null)
        {
            if (ctx.funcreturn().returnVar != null)
            {
                if (ctx.funcreturn().returnVar.identifier() != null)
                {
                    Symbol retVar = currentScope.lookupVariable(ctx.funcreturn().returnVar.identifier().getText());
                    if (retVar == null)
                        throw new IllegalArgumentException("Function " + funcName + " contains non existing return variable");
                    else
                    {
                        Types type = retVar.getType();
                        if (type == Types.IDENTIFIER) type = Types.FLOAT;
                        func.setReturnType(type, retVar.getId());
                    }
                }
                else
                {
                    func.setReturnType(fromContext(ctx.funcreturn().returnVar), returnId);
                }
            }
        }

        closeScope(currentScope.getName());
        return null;
    }

    @Override
    public Types visitConditionalbody(LastMinuteParser.ConditionalbodyContext ctx)
    {
        visit(ctx.condition());

        String scopeName = "scope_" + scopecount++;
        newScope(scopeName, ctx);

        visit(ctx.body());

        closeScope(scopeName);

        return null;
    }

    @Override
    public Types visitVartrans(LastMinuteParser.VartransContext ctx)
    {
        scopeTree.put(ctx, currentScope);
        return super.visitVartrans(ctx);
    }

    @Override
    public Types visitIf_else(LastMinuteParser.If_elseContext ctx)
    {
        String scopeName = "scope_" + scopecount++;
        Scope childScope = new Scope(scopeName, currentScope);
        currentScope.addChild(childScope);
        currentScope = childScope;
        scopeTree.put(ctx, currentScope);

        // =========== If and elseifs
        for (int i = 0; i < ctx.conditionalbody().size(); i++)
        {
            String scopeName2 = "scope_" + scopecount++;
            Scope childScope2 = new Scope(scopeName2, currentScope);
            currentScope.addChild(childScope2);
            currentScope = childScope2;

            visit(ctx.conditionalbody().get(i));

            closeScope(childScope2.getName());
        }

        // =========== Else
        if (ctx.lastif != null)
        {
            String scopeName2 = "scope_" + scopecount++;
            Scope childScope2 = new Scope(scopeName2, currentScope);
            currentScope.addChild(childScope2);
            currentScope = childScope2;

            visit(ctx.lastif);

            closeScope(childScope2.getName());
        }

        closeScope(childScope.getName());
        return null;
    }

    @Override
    public Types visitIdentifier(LastMinuteParser.IdentifierContext ctx)
    {
        boolean lookupVar = currentScope.lookupVariable(ctx.getText()) != null;
        boolean lookupFunc = currentScope.lookupFunction(ctx.getText()) != null;

        System.out.println(ctx.getText() + " var " + lookupVar + " func " + lookupFunc);

        return super.visitIdentifier(ctx);
    }

    @Override
    public Types visitFunccall(LastMinuteParser.FunccallContext ctx)
    {
        scopeTree.put(ctx, currentScope);

        String funcName = ctx.identifier().getText();
        Function func = funcmap.get(funcName);

        if (funcName.equals("print") || funcName.equals("rand")){

            System.out.println("reserved function called");
            funcTree.put(ctx, func);
        }
        else
        {
            if (func == null) {
                System.err.println("calling function " + funcName + " that does not exist, exiting..");
                return null;
            } else if (ctx.extendedparams().varvalue().size() != func.getParams().size()) {
                System.err.println("calling function with the wrong amount of params");
                return null;
            }
            System.out.println("succesfully called function: " + func.getName());

        }

        if (func != null)
            funcTree.put(ctx, func);

        return super.visitFunccall(ctx);
    }

    @Override
    public Types visitSetVariable(LastMinuteParser.SetVariableContext ctx)
    {
        //getting the name of the variable
        String varName = ctx.identifier().getText();
        Types type = fromContext(ctx.varvalue());

        if (type == null){
            type = Types.FLOAT;
        }

            Symbol theSymbol = currentScope.lookupVariable(varName);

            System.out.println("[Name : Type] - [" + varName + " : " + type.toString() + "]");

            if (theSymbol != null)
            {
                theSymbol.setType(type);
            }
            else
            {
                theSymbol = new Symbol(varName, type);
                theSymbol.incCount();
            }

            currentScope.declareVariable(theSymbol);
            funcTree.put(ctx, theSymbol);
            scopeTree.put(ctx, currentScope);

        System.out.println("adding variable to: " + currentScope.getName() + "");
        return super.visitSetVariable(ctx);
    }

//    @Override
//    public Types visitValue(LastMinuteParser.ValueContext ctx)
//    {
//        if (ctx.identifier() != null){
//            //check if identifier exists & is of type int
//            Symbol test = currentScope.lookupVariable(ctx.identifier().getText());
//            if (test != null) {
//                if (test.getType() == Types.INT || test.getType() == Types.FLOAT) {
//                    System.out.println("identifier \"" + ctx.identifier().getText() + "\" is an " + test.getType() + ", thus valid");
//                } else {
//                    System.err.println("identifier \"" + ctx.identifier().getText() + "\" is not of type int, so calculation can not be executed");
//                }
//            }else {
//                System.out.println("Identifier \"" + ctx.identifier().getText()+  "\" didnt exist, skipping calculation");
//            }
//        }
//        return super.visitValue(ctx);
//    }




    @Override
    public Types visitCalcVal(LastMinuteParser.CalcValContext ctx) {
        if (ctx.identifier() != null){
            Types type = currentScope.lookupVariable(ctx.identifier().getText()).getType();
            if (type != Types.INT && type != Types.FLOAT){
                System.err.println("wrong type on identifier " + ctx.identifier().getText());
            }
        }
        return super.visitCalcVal(ctx);
    }

    @Override
    public Types visitWhileloop(LastMinuteParser.WhileloopContext ctx)
    {
        String scopeName = "whileScope" + scopecount;

        newScope(scopeName, ctx);
        scopecount++;

        scopeTree.put(ctx, currentScope);

        visit(ctx.conditionalbody().condition());
        visit(ctx.conditionalbody().body());

        closeScope(scopeName);

        return null;
    }

    @Override
    public Types visitForloop(LastMinuteParser.ForloopContext ctx)
    {
        //check if iterator var is an int
        if (((LastMinuteParser.SetVariableContext)ctx.vardecl()).varvalue().varvalnum() == null){
            System.err.println("vardecl in for loop is of wrong type, expecting int");
        }
        String scopeName = "forScope" + scopecount;

        newScope(scopeName, ctx);
        scopecount++;

        scopeTree.put(ctx, currentScope);

        visit(ctx.vardecl());
        visit(ctx.condition());
        visit(ctx.body());
        visit(ctx.varcalc());
        closeScope(scopeName);

        return null;
    }

    @Override
    public Types visitOperatorCondition(LastMinuteParser.OperatorConditionContext ctx)
    {
        scopeTree.put(ctx, currentScope);
        return super.visitOperatorCondition(ctx);
    }

    @Override
    public Types visitIncrementVariable(LastMinuteParser.IncrementVariableContext ctx)
    {
        scopeTree.put(ctx, currentScope);
        return super.visitIncrementVariable(ctx);
    }

    public Types fromContext(LastMinuteParser.VarvalueContext ctx)
    {
        Types type;
        if (ctx.varvalarray() != null)
            type = (Types.ARRAY);
        else if (ctx.varvalbool() != null)
            type = (Types.BOOL);
        else if (ctx.varvalchar() != null)
            type = (Types.CHAR);
        else if (ctx.varvalnum() != null)
            type = (Types.INT);
        else if (ctx.varvalstring() != null)
            type = (Types.STRING);
        else if (ctx.varvalfloat() != null)
            type = (Types.FLOAT);
        else if (ctx.funccall() != null)
            type = (Types.FUNCTION);
        else{type  = null;}
        return type;
    }


}
