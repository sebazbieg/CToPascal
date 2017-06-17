// Generated from miniC.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniCParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_lib = 1, RULE_initial = 2, RULE_blockItemList = 3, 
		RULE_blockItem = 4, RULE_selectionStat = 5, RULE_iterationStat = 6, RULE_assigmentStat = 7, 
		RULE_varibleDecl = 8, RULE_arithmeticStat = 9, RULE_inOutStat = 10, RULE_constDecl = 11, 
		RULE_expression = 12, RULE_scanf = 13, RULE_printf = 14, RULE_stat = 15, 
		RULE_block = 16, RULE_elseStat = 17, RULE_scanVar = 18, RULE_scanParam = 19, 
		RULE_variables_1 = 20, RULE_variables_2 = 21, RULE_printParam = 22, RULE_printWord = 23;
	public static final String[] ruleNames = {
		"start", "lib", "initial", "blockItemList", "blockItem", "selectionStat", 
		"iterationStat", "assigmentStat", "varibleDecl", "arithmeticStat", "inOutStat", 
		"constDecl", "expression", "scanf", "printf", "stat", "block", "elseStat", 
		"scanVar", "scanParam", "variables_1", "variables_2", "printParam", "printWord"
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

	@Override
	public String getGrammarFileName() { return "miniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(miniCParser.EOF, 0); }
		public LibContext lib() {
			return getRuleContext(LibContext.class,0);
		}
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(48);
				lib();
				}
			}

			setState(52);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(51);
				initial();
				}
			}

			setState(54);
			match(EOF);
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

	public static class LibContext extends ParserRuleContext {
		public TerminalNode Lib() { return getToken(miniCParser.Lib, 0); }
		public LibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterLib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitLib(this);
		}
	}

	public final LibContext lib() throws RecognitionException {
		LibContext _localctx = new LibContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(Lib);
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

	public static class InitialContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitInitial(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__1);
			setState(60);
			blockItemList();
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

	public static class BlockItemListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(miniCParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(miniCParser.RightBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LeftBrace);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << Identifier) | (1L << While) | (1L << If) | (1L << Word) | (1L << Const) | (1L << LeftBrace) | (1L << Semi))) != 0)) {
				{
				{
				setState(63);
				blockItem();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(RightBrace);
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

	public static class BlockItemContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public SelectionStatContext selectionStat() {
			return getRuleContext(SelectionStatContext.class,0);
		}
		public IterationStatContext iterationStat() {
			return getRuleContext(IterationStatContext.class,0);
		}
		public AssigmentStatContext assigmentStat() {
			return getRuleContext(AssigmentStatContext.class,0);
		}
		public ArithmeticStatContext arithmeticStat() {
			return getRuleContext(ArithmeticStatContext.class,0);
		}
		public InOutStatContext inOutStat() {
			return getRuleContext(InOutStatContext.class,0);
		}
		public VaribleDeclContext varibleDecl() {
			return getRuleContext(VaribleDeclContext.class,0);
		}
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockItem);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				blockItemList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				selectionStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				iterationStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				assigmentStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				arithmeticStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				inOutStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				varibleDecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				constDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				match(Semi);
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

	public static class SelectionStatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(miniCParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(miniCParser.RightParen, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public SelectionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterSelectionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitSelectionStat(this);
		}
	}

	public final SelectionStatContext selectionStat() throws RecognitionException {
		SelectionStatContext _localctx = new SelectionStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(If);
			setState(83);
			expression();
			setState(84);
			match(RightParen);
			setState(85);
			stat();
			setState(87);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(86);
				elseStat();
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

	public static class IterationStatContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(miniCParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(miniCParser.RightParen, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public IterationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterIterationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitIterationStat(this);
		}
	}

	public final IterationStatContext iterationStat() throws RecognitionException {
		IterationStatContext _localctx = new IterationStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iterationStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(While);
			setState(90);
			expression();
			setState(91);
			match(RightParen);
			setState(92);
			stat();
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

	public static class AssigmentStatContext extends ParserRuleContext {
		public List<TerminalNode> Word() { return getTokens(miniCParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(miniCParser.Word, i);
		}
		public TerminalNode Assign() { return getToken(miniCParser.Assign, 0); }
		public TerminalNode Number() { return getToken(miniCParser.Number, 0); }
		public AssigmentStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigmentStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterAssigmentStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitAssigmentStat(this);
		}
	}

	public final AssigmentStatContext assigmentStat() throws RecognitionException {
		AssigmentStatContext _localctx = new AssigmentStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assigmentStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Word);
			setState(95);
			match(Assign);
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(97);
			match(Semi);
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

	public static class VaribleDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(miniCParser.Identifier, 0); }
		public List<TerminalNode> Word() { return getTokens(miniCParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(miniCParser.Word, i);
		}
		public TerminalNode Assign() { return getToken(miniCParser.Assign, 0); }
		public TerminalNode Number() { return getToken(miniCParser.Number, 0); }
		public VaribleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varibleDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterVaribleDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitVaribleDecl(this);
		}
	}

	public final VaribleDeclContext varibleDecl() throws RecognitionException {
		VaribleDeclContext _localctx = new VaribleDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varibleDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Identifier);
			setState(100);
			match(Word);
			setState(103);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(101);
				match(Assign);
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==Word || _la==Number) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(105);
			match(Semi);
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

	public static class ArithmeticStatContext extends ParserRuleContext {
		public List<TerminalNode> Word() { return getTokens(miniCParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(miniCParser.Word, i);
		}
		public TerminalNode Assign() { return getToken(miniCParser.Assign, 0); }
		public TerminalNode ArithmeticOperation() { return getToken(miniCParser.ArithmeticOperation, 0); }
		public List<TerminalNode> Number() { return getTokens(miniCParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(miniCParser.Number, i);
		}
		public ArithmeticStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterArithmeticStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitArithmeticStat(this);
		}
	}

	public final ArithmeticStatContext arithmeticStat() throws RecognitionException {
		ArithmeticStatContext _localctx = new ArithmeticStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithmeticStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Word);
			setState(108);
			match(Assign);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(110);
			match(ArithmeticOperation);
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(112);
			match(Semi);
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

	public static class InOutStatContext extends ParserRuleContext {
		public ScanfContext scanf() {
			return getRuleContext(ScanfContext.class,0);
		}
		public PrintfContext printf() {
			return getRuleContext(PrintfContext.class,0);
		}
		public InOutStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOutStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterInOutStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitInOutStat(this);
		}
	}

	public final InOutStatContext inOutStat() throws RecognitionException {
		InOutStatContext _localctx = new InOutStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inOutStat);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				scanf();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				printf();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(miniCParser.Const, 0); }
		public TerminalNode Identifier() { return getToken(miniCParser.Identifier, 0); }
		public List<TerminalNode> Word() { return getTokens(miniCParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(miniCParser.Word, i);
		}
		public TerminalNode Assign() { return getToken(miniCParser.Assign, 0); }
		public TerminalNode Number() { return getToken(miniCParser.Number, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Const);
			setState(119);
			match(Identifier);
			setState(120);
			match(Word);
			setState(121);
			match(Assign);
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(123);
			match(Semi);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode RelationalOperation() { return getToken(miniCParser.RelationalOperation, 0); }
		public List<TerminalNode> Word() { return getTokens(miniCParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(miniCParser.Word, i);
		}
		public List<TerminalNode> Number() { return getTokens(miniCParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(miniCParser.Number, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(126);
			match(RelationalOperation);
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ScanfContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(miniCParser.LeftParen, 0); }
		public ScanVarContext scanVar() {
			return getRuleContext(ScanVarContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(miniCParser.RightParen, 0); }
		public List<TerminalNode> Word() { return getTokens(miniCParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(miniCParser.Word, i);
		}
		public ScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterScanf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitScanf(this);
		}
	}

	public final ScanfContext scanf() throws RecognitionException {
		ScanfContext _localctx = new ScanfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__2);
			setState(130);
			match(LeftParen);
			setState(131);
			match(QuotationMarks);
			setState(132);
			scanVar();
			setState(133);
			match(QuotationMarks);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				match(Comma);
				setState(135);
				match(T__3);
				setState(136);
				match(Word);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			setState(141);
			match(RightParen);
			setState(142);
			match(Semi);
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

	public static class PrintfContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(miniCParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(miniCParser.RightParen, 0); }
		public List<Variables_1Context> variables_1() {
			return getRuleContexts(Variables_1Context.class);
		}
		public Variables_1Context variables_1(int i) {
			return getRuleContext(Variables_1Context.class,i);
		}
		public List<Variables_2Context> variables_2() {
			return getRuleContexts(Variables_2Context.class);
		}
		public Variables_2Context variables_2(int i) {
			return getRuleContext(Variables_2Context.class,i);
		}
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPrintf(this);
		}
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__4);
			setState(145);
			match(LeftParen);
			setState(146);
			match(QuotationMarks);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Word || _la==Param) {
				{
				{
				setState(147);
				variables_1();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(QuotationMarks);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Number || _la==Comma) {
				{
				{
				setState(154);
				variables_2();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RightParen);
			setState(161);
			match(Semi);
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

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssigmentStatContext assigmentStat() {
			return getRuleContext(AssigmentStatContext.class,0);
		}
		public ArithmeticStatContext arithmeticStat() {
			return getRuleContext(ArithmeticStatContext.class,0);
		}
		public InOutStatContext inOutStat() {
			return getRuleContext(InOutStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				assigmentStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				arithmeticStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				inOutStat();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LeftBrace);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << Word) | (1L << LeftBrace))) != 0)) {
				{
				{
				setState(170);
				stat();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RightBrace);
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(miniCParser.Else, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitElseStat(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(Else);
			setState(179);
			stat();
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

	public static class ScanVarContext extends ParserRuleContext {
		public List<ScanParamContext> scanParam() {
			return getRuleContexts(ScanParamContext.class);
		}
		public ScanParamContext scanParam(int i) {
			return getRuleContext(ScanParamContext.class,i);
		}
		public ScanVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterScanVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitScanVar(this);
		}
	}

	public final ScanVarContext scanVar() throws RecognitionException {
		ScanVarContext _localctx = new ScanVarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scanVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				scanParam();
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Param );
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

	public static class ScanParamContext extends ParserRuleContext {
		public TerminalNode Param() { return getToken(miniCParser.Param, 0); }
		public ScanParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterScanParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitScanParam(this);
		}
	}

	public final ScanParamContext scanParam() throws RecognitionException {
		ScanParamContext _localctx = new ScanParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scanParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Param);
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

	public static class Variables_1Context extends ParserRuleContext {
		public PrintParamContext printParam() {
			return getRuleContext(PrintParamContext.class,0);
		}
		public PrintWordContext printWord() {
			return getRuleContext(PrintWordContext.class,0);
		}
		public Variables_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterVariables_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitVariables_1(this);
		}
	}

	public final Variables_1Context variables_1() throws RecognitionException {
		Variables_1Context _localctx = new Variables_1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_variables_1);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case Param:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				printParam();
				}
				break;
			case Word:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				printWord();
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

	public static class Variables_2Context extends ParserRuleContext {
		public TerminalNode Word() { return getToken(miniCParser.Word, 0); }
		public TerminalNode Number() { return getToken(miniCParser.Number, 0); }
		public Variables_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterVariables_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitVariables_2(this);
		}
	}

	public final Variables_2Context variables_2() throws RecognitionException {
		Variables_2Context _localctx = new Variables_2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_variables_2);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(Comma);
				setState(193);
				match(Word);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(Number);
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

	public static class PrintParamContext extends ParserRuleContext {
		public TerminalNode Param() { return getToken(miniCParser.Param, 0); }
		public PrintParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPrintParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPrintParam(this);
		}
	}

	public final PrintParamContext printParam() throws RecognitionException {
		PrintParamContext _localctx = new PrintParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_printParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(Param);
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

	public static class PrintWordContext extends ParserRuleContext {
		public List<TerminalNode> Word() { return getTokens(miniCParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(miniCParser.Word, i);
		}
		public PrintWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).enterPrintWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCListener ) ((miniCListener)listener).exitPrintWord(this);
		}
	}

	public final PrintWordContext printWord() throws RecognitionException {
		PrintWordContext _localctx = new PrintWordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_printWord);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(199);
					match(Word);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00cf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\5\2\67\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\7\5C\n\5\f\5\16\5F\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6S\n\6\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\5\nj\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\5\fw\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u008c\n\17\r\17\16\17\u008d"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0097\n\20\f\20\16\20\u009a\13"+
		"\20\3\20\3\20\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\5\21\u00aa\n\21\3\22\3\22\7\22\u00ae\n\22\f\22\16\22"+
		"\u00b1\13\22\3\22\3\22\3\23\3\23\3\23\3\24\6\24\u00b9\n\24\r\24\16\24"+
		"\u00ba\3\25\3\25\3\26\3\26\5\26\u00c1\n\26\3\27\3\27\3\27\5\27\u00c6\n"+
		"\27\3\30\3\30\3\31\6\31\u00cb\n\31\r\31\16\31\u00cc\3\31\2\2\32\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2\17\20\u00cf\2\63"+
		"\3\2\2\2\4:\3\2\2\2\6=\3\2\2\2\b@\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16[\3"+
		"\2\2\2\20`\3\2\2\2\22e\3\2\2\2\24m\3\2\2\2\26v\3\2\2\2\30x\3\2\2\2\32"+
		"\177\3\2\2\2\34\u0083\3\2\2\2\36\u0092\3\2\2\2 \u00a9\3\2\2\2\"\u00ab"+
		"\3\2\2\2$\u00b4\3\2\2\2&\u00b8\3\2\2\2(\u00bc\3\2\2\2*\u00c0\3\2\2\2,"+
		"\u00c5\3\2\2\2.\u00c7\3\2\2\2\60\u00ca\3\2\2\2\62\64\5\4\3\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67\3\2"+
		"\2\2\678\3\2\2\289\7\2\2\39\3\3\2\2\2:;\7\3\2\2;<\7\22\2\2<\5\3\2\2\2"+
		"=>\7\4\2\2>?\5\b\5\2?\7\3\2\2\2@D\7+\2\2AC\5\n\6\2BA\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7,\2\2H\t\3\2\2\2IS\5\b\5\2"+
		"JS\5\f\7\2KS\5\16\b\2LS\5\20\t\2MS\5\24\13\2NS\5\26\f\2OS\5\22\n\2PS\5"+
		"\30\r\2QS\7-\2\2RI\3\2\2\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3"+
		"\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2\2\2TU\7\16\2\2UV\5\32\16"+
		"\2VW\7*\2\2WY\5 \21\2XZ\5$\23\2YX\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[\\\7\r"+
		"\2\2\\]\5\32\16\2]^\7*\2\2^_\5 \21\2_\17\3\2\2\2`a\7\17\2\2ab\7\"\2\2"+
		"bc\t\2\2\2cd\7-\2\2d\21\3\2\2\2ef\7\b\2\2fi\7\17\2\2gh\7\"\2\2hj\t\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7-\2\2l\23\3\2\2\2mn\7\17\2\2no\7\""+
		"\2\2op\t\2\2\2pq\7\n\2\2qr\t\2\2\2rs\7-\2\2s\25\3\2\2\2tw\5\34\17\2uw"+
		"\5\36\20\2vt\3\2\2\2vu\3\2\2\2w\27\3\2\2\2xy\7#\2\2yz\7\b\2\2z{\7\17\2"+
		"\2{|\7\"\2\2|}\t\2\2\2}~\7-\2\2~\31\3\2\2\2\177\u0080\t\2\2\2\u0080\u0081"+
		"\7\t\2\2\u0081\u0082\t\2\2\2\u0082\33\3\2\2\2\u0083\u0084\7\5\2\2\u0084"+
		"\u0085\7)\2\2\u0085\u0086\7/\2\2\u0086\u0087\5&\24\2\u0087\u008b\7/\2"+
		"\2\u0088\u0089\7.\2\2\u0089\u008a\7\6\2\2\u008a\u008c\7\17\2\2\u008b\u0088"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7*\2\2\u0090\u0091\7-\2\2\u0091\35\3\2\2\2"+
		"\u0092\u0093\7\7\2\2\u0093\u0094\7)\2\2\u0094\u0098\7/\2\2\u0095\u0097"+
		"\5*\26\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\7/"+
		"\2\2\u009c\u009e\5,\27\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\7*\2\2\u00a3\u00a4\7-\2\2\u00a4\37\3\2\2\2\u00a5\u00aa"+
		"\5\"\22\2\u00a6\u00aa\5\20\t\2\u00a7\u00aa\5\24\13\2\u00a8\u00aa\5\26"+
		"\f\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa!\3\2\2\2\u00ab\u00af\7+\2\2\u00ac\u00ae\5 \21\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3"+
		"#\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\5 \21\2\u00b6%\3\2\2\2\u00b7"+
		"\u00b9\5(\25\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\7\23\2\2\u00bd)\3"+
		"\2\2\2\u00be\u00c1\5.\30\2\u00bf\u00c1\5\60\31\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1+\3\2\2\2\u00c2\u00c3\7.\2\2\u00c3\u00c6\7\17\2\2"+
		"\u00c4\u00c6\7\20\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6-\3"+
		"\2\2\2\u00c7\u00c8\7\23\2\2\u00c8/\3\2\2\2\u00c9\u00cb\7\17\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\61\3\2\2\2\22\63\66DRYiv\u008d\u0098\u009f\u00a9\u00af\u00ba"+
		"\u00c0\u00c5\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}