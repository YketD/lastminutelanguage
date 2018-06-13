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
    public Types visitFuncdecl(LastMinuteParser.FuncdeclContext ctx)
    {
        // Get function name
        String funcName = ctx.identifier().getText();

        if (currentScope.lookupFunction(funcName) == null)
        {
            Function func = new Function(funcName, fromContext(ctx.funcreturn().returnVar));

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
                        func.addParam(new Symbol(paramName, Types.UNASSIGNED));
                    }
                }
            }

            newFuncScope(funcName, func, ctx);

            currentScope.declareFunction(func);
            funcmap.put(func.getName(), func);
            funcTree.put(ctx, func);
        }
        else
        {
            throw new KeyAlreadyExistsException("Function " + funcName + " duplicate method entry");
        }

        for(LastMinuteParser.FuncbodyContext body : ctx.funcbody())
            visit(body);

        visit(ctx.funcreturn());

        String scopeName = currentScope.getName();
        closeScope(scopeName);

        return null;
    }

    @Override
    public Types visitWhileloop(LastMinuteParser.WhileloopContext ctx)
    {
        visit(ctx.conditionalbody());
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
    public Types visitIf_else(LastMinuteParser.If_elseContext ctx)
    {
        visit(ctx.conditionalbody());

        if (ctx.body() != null)
        {

            String scopeName = "scope_" + scopecount++;
            newScope(scopeName, ctx);

            visit(ctx.body());

            closeScope(scopeName);
        }

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
        if (ctx.identifier().getText().equals("print")){
            System.out.println("print function called");
        }else {
            Function func = funcmap.get(ctx.identifier().getText());
            if (func == null) {
                System.err.println("calling function " + ctx.identifier().getText() + " that does not exist, exiting..");
                return null;
            } else if (ctx.extendedparams().varvalue().size() != func.getParams().size()) {
                System.err.println("calling function with the wrong amount of params");
                return null;
            }
            System.out.println("succesfully called function: " + func.getName());
        }
        return super.visitFunccall(ctx);
    }

    @Override
    public Types visitSetVariable(LastMinuteParser.SetVariableContext ctx)
    {
        //getting the name of the variable
        String varName = ctx.identifier().getText();
        Types type = fromContext(ctx.varvalue());

        if (type != null)
        {
            Symbol existingVar = currentScope.lookupVariable(varName);
            if (existingVar != null)
            {
                existingVar.setType(type);
            }
            else
            {
                Symbol symb = new Symbol(varName, type);
                currentScope.declareVariable(symb);
                funcTree.put(ctx, symb);
                System.out.println("[Name : Type] - [" + varName + " : " + type.toString() + "]");
            }
        }
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
    public Types visitCalcVal(LastMinuteParser.CalcValContext ctx)
    {
        if (ctx.identifier() != null){
            //check if identifier exists & is of type int
            Symbol test = currentScope.lookupVariable(ctx.identifier().getText());
            if (test != null) {
                if (test.getType() == Types.INT || test.getType() == Types.FLOAT) {
                    System.out.println("identifier \"" + ctx.identifier().getText() + "\" is an " + test.getType() + ", thus valid");
                } else {
                    System.err.println("identifier \"" + ctx.identifier().getText() + "\" is not of type int, so calculation can not be executed");
                }
            }else {
                System.out.println("Identifier \"" + ctx.identifier().getText()+  "\" didnt exist, skipping calculation");
            }
        }
        return super.visitCalcVal(ctx);
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
        scopecount ++;

        visit(ctx.vardecl());
        visit(ctx.condition());
        visit(ctx.varcalc());
        visit(ctx.body());
        closeScope(scopeName);


        return null;
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
        else{type  = null;}
        return type;
    }


}
