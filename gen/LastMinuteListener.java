// Generated from D:/School Projects/lastminutelanguage\LastMinute.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LastMinuteParser}.
 */
public interface LastMinuteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LastMinuteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LastMinuteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link LastMinuteParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(LastMinuteParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link LastMinuteParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(LastMinuteParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#varvalue}.
	 * @param ctx the parse tree
	 */
	void enterVarvalue(LastMinuteParser.VarvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#varvalue}.
	 * @param ctx the parse tree
	 */
	void exitVarvalue(LastMinuteParser.VarvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#varvalnum}.
	 * @param ctx the parse tree
	 */
	void enterVarvalnum(LastMinuteParser.VarvalnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#varvalnum}.
	 * @param ctx the parse tree
	 */
	void exitVarvalnum(LastMinuteParser.VarvalnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#varvalstring}.
	 * @param ctx the parse tree
	 */
	void enterVarvalstring(LastMinuteParser.VarvalstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#varvalstring}.
	 * @param ctx the parse tree
	 */
	void exitVarvalstring(LastMinuteParser.VarvalstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#varvalchar}.
	 * @param ctx the parse tree
	 */
	void enterVarvalchar(LastMinuteParser.VarvalcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#varvalchar}.
	 * @param ctx the parse tree
	 */
	void exitVarvalchar(LastMinuteParser.VarvalcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#varvalarray}.
	 * @param ctx the parse tree
	 */
	void enterVarvalarray(LastMinuteParser.VarvalarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#varvalarray}.
	 * @param ctx the parse tree
	 */
	void exitVarvalarray(LastMinuteParser.VarvalarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#varvalbool}.
	 * @param ctx the parse tree
	 */
	void enterVarvalbool(LastMinuteParser.VarvalboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#varvalbool}.
	 * @param ctx the parse tree
	 */
	void exitVarvalbool(LastMinuteParser.VarvalboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#funcdecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecl(LastMinuteParser.FuncdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#funcdecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecl(LastMinuteParser.FuncdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LastMinuteParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LastMinuteParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#extendedparams}.
	 * @param ctx the parse tree
	 */
	void enterExtendedparams(LastMinuteParser.ExtendedparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#extendedparams}.
	 * @param ctx the parse tree
	 */
	void exitExtendedparams(LastMinuteParser.ExtendedparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(LastMinuteParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(LastMinuteParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LastMinuteParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LastMinuteParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#conditionalbody}.
	 * @param ctx the parse tree
	 */
	void enterConditionalbody(LastMinuteParser.ConditionalbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#conditionalbody}.
	 * @param ctx the parse tree
	 */
	void exitConditionalbody(LastMinuteParser.ConditionalbodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InverseCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterInverseCondition(LastMinuteParser.InverseConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InverseCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitInverseCondition(LastMinuteParser.InverseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualCondition(LastMinuteParser.NotEqualConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualCondition(LastMinuteParser.NotEqualConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCompareCondition(LastMinuteParser.CompareConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCompareCondition(LastMinuteParser.CompareConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCondition(LastMinuteParser.OperatorConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCondition(LastMinuteParser.OperatorConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(LastMinuteParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(LastMinuteParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBoolCondition(LastMinuteParser.BoolConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBoolCondition(LastMinuteParser.BoolConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(LastMinuteParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link LastMinuteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(LastMinuteParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LastMinuteParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LastMinuteParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(LastMinuteParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(LastMinuteParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(LastMinuteParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(LastMinuteParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(LastMinuteParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(LastMinuteParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(LastMinuteParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(LastMinuteParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(LastMinuteParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(LastMinuteParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LastMinuteParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LastMinuteParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(LastMinuteParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(LastMinuteParser.CalculationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(LastMinuteParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(LastMinuteParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(LastMinuteParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(LastMinuteParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(LastMinuteParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(LastMinuteParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LastMinuteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LastMinuteParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LastMinuteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LastMinuteParser.ValueContext ctx);
}