// Generated from C:/Users/yketd/Documents/lastminutelanguage\LastMinute.g4 by ANTLR 4.6
package nl.saxion.maryke.lastmin;
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
	 * Visit a parse tree produced by {@link LastMinuteParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(LastMinuteParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#funcdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl(LastMinuteParser.FuncdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(LastMinuteParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LastMinuteParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LastMinuteParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#lm_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLm_if(LastMinuteParser.Lm_ifContext ctx);
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
	 * Visit a parse tree produced by {@link LastMinuteParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculation(LastMinuteParser.CalculationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LastMinuteParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#lm_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLm_boolean(LastMinuteParser.Lm_booleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LastMinuteParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(LastMinuteParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(LastMinuteParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#subtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(LastMinuteParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(LastMinuteParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(LastMinuteParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(LastMinuteParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(LastMinuteParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#varvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarvalue(LastMinuteParser.VarvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#arrayval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayval(LastMinuteParser.ArrayvalContext ctx);
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
	 * Visit a parse tree produced by {@link LastMinuteParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LastMinuteParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(LastMinuteParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link LastMinuteParser#extendedparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedparams(LastMinuteParser.ExtendedparamsContext ctx);
}