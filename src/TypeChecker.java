import Model.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.LinkedHashMap;

/**
 * Created by yketd on 21-3-2017.
 */
public class TypeChecker extends LastMinuteBaseVisitor<Types>
{

    private String globalScopeKey = "global";
    private int FUNC_COUNTER = 1;
    // global scope init
    private Scope scope= new Scope(null, globalScopeKey);

    private LinkedHashMap<String, Scope> scopemap= new LinkedHashMap<>();


    private ParseTreeProperty scopeTree, funcTree;

    private Scope currentScope;



    public TypeChecker()
    {
        //global scope


        scopemap.put(globalScopeKey, scope);
        currentScope = scope;
        System.out.println("global scope init");
        funcTree  = new ParseTreeProperty();
        scopemap.put(globalScopeKey, scope);
    }

    @Override
    public Types visitFuncdecl(LastMinuteParser.FuncdeclContext ctx)
    {

        currentScope = new Scope(scopemap.get("global"), ctx.identifier().getText());
        System.out.println("initializing scope: " + ctx.identifier().getText());
        scope = currentScope;
        scopemap.put(currentScope.getName(), currentScope);


        // Get function name
        String funcName = ctx.identifier().getText();

        if (scope.lookupFunction(funcName) == null)
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

            scope.declareFunction(func);
            funcTree.put(ctx, func);

        }
        else
        {
            throw new KeyAlreadyExistsException("Function " + funcName + " duplicate method entry");
        }

        return super.visitFuncdecl(ctx);
    }

//    @Override
//    public Types visitReturn



    @Override
    public Types visitFuncbody(LastMinuteParser.FuncbodyContext ctx){

//        currentScope = scopemap.get(globalScopeKey);
        return super.visitFuncbody(ctx);
    }

    @Override
    public Types visitFuncreturn(LastMinuteParser.FuncreturnContext ctx){

        currentScope = scopemap.get(globalScopeKey);
        return super.visitFuncreturn(ctx);
    }

    @Override
    public Types visitSetVariable(LastMinuteParser.SetVariableContext ctx) {
        //getting the name of the variable
        String varName = ctx.identifier().getText();
        //DataType type = new DataType(ctx.varvalue());
            //TODO: Add error handling for invalid type
        DataType type = new DataType(fromContext(ctx.varvalue()));
        //TODO: Add error handling for invalid type
        if (type.getType() != null) {
            scope.declareVariable(new Symbol(varName, type.getType()));
            System.out.println("[Name : Type] - [" + varName + " : " + type.getType().toString() + "]");
            Symbol symbol = new Symbol(varName, new DataType(fromContext(ctx.varvalue())).getType());
//            System.out.println(symbol.getType().toString());
            scope.declareVariable(new Symbol(varName, new DataType(fromContext(ctx.varvalue())).getType()));
        }
        System.out.println("adding variable to: " + currentScope.getName() + "");
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
