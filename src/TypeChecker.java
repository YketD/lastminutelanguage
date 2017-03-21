import nl.saxion.maryke.lastmin.LastMinuteBaseVisitor;
import nl.saxion.maryke.lastmin.LastMinuteParser;

/**
 * Created by yketd on 21-3-2017.
 */
public class TypeChecker extends LastMinuteBaseVisitor<Types> {
    Scope currentScope;

    @Override
    public Types visitStatement(LastMinuteParser.StatementContext ctx) {
        currentScope = new Scope(null);
        return super.visitStatement(ctx);
    }

    @Override
    public Types visitCondition(LastMinuteParser.ConditionContext ctx) {
        System.out.println(ctx.getChildCount());
        System.out.println(ctx.getChild(0).getText());

        return super.visitCondition(ctx);
    }
}
