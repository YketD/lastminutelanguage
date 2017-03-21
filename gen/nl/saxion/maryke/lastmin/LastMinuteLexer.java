// Generated from D:/school/antlr_grammar\LastMinute.g4 by ANTLR 4.6
package nl.saxion.maryke.lastmin;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LastMinuteLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "CHAR", "EQUALS", "NOTEQUAL", "GT", "LT", "GTE", "LTE", "AND", 
		"OR", "NOT", "RETURN", "FOR", "WHILE", "IF", "ELSE", "TEXT", "INT", "TRUE", 
		"FALSE", "COMMA", "QUOTE", "SQUOTE", "ENDL", "MAKEEQUAL", "OPENPAR", "CLOSEPAR", 
		"OPENBRACES", "CLOSEBRACES", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULO", 
		"POWER", "WS"
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


	public LastMinuteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LastMinute.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\6\2N\n\2\r\2\16\2O\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\6\22\u008a\n\22\r\22\16\22\u008b\3\23\6\23\u008f"+
		"\n\23\r\23\16\23\u0090\3\24\3\24\3\24\3\24\3\24\5\24\u0098\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u00a0\n\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u00c1\n%\r%\16%\u00c2\3%\3%\2\2"+
		"&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&\3\2\6\5\2\"\"C\\c|\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\""+
		"\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\tZ\3\2\2\2\13]\3"+
		"\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21d\3\2\2\2\23g\3\2\2\2\25j\3\2\2\2\27m"+
		"\3\2\2\2\31o\3\2\2\2\33v\3\2\2\2\35z\3\2\2\2\37\u0080\3\2\2\2!\u0083\3"+
		"\2\2\2#\u0089\3\2\2\2%\u008e\3\2\2\2\'\u0097\3\2\2\2)\u009f\3\2\2\2+\u00a1"+
		"\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2"+
		"\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b1\3\2\2\2=\u00b3"+
		"\3\2\2\2?\u00b5\3\2\2\2A\u00b7\3\2\2\2C\u00b9\3\2\2\2E\u00bb\3\2\2\2G"+
		"\u00bd\3\2\2\2I\u00c0\3\2\2\2KM\5-\27\2LN\t\2\2\2ML\3\2\2\2NO\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5-\27\2R\4\3\2\2\2ST\5/\30\2TU\t\3\2"+
		"\2UV\5/\30\2V\6\3\2\2\2WX\7?\2\2XY\7?\2\2Y\b\3\2\2\2Z[\7#\2\2[\\\7?\2"+
		"\2\\\n\3\2\2\2]^\7@\2\2^\f\3\2\2\2_`\7>\2\2`\16\3\2\2\2ab\7@\2\2bc\7?"+
		"\2\2c\20\3\2\2\2de\7>\2\2ef\7?\2\2f\22\3\2\2\2gh\7(\2\2hi\7(\2\2i\24\3"+
		"\2\2\2jk\7~\2\2kl\7~\2\2l\26\3\2\2\2mn\7#\2\2n\30\3\2\2\2op\7t\2\2pq\7"+
		"g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2\2u\32\3\2\2\2vw\7h\2\2wx\7q\2"+
		"\2xy\7t\2\2y\34\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2"+
		"\2\177\36\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082 \3\2\2\2"+
		"\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7g\2\2\u0087\"\3\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c$\3\2\2\2"+
		"\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091&\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094"+
		"\7t\2\2\u0094\u0095\7w\2\2\u0095\u0098\7g\2\2\u0096\u0098\7\63\2\2\u0097"+
		"\u0092\3\2\2\2\u0097\u0096\3\2\2\2\u0098(\3\2\2\2\u0099\u009a\7h\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u00a0\7g\2\2"+
		"\u009e\u00a0\7\62\2\2\u009f\u0099\3\2\2\2\u009f\u009e\3\2\2\2\u00a0*\3"+
		"\2\2\2\u00a1\u00a2\7.\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4.\3\2"+
		"\2\2\u00a5\u00a6\7)\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7=\2\2\u00a8\62\3"+
		"\2\2\2\u00a9\u00aa\7<\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac\66"+
		"\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae8\3\2\2\2\u00af\u00b0\7}\2\2\u00b0:\3"+
		"\2\2\2\u00b1\u00b2\7\177\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4>"+
		"\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6@\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8B\3"+
		"\2\2\2\u00b9\u00ba\7\61\2\2\u00baD\3\2\2\2\u00bb\u00bc\7\'\2\2\u00bcF"+
		"\3\2\2\2\u00bd\u00be\7`\2\2\u00beH\3\2\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\b%\2\2\u00c5J\3\2\2\2\t\2O\u008b\u0090\u0097"+
		"\u009f\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}