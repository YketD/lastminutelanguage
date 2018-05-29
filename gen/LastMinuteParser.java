// Generated from D:/School Projects/lastminutelanguage\LastMinute.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LastMinuteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERALBOOL=1, EQUALS=2, NOTEQUAL=3, GT=4, LT=5, GTE=6, LTE=7, AND=8, 
		OR=9, NOT=10, RETURN=11, FOR=12, WHILE=13, IF=14, ELSE=15, INT=16, TRUE=17, 
		FALSE=18, COMMA=19, QUOTE=20, SQUOTE=21, ENDL=22, MAKEEQUAL=23, OPENPAR=24, 
		CLOSEPAR=25, OPENBRACES=26, CLOSEBRACES=27, PLUS=28, MINUS=29, TIMES=30, 
		DIVIDE=31, MODULO=32, POWER=33, STRING=34, CHAR=35, TEXT=36, WS=37;
	public static final int
		RULE_statement = 0, RULE_vardecl = 1, RULE_varvalue = 2, RULE_varvalnum = 3, 
		RULE_varvalstring = 4, RULE_varvalchar = 5, RULE_varvalarray = 6, RULE_varvalbool = 7, 
		RULE_funcdecl = 8, RULE_params = 9, RULE_extendedparams = 10, RULE_funcbody = 11, 
		RULE_body = 12, RULE_conditionalbody = 13, RULE_condition = 14, RULE_operator = 15, 
		RULE_if_else = 16, RULE_loop = 17, RULE_whileloop = 18, RULE_forloop = 19, 
		RULE_funccall = 20, RULE_identifier = 21, RULE_calculation = 22, RULE_addition = 23, 
		RULE_multiplication = 24, RULE_power = 25, RULE_value = 26;
	public static final String[] ruleNames = {
		"statement", "vardecl", "varvalue", "varvalnum", "varvalstring", "varvalchar", 
		"varvalarray", "varvalbool", "funcdecl", "params", "extendedparams", "funcbody", 
		"body", "conditionalbody", "condition", "operator", "if_else", "loop", 
		"whileloop", "forloop", "funccall", "identifier", "calculation", "addition", 
		"multiplication", "power", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", 
		"'!'", "'return'", "'for'", "'while'", "'if'", "'else'", null, null, null, 
		"','", "'\"'", "'''", "';'", "':'", "'('", "')'", "'{'", "'}'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERALBOOL", "EQUALS", "NOTEQUAL", "GT", "LT", "GTE", "LTE", "AND", 
		"OR", "NOT", "RETURN", "FOR", "WHILE", "IF", "ELSE", "INT", "TRUE", "FALSE", 
		"COMMA", "QUOTE", "SQUOTE", "ENDL", "MAKEEQUAL", "OPENPAR", "CLOSEPAR", 
		"OPENBRACES", "CLOSEBRACES", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULO", 
		"POWER", "STRING", "CHAR", "TEXT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LastMinute.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LastMinuteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<FuncdeclContext> funcdecl() {
			return getRuleContexts(FuncdeclContext.class);
		}
		public FuncdeclContext funcdecl(int i) {
			return getRuleContext(FuncdeclContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					vardecl();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(60);
				funcdecl();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetVariableContext extends VardeclContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MAKEEQUAL() { return getToken(LastMinuteParser.MAKEEQUAL, 0); }
		public VarvalueContext varvalue() {
			return getRuleContext(VarvalueContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(LastMinuteParser.ENDL, 0); }
		public SetVariableContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterSetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitSetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vardecl);
		try {
			_localctx = new SetVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			identifier();
			setState(67);
			match(MAKEEQUAL);
			setState(68);
			varvalue();
			setState(69);
			match(ENDL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarvalueContext extends ParserRuleContext {
		public VarvalnumContext varvalnum() {
			return getRuleContext(VarvalnumContext.class,0);
		}
		public VarvalstringContext varvalstring() {
			return getRuleContext(VarvalstringContext.class,0);
		}
		public VarvalcharContext varvalchar() {
			return getRuleContext(VarvalcharContext.class,0);
		}
		public VarvalarrayContext varvalarray() {
			return getRuleContext(VarvalarrayContext.class,0);
		}
		public VarvalboolContext varvalbool() {
			return getRuleContext(VarvalboolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public VarvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterVarvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitVarvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalueContext varvalue() throws RecognitionException {
		VarvalueContext _localctx = new VarvalueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varvalue);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				varvalnum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				varvalstring();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				varvalchar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				varvalarray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				varvalbool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				calculation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarvalnumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LastMinuteParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(LastMinuteParser.MINUS, 0); }
		public VarvalnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterVarvalnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitVarvalnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalnumContext varvalnum() throws RecognitionException {
		VarvalnumContext _localctx = new VarvalnumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varvalnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(80);
				match(MINUS);
				}
			}

			setState(83);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarvalstringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LastMinuteParser.STRING, 0); }
		public VarvalstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterVarvalstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitVarvalstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalstringContext varvalstring() throws RecognitionException {
		VarvalstringContext _localctx = new VarvalstringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varvalstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarvalcharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(LastMinuteParser.CHAR, 0); }
		public VarvalcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterVarvalchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitVarvalchar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalcharContext varvalchar() throws RecognitionException {
		VarvalcharContext _localctx = new VarvalcharContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varvalchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarvalarrayContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LastMinuteParser.LT, 0); }
		public TerminalNode GT() { return getToken(LastMinuteParser.GT, 0); }
		public List<VarvalueContext> varvalue() {
			return getRuleContexts(VarvalueContext.class);
		}
		public VarvalueContext varvalue(int i) {
			return getRuleContext(VarvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LastMinuteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LastMinuteParser.COMMA, i);
		}
		public VarvalarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterVarvalarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitVarvalarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalarrayContext varvalarray() throws RecognitionException {
		VarvalarrayContext _localctx = new VarvalarrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varvalarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LT);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				varvalue();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(91);
					match(COMMA);
					setState(92);
					varvalue();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERALBOOL) | (1L << LT) | (1L << INT) | (1L << OPENPAR) | (1L << MINUS) | (1L << STRING) | (1L << CHAR) | (1L << TEXT))) != 0) );
			setState(102);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarvalboolContext extends ParserRuleContext {
		public TerminalNode LITERALBOOL() { return getToken(LastMinuteParser.LITERALBOOL, 0); }
		public VarvalboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterVarvalbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitVarvalbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalbool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalboolContext varvalbool() throws RecognitionException {
		VarvalboolContext _localctx = new VarvalboolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varvalbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LITERALBOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(LastMinuteParser.OPENPAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(LastMinuteParser.CLOSEPAR, 0); }
		public TerminalNode OPENBRACES() { return getToken(LastMinuteParser.OPENBRACES, 0); }
		public TerminalNode RETURN() { return getToken(LastMinuteParser.RETURN, 0); }
		public VarvalueContext varvalue() {
			return getRuleContext(VarvalueContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(LastMinuteParser.ENDL, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(LastMinuteParser.CLOSEBRACES, 0); }
		public List<FuncbodyContext> funcbody() {
			return getRuleContexts(FuncbodyContext.class);
		}
		public FuncbodyContext funcbody(int i) {
			return getRuleContext(FuncbodyContext.class,i);
		}
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterFuncdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitFuncdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitFuncdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			identifier();
			setState(107);
			match(OPENPAR);
			setState(108);
			params();
			setState(109);
			match(CLOSEPAR);
			setState(110);
			match(OPENBRACES);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << INT) | (1L << OPENPAR) | (1L << TEXT))) != 0)) {
				{
				{
				setState(111);
				funcbody();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RETURN);
			setState(118);
			varvalue();
			setState(119);
			match(ENDL);
			setState(120);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LastMinuteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LastMinuteParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(122);
				identifier();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					identifier();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedparamsContext extends ParserRuleContext {
		public List<VarvalueContext> varvalue() {
			return getRuleContexts(VarvalueContext.class);
		}
		public VarvalueContext varvalue(int i) {
			return getRuleContext(VarvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LastMinuteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LastMinuteParser.COMMA, i);
		}
		public ExtendedparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterExtendedparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitExtendedparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitExtendedparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedparamsContext extendedparams() throws RecognitionException {
		ExtendedparamsContext _localctx = new ExtendedparamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_extendedparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERALBOOL) | (1L << LT) | (1L << INT) | (1L << OPENPAR) | (1L << MINUS) | (1L << STRING) | (1L << CHAR) | (1L << TEXT))) != 0)) {
				{
				setState(132);
				varvalue();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133);
					match(COMMA);
					setState(134);
					varvalue();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncbodyContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitFuncbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcbody);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				funccall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				if_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				calculation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(LastMinuteParser.OPENBRACES, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(LastMinuteParser.CLOSEBRACES, 0); }
		public List<FuncbodyContext> funcbody() {
			return getRuleContexts(FuncbodyContext.class);
		}
		public FuncbodyContext funcbody(int i) {
			return getRuleContext(FuncbodyContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(OPENBRACES);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << INT) | (1L << OPENPAR) | (1L << TEXT))) != 0)) {
				{
				{
				setState(150);
				funcbody();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalbodyContext extends ParserRuleContext {
		public TerminalNode OPENPAR() { return getToken(LastMinuteParser.OPENPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(LastMinuteParser.CLOSEPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ConditionalbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterConditionalbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitConditionalbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitConditionalbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalbodyContext conditionalbody() throws RecognitionException {
		ConditionalbodyContext _localctx = new ConditionalbodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(OPENPAR);
			setState(159);
			condition(0);
			setState(160);
			match(CLOSEPAR);
			setState(161);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InverseConditionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(LastMinuteParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InverseConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterInverseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitInverseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitInverseCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualConditionContext extends ConditionContext {
		public List<VarvalueContext> varvalue() {
			return getRuleContexts(VarvalueContext.class);
		}
		public VarvalueContext varvalue(int i) {
			return getRuleContext(VarvalueContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(LastMinuteParser.NOTEQUAL, 0); }
		public NotEqualConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterNotEqualCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitNotEqualCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitNotEqualCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareConditionContext extends ConditionContext {
		public List<VarvalueContext> varvalue() {
			return getRuleContexts(VarvalueContext.class);
		}
		public VarvalueContext varvalue(int i) {
			return getRuleContext(VarvalueContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(LastMinuteParser.EQUALS, 0); }
		public CompareConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterCompareCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitCompareCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitCompareCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorConditionContext extends ConditionContext {
		public List<VarvalueContext> varvalue() {
			return getRuleContexts(VarvalueContext.class);
		}
		public VarvalueContext varvalue(int i) {
			return getRuleContext(VarvalueContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterOperatorCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitOperatorCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitOperatorCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrConditionContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(LastMinuteParser.OR, 0); }
		public OrConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConditionContext extends ConditionContext {
		public VarvalboolContext varvalbool() {
			return getRuleContext(VarvalboolContext.class,0);
		}
		public BoolConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterBoolCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitBoolCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitBoolCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndConditionContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LastMinuteParser.AND, 0); }
		public AndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new InverseConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				match(NOT);
				setState(165);
				condition(7);
				}
				break;
			case 2:
				{
				_localctx = new CompareConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				varvalue();
				setState(167);
				match(EQUALS);
				setState(168);
				varvalue();
				}
				break;
			case 3:
				{
				_localctx = new NotEqualConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				varvalue();
				setState(171);
				match(NOTEQUAL);
				setState(172);
				varvalue();
				}
				break;
			case 4:
				{
				_localctx = new BoolConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				varvalbool();
				}
				break;
			case 5:
				{
				_localctx = new OperatorConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				varvalue();
				setState(176);
				operator();
				setState(177);
				varvalue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						match(AND);
						setState(183);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						match(OR);
						setState(186);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LastMinuteParser.LT, 0); }
		public TerminalNode GT() { return getToken(LastMinuteParser.GT, 0); }
		public TerminalNode EQUALS() { return getToken(LastMinuteParser.EQUALS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(LastMinuteParser.NOTEQUAL, 0); }
		public TerminalNode GTE() { return getToken(LastMinuteParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(LastMinuteParser.LTE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOTEQUAL) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LastMinuteParser.IF, 0); }
		public ConditionalbodyContext conditionalbody() {
			return getRuleContext(ConditionalbodyContext.class,0);
		}
		public List<TerminalNode> ELSE() { return getTokens(LastMinuteParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LastMinuteParser.ELSE, i);
		}
		public List<If_elseContext> if_else() {
			return getRuleContexts(If_elseContext.class);
		}
		public If_elseContext if_else(int i) {
			return getRuleContext(If_elseContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
			setState(195);
			conditionalbody();
			{
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(ELSE);
					setState(197);
					if_else();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(203);
				match(ELSE);
				setState(204);
				body();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				forloop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				whileloop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LastMinuteParser.WHILE, 0); }
		public ConditionalbodyContext conditionalbody() {
			return getRuleContext(ConditionalbodyContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WHILE);
			setState(212);
			conditionalbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LastMinuteParser.FOR, 0); }
		public TerminalNode OPENPAR() { return getToken(LastMinuteParser.OPENPAR, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(LastMinuteParser.ENDL, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(LastMinuteParser.CLOSEPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(FOR);
			setState(215);
			match(OPENPAR);
			setState(216);
			vardecl();
			setState(217);
			condition(0);
			setState(218);
			match(ENDL);
			setState(219);
			calculation();
			setState(220);
			match(CLOSEPAR);
			setState(221);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunccallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(LastMinuteParser.OPENPAR, 0); }
		public ExtendedparamsContext extendedparams() {
			return getRuleContext(ExtendedparamsContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(LastMinuteParser.CLOSEPAR, 0); }
		public TerminalNode ENDL() { return getToken(LastMinuteParser.ENDL, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			identifier();
			setState(224);
			match(OPENPAR);
			setState(225);
			extendedparams();
			setState(226);
			match(CLOSEPAR);
			setState(227);
			match(ENDL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LastMinuteParser.TEXT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculationContext extends ParserRuleContext {
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitCalculation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitCalculation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_calculation);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				addition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				multiplication();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				power();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(LastMinuteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LastMinuteParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LastMinuteParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LastMinuteParser.MINUS, i);
		}
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			value();
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(237);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(238);
						value();
						}
						break;
					case 2:
						{
						setState(239);
						calculation();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicationContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(LastMinuteParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(LastMinuteParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(LastMinuteParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(LastMinuteParser.DIVIDE, i);
		}
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiplication);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			value();
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(247);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVIDE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(248);
						value();
						}
						break;
					case 2:
						{
						setState(249);
						calculation();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> MODULO() { return getTokens(LastMinuteParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(LastMinuteParser.MODULO, i);
		}
		public List<TerminalNode> POWER() { return getTokens(LastMinuteParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(LastMinuteParser.POWER, i);
		}
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_power);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			value();
			setState(262); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(257);
					_la = _input.LA(1);
					if ( !(_la==MODULO || _la==POWER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(258);
						value();
						}
						break;
					case 2:
						{
						setState(259);
						calculation();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LastMinuteParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(LastMinuteParser.OPENPAR, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(LastMinuteParser.CLOSEPAR, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(INT);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				identifier();
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(OPENPAR);
				setState(269);
				addition();
				setState(270);
				match(CLOSEPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"Q\n\4\3\5\5\5T\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b`\n\b\f"+
		"\b\16\bc\13\b\6\be\n\b\r\b\16\bf\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\ns\n\n\f\n\16\nv\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0080"+
		"\n\13\f\13\16\13\u0083\13\13\5\13\u0085\n\13\3\f\3\f\3\f\7\f\u008a\n\f"+
		"\f\f\16\f\u008d\13\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3"+
		"\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00b6\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00be\n\20\f\20\16\20\u00c1\13\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00c9\n\22\f\22\16\22\u00cc\13\22\3\22\3\22\5\22\u00d0\n\22\3\23"+
		"\3\23\5\23\u00d4\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30"+
		"\u00ed\n\30\3\31\3\31\3\31\3\31\5\31\u00f3\n\31\6\31\u00f5\n\31\r\31\16"+
		"\31\u00f6\3\32\3\32\3\32\3\32\5\32\u00fd\n\32\6\32\u00ff\n\32\r\32\16"+
		"\32\u0100\3\33\3\33\3\33\3\33\5\33\u0107\n\33\6\33\u0109\n\33\r\33\16"+
		"\33\u010a\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0113\n\34\3\34\2\3\36\35"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\3\2\4"+
		"\t\3\2\36\37\3\2 !\3\2\"#\u0121\2;\3\2\2\2\4D\3\2\2\2\6P\3\2\2\2\bS\3"+
		"\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20j\3\2\2\2\22l\3\2\2\2\24\u0084"+
		"\3\2\2\2\26\u008e\3\2\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u00a0\3"+
		"\2\2\2\36\u00b5\3\2\2\2 \u00c2\3\2\2\2\"\u00c4\3\2\2\2$\u00d3\3\2\2\2"+
		"&\u00d5\3\2\2\2(\u00d8\3\2\2\2*\u00e1\3\2\2\2,\u00e7\3\2\2\2.\u00ec\3"+
		"\2\2\2\60\u00ee\3\2\2\2\62\u00f8\3\2\2\2\64\u0102\3\2\2\2\66\u0112\3\2"+
		"\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2"+
		"\2\2>@\5\22\n\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3"+
		"\2\2\2DE\5,\27\2EF\7\31\2\2FG\5\6\4\2GH\7\30\2\2H\5\3\2\2\2IQ\5\b\5\2"+
		"JQ\5\n\6\2KQ\5\f\7\2LQ\5\16\b\2MQ\5\20\t\2NQ\5,\27\2OQ\5.\30\2PI\3\2\2"+
		"\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\7\3\2"+
		"\2\2RT\7\37\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\22\2\2V\t\3\2\2\2WX"+
		"\7$\2\2X\13\3\2\2\2YZ\7%\2\2Z\r\3\2\2\2[d\7\7\2\2\\a\5\6\4\2]^\7\25\2"+
		"\2^`\5\6\4\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2d\\\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\6\2\2i\17\3"+
		"\2\2\2jk\7\3\2\2k\21\3\2\2\2lm\5,\27\2mn\7\32\2\2no\5\24\13\2op\7\33\2"+
		"\2pt\7\34\2\2qs\5\30\r\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2"+
		"\2\2vt\3\2\2\2wx\7\r\2\2xy\5\6\4\2yz\7\30\2\2z{\7\35\2\2{\23\3\2\2\2|"+
		"\u0081\5,\27\2}~\7\25\2\2~\u0080\5,\27\2\177}\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084|\3\2\2\2\u0084\u0085\3\2\2\2\u0085\25\3\2\2\2\u0086\u008b"+
		"\5\6\4\2\u0087\u0088\7\25\2\2\u0088\u008a\5\6\4\2\u0089\u0087\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\27\3\2\2\2\u0090\u0096\5\4\3\2\u0091\u0096\5*\26\2\u0092\u0096\5$\23"+
		"\2\u0093\u0096\5\"\22\2\u0094\u0096\5.\30\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\31\3\2\2\2\u0097\u009b\7\34\2\2\u0098\u009a\5\30\r\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\35\2\2\u009f"+
		"\33\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3\7\33"+
		"\2\2\u00a3\u00a4\5\32\16\2\u00a4\35\3\2\2\2\u00a5\u00a6\b\20\1\2\u00a6"+
		"\u00a7\7\f\2\2\u00a7\u00b6\5\36\20\t\u00a8\u00a9\5\6\4\2\u00a9\u00aa\7"+
		"\4\2\2\u00aa\u00ab\5\6\4\2\u00ab\u00b6\3\2\2\2\u00ac\u00ad\5\6\4\2\u00ad"+
		"\u00ae\7\5\2\2\u00ae\u00af\5\6\4\2\u00af\u00b6\3\2\2\2\u00b0\u00b6\5\20"+
		"\t\2\u00b1\u00b2\5\6\4\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\5\6\4\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00ac\3\2"+
		"\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00bf\3\2\2\2\u00b7"+
		"\u00b8\f\6\2\2\u00b8\u00b9\7\n\2\2\u00b9\u00be\5\36\20\7\u00ba\u00bb\f"+
		"\5\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00be\5\36\20\6\u00bd\u00b7\3\2\2\2"+
		"\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\37\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3"+
		"!\3\2\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00ca\5\34\17\2\u00c6\u00c7\7\21"+
		"\2\2\u00c7\u00c9\5\"\22\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7\21\2\2\u00ce\u00d0\5\32\16\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d4\5(\25\2\u00d2\u00d4\5&\24\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00d6\7"+
		"\17\2\2\u00d6\u00d7\5\34\17\2\u00d7\'\3\2\2\2\u00d8\u00d9\7\16\2\2\u00d9"+
		"\u00da\7\32\2\2\u00da\u00db\5\4\3\2\u00db\u00dc\5\36\20\2\u00dc\u00dd"+
		"\7\30\2\2\u00dd\u00de\5.\30\2\u00de\u00df\7\33\2\2\u00df\u00e0\5\32\16"+
		"\2\u00e0)\3\2\2\2\u00e1\u00e2\5,\27\2\u00e2\u00e3\7\32\2\2\u00e3\u00e4"+
		"\5\26\f\2\u00e4\u00e5\7\33\2\2\u00e5\u00e6\7\30\2\2\u00e6+\3\2\2\2\u00e7"+
		"\u00e8\7&\2\2\u00e8-\3\2\2\2\u00e9\u00ed\5\60\31\2\u00ea\u00ed\5\62\32"+
		"\2\u00eb\u00ed\5\64\33\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed/\3\2\2\2\u00ee\u00f4\5\66\34\2\u00ef\u00f2\t\3\2"+
		"\2\u00f0\u00f3\5\66\34\2\u00f1\u00f3\5.\30\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\61\3\2\2\2\u00f8\u00fe"+
		"\5\66\34\2\u00f9\u00fc\t\4\2\2\u00fa\u00fd\5\66\34\2\u00fb\u00fd\5.\30"+
		"\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\63\3\2\2\2\u0102\u0108\5\66\34\2\u0103\u0106\t\5\2\2\u0104\u0107\5\66"+
		"\34\2\u0105\u0107\5.\30\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0103\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\65\3\2\2\2\u010c\u0113\7\22\2\2\u010d\u0113"+
		"\5,\27\2\u010e\u010f\7\32\2\2\u010f\u0110\5\60\31\2\u0110\u0111\7\33\2"+
		"\2\u0111\u0113\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010e"+
		"\3\2\2\2\u0113\67\3\2\2\2\35;APSaft\u0081\u0084\u008b\u008e\u0095\u009b"+
		"\u00b5\u00bd\u00bf\u00ca\u00cf\u00d3\u00ec\u00f2\u00f6\u00fc\u0100\u0106"+
		"\u010a\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}