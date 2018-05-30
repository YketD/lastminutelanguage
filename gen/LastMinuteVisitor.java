// Generated from D:/School exercises/lmlanguage/lastminutelanguage\LastMinute.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LastMinuteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LastMinuteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LastMinuteParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(LastMinuteParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementVariable}
	 * labeled alternative in {@link LastMinuteParser#varcalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementVariable(LastMinuteParser.IncrementVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransformVariable}
	 * labeled alternative in {@link LastMinuteParser#varcalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformVariable(LastMinuteParser.TransformVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link LastMinuteParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(LastMinuteParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#vartrans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartrans(LastMinuteParser.VartransContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#varvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarvalue(LastMinuteParser.VarvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#varvalnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarvalnum(LastMinuteParser.VarvalnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#varvalstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarvalstring(LastMinuteParser.VarvalstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#varvalchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarvalchar(LastMinuteParser.VarvalcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#varvalarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarvalarray(LastMinuteParser.VarvalarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#varvalbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarvalbool(LastMinuteParser.VarvalboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#funcdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl(LastMinuteParser.FuncdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LastMinuteParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#extendedparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedparams(LastMinuteParser.ExtendedparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(LastMinuteParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LastMinuteParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#conditionalbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalbody(LastMinuteParser.ConditionalbodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InverseCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseCondition(LastMinuteParser.InverseConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualCondition(LastMinuteParser.NotEqualConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareCondition(LastMinuteParser.CompareConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCondition(LastMinuteParser.OperatorConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(LastMinuteParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCondition(LastMinuteParser.BoolConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(LastMinuteParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LastMinuteParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(LastMinuteParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LastMinuteParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(LastMinuteParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(LastMinuteParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(LastMinuteParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LastMinuteParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculation(LastMinuteParser.CalculationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(LastMinuteParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(LastMinuteParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(LastMinuteParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LastMinuteParser.ValueContext ctx);
}