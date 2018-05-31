

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by yketd on 21-3-2017.
 */
public class TypeChecker extends LastMinuteBaseVisitor<Types> {
    Scope globalScope;
    Scope currentScope;



    @Override
    public Types visitFuncdecl(LastMinuteParser.FuncdeclContext ctx) {

        String funcName = "";
        ArrayList<String> params = new ArrayList<>();

        if (ctx.getChild(0) instanceof LastMinuteParser.IdentifierContext) {
            funcName = ctx.getChild(0).getText();
        } else {
            throw new IllegalArgumentException();
        }

        if (ctx.getChild(2) instanceof LastMinuteParser.ParamsContext) {
            if (ctx.getChild(2).getChildCount() > 0) {
                String param;
                for (int i = 0; i < ctx.getChild(2).getChildCount(); i++) {
                    param = ctx.getChild(2).getChild(i).getText();

                    if (!param.equals(","))
                        params.add(param);
                }
            }
        }

        if (currentScope == globalScope) {
            currentScope = new Scope(globalScope);
            System.out.println("Func name: " + funcName);
            System.out.println("Params: " + String.join(", ", params));
        } else {
            if (ctx.getChildCount() > 6) {
                if (ctx.getChild(6).getText().equals("return"))
                    currentScope = currentScope.getParentScope();
            }
        }

        return super.visitFuncdecl(ctx);
    }

    @Override
    public Types visitFunccall(LastMinuteParser.FunccallContext ctx) {
        String funcname = ctx.identifier().TEXT().toString();
        System.out.println(ctx.identifier().getText());
        if (funcname.equals("print")) {
            System.out.println("function print called");
//            if (params.size() < 1) params.add("");
//            System.out.println(String.format(params.get(0), params.toArray()));
        }
        System.out.println("funccall");

        return super.visitFunccall(ctx);
    }

    @Override
    public Types visitSetVariable(LastMinuteParser.SetVariableContext ctx) {
        String varname = ctx.identifier().getText();
        if (ctx.varvalue().varvalarray() != null)
            currentScope.declareVariable(varname, Types.ARRAY);
        else if (ctx.varvalue().varvalbool() != null)
            currentScope.declareVariable(varname, Types.BOOL);
        else if (ctx.varvalue().varvalchar() != null)
            currentScope.declareVariable(varname, Types.CHAR);
        else if (ctx.varvalue().varvalnum() != null)
            currentScope.declareVariable(varname, Types.INT);
        else if (ctx.varvalue().varvalstring() != null)
            currentScope.declareVariable(varname, Types.STRING);
        return super.visitSetVariable(ctx);
    }


    @Override
    public Types visitStatement(LastMinuteParser.StatementContext ctx) {
        globalScope = new Scope(null);
        currentScope = globalScope;
        return super.visitStatement(ctx);
    }


}
