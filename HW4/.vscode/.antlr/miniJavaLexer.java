// Generated from c:\Users\Sajjad\Documents\University\Semester 8\Compiler\HW4\HW4\.vscode\miniJavaAST.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, IDENTIFIER=34, DECIMAL_LITERAL=35, HEX_LITERAL=36, 
		OCT_LITERAL=37, BINARY_LITERAL=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"IDENTIFIER", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
			"Digits", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
			"'int'", "'boolean'", "'if'", "'System.out.println'", "'='", "'&&'", 
			"'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'true'", "'false'", "'this'", 
			"'new'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "IDENTIFIER", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public miniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniJavaAST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\7#\u00ea\n#\f#\16#\u00ed\13#\3$\3$\3"+
		"$\5$\u00f2\n$\3$\6$\u00f5\n$\r$\16$\u00f6\3$\5$\u00fa\n$\5$\u00fc\n$\3"+
		"$\5$\u00ff\n$\3%\3%\3%\3%\7%\u0105\n%\f%\16%\u0108\13%\3%\5%\u010b\n%"+
		"\3%\5%\u010e\n%\3&\3&\7&\u0112\n&\f&\16&\u0115\13&\3&\3&\7&\u0119\n&\f"+
		"&\16&\u011c\13&\3&\5&\u011f\n&\3&\5&\u0122\n&\3\'\3\'\3\'\3\'\7\'\u0128"+
		"\n\'\f\'\16\'\u012b\13\'\3\'\5\'\u012e\n\'\3\'\5\'\u0131\n\'\3(\3(\7("+
		"\u0135\n(\f(\16(\u0138\13(\3(\5(\u013b\n(\3)\3)\5)\u013f\n)\3*\3*\3*\3"+
		"*\5*\u0145\n*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2\3\2\22\3\2\63;\4\2N"+
		"Nnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd\3\2\62"+
		"\63\4\2\62\63aa\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\2\u0157\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\3U\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\td\3\2\2\2\13k\3\2\2\2\rp\3\2"+
		"\2\2\17u\3\2\2\2\21w\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2"+
		"\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2\2"+
		"\2!\u0092\3\2\2\2#\u0099\3\2\2\2%\u009d\3\2\2\2\'\u00a5\3\2\2\2)\u00a8"+
		"\3\2\2\2+\u00bb\3\2\2\2-\u00bd\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2"+
		"\63\u00c4\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00ca\3\2\2\2;\u00d1"+
		"\3\2\2\2=\u00d6\3\2\2\2?\u00dc\3\2\2\2A\u00e1\3\2\2\2C\u00e5\3\2\2\2E"+
		"\u00e7\3\2\2\2G\u00fb\3\2\2\2I\u0100\3\2\2\2K\u010f\3\2\2\2M\u0123\3\2"+
		"\2\2O\u0132\3\2\2\2Q\u013e\3\2\2\2S\u0144\3\2\2\2UV\7e\2\2VW\7n\2\2WX"+
		"\7c\2\2XY\7u\2\2YZ\7u\2\2Z\4\3\2\2\2[\\\7}\2\2\\\6\3\2\2\2]^\7r\2\2^_"+
		"\7w\2\2_`\7d\2\2`a\7n\2\2ab\7k\2\2bc\7e\2\2c\b\3\2\2\2de\7u\2\2ef\7v\2"+
		"\2fg\7c\2\2gh\7v\2\2hi\7k\2\2ij\7e\2\2j\n\3\2\2\2kl\7x\2\2lm\7q\2\2mn"+
		"\7k\2\2no\7f\2\2o\f\3\2\2\2pq\7o\2\2qr\7c\2\2rs\7k\2\2st\7p\2\2t\16\3"+
		"\2\2\2uv\7*\2\2v\20\3\2\2\2wx\7U\2\2xy\7v\2\2yz\7t\2\2z{\7k\2\2{|\7p\2"+
		"\2|}\7i\2\2}\22\3\2\2\2~\177\7]\2\2\177\24\3\2\2\2\u0080\u0081\7_\2\2"+
		"\u0081\26\3\2\2\2\u0082\u0083\7+\2\2\u0083\30\3\2\2\2\u0084\u0085\7\177"+
		"\2\2\u0085\32\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7z\2\2\u0088\u0089"+
		"\7v\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c"+
		"\u008d\7u\2\2\u008d\34\3\2\2\2\u008e\u008f\7=\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7.\2\2\u0091 \3\2\2\2\u0092\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7w\2\2\u0096\u0097\7t\2\2\u0097\u0098\7p\2\2"+
		"\u0098\"\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v"+
		"\2\2\u009c$\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7q\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a9\7U\2\2\u00a9\u00aa\7{\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7o\2\2\u00ae\u00af\7\60\2"+
		"\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3"+
		"\7\60\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7p\2\2"+
		"\u00ba*\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc,\3\2\2\2\u00bd\u00be\7(\2\2\u00be"+
		"\u00bf\7(\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\60\3\2\2\2\u00c2"+
		"\u00c3\7-\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\64\3\2\2\2\u00c6"+
		"\u00c7\7,\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7\60\2\2\u00c98\3\2\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7i\2\2"+
		"\u00ce\u00cf\7v\2\2\u00cf\u00d0\7j\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7v\2"+
		"\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7g\2\2\u00d5<\3\2"+
		"\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da"+
		"\7u\2\2\u00da\u00db\7g\2\2\u00db>\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de"+
		"\7j\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7u\2\2\u00e0@\3\2\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7y\2\2\u00e4B\3\2\2\2\u00e5\u00e6"+
		"\7#\2\2\u00e6D\3\2\2\2\u00e7\u00eb\5S*\2\u00e8\u00ea\5Q)\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"F\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00fc\7\62\2\2\u00ef\u00f9\t\2\2\2"+
		"\u00f0\u00f2\5O(\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fa"+
		"\3\2\2\2\u00f3\u00f5\7a\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\5O"+
		"(\2\u00f9\u00f1\3\2\2\2\u00f9\u00f4\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00ee\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\t\3"+
		"\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffH\3\2\2\2\u0100\u0101"+
		"\7\62\2\2\u0101\u0102\t\4\2\2\u0102\u010a\t\5\2\2\u0103\u0105\t\6\2\2"+
		"\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\t\5\2\2\u010a"+
		"\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\t\3"+
		"\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010eJ\3\2\2\2\u010f\u0113"+
		"\7\62\2\2\u0110\u0112\7a\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u011e\t\7\2\2\u0117\u0119\t\b\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u011f\t\7\2\2\u011e\u011a\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0122\t\3\2\2\u0121\u0120\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122L\3\2\2\2\u0123\u0124\7\62\2\2\u0124\u0125"+
		"\t\t\2\2\u0125\u012d\t\n\2\2\u0126\u0128\t\13\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\t\n\2\2\u012d\u0129\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131\t\3\2\2\u0130\u012f\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131N\3\2\2\2\u0132\u013a\t\f\2\2\u0133\u0135"+
		"\t\r\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\t\f"+
		"\2\2\u013a\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013bP\3\2\2\2\u013c\u013f"+
		"\5S*\2\u013d\u013f\t\f\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"R\3\2\2\2\u0140\u0145\t\16\2\2\u0141\u0145\n\17\2\2\u0142\u0143\t\20\2"+
		"\2\u0143\u0145\t\21\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145T\3\2\2\2\27\2\u00eb\u00f1\u00f6\u00f9\u00fb\u00fe"+
		"\u0106\u010a\u010d\u0113\u011a\u011e\u0121\u0129\u012d\u0130\u0136\u013a"+
		"\u013e\u0144\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}