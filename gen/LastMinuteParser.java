// Generated from D:/School exercises/lmlanguage/lastminutelanguage\LastMinute.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERALBOOL=1, EQUALS=2, NOTEQUAL=3, GT=4, LT=5, GTE=6, LTE=7, AND=8, 
		OR=9, NOT=10, RETURN=11, FOR=12, WHILE=13, IF=14, ELSE=15, INT=16, TRUE=17, 
		FALSE=18, COMMA=19, QUOTE=20, SQUOTE=21, ENDL=22, MAKEEQUAL=23, OPENPAR=24, 
		CLOSEPAR=25, OPENBRACES=26, CLOSEBRACES=27, OPENBRACKET=28, CLOSEBRACKET=29, 
		PLUS=30, MINUS=31, TIMES=32, DIVIDE=33, MODULO=34, POWER=35, STRING=36, 
		CHAR=37, TEXT=38, COMMENT=39, MULTCOMMENT=40, COMMENT2=41, COMMENT3=42, 
		MULTCOMMENTOPEN=43, MULTCOMMENTCLOSE=44, ARRAYINDEX=45, INCVAR=46, DECVAR=47, 
		WS=48;
	public static final int
		RULE_statement = 0, RULE_comment = 1, RULE_varcalc = 2, RULE_vardecl = 3, 
		RULE_vartrans = 4, RULE_varvalue = 5, RULE_varvalnum = 6, RULE_varvalstring = 7, 
		RULE_varvalchar = 8, RULE_varvalarray = 9, RULE_varvalbool = 10, RULE_funcdecl = 11, 
		RULE_params = 12, RULE_extendedparams = 13, RULE_funcbody = 14, RULE_body = 15, 
		RULE_conditionalbody = 16, RULE_condition = 17, RULE_operator = 18, RULE_if_else = 19, 
		RULE_loop = 20, RULE_whileloop = 21, RULE_forloop = 22, RULE_funccall = 23, 
		RULE_identifier = 24, RULE_calculation = 25, RULE_addition = 26, RULE_multiplication = 27, 
		RULE_power = 28, RULE_value = 29;
	public static final String[] ruleNames = {
		"statement", "comment", "varcalc", "vardecl", "vartrans", "varvalue", 
		"varvalnum", "varvalstring", "varvalchar", "varvalarray", "varvalbool", 
		"funcdecl", "params", "extendedparams", "funcbody", "body", "conditionalbody", 
		"condition", "operator", "if_else", "loop", "whileloop", "forloop", "funccall", 
		"identifier", "calculation", "addition", "multiplication", "power", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", 
		"'!'", "'return'", "'for'", "'while'", "'if'", "'else'", null, null, null, 
		"','", "'\"'", "'''", "';'", "':'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", null, null, null, null, 
		null, "'//'", "'##'", "'/*'", "'*/'", null, "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERALBOOL", "EQUALS", "NOTEQUAL", "GT", "LT", "GTE", "LTE", "AND", 
		"OR", "NOT", "RETURN", "FOR", "WHILE", "IF", "ELSE", "INT", "TRUE", "FALSE", 
		"COMMA", "QUOTE", "SQUOTE", "ENDL", "MAKEEQUAL", "OPENPAR", "CLOSEPAR", 
		"OPENBRACES", "CLOSEBRACES", "OPENBRACKET", "CLOSEBRACKET", "PLUS", "MINUS", 
		"TIMES", "DIVIDE", "MODULO", "POWER", "STRING", "CHAR", "TEXT", "COMMENT", 
		"MULTCOMMENT", "COMMENT2", "COMMENT3", "MULTCOMMENTOPEN", "MULTCOMMENTCLOSE", 
		"ARRAYINDEX", "INCVAR", "DECVAR", "WS"
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<VarcalcContext> varcalc() {
			return getRuleContexts(VarcalcContext.class);
		}
		public VarcalcContext varcalc(int i) {
			return getRuleContext(VarcalcContext.class,i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << COMMENT) | (1L << MULTCOMMENT))) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					comment();
					}
					break;
				case 2:
					{
					setState(61);
					varcalc();
					}
					break;
				case 3:
					{
					setState(62);
					vardecl();
					}
					break;
				case 4:
					{
					setState(63);
					funcdecl();
					}
					break;
				}
				}
				setState(68);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode MULTCOMMENT() { return getToken(LastMinuteParser.MULTCOMMENT, 0); }
		public TerminalNode COMMENT() { return getToken(LastMinuteParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==MULTCOMMENT) ) {
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

	public static class VarcalcContext extends ParserRuleContext {
		public VarcalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varcalc; }
	 
		public VarcalcContext() { }
		public void copyFrom(VarcalcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementVariableContext extends VarcalcContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(LastMinuteParser.ENDL, 0); }
		public TerminalNode INCVAR() { return getToken(LastMinuteParser.INCVAR, 0); }
		public TerminalNode DECVAR() { return getToken(LastMinuteParser.DECVAR, 0); }
		public IncrementVariableContext(VarcalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterIncrementVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitIncrementVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitIncrementVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformVariableContext extends VarcalcContext {
		public VartransContext vartrans() {
			return getRuleContext(VartransContext.class,0);
		}
		public TransformVariableContext(VarcalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterTransformVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitTransformVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitTransformVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarcalcContext varcalc() throws RecognitionException {
		VarcalcContext _localctx = new VarcalcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varcalc);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IncrementVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				identifier();
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==INCVAR || _la==DECVAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				match(ENDL);
				}
				break;
			case 2:
				_localctx = new TransformVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				vartrans();
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
		enterRule(_localctx, 6, RULE_vardecl);
		try {
			_localctx = new SetVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			identifier();
			setState(79);
			match(MAKEEQUAL);
			setState(80);
			varvalue();
			setState(81);
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

	public static class VartransContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MAKEEQUAL() { return getToken(LastMinuteParser.MAKEEQUAL, 0); }
		public VarvalueContext varvalue() {
			return getRuleContext(VarvalueContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(LastMinuteParser.ENDL, 0); }
		public TerminalNode PLUS() { return getToken(LastMinuteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LastMinuteParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(LastMinuteParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(LastMinuteParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(LastMinuteParser.MODULO, 0); }
		public VartransContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartrans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).enterVartrans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LastMinuteListener ) ((LastMinuteListener)listener).exitVartrans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVartrans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VartransContext vartrans() throws RecognitionException {
		VartransContext _localctx = new VartransContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vartrans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			identifier();
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			match(MAKEEQUAL);
			setState(86);
			varvalue();
			setState(87);
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
		enterRule(_localctx, 10, RULE_varvalue);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				varvalnum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				varvalstring();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				varvalchar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				varvalarray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				varvalbool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
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
		enterRule(_localctx, 12, RULE_varvalnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(98);
				match(MINUS);
				}
			}

			setState(101);
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
		enterRule(_localctx, 14, RULE_varvalstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		enterRule(_localctx, 16, RULE_varvalchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 18, RULE_varvalarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LT);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				varvalue();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					setState(110);
					varvalue();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERALBOOL) | (1L << LT) | (1L << INT) | (1L << OPENPAR) | (1L << MINUS) | (1L << STRING) | (1L << CHAR) | (1L << TEXT))) != 0) );
			setState(120);
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
		enterRule(_localctx, 20, RULE_varvalbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		enterRule(_localctx, 22, RULE_funcdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			identifier();
			setState(125);
			match(OPENPAR);
			setState(126);
			params();
			setState(127);
			match(CLOSEPAR);
			setState(128);
			match(OPENBRACES);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << INT) | (1L << OPENPAR) | (1L << TEXT) | (1L << COMMENT) | (1L << MULTCOMMENT))) != 0)) {
				{
				{
				setState(129);
				funcbody();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(RETURN);
			setState(136);
			varvalue();
			setState(137);
			match(ENDL);
			setState(138);
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
		enterRule(_localctx, 24, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(140);
				identifier();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(141);
					match(COMMA);
					setState(142);
					identifier();
					}
					}
					setState(147);
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
		enterRule(_localctx, 26, RULE_extendedparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERALBOOL) | (1L << LT) | (1L << INT) | (1L << OPENPAR) | (1L << MINUS) | (1L << STRING) | (1L << CHAR) | (1L << TEXT))) != 0)) {
				{
				setState(150);
				varvalue();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					varvalue();
					}
					}
					setState(157);
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
		public VarcalcContext varcalc() {
			return getRuleContext(VarcalcContext.class,0);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
		enterRule(_localctx, 28, RULE_funcbody);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				varcalc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				funccall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				if_else();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				calculation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				comment();
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
		enterRule(_localctx, 30, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(OPENBRACES);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << INT) | (1L << OPENPAR) | (1L << TEXT) | (1L << COMMENT) | (1L << MULTCOMMENT))) != 0)) {
				{
				{
				setState(170);
				funcbody();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
		enterRule(_localctx, 32, RULE_conditionalbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OPENPAR);
			setState(179);
			condition(0);
			setState(180);
			match(CLOSEPAR);
			setState(181);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new InverseConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				match(NOT);
				setState(185);
				condition(7);
				}
				break;
			case 2:
				{
				_localctx = new CompareConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				varvalue();
				setState(187);
				match(EQUALS);
				setState(188);
				varvalue();
				}
				break;
			case 3:
				{
				_localctx = new NotEqualConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				varvalue();
				setState(191);
				match(NOTEQUAL);
				setState(192);
				varvalue();
				}
				break;
			case 4:
				{
				_localctx = new BoolConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				varvalbool();
				}
				break;
			case 5:
				{
				_localctx = new OperatorConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				varvalue();
				setState(196);
				operator();
				setState(197);
				varvalue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(202);
						match(AND);
						setState(203);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205);
						match(OR);
						setState(206);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 36, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		enterRule(_localctx, 38, RULE_if_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IF);
			setState(215);
			conditionalbody();
			{
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(ELSE);
					setState(217);
					if_else();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(223);
				match(ELSE);
				setState(224);
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
		enterRule(_localctx, 40, RULE_loop);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				forloop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
		enterRule(_localctx, 42, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(WHILE);
			setState(232);
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
		enterRule(_localctx, 44, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(FOR);
			setState(235);
			match(OPENPAR);
			setState(236);
			vardecl();
			setState(237);
			condition(0);
			setState(238);
			match(ENDL);
			setState(239);
			calculation();
			setState(240);
			match(CLOSEPAR);
			setState(241);
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
		enterRule(_localctx, 46, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			identifier();
			setState(244);
			match(OPENPAR);
			setState(245);
			extendedparams();
			setState(246);
			match(CLOSEPAR);
			setState(247);
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
		public TerminalNode ARRAYINDEX() { return getToken(LastMinuteParser.ARRAYINDEX, 0); }
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
		enterRule(_localctx, 48, RULE_identifier);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(TEXT);
				setState(251);
				match(ARRAYINDEX);
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
		enterRule(_localctx, 50, RULE_calculation);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				addition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				multiplication();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
		enterRule(_localctx, 52, RULE_addition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			value();
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(260);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(261);
						value();
						}
						break;
					case 2:
						{
						setState(262);
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
				setState(267); 
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
		enterRule(_localctx, 54, RULE_multiplication);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			value();
			setState(275); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(270);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVIDE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(271);
						value();
						}
						break;
					case 2:
						{
						setState(272);
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
				setState(277); 
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
		enterRule(_localctx, 56, RULE_power);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			value();
			setState(285); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(280);
					_la = _input.LA(1);
					if ( !(_la==MODULO || _la==POWER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(281);
						value();
						}
						break;
					case 2:
						{
						setState(282);
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
				setState(287); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 58, RULE_value);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(INT);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				identifier();
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(OPENPAR);
				setState(292);
				addition();
				setState(293);
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u012c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7c\n\7\3\b\5\bf\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"r\n\13\f\13\16\13u\13\13\6\13w\n\13\r\13\16\13x\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u0085\n\r\f\r\16\r\u0088\13\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\5\16\u0097"+
		"\n\16\3\17\3\17\3\17\7\17\u009c\n\17\f\17\16\17\u009f\13\17\5\17\u00a1"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00aa\n\20\3\21\3\21\7\21"+
		"\u00ae\n\21\f\21\16\21\u00b1\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00ca\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d2\n"+
		"\23\f\23\16\23\u00d5\13\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00dd\n"+
		"\25\f\25\16\25\u00e0\13\25\3\25\3\25\5\25\u00e4\n\25\3\26\3\26\5\26\u00e8"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u00ff\n\32\3\33\3\33\3\33"+
		"\5\33\u0104\n\33\3\34\3\34\3\34\3\34\5\34\u010a\n\34\6\34\u010c\n\34\r"+
		"\34\16\34\u010d\3\35\3\35\3\35\3\35\5\35\u0114\n\35\6\35\u0116\n\35\r"+
		"\35\16\35\u0117\3\36\3\36\3\36\3\36\5\36\u011e\n\36\6\36\u0120\n\36\r"+
		"\36\16\36\u0121\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u012a\n\37\3\37\2\3"+
		"$ \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t"+
		"\3\2)*\3\2\60\61\3\2 $\3\2\4\t\3\2 !\3\2\"#\3\2$%\2\u013b\2D\3\2\2\2\4"+
		"G\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nU\3\2\2\2\fb\3\2\2\2\16e\3\2\2\2\20i"+
		"\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0096\3\2"+
		"\2\2\34\u00a0\3\2\2\2\36\u00a9\3\2\2\2 \u00ab\3\2\2\2\"\u00b4\3\2\2\2"+
		"$\u00c9\3\2\2\2&\u00d6\3\2\2\2(\u00d8\3\2\2\2*\u00e7\3\2\2\2,\u00e9\3"+
		"\2\2\2.\u00ec\3\2\2\2\60\u00f5\3\2\2\2\62\u00fe\3\2\2\2\64\u0103\3\2\2"+
		"\2\66\u0105\3\2\2\28\u010f\3\2\2\2:\u0119\3\2\2\2<\u0129\3\2\2\2>C\5\4"+
		"\3\2?C\5\6\4\2@C\5\b\5\2AC\5\30\r\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FD\3\2\2\2GH\t\2\2\2H\5"+
		"\3\2\2\2IJ\5\62\32\2JK\t\3\2\2KL\7\30\2\2LO\3\2\2\2MO\5\n\6\2NI\3\2\2"+
		"\2NM\3\2\2\2O\7\3\2\2\2PQ\5\62\32\2QR\7\31\2\2RS\5\f\7\2ST\7\30\2\2T\t"+
		"\3\2\2\2UV\5\62\32\2VW\t\4\2\2WX\7\31\2\2XY\5\f\7\2YZ\7\30\2\2Z\13\3\2"+
		"\2\2[c\5\16\b\2\\c\5\20\t\2]c\5\22\n\2^c\5\24\13\2_c\5\26\f\2`c\5\62\32"+
		"\2ac\5\64\33\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3"+
		"\2\2\2ba\3\2\2\2c\r\3\2\2\2df\7!\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7"+
		"\22\2\2h\17\3\2\2\2ij\7&\2\2j\21\3\2\2\2kl\7\'\2\2l\23\3\2\2\2mv\7\7\2"+
		"\2ns\5\f\7\2op\7\25\2\2pr\5\f\7\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2"+
		"\2\2z{\7\6\2\2{\25\3\2\2\2|}\7\3\2\2}\27\3\2\2\2~\177\5\62\32\2\177\u0080"+
		"\7\32\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\33\2\2\u0082\u0086\7\34"+
		"\2\2\u0083\u0085\5\36\20\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008a\7\r\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\30\2\2\u008c"+
		"\u008d\7\35\2\2\u008d\31\3\2\2\2\u008e\u0093\5\62\32\2\u008f\u0090\7\25"+
		"\2\2\u0090\u0092\5\62\32\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u008e\3\2\2\2\u0096\u0097\3\2\2\2\u0097\33\3\2\2\2\u0098\u009d"+
		"\5\f\7\2\u0099\u009a\7\25\2\2\u009a\u009c\5\f\7\2\u009b\u0099\3\2\2\2"+
		"\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\35\3\2\2\2\u00a2\u00aa\5\b\5\2\u00a3\u00aa\5\6\4\2\u00a4\u00aa\5\60\31"+
		"\2\u00a5\u00aa\5*\26\2\u00a6\u00aa\5(\25\2\u00a7\u00aa\5\64\33\2\u00a8"+
		"\u00aa\5\4\3\2\u00a9\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2"+
		"\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\37\3\2\2\2\u00ab\u00af\7\34\2\2\u00ac\u00ae\5\36"+
		"\20\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\35"+
		"\2\2\u00b3!\3\2\2\2\u00b4\u00b5\7\32\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7"+
		"\7\33\2\2\u00b7\u00b8\5 \21\2\u00b8#\3\2\2\2\u00b9\u00ba\b\23\1\2\u00ba"+
		"\u00bb\7\f\2\2\u00bb\u00ca\5$\23\t\u00bc\u00bd\5\f\7\2\u00bd\u00be\7\4"+
		"\2\2\u00be\u00bf\5\f\7\2\u00bf\u00ca\3\2\2\2\u00c0\u00c1\5\f\7\2\u00c1"+
		"\u00c2\7\5\2\2\u00c2\u00c3\5\f\7\2\u00c3\u00ca\3\2\2\2\u00c4\u00ca\5\26"+
		"\f\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\5\f\7\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9\u00bc\3\2\2\2\u00c9\u00c0\3\2"+
		"\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00d3\3\2\2\2\u00cb"+
		"\u00cc\f\6\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00d2\5$\23\7\u00ce\u00cf\f\5"+
		"\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d2\5$\23\6\u00d1\u00cb\3\2\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4%\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\5\2\2\u00d7\'\3"+
		"\2\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00de\5\"\22\2\u00da\u00db\7\21\2\2"+
		"\u00db\u00dd\5(\25\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7\21\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4)\3\2\2\2\u00e5\u00e8\5.\30\2\u00e6\u00e8\5,\27\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8+\3\2\2\2\u00e9\u00ea\7\17\2\2\u00ea"+
		"\u00eb\5\"\22\2\u00eb-\3\2\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\7\32\2"+
		"\2\u00ee\u00ef\5\b\5\2\u00ef\u00f0\5$\23\2\u00f0\u00f1\7\30\2\2\u00f1"+
		"\u00f2\5\64\33\2\u00f2\u00f3\7\33\2\2\u00f3\u00f4\5 \21\2\u00f4/\3\2\2"+
		"\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8\5\34\17\2\u00f8"+
		"\u00f9\7\33\2\2\u00f9\u00fa\7\30\2\2\u00fa\61\3\2\2\2\u00fb\u00ff\7(\2"+
		"\2\u00fc\u00fd\7(\2\2\u00fd\u00ff\7/\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\63\3\2\2\2\u0100\u0104\5\66\34\2\u0101\u0104\58\35\2\u0102"+
		"\u0104\5:\36\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2"+
		"\2\2\u0104\65\3\2\2\2\u0105\u010b\5<\37\2\u0106\u0109\t\6\2\2\u0107\u010a"+
		"\5<\37\2\u0108\u010a\5\64\33\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2"+
		"\u010a\u010c\3\2\2\2\u010b\u0106\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\67\3\2\2\2\u010f\u0115\5<\37\2\u0110"+
		"\u0113\t\7\2\2\u0111\u0114\5<\37\2\u0112\u0114\5\64\33\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0112\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u01189\3\2\2\2"+
		"\u0119\u011f\5<\37\2\u011a\u011d\t\b\2\2\u011b\u011e\5<\37\2\u011c\u011e"+
		"\5\64\33\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0120\3\2\2\2"+
		"\u011f\u011a\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122;\3\2\2\2\u0123\u012a\7\22\2\2\u0124\u012a\5\62\32\2\u0125"+
		"\u0126\7\32\2\2\u0126\u0127\5\66\34\2\u0127\u0128\7\33\2\2\u0128\u012a"+
		"\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u012a"+
		"=\3\2\2\2\37BDNbesx\u0086\u0093\u0096\u009d\u00a0\u00a9\u00af\u00c9\u00d1"+
		"\u00d3\u00de\u00e3\u00e7\u00fe\u0103\u0109\u010d\u0113\u0117\u011d\u0121"+
		"\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}