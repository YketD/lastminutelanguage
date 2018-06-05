import Model.DataType;
import Model.Scope;
import Model.Types;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

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

        //Function func = new Function(funcName, DataType.fromSymbol(ctx.returnVar));

        // Check if has parameters
        if (ctx.params().children != null)
        {
            // Loop through parameters
            for (int i = 0; i < ctx.params().children.size(); i++)
            {
                // Only get identifier contexts, skipping the ',' separator chars
                if (ctx.params().children.get(i) instanceof LastMinuteParser.IdentifierContext)
                {
                    // Found one param
                    System.out.println("param " + i + " " + ctx.params().children.get(i).getText());
                }

                //func.addParam(param);
            }
        }

        return null;
    }

    @Override
    public Types visitSetVariable(LastMinuteParser.SetVariableContext ctx)
    {
        //getting the name of the variable
        String varname = ctx.identifier().getText();
        //DataType type = new DataType(ctx.varvalue());
            //TODO: Add error handling for invalid type
        //if (type != null) {
            //scope.declareVariable(varname, type.getType());
            //System.out.println("[Name : Type] - [" + varname + " : " + type.getType().toString() + "]");
        //}
        return super.visitSetVariable(ctx);
    }
}
