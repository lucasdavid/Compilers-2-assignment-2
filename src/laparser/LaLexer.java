// Generated from C:\Users\Usuario\Documents\GitHub\Compilers-2-assignment-1\src\grammar\La.g4 by ANTLR 4.1
package laparser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__59=1, T__58=2, T__57=3, T__56=4, T__55=5, T__54=6, T__53=7, T__52=8, 
		T__51=9, T__50=10, T__49=11, T__48=12, T__47=13, T__46=14, T__45=15, T__44=16, 
		T__43=17, T__42=18, T__41=19, T__40=20, T__39=21, T__38=22, T__37=23, 
		T__36=24, T__35=25, T__34=26, T__33=27, T__32=28, T__31=29, T__30=30, 
		T__29=31, T__28=32, T__27=33, T__26=34, T__25=35, T__24=36, T__23=37, 
		T__22=38, T__21=39, T__20=40, T__19=41, T__18=42, T__17=43, T__16=44, 
		T__15=45, T__14=46, T__13=47, T__12=48, T__11=49, T__10=50, T__9=51, T__8=52, 
		T__7=53, T__6=54, T__5=55, T__4=56, T__3=57, T__2=58, T__1=59, T__0=60, 
		IDENT=61, CADEIA=62, NUM_INT=63, NUM_REAL=64, COMENTARIO=65, WS=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'retorne'", "'algoritmo'", "'constante'", "'..'", "'='", "'faca'", "'^'", 
		"'literal'", "'nao'", "'ou'", "'fim_algoritmo'", "'seja'", "'('", "'para'", 
		"'fim_caso'", "'entao'", "'declare'", "','", "'verdadeiro'", "'<-'", "'var'", 
		"'logico'", "'senao'", "'registro'", "'fim_procedimento'", "'>='", "'<'", 
		"']'", "'<>'", "'caso'", "'e'", "'enquanto'", "'+'", "'fim_para'", "'/'", 
		"'fim_registro'", "'fim_se'", "'ate'", "'<='", "'procedimento'", "'falso'", 
		"'&'", "'*'", "'.'", "'se'", "'):'", "'fim_enquanto'", "'fim_funcao'", 
		"'inteiro'", "':'", "'['", "'>'", "'escreva'", "'tipo'", "'%'", "')'", 
		"'funcao'", "'-'", "'leia'", "'real'", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", 
		"COMENTARIO", "WS"
	};
	public static final String[] ruleNames = {
		"T__59", "T__58", "T__57", "T__56", "T__55", "T__54", "T__53", "T__52", 
		"T__51", "T__50", "T__49", "T__48", "T__47", "T__46", "T__45", "T__44", 
		"T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", "T__36", 
		"T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", 
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", 
		"WS"
	};

	 //Cria um objeto pilhaDeTabelas 
	    infrastructure.PilhaDeTabelas pilhaDeTabelas = new infrastructure.PilhaDeTabelas();


	public LaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 64: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;

		case 65: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2D\u0202\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\7>\u01d8\n>\f>\16>\u01db\13>\3"+
		"?\3?\7?\u01df\n?\f?\16?\u01e2\13?\3?\3?\3@\6@\u01e7\n@\r@\16@\u01e8\3"+
		"A\6A\u01ec\nA\rA\16A\u01ed\3A\3A\6A\u01f2\nA\rA\16A\u01f3\3B\3B\7B\u01f8"+
		"\nB\fB\16B\u01fb\13B\3B\3B\3B\3C\3C\3C\2D\3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1"+
		"\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1"+
		"Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67"+
		"\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\2\u0085"+
		"D\3\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\5\2\f\f\17\17\177"+
		"\177\5\2\13\f\17\17\"\"\u0207\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u008f\3\2\2"+
		"\2\7\u0099\3\2\2\2\t\u00a3\3\2\2\2\13\u00a6\3\2\2\2\r\u00a8\3\2\2\2\17"+
		"\u00ad\3\2\2\2\21\u00af\3\2\2\2\23\u00b7\3\2\2\2\25\u00bb\3\2\2\2\27\u00be"+
		"\3\2\2\2\31\u00cc\3\2\2\2\33\u00d1\3\2\2\2\35\u00d3\3\2\2\2\37\u00d8\3"+
		"\2\2\2!\u00e1\3\2\2\2#\u00e7\3\2\2\2%\u00ef\3\2\2\2\'\u00f1\3\2\2\2)\u00fc"+
		"\3\2\2\2+\u00ff\3\2\2\2-\u0103\3\2\2\2/\u010a\3\2\2\2\61\u0110\3\2\2\2"+
		"\63\u0119\3\2\2\2\65\u012a\3\2\2\2\67\u012d\3\2\2\29\u012f\3\2\2\2;\u0131"+
		"\3\2\2\2=\u0134\3\2\2\2?\u0139\3\2\2\2A\u013b\3\2\2\2C\u0144\3\2\2\2E"+
		"\u0146\3\2\2\2G\u014f\3\2\2\2I\u0151\3\2\2\2K\u015e\3\2\2\2M\u0165\3\2"+
		"\2\2O\u0169\3\2\2\2Q\u016c\3\2\2\2S\u0179\3\2\2\2U\u017f\3\2\2\2W\u0181"+
		"\3\2\2\2Y\u0183\3\2\2\2[\u0185\3\2\2\2]\u0188\3\2\2\2_\u018b\3\2\2\2a"+
		"\u0198\3\2\2\2c\u01a3\3\2\2\2e\u01ab\3\2\2\2g\u01ad\3\2\2\2i\u01af\3\2"+
		"\2\2k\u01b1\3\2\2\2m\u01b9\3\2\2\2o\u01be\3\2\2\2q\u01c0\3\2\2\2s\u01c2"+
		"\3\2\2\2u\u01c9\3\2\2\2w\u01cb\3\2\2\2y\u01d0\3\2\2\2{\u01d5\3\2\2\2}"+
		"\u01dc\3\2\2\2\177\u01e6\3\2\2\2\u0081\u01eb\3\2\2\2\u0083\u01f5\3\2\2"+
		"\2\u0085\u01ff\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7v\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7g\2\2\u008e\4\3\2\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7i\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095\7k\2\2"+
		"\u0095\u0096\7v\2\2\u0096\u0097\7o\2\2\u0097\u0098\7q\2\2\u0098\6\3\2"+
		"\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7v\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7g\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7\60\2\2"+
		"\u00a4\u00a5\7\60\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\f\3\2\2"+
		"\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac"+
		"\7c\2\2\u00ac\16\3\2\2\2\u00ad\u00ae\7`\2\2\u00ae\20\3\2\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\22\3\2\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7q\2\2\u00ba\24\3\2\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7w\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7h\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7a\2\2\u00c2\u00c3\7c\2\2"+
		"\u00c3\u00c4\7n\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7o\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\30\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\u00cf\7l\2\2\u00cf\u00d0\7c\2\2\u00d0\32\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2"+
		"\34\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\36\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7k\2\2\u00da"+
		"\u00db\7o\2\2\u00db\u00dc\7a\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7c\2\2"+
		"\u00de\u00df\7u\2\2\u00df\u00e0\7q\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7g\2"+
		"\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7q\2\2\u00e6\"\3\2\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7e\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7.\2\2\u00f0&\3\2\2\2\u00f1\u00f2"+
		"\7x\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7f\2\2\u00f5"+
		"\u00f6\7c\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7k\2\2"+
		"\u00f9\u00fa\7t\2\2\u00fa\u00fb\7q\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7>\2"+
		"\2\u00fd\u00fe\7/\2\2\u00fe*\3\2\2\2\u00ff\u0100\7x\2\2\u0100\u0101\7"+
		"c\2\2\u0101\u0102\7t\2\2\u0102,\3\2\2\2\u0103\u0104\7n\2\2\u0104\u0105"+
		"\7q\2\2\u0105\u0106\7i\2\2\u0106\u0107\7k\2\2\u0107\u0108\7e\2\2\u0108"+
		"\u0109\7q\2\2\u0109.\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7c\2\2\u010e\u010f\7q\2\2\u010f\60\3\2\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7g\2\2\u0112\u0113\7i\2\2\u0113\u0114\7k\2\2"+
		"\u0114\u0115\7u\2\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7q\2\2\u0118\62\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b\7k\2\2\u011b\u011c"+
		"\7o\2\2\u011c\u011d\7a\2\2\u011d\u011e\7r\2\2\u011e\u011f\7t\2\2\u011f"+
		"\u0120\7q\2\2\u0120\u0121\7e\2\2\u0121\u0122\7g\2\2\u0122\u0123\7f\2\2"+
		"\u0123\u0124\7k\2\2\u0124\u0125\7o\2\2\u0125\u0126\7g\2\2\u0126\u0127"+
		"\7p\2\2\u0127\u0128\7v\2\2\u0128\u0129\7q\2\2\u0129\64\3\2\2\2\u012a\u012b"+
		"\7@\2\2\u012b\u012c\7?\2\2\u012c\66\3\2\2\2\u012d\u012e\7>\2\2\u012e8"+
		"\3\2\2\2\u012f\u0130\7_\2\2\u0130:\3\2\2\2\u0131\u0132\7>\2\2\u0132\u0133"+
		"\7@\2\2\u0133<\3\2\2\2\u0134\u0135\7e\2\2\u0135\u0136\7c\2\2\u0136\u0137"+
		"\7u\2\2\u0137\u0138\7q\2\2\u0138>\3\2\2\2\u0139\u013a\7g\2\2\u013a@\3"+
		"\2\2\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2\2\u013d\u013e\7s\2\2\u013e"+
		"\u013f\7w\2\2\u013f\u0140\7c\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2"+
		"\u0142\u0143\7q\2\2\u0143B\3\2\2\2\u0144\u0145\7-\2\2\u0145D\3\2\2\2\u0146"+
		"\u0147\7h\2\2\u0147\u0148\7k\2\2\u0148\u0149\7o\2\2\u0149\u014a\7a\2\2"+
		"\u014a\u014b\7r\2\2\u014b\u014c\7c\2\2\u014c\u014d\7t\2\2\u014d\u014e"+
		"\7c\2\2\u014eF\3\2\2\2\u014f\u0150\7\61\2\2\u0150H\3\2\2\2\u0151\u0152"+
		"\7h\2\2\u0152\u0153\7k\2\2\u0153\u0154\7o\2\2\u0154\u0155\7a\2\2\u0155"+
		"\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7i\2\2\u0158\u0159\7k\2\2"+
		"\u0159\u015a\7u\2\2\u015a\u015b\7v\2\2\u015b\u015c\7t\2\2\u015c\u015d"+
		"\7q\2\2\u015dJ\3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160\7k\2\2\u0160\u0161"+
		"\7o\2\2\u0161\u0162\7a\2\2\u0162\u0163\7u\2\2\u0163\u0164\7g\2\2\u0164"+
		"L\3\2\2\2\u0165\u0166\7c\2\2\u0166\u0167\7v\2\2\u0167\u0168\7g\2\2\u0168"+
		"N\3\2\2\2\u0169\u016a\7>\2\2\u016a\u016b\7?\2\2\u016bP\3\2\2\2\u016c\u016d"+
		"\7r\2\2\u016d\u016e\7t\2\2\u016e\u016f\7q\2\2\u016f\u0170\7e\2\2\u0170"+
		"\u0171\7g\2\2\u0171\u0172\7f\2\2\u0172\u0173\7k\2\2\u0173\u0174\7o\2\2"+
		"\u0174\u0175\7g\2\2\u0175\u0176\7p\2\2\u0176\u0177\7v\2\2\u0177\u0178"+
		"\7q\2\2\u0178R\3\2\2\2\u0179\u017a\7h\2\2\u017a\u017b\7c\2\2\u017b\u017c"+
		"\7n\2\2\u017c\u017d\7u\2\2\u017d\u017e\7q\2\2\u017eT\3\2\2\2\u017f\u0180"+
		"\7(\2\2\u0180V\3\2\2\2\u0181\u0182\7,\2\2\u0182X\3\2\2\2\u0183\u0184\7"+
		"\60\2\2\u0184Z\3\2\2\2\u0185\u0186\7u\2\2\u0186\u0187\7g\2\2\u0187\\\3"+
		"\2\2\2\u0188\u0189\7+\2\2\u0189\u018a\7<\2\2\u018a^\3\2\2\2\u018b\u018c"+
		"\7h\2\2\u018c\u018d\7k\2\2\u018d\u018e\7o\2\2\u018e\u018f\7a\2\2\u018f"+
		"\u0190\7g\2\2\u0190\u0191\7p\2\2\u0191\u0192\7s\2\2\u0192\u0193\7w\2\2"+
		"\u0193\u0194\7c\2\2\u0194\u0195\7p\2\2\u0195\u0196\7v\2\2\u0196\u0197"+
		"\7q\2\2\u0197`\3\2\2\2\u0198\u0199\7h\2\2\u0199\u019a\7k\2\2\u019a\u019b"+
		"\7o\2\2\u019b\u019c\7a\2\2\u019c\u019d\7h\2\2\u019d\u019e\7w\2\2\u019e"+
		"\u019f\7p\2\2\u019f\u01a0\7e\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7q\2\2"+
		"\u01a2b\3\2\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5\7p\2\2\u01a5\u01a6\7v\2"+
		"\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7t\2\2\u01a9\u01aa"+
		"\7q\2\2\u01aad\3\2\2\2\u01ab\u01ac\7<\2\2\u01acf\3\2\2\2\u01ad\u01ae\7"+
		"]\2\2\u01aeh\3\2\2\2\u01af\u01b0\7@\2\2\u01b0j\3\2\2\2\u01b1\u01b2\7g"+
		"\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4\7e\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6"+
		"\7g\2\2\u01b6\u01b7\7x\2\2\u01b7\u01b8\7c\2\2\u01b8l\3\2\2\2\u01b9\u01ba"+
		"\7v\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7r\2\2\u01bc\u01bd\7q\2\2\u01bd"+
		"n\3\2\2\2\u01be\u01bf\7\'\2\2\u01bfp\3\2\2\2\u01c0\u01c1\7+\2\2\u01c1"+
		"r\3\2\2\2\u01c2\u01c3\7h\2\2\u01c3\u01c4\7w\2\2\u01c4\u01c5\7p\2\2\u01c5"+
		"\u01c6\7e\2\2\u01c6\u01c7\7c\2\2\u01c7\u01c8\7q\2\2\u01c8t\3\2\2\2\u01c9"+
		"\u01ca\7/\2\2\u01cav\3\2\2\2\u01cb\u01cc\7n\2\2\u01cc\u01cd\7g\2\2\u01cd"+
		"\u01ce\7k\2\2\u01ce\u01cf\7c\2\2\u01cfx\3\2\2\2\u01d0\u01d1\7t\2\2\u01d1"+
		"\u01d2\7g\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7n\2\2\u01d4z\3\2\2\2\u01d5"+
		"\u01d9\t\2\2\2\u01d6\u01d8\t\3\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da|\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01e0\7$\2\2\u01dd\u01df\n\4\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7$\2\2\u01e4~\3\2\2\2\u01e5\u01e7"+
		"\4\62;\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u0080\3\2\2\2\u01ea\u01ec\4\62;\2\u01eb\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\7\60\2\2\u01f0\u01f2\4\62;\2\u01f1\u01f0\3"+
		"\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u0082\3\2\2\2\u01f5\u01f9\7}\2\2\u01f6\u01f8\n\5\2\2\u01f7\u01f6\3\2"+
		"\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7\177\2\2\u01fd\u01fe\b"+
		"B\2\2\u01fe\u0084\3\2\2\2\u01ff\u0200\t\6\2\2\u0200\u0201\bC\3\2\u0201"+
		"\u0086\3\2\2\2\t\2\u01d9\u01e0\u01e8\u01ed\u01f3\u01f9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}