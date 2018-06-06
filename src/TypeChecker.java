import Model.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.LinkedHashMap;

/**
 * Created by yketd on 21-3-2017.
 */
public class TypeChecker extends LastMinuteBaseVisitor<Types>
{
    private int FUNC_COUNTER = 1;

    private Scope scope;


    private ParseTreeProperty scopeTree, funcTree;

    public TypeChecker()
    {
        scope = new Scope(null, "func_" + FUNC_COUNTER++);

        scopeTree = new ParseTreeProperty();
        funcTree  = new ParseTreeProperty();
    }

    @Override
    public Types visitFuncdecl(LastMinuteParser.FuncdeclContext ctx)
    {
        scopeTree.put(ctx, scope);

        // if (scope.lookFunctie(ctx.ID().getText()) == null)
        // if function does not exist

        // Get function name
        String funcName = ctx.identifier().getText();
        System.out.println("func " + funcName);

        Function func = new Function(funcName, fromContext(ctx.returnVar));

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
                    func.addParam(paramName);
                }
            }
        }

        return super.visitFuncdecl(ctx);
    }

    @Override
    public Types visitFuncbody(LastMinuteParser.FuncbodyContext ctx){

        return super.visitFuncbody(ctx);
    }

    @Override
    public Types visitSetVariable(LastMinuteParser.SetVariableContext ctx) {
        //getting the name of the variable
        String varname = ctx.identifier().getText();
        //DataType type = new DataType(ctx.varvalue());
            //TODO: Add error handling for invalid type
        DataType type = new DataType(fromContext(ctx.varvalue()));
        //TODO: Add error handling for invalid type
        if (type.getType() != null) {
            scope.declareVariable(varname, type);
            System.out.println("[Name : Type] - [" + varname + " : " + type.getType().toString() + "]");
            Symbol symbol = new Symbol(varname, new DataType(fromContext(ctx.varvalue())));
//            System.out.println(symbol.getType().toString());
            varTree.put(varname, symbol);
            scope.declareVariable(varname, new DataType(fromcontext(ctx.varvalue())));
        }
        return super.visitSetVariable(ctx);
    }

    @Override
    public Types visitValue(LastMinuteParser.ValueContext ctx){

        if (ctx.identifier() != null){
            //check if identifier exists & is of type int
            Symbol test = scope.lookupVariable(ctx.identifier().getText());
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
        return super.visitValue(ctx);
    }

    @Override
    public Types visitAddition(LastMinuteParser.AdditionContext ctx){
        scopeTree.put(ctx, scope);
        if (ctx.calculation() != null){

        }
//        if (!ctx.PLUS().isEmpty()){
//            //addition
//            System.out.println(ctx.PLUS().size() + " additions detected");
//        }
//        if (!ctx.MINUS().isEmpty()){
//            //subtraction
//            System.out.println(ctx.MINUS().size() + " subtractions detected");
//        }
        return super.visitAddition(ctx);
    }

//    public Symbol getSymbolByName(String symbolname){
//
//    }
    public Types fromContext(LastMinuteParser.VarvalueContext ctx){
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
