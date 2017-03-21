// Generated from D:/school/antlr_grammar\LastMinute.g4 by ANTLR 4.6
package nl.saxion.maryke.lastmin;
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
		STRING=1, CHAR=2, EQUALS=3, NOTEQUAL=4, GT=5, LT=6, GTE=7, LTE=8, AND=9, 
		OR=10, NOT=11, RETURN=12, FOR=13, WHILE=14, IF=15, ELSE=16, TEXT=17, INT=18, 
		TRUE=19, FALSE=20, COMMA=21, QUOTE=22, SQUOTE=23, ENDL=24, MAKEEQUAL=25, 
		OPENPAR=26, CLOSEPAR=27, OPENBRACES=28, CLOSEBRACES=29, PLUS=30, MINUS=31, 
		TIMES=32, DIVIDE=33, MODULO=34, POWER=35, WS=36;
	public static final int
		RULE_statement = 0, RULE_vardecl = 1, RULE_funcdecl = 2, RULE_funcbody = 3, 
		RULE_identifier = 4, RULE_loop = 5, RULE_lm_if = 6, RULE_whileloop = 7, 
		RULE_forloop = 8, RULE_calculation = 9, RULE_condition = 10, RULE_lm_boolean = 11, 
		RULE_operator = 12, RULE_funccall = 13, RULE_addition = 14, RULE_subtraction = 15, 
		RULE_multiplication = 16, RULE_divide = 17, RULE_increment = 18, RULE_decrement = 19, 
		RULE_varvalue = 20, RULE_arrayval = 21, RULE_varvalnum = 22, RULE_varvalstring = 23, 
		RULE_varvalchar = 24, RULE_varvalarray = 25, RULE_params = 26, RULE_bool = 27, 
		RULE_extendedparams = 28;
	public static final String[] ruleNames = {
		"statement", "vardecl", "funcdecl", "funcbody", "identifier", "loop", 
		"lm_if", "whileloop", "forloop", "calculation", "condition", "lm_boolean", 
		"operator", "funccall", "addition", "subtraction", "multiplication", "divide", 
		"increment", "decrement", "varvalue", "arrayval", "varvalnum", "varvalstring", 
		"varvalchar", "varvalarray", "params", "bool", "extendedparams"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", 
		"'||'", "'!'", "'return'", "'for'", "'while'", "'if'", "'else'", null, 
		null, null, null, "','", "'\"'", "'''", "';'", "':'", "'('", "')'", "'{'", 
		"'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "CHAR", "EQUALS", "NOTEQUAL", "GT", "LT", "GTE", "LTE", 
		"AND", "OR", "NOT", "RETURN", "FOR", "WHILE", "IF", "ELSE", "TEXT", "INT", 
		"TRUE", "FALSE", "COMMA", "QUOTE", "SQUOTE", "ENDL", "MAKEEQUAL", "OPENPAR", 
		"CLOSEPAR", "OPENBRACES", "CLOSEBRACES", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"MODULO", "POWER", "WS"
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					vardecl();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(64);
				funcdecl();
				}
				}
				setState(69);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ENDL() { return getToken(LastMinuteParser.ENDL, 0); }
		public TerminalNode MAKEEQUAL() { return getToken(LastMinuteParser.MAKEEQUAL, 0); }
		public VarvalueContext varvalue() {
			return getRuleContext(VarvalueContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LastMinuteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LastMinuteParser.MINUS, 0); }
		public TerminalNode MODULO() { return getToken(LastMinuteParser.MODULO, 0); }
		public TerminalNode DIVIDE() { return getToken(LastMinuteParser.DIVIDE, 0); }
		public TerminalNode TIMES() { return getToken(LastMinuteParser.TIMES, 0); }
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			identifier();
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(71);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(74);
			match(MAKEEQUAL);
			}
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(76);
				varvalue();
				}
				break;
			case 2:
				{
				setState(77);
				calculation();
				}
				break;
			case 3:
				{
				setState(78);
				identifier();
				}
				break;
			case 4:
				{
				setState(79);
				bool();
				}
				break;
			}
			setState(82);
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

	public static class FuncdeclContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OPENPAR() { return getToken(LastMinuteParser.OPENPAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(LastMinuteParser.CLOSEPAR, 0); }
		public TerminalNode OPENBRACES() { return getToken(LastMinuteParser.OPENBRACES, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(LastMinuteParser.CLOSEBRACES, 0); }
		public TerminalNode RETURN() { return getToken(LastMinuteParser.RETURN, 0); }
		public VarvalueContext varvalue() {
			return getRuleContext(VarvalueContext.class,0);
		}
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitFuncdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			identifier();
			setState(85);
			match(OPENPAR);
			setState(86);
			params();
			setState(87);
			match(CLOSEPAR);
			setState(88);
			match(OPENBRACES);
			setState(89);
			funcbody();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(90);
				match(RETURN);
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(91);
					identifier();
					}
					break;
				case STRING:
				case CHAR:
				case LT:
				case INT:
				case MINUS:
					{
					setState(92);
					varvalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(97);
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

	public static class FuncbodyContext extends ParserRuleContext {
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<FunccallContext> funccall() {
			return getRuleContexts(FunccallContext.class);
		}
		public FunccallContext funccall(int i) {
			return getRuleContext(FunccallContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<Lm_ifContext> lm_if() {
			return getRuleContexts(Lm_ifContext.class);
		}
		public Lm_ifContext lm_if(int i) {
			return getRuleContext(Lm_ifContext.class,i);
		}
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public List<TerminalNode> ENDL() { return getTokens(LastMinuteParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(LastMinuteParser.ENDL, i);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << TEXT) | (1L << INT) | (1L << MINUS))) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(99);
					vardecl();
					}
					break;
				case 2:
					{
					setState(100);
					funccall();
					}
					break;
				case 3:
					{
					setState(101);
					loop();
					}
					break;
				case 4:
					{
					setState(102);
					lm_if();
					}
					break;
				case 5:
					{
					{
					setState(103);
					calculation();
					setState(104);
					match(ENDL);
					}
					}
					break;
				}
				}
				setState(110);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LastMinuteParser.TEXT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				forloop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
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

	public static class Lm_ifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(LastMinuteParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(LastMinuteParser.IF, i);
		}
		public List<TerminalNode> OPENPAR() { return getTokens(LastMinuteParser.OPENPAR); }
		public TerminalNode OPENPAR(int i) {
			return getToken(LastMinuteParser.OPENPAR, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> CLOSEPAR() { return getTokens(LastMinuteParser.CLOSEPAR); }
		public TerminalNode CLOSEPAR(int i) {
			return getToken(LastMinuteParser.CLOSEPAR, i);
		}
		public List<TerminalNode> OPENBRACES() { return getTokens(LastMinuteParser.OPENBRACES); }
		public TerminalNode OPENBRACES(int i) {
			return getToken(LastMinuteParser.OPENBRACES, i);
		}
		public List<FuncbodyContext> funcbody() {
			return getRuleContexts(FuncbodyContext.class);
		}
		public FuncbodyContext funcbody(int i) {
			return getRuleContext(FuncbodyContext.class,i);
		}
		public List<TerminalNode> CLOSEBRACES() { return getTokens(LastMinuteParser.CLOSEBRACES); }
		public TerminalNode CLOSEBRACES(int i) {
			return getToken(LastMinuteParser.CLOSEBRACES, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(LastMinuteParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LastMinuteParser.ELSE, i);
		}
		public Lm_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lm_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitLm_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lm_ifContext lm_if() throws RecognitionException {
		Lm_ifContext _localctx = new Lm_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lm_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF);
			setState(118);
			match(OPENPAR);
			setState(119);
			condition();
			setState(120);
			match(CLOSEPAR);
			setState(121);
			match(OPENBRACES);
			setState(122);
			funcbody();
			setState(123);
			match(CLOSEBRACES);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(ELSE);
					setState(125);
					match(IF);
					setState(126);
					match(OPENPAR);
					setState(127);
					condition();
					setState(128);
					match(CLOSEPAR);
					setState(129);
					match(OPENBRACES);
					setState(130);
					funcbody();
					setState(131);
					match(CLOSEBRACES);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(138);
				match(ELSE);
				setState(139);
				match(OPENBRACES);
				setState(140);
				funcbody();
				setState(141);
				match(CLOSEBRACES);
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

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LastMinuteParser.WHILE, 0); }
		public TerminalNode OPENPAR() { return getToken(LastMinuteParser.OPENPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(LastMinuteParser.CLOSEPAR, 0); }
		public TerminalNode OPENBRACES() { return getToken(LastMinuteParser.OPENBRACES, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(LastMinuteParser.CLOSEBRACES, 0); }
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(WHILE);
			setState(146);
			match(OPENPAR);
			setState(147);
			condition();
			setState(148);
			match(CLOSEPAR);
			setState(149);
			match(OPENBRACES);
			setState(150);
			funcbody();
			setState(151);
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
		public TerminalNode OPENBRACES() { return getToken(LastMinuteParser.OPENBRACES, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(LastMinuteParser.CLOSEBRACES, 0); }
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FOR);
			setState(154);
			match(OPENPAR);
			setState(155);
			vardecl();
			setState(156);
			condition();
			setState(157);
			match(ENDL);
			setState(158);
			calculation();
			setState(159);
			match(CLOSEPAR);
			setState(160);
			match(OPENBRACES);
			setState(161);
			funcbody();
			setState(162);
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

	public static class CalculationContext extends ParserRuleContext {
		public List<VarvalnumContext> varvalnum() {
			return getRuleContexts(VarvalnumContext.class);
		}
		public VarvalnumContext varvalnum(int i) {
			return getRuleContext(VarvalnumContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public List<DivideContext> divide() {
			return getRuleContexts(DivideContext.class);
		}
		public DivideContext divide(int i) {
			return getRuleContext(DivideContext.class,i);
		}
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public List<SubtractionContext> subtraction() {
			return getRuleContexts(SubtractionContext.class);
		}
		public SubtractionContext subtraction(int i) {
			return getRuleContext(SubtractionContext.class,i);
		}
		public List<IncrementContext> increment() {
			return getRuleContexts(IncrementContext.class);
		}
		public IncrementContext increment(int i) {
			return getRuleContext(IncrementContext.class,i);
		}
		public List<DecrementContext> decrement() {
			return getRuleContexts(DecrementContext.class);
		}
		public DecrementContext decrement(int i) {
			return getRuleContext(DecrementContext.class,i);
		}
		public List<TerminalNode> OPENPAR() { return getTokens(LastMinuteParser.OPENPAR); }
		public TerminalNode OPENPAR(int i) {
			return getToken(LastMinuteParser.OPENPAR, i);
		}
		public List<TerminalNode> CLOSEPAR() { return getTokens(LastMinuteParser.CLOSEPAR); }
		public TerminalNode CLOSEPAR(int i) {
			return getToken(LastMinuteParser.CLOSEPAR, i);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitCalculation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_calculation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case MINUS:
				{
				setState(164);
				varvalnum();
				}
				break;
			case TEXT:
				{
				setState(165);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(174);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(168);
							multiplication();
							}
							break;
						case 2:
							{
							setState(169);
							divide();
							}
							break;
						case 3:
							{
							setState(170);
							addition();
							}
							break;
						case 4:
							{
							setState(171);
							subtraction();
							}
							break;
						case 5:
							{
							setState(172);
							increment();
							}
							break;
						case 6:
							{
							setState(173);
							decrement();
							}
							break;
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPENPAR) {
					{
					{
					setState(179);
					match(OPENPAR);
					setState(182);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case MINUS:
						{
						setState(180);
						varvalnum();
						}
						break;
					case TEXT:
						{
						setState(181);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) {
						{
						setState(190);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(184);
							multiplication();
							}
							break;
						case 2:
							{
							setState(185);
							divide();
							}
							break;
						case 3:
							{
							setState(186);
							addition();
							}
							break;
						case 4:
							{
							setState(187);
							subtraction();
							}
							break;
						case 5:
							{
							setState(188);
							increment();
							}
							break;
						case 6:
							{
							setState(189);
							decrement();
							}
							break;
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(195);
					match(CLOSEPAR);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public List<Lm_booleanContext> lm_boolean() {
			return getRuleContexts(Lm_booleanContext.class);
		}
		public Lm_booleanContext lm_boolean(int i) {
			return getRuleContext(Lm_booleanContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(LastMinuteParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LastMinuteParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(LastMinuteParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LastMinuteParser.OR, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LastMinuteParser.NOT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(204);
					match(NOT);
					}
				}

				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(207);
					identifier();
					}
					break;
				case TRUE:
				case FALSE:
					{
					setState(208);
					bool();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				{
				setState(211);
				lm_boolean();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					{
					setState(214);
					match(AND);
					setState(215);
					lm_boolean();
					}
					}
					break;
				case OR:
					{
					{
					setState(216);
					match(OR);
					setState(217);
					lm_boolean();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Lm_booleanContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<VarvalnumContext> varvalnum() {
			return getRuleContexts(VarvalnumContext.class);
		}
		public VarvalnumContext varvalnum(int i) {
			return getRuleContext(VarvalnumContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode NOT() { return getToken(LastMinuteParser.NOT, 0); }
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Lm_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lm_boolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitLm_boolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lm_booleanContext lm_boolean() throws RecognitionException {
		Lm_booleanContext _localctx = new Lm_booleanContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lm_boolean);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(223);
					match(NOT);
					}
				}

				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case MINUS:
					{
					setState(226);
					varvalnum();
					}
					break;
				case TEXT:
					{
					setState(227);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << INT) | (1L << MINUS))) != 0)) {
					{
					{
					setState(230);
					calculation();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				operator();
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case MINUS:
					{
					setState(237);
					varvalnum();
					}
					break;
				case TEXT:
					{
					setState(238);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(241);
					match(NOT);
					}
				}

				setState(244);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(245);
					match(NOT);
					}
				}

				setState(248);
				identifier();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			identifier();
			setState(254);
			match(OPENPAR);
			setState(255);
			extendedparams();
			setState(256);
			match(CLOSEPAR);
			setState(257);
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

	public static class AdditionContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LastMinuteParser.PLUS, 0); }
		public VarvalnumContext varvalnum() {
			return getRuleContext(VarvalnumContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PLUS);
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case MINUS:
				{
				setState(260);
				varvalnum();
				}
				break;
			case TEXT:
				{
				setState(261);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SubtractionContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(LastMinuteParser.MINUS, 0); }
		public VarvalnumContext varvalnum() {
			return getRuleContext(VarvalnumContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		SubtractionContext _localctx = new SubtractionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subtraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(MINUS);
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case MINUS:
				{
				setState(265);
				varvalnum();
				}
				break;
			case TEXT:
				{
				setState(266);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultiplicationContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(LastMinuteParser.TIMES, 0); }
		public VarvalnumContext varvalnum() {
			return getRuleContext(VarvalnumContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(TIMES);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case MINUS:
				{
				setState(270);
				varvalnum();
				}
				break;
			case TEXT:
				{
				setState(271);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DivideContext extends ParserRuleContext {
		public TerminalNode DIVIDE() { return getToken(LastMinuteParser.DIVIDE, 0); }
		public VarvalnumContext varvalnum() {
			return getRuleContext(VarvalnumContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(DIVIDE);
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case MINUS:
				{
				setState(275);
				varvalnum();
				}
				break;
			case TEXT:
				{
				setState(276);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IncrementContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(LastMinuteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LastMinuteParser.PLUS, i);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PLUS);
			setState(280);
			match(PLUS);
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

	public static class DecrementContext extends ParserRuleContext {
		public List<TerminalNode> MINUS() { return getTokens(LastMinuteParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LastMinuteParser.MINUS, i);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(MINUS);
			setState(283);
			match(MINUS);
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
		public VarvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalueContext varvalue() throws RecognitionException {
		VarvalueContext _localctx = new VarvalueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varvalue);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				varvalnum();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				varvalstring();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				varvalchar();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				varvalarray();
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

	public static class ArrayvalContext extends ParserRuleContext {
		public VarvalnumContext varvalnum() {
			return getRuleContext(VarvalnumContext.class,0);
		}
		public VarvalstringContext varvalstring() {
			return getRuleContext(VarvalstringContext.class,0);
		}
		public VarvalcharContext varvalchar() {
			return getRuleContext(VarvalcharContext.class,0);
		}
		public ArrayvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitArrayval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayvalContext arrayval() throws RecognitionException {
		ArrayvalContext _localctx = new ArrayvalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayval);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				varvalnum();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				varvalstring();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				varvalchar();
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

	public static class VarvalnumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LastMinuteParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(LastMinuteParser.MINUS, 0); }
		public VarvalnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varvalnum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalnumContext varvalnum() throws RecognitionException {
		VarvalnumContext _localctx = new VarvalnumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varvalnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(296);
				match(MINUS);
				}
			}

			setState(299);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalstringContext varvalstring() throws RecognitionException {
		VarvalstringContext _localctx = new VarvalstringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varvalstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalcharContext varvalchar() throws RecognitionException {
		VarvalcharContext _localctx = new VarvalcharContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varvalchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		public List<ArrayvalContext> arrayval() {
			return getRuleContexts(ArrayvalContext.class);
		}
		public ArrayvalContext arrayval(int i) {
			return getRuleContext(ArrayvalContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitVarvalarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarvalarrayContext varvalarray() throws RecognitionException {
		VarvalarrayContext _localctx = new VarvalarrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varvalarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LT);
			{
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				arrayval();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(307);
					match(COMMA);
					setState(308);
					arrayval();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CHAR) | (1L << INT) | (1L << MINUS))) != 0) );
			}
			setState(318);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(320);
				identifier();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(321);
					match(COMMA);
					setState(322);
					identifier();
					}
					}
					setState(327);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LastMinuteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LastMinuteParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class ExtendedparamsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public List<VarvalnumContext> varvalnum() {
			return getRuleContexts(VarvalnumContext.class);
		}
		public VarvalnumContext varvalnum(int i) {
			return getRuleContext(VarvalnumContext.class,i);
		}
		public List<FunccallContext> funccall() {
			return getRuleContexts(FunccallContext.class);
		}
		public FunccallContext funccall(int i) {
			return getRuleContext(FunccallContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LastMinuteVisitor ) return ((LastMinuteVisitor<? extends T>)visitor).visitExtendedparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedparamsContext extendedparams() throws RecognitionException {
		ExtendedparamsContext _localctx = new ExtendedparamsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_extendedparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << INT) | (1L << MINUS))) != 0)) {
				{
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(332);
					identifier();
					}
					break;
				case 2:
					{
					setState(333);
					calculation();
					}
					break;
				case 3:
					{
					setState(334);
					varvalnum();
					}
					break;
				case 4:
					{
					setState(335);
					funccall();
					}
					break;
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(338);
					match(COMMA);
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(339);
						identifier();
						}
						break;
					case 2:
						{
						setState(340);
						calculation();
						}
						break;
					case 3:
						{
						setState(341);
						varvalnum();
						}
						break;
					case 4:
						{
						setState(342);
						funccall();
						}
						break;
					}
					}
					}
					setState(349);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0163\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3S\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4"+
		"\5\4b\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5"+
		"\3\6\3\6\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00a9\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\13\3\13\3\13\5\13"+
		"\u00b9\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c1\n\13\f\13\16\13\u00c4"+
		"\13\13\3\13\3\13\7\13\u00c8\n\13\f\13\16\13\u00cb\13\13\5\13\u00cd\n\13"+
		"\3\f\5\f\u00d0\n\f\3\f\3\f\5\f\u00d4\n\f\3\f\5\f\u00d7\n\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00dd\n\f\f\f\16\f\u00e0\13\f\3\r\5\r\u00e3\n\r\3\r\3\r\5\r\u00e7"+
		"\n\r\3\r\7\r\u00ea\n\r\f\r\16\r\u00ed\13\r\3\r\3\r\3\r\5\r\u00f2\n\r\3"+
		"\r\5\r\u00f5\n\r\3\r\3\r\5\r\u00f9\n\r\3\r\5\r\u00fc\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u0109\n\20\3\21\3\21\3\21"+
		"\5\21\u010e\n\21\3\22\3\22\3\22\5\22\u0113\n\22\3\23\3\23\3\23\5\23\u0118"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0124\n\26"+
		"\3\27\3\27\3\27\5\27\u0129\n\27\3\30\5\30\u012c\n\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0138\n\33\f\33\16\33\u013b\13"+
		"\33\6\33\u013d\n\33\r\33\16\33\u013e\3\33\3\33\3\34\3\34\3\34\7\34\u0146"+
		"\n\34\f\34\16\34\u0149\13\34\5\34\u014b\n\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\5\36\u0153\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u015a\n\36\7\36\u015c"+
		"\n\36\f\36\16\36\u015f\13\36\5\36\u0161\n\36\3\36\2\2\37\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2 $\3\2\5\n\3\2"+
		"\25\26\u0188\2?\3\2\2\2\4H\3\2\2\2\6V\3\2\2\2\bn\3\2\2\2\nq\3\2\2\2\f"+
		"u\3\2\2\2\16w\3\2\2\2\20\u0093\3\2\2\2\22\u009b\3\2\2\2\24\u00a8\3\2\2"+
		"\2\26\u00d6\3\2\2\2\30\u00fb\3\2\2\2\32\u00fd\3\2\2\2\34\u00ff\3\2\2\2"+
		"\36\u0105\3\2\2\2 \u010a\3\2\2\2\"\u010f\3\2\2\2$\u0114\3\2\2\2&\u0119"+
		"\3\2\2\2(\u011c\3\2\2\2*\u0123\3\2\2\2,\u0128\3\2\2\2.\u012b\3\2\2\2\60"+
		"\u012f\3\2\2\2\62\u0131\3\2\2\2\64\u0133\3\2\2\2\66\u014a\3\2\2\28\u014c"+
		"\3\2\2\2:\u0160\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@E\3\2\2\2A?\3\2\2\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\3\3\2\2\2GE\3\2\2\2HJ\5\n\6\2IK\t\2\2\2JI\3\2\2\2JK\3\2\2\2KL\3"+
		"\2\2\2LM\7\33\2\2MR\3\2\2\2NS\5*\26\2OS\5\24\13\2PS\5\n\6\2QS\58\35\2"+
		"RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TU\7\32\2\2U\5\3\2\2"+
		"\2VW\5\n\6\2WX\7\34\2\2XY\5\66\34\2YZ\7\35\2\2Z[\7\36\2\2[a\5\b\5\2\\"+
		"_\7\16\2\2]`\5\n\6\2^`\5*\26\2_]\3\2\2\2_^\3\2\2\2`b\3\2\2\2a\\\3\2\2"+
		"\2ab\3\2\2\2bc\3\2\2\2cd\7\37\2\2d\7\3\2\2\2em\5\4\3\2fm\5\34\17\2gm\5"+
		"\f\7\2hm\5\16\b\2ij\5\24\13\2jk\7\32\2\2km\3\2\2\2le\3\2\2\2lf\3\2\2\2"+
		"lg\3\2\2\2lh\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\t\3\2\2"+
		"\2pn\3\2\2\2qr\7\23\2\2r\13\3\2\2\2sv\5\22\n\2tv\5\20\t\2us\3\2\2\2ut"+
		"\3\2\2\2v\r\3\2\2\2wx\7\21\2\2xy\7\34\2\2yz\5\26\f\2z{\7\35\2\2{|\7\36"+
		"\2\2|}\5\b\5\2}\u0089\7\37\2\2~\177\7\22\2\2\177\u0080\7\21\2\2\u0080"+
		"\u0081\7\34\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7\35\2\2\u0083\u0084"+
		"\7\36\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7\37\2\2\u0086\u0088\3\2\2\2"+
		"\u0087~\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u0091\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\22\2\2\u008d"+
		"\u008e\7\36\2\2\u008e\u008f\5\b\5\2\u008f\u0090\7\37\2\2\u0090\u0092\3"+
		"\2\2\2\u0091\u008c\3\2\2\2\u0091\u0092\3\2\2\2\u0092\17\3\2\2\2\u0093"+
		"\u0094\7\20\2\2\u0094\u0095\7\34\2\2\u0095\u0096\5\26\f\2\u0096\u0097"+
		"\7\35\2\2\u0097\u0098\7\36\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7\37\2"+
		"\2\u009a\21\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\7\34\2\2\u009d\u009e"+
		"\5\4\3\2\u009e\u009f\5\26\f\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\5\24\13"+
		"\2\u00a1\u00a2\7\35\2\2\u00a2\u00a3\7\36\2\2\u00a3\u00a4\5\b\5\2\u00a4"+
		"\u00a5\7\37\2\2\u00a5\23\3\2\2\2\u00a6\u00a9\5.\30\2\u00a7\u00a9\5\n\6"+
		"\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00cc\3\2\2\2\u00aa\u00b1"+
		"\5\"\22\2\u00ab\u00b1\5$\23\2\u00ac\u00b1\5\36\20\2\u00ad\u00b1\5 \21"+
		"\2\u00ae\u00b1\5&\24\2\u00af\u00b1\5(\25\2\u00b0\u00aa\3\2\2\2\u00b0\u00ab"+
		"\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00cd\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\7\34\2\2\u00b6"+
		"\u00b9\5.\30\2\u00b7\u00b9\5\n\6\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\u00c2\3\2\2\2\u00ba\u00c1\5\"\22\2\u00bb\u00c1\5$\23\2\u00bc"+
		"\u00c1\5\36\20\2\u00bd\u00c1\5 \21\2\u00be\u00c1\5&\24\2\u00bf\u00c1\5"+
		"(\25\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0"+
		"\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b5\3"+
		"\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00b2\3\2\2\2\u00cc\u00c9\3\2"+
		"\2\2\u00cd\25\3\2\2\2\u00ce\u00d0\7\r\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d4\5\n\6\2\u00d2\u00d4\58\35\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5\30"+
		"\r\2\u00d6\u00cf\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00de\3\2\2\2\u00d8"+
		"\u00d9\7\13\2\2\u00d9\u00dd\5\30\r\2\u00da\u00db\7\f\2\2\u00db\u00dd\5"+
		"\30\r\2\u00dc\u00d8\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\27\3\2\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e1\u00e3\7\r\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e7\5.\30\2\u00e5\u00e7\5\n\6\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea\5\24\13\2\u00e9\u00e8\3"+
		"\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\5\32\16\2\u00ef\u00f2\5"+
		".\30\2\u00f0\u00f2\5\n\6\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00fc\3\2\2\2\u00f3\u00f5\7\r\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fc\58\35\2\u00f7\u00f9\7\r\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\5\n"+
		"\6\2\u00fb\u00e2\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc"+
		"\31\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe\33\3\2\2\2\u00ff\u0100\5\n\6\2\u0100"+
		"\u0101\7\34\2\2\u0101\u0102\5:\36\2\u0102\u0103\7\35\2\2\u0103\u0104\7"+
		"\32\2\2\u0104\35\3\2\2\2\u0105\u0108\7 \2\2\u0106\u0109\5.\30\2\u0107"+
		"\u0109\5\n\6\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\37\3\2\2"+
		"\2\u010a\u010d\7!\2\2\u010b\u010e\5.\30\2\u010c\u010e\5\n\6\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010e!\3\2\2\2\u010f\u0112\7\"\2\2\u0110"+
		"\u0113\5.\30\2\u0111\u0113\5\n\6\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2"+
		"\2\2\u0113#\3\2\2\2\u0114\u0117\7#\2\2\u0115\u0118\5.\30\2\u0116\u0118"+
		"\5\n\6\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118%\3\2\2\2\u0119"+
		"\u011a\7 \2\2\u011a\u011b\7 \2\2\u011b\'\3\2\2\2\u011c\u011d\7!\2\2\u011d"+
		"\u011e\7!\2\2\u011e)\3\2\2\2\u011f\u0124\5.\30\2\u0120\u0124\5\60\31\2"+
		"\u0121\u0124\5\62\32\2\u0122\u0124\5\64\33\2\u0123\u011f\3\2\2\2\u0123"+
		"\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124+\3\2\2\2"+
		"\u0125\u0129\5.\30\2\u0126\u0129\5\60\31\2\u0127\u0129\5\62\32\2\u0128"+
		"\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129-\3\2\2\2"+
		"\u012a\u012c\7!\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\7\24\2\2\u012e/\3\2\2\2\u012f\u0130\7\3\2\2\u0130"+
		"\61\3\2\2\2\u0131\u0132\7\4\2\2\u0132\63\3\2\2\2\u0133\u013c\7\b\2\2\u0134"+
		"\u0139\5,\27\2\u0135\u0136\7\27\2\2\u0136\u0138\5,\27\2\u0137\u0135\3"+
		"\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0134\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\7\7\2\2\u0141\65\3\2\2\2\u0142\u0147\5\n\6\2\u0143\u0144\7\27\2"+
		"\2\u0144\u0146\5\n\6\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u0142\3\2\2\2\u014a\u014b\3\2\2\2\u014b\67\3\2\2\2\u014c\u014d\t\4\2"+
		"\2\u014d9\3\2\2\2\u014e\u0153\5\n\6\2\u014f\u0153\5\24\13\2\u0150\u0153"+
		"\5.\30\2\u0151\u0153\5\34\17\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2\2\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u015d\3\2\2\2\u0154\u0159"+
		"\7\27\2\2\u0155\u015a\5\n\6\2\u0156\u015a\5\24\13\2\u0157\u015a\5.\30"+
		"\2\u0158\u015a\5\34\17\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0154\3\2"+
		"\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0152\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161;\3\2\2\2\60?EJR_alnu\u0089\u0091\u00a8\u00b0\u00b2\u00b8\u00c0"+
		"\u00c2\u00c9\u00cc\u00cf\u00d3\u00d6\u00dc\u00de\u00e2\u00e6\u00eb\u00f1"+
		"\u00f4\u00f8\u00fb\u0108\u010d\u0112\u0117\u0123\u0128\u012b\u0139\u013e"+
		"\u0147\u014a\u0152\u0159\u015d\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}