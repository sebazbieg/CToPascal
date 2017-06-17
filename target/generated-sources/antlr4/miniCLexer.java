// Generated from miniC.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Identifier=6, RelationalOperation=7, 
		ArithmeticOperation=8, LogicalOperation=9, Else=10, While=11, If=12, Word=13, 
		Number=14, Floating=15, Lib=16, Param=17, Less=18, LessEqual=19, Greater=20, 
		GreaterEqual=21, Equal=22, NotEqual=23, And=24, Or=25, Not=26, Plus=27, 
		Minus=28, Star=29, Div=30, Mod=31, Assign=32, Const=33, Double=34, Float=35, 
		Int=36, Long=37, Short=38, LeftParen=39, RightParen=40, LeftBrace=41, 
		RightBrace=42, Semi=43, Comma=44, QuotationMarks=45, Whitespace=46, Newline=47, 
		BlockComment=48, LineComment=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "Identifier", "RelationalOperation", 
		"ArithmeticOperation", "LogicalOperation", "Else", "While", "If", "Word", 
		"Number", "Floating", "Lib", "Param", "Less", "LessEqual", "Greater", 
		"GreaterEqual", "Equal", "NotEqual", "And", "Or", "Not", "Plus", "Minus", 
		"Star", "Div", "Mod", "Assign", "Const", "Double", "Float", "Int", "Long", 
		"Short", "LeftParen", "RightParen", "LeftBrace", "RightBrace", "Semi", 
		"Comma", "QuotationMarks", "Nondigit", "Digit", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include'", "'int main()'", "'scanf'", "'&'", "'printf'", null, 
		null, null, null, null, null, null, null, null, null, "'<stdio.h>'", null, 
		"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'='", "'const '", "'double'", "'float'", 
		"'int'", "'long'", "'short'", "'('", "')'", "'{'", "'}'", "';'", "','", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "Identifier", "RelationalOperation", 
		"ArithmeticOperation", "LogicalOperation", "Else", "While", "If", "Word", 
		"Number", "Floating", "Lib", "Param", "Less", "LessEqual", "Greater", 
		"GreaterEqual", "Equal", "NotEqual", "And", "Or", "Not", "Plus", "Minus", 
		"Star", "Div", "Mod", "Assign", "Const", "Double", "Float", "Int", "Long", 
		"Short", "LeftParen", "RightParen", "LeftBrace", "RightBrace", "Semi", 
		"Comma", "QuotationMarks", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public miniCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u0176\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009a"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a1\n\t\3\n\3\n\3\n\5\n\u00a6\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\16\7\16\u00d0\n\16\f\16\16"+
		"\16\u00d3\13\16\3\17\3\17\3\17\6\17\u00d8\n\17\r\17\16\17\u00d9\5\17\u00dc"+
		"\n\17\3\20\3\20\3\20\6\20\u00e1\n\20\r\20\16\20\u00e2\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00f3\n\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\6\61\u014f\n\61\r\61\16\61\u0150\3\61\3\61\3\62\3\62\5\62\u0157"+
		"\n\62\3\62\5\62\u015a\n\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0162\n"+
		"\63\f\63\16\63\u0165\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\7\64\u0170\n\64\f\64\16\64\u0173\13\64\3\64\3\64\3\u0163\2\65\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\60c\61e\62g\63\3\2\7\3\2\63;\5\2C\\"+
		"aac|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\u0190\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2"+
		"\2\2\5r\3\2\2\2\7}\3\2\2\2\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r\u0091\3"+
		"\2\2\2\17\u0099\3\2\2\2\21\u00a0\3\2\2\2\23\u00a5\3\2\2\2\25\u00b0\3\2"+
		"\2\2\27\u00c0\3\2\2\2\31\u00ca\3\2\2\2\33\u00cc\3\2\2\2\35\u00db\3\2\2"+
		"\2\37\u00dd\3\2\2\2!\u00e4\3\2\2\2#\u00f2\3\2\2\2%\u00f4\3\2\2\2\'\u00f6"+
		"\3\2\2\2)\u00f9\3\2\2\2+\u00fb\3\2\2\2-\u00fe\3\2\2\2/\u0101\3\2\2\2\61"+
		"\u0104\3\2\2\2\63\u0107\3\2\2\2\65\u010a\3\2\2\2\67\u010c\3\2\2\29\u010e"+
		"\3\2\2\2;\u0110\3\2\2\2=\u0112\3\2\2\2?\u0114\3\2\2\2A\u0116\3\2\2\2C"+
		"\u0118\3\2\2\2E\u011f\3\2\2\2G\u0126\3\2\2\2I\u012c\3\2\2\2K\u0130\3\2"+
		"\2\2M\u0135\3\2\2\2O\u013b\3\2\2\2Q\u013d\3\2\2\2S\u013f\3\2\2\2U\u0141"+
		"\3\2\2\2W\u0143\3\2\2\2Y\u0145\3\2\2\2[\u0147\3\2\2\2]\u0149\3\2\2\2_"+
		"\u014b\3\2\2\2a\u014e\3\2\2\2c\u0159\3\2\2\2e\u015d\3\2\2\2g\u016b\3\2"+
		"\2\2ij\7%\2\2jk\7k\2\2kl\7p\2\2lm\7e\2\2mn\7n\2\2no\7w\2\2op\7f\2\2pq"+
		"\7g\2\2q\4\3\2\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2uv\7\"\2\2vw\7o\2\2wx\7c"+
		"\2\2xy\7k\2\2yz\7p\2\2z{\7*\2\2{|\7+\2\2|\6\3\2\2\2}~\7u\2\2~\177\7e\2"+
		"\2\177\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082\7h\2\2\u0082\b\3\2"+
		"\2\2\u0083\u0084\7(\2\2\u0084\n\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7h\2\2\u008b\f\3\2\2\2\u008c\u0092\5I%\2\u008d\u0092\5G$\2\u008e"+
		"\u0092\5K&\2\u008f\u0092\5M\'\2\u0090\u0092\5E#\2\u0091\u008c\3\2\2\2"+
		"\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\16\3\2\2\2\u0093\u009a\5%\23\2\u0094\u009a\5\'\24\2\u0095"+
		"\u009a\5)\25\2\u0096\u009a\5+\26\2\u0097\u009a\5-\27\2\u0098\u009a\5/"+
		"\30\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\20\3\2\2"+
		"\2\u009b\u00a1\5\67\34\2\u009c\u00a1\59\35\2\u009d\u00a1\5;\36\2\u009e"+
		"\u00a1\5=\37\2\u009f\u00a1\5? \2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2"+
		"\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\22"+
		"\3\2\2\2\u00a2\u00a6\5\61\31\2\u00a3\u00a6\5\63\32\2\u00a4\u00a6\5\65"+
		"\33\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\24\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00b1\7g\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2"+
		"\u00ae\u00af\7g\2\2\u00af\u00b1\7\"\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00ab"+
		"\3\2\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00c1\7*\2\2"+
		"\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\5O(\2\u00c0\u00b2\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c1\30\3\2\2\2"+
		"\u00c2\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4\u00cb\7*\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\5O(\2\u00ca\u00c2\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\32\3\2\2\2"+
		"\u00cc\u00d1\5]/\2\u00cd\u00d0\5]/\2\u00ce\u00d0\5_\60\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\34\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00dc\5_\60"+
		"\2\u00d5\u00d7\t\2\2\2\u00d6\u00d8\5_\60\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d4\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc\36\3\2\2\2\u00dd\u00de\5\35\17"+
		"\2\u00de\u00e0\7\60\2\2\u00df\u00e1\5_\60\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3 \3\2\2\2"+
		"\u00e4\u00e5\7>\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8"+
		"\7f\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7\60\2\2\u00eb"+
		"\u00ec\7j\2\2\u00ec\u00ed\7@\2\2\u00ed\"\3\2\2\2\u00ee\u00ef\7\'\2\2\u00ef"+
		"\u00f3\7f\2\2\u00f0\u00f1\7\'\2\2\u00f1\u00f3\7h\2\2\u00f2\u00ee\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3$\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5&\3\2\2"+
		"\2\u00f6\u00f7\7>\2\2\u00f7\u00f8\7?\2\2\u00f8(\3\2\2\2\u00f9\u00fa\7"+
		"@\2\2\u00fa*\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2\2\u00fd,\3\2"+
		"\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100\7?\2\2\u0100.\3\2\2\2\u0101\u0102"+
		"\7#\2\2\u0102\u0103\7?\2\2\u0103\60\3\2\2\2\u0104\u0105\7(\2\2\u0105\u0106"+
		"\7(\2\2\u0106\62\3\2\2\2\u0107\u0108\7~\2\2\u0108\u0109\7~\2\2\u0109\64"+
		"\3\2\2\2\u010a\u010b\7#\2\2\u010b\66\3\2\2\2\u010c\u010d\7-\2\2\u010d"+
		"8\3\2\2\2\u010e\u010f\7/\2\2\u010f:\3\2\2\2\u0110\u0111\7,\2\2\u0111<"+
		"\3\2\2\2\u0112\u0113\7\61\2\2\u0113>\3\2\2\2\u0114\u0115\7\'\2\2\u0115"+
		"@\3\2\2\2\u0116\u0117\7?\2\2\u0117B\3\2\2\2\u0118\u0119\7e\2\2\u0119\u011a"+
		"\7q\2\2\u011a\u011b\7p\2\2\u011b\u011c\7u\2\2\u011c\u011d\7v\2\2\u011d"+
		"\u011e\7\"\2\2\u011eD\3\2\2\2\u011f\u0120\7f\2\2\u0120\u0121\7q\2\2\u0121"+
		"\u0122\7w\2\2\u0122\u0123\7d\2\2\u0123\u0124\7n\2\2\u0124\u0125\7g\2\2"+
		"\u0125F\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\7n\2\2\u0128\u0129\7q\2"+
		"\2\u0129\u012a\7c\2\2\u012a\u012b\7v\2\2\u012bH\3\2\2\2\u012c\u012d\7"+
		"k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7v\2\2\u012fJ\3\2\2\2\u0130\u0131"+
		"\7n\2\2\u0131\u0132\7q\2\2\u0132\u0133\7p\2\2\u0133\u0134\7i\2\2\u0134"+
		"L\3\2\2\2\u0135\u0136\7u\2\2\u0136\u0137\7j\2\2\u0137\u0138\7q\2\2\u0138"+
		"\u0139\7t\2\2\u0139\u013a\7v\2\2\u013aN\3\2\2\2\u013b\u013c\7*\2\2\u013c"+
		"P\3\2\2\2\u013d\u013e\7+\2\2\u013eR\3\2\2\2\u013f\u0140\7}\2\2\u0140T"+
		"\3\2\2\2\u0141\u0142\7\177\2\2\u0142V\3\2\2\2\u0143\u0144\7=\2\2\u0144"+
		"X\3\2\2\2\u0145\u0146\7.\2\2\u0146Z\3\2\2\2\u0147\u0148\7$\2\2\u0148\\"+
		"\3\2\2\2\u0149\u014a\t\3\2\2\u014a^\3\2\2\2\u014b\u014c\t\4\2\2\u014c"+
		"`\3\2\2\2\u014d\u014f\t\5\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153"+
		"\b\61\2\2\u0153b\3\2\2\2\u0154\u0156\7\17\2\2\u0155\u0157\7\f\2\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u015a\7\f"+
		"\2\2\u0159\u0154\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\b\62\2\2\u015cd\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7,\2\2"+
		"\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7,\2\2\u0167\u0168\7\61\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\b\63\2\2\u016af\3\2\2\2\u016b\u016c\7\61\2\2\u016c\u016d"+
		"\7\61\2\2\u016d\u0171\3\2\2\2\u016e\u0170\n\6\2\2\u016f\u016e\3\2\2\2"+
		"\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\b\64\2\2\u0175h\3\2\2\2\25\2"+
		"\u0091\u0099\u00a0\u00a5\u00b0\u00c0\u00ca\u00cf\u00d1\u00d9\u00db\u00e2"+
		"\u00f2\u0150\u0156\u0159\u0163\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}