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
		T__0=1, Identifier=2, RelationalOperation=3, ArithmeticOperation=4, LogicalOperation=5, 
		Else=6, While=7, If=8, Word=9, Number=10, Less=11, LessEqual=12, Greater=13, 
		GreaterEqual=14, Equal=15, NotEqual=16, And=17, Or=18, Not=19, Plus=20, 
		Minus=21, Star=22, Div=23, Mod=24, Assign=25, Const=26, Double=27, Float=28, 
		Int=29, Long=30, Short=31, LeftParen=32, RightParen=33, LeftBrace=34, 
		RightBrace=35, Semi=36, Comma=37, Whitespace=38, Newline=39, BlockComment=40, 
		LineComment=41;
	public static final int
		RULE_start = 0, RULE_initial = 1, RULE_blockItemList = 2, RULE_blockItem = 3, 
		RULE_selectionStat = 4, RULE_iterationStat = 5, RULE_assigmentStat = 6, 
		RULE_varibleDecl = 7, RULE_arithmeticStat = 8, RULE_constDecl = 9, RULE_expression = 10, 
		RULE_stat = 11, RULE_block = 12, RULE_elseStat = 13;
	public static final String[] ruleNames = {
		"start", "initial", "blockItemList", "blockItem", "selectionStat", "iterationStat", 
		"assigmentStat", "varibleDecl", "arithmeticStat", "constDecl", "expression", 
		"stat", "block", "elseStat"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int main()'", null, null, null, null, null, null, null, null, 
		null, "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'const '", "'double'", "'float'", 
		"'int'", "'long'", "'short'", "'('", "')'", "'{'", "'}'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Identifier", "RelationalOperation", "ArithmeticOperation", 
		"LogicalOperation", "Else", "While", "If", "Word", "Number", "Less", "LessEqual", 
		"Greater", "GreaterEqual", "Equal", "NotEqual", "And", "Or", "Not", "Plus", 
		"Minus", "Star", "Div", "Mod", "Assign", "Const", "Double", "Float", "Int", 
		"Long", "Short", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
		"Semi", "Comma", "Whitespace", "Newline", "BlockComment", "LineComment"
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
			setState(29);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(28);
				initial();
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
		enterRule(_localctx, 2, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
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
		enterRule(_localctx, 4, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(LeftBrace);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << While) | (1L << If) | (1L << Word) | (1L << Const) | (1L << LeftBrace) | (1L << Semi))) != 0)) {
				{
				{
				setState(35);
				blockItem();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
		enterRule(_localctx, 6, RULE_blockItem);
		try {
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				blockItemList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				selectionStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				iterationStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				assigmentStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				arithmeticStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				varibleDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				constDecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
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
		enterRule(_localctx, 8, RULE_selectionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(If);
			setState(54);
			expression();
			setState(55);
			match(RightParen);
			setState(56);
			stat();
			setState(58);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(57);
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
		enterRule(_localctx, 10, RULE_iterationStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(While);
			setState(61);
			expression();
			setState(62);
			match(RightParen);
			setState(63);
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
		enterRule(_localctx, 12, RULE_assigmentStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Word);
			setState(66);
			match(Assign);
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(68);
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
		enterRule(_localctx, 14, RULE_varibleDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Identifier);
			setState(71);
			match(Word);
			setState(74);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(72);
				match(Assign);
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==Word || _la==Number) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(76);
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
		enterRule(_localctx, 16, RULE_arithmeticStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(Word);
			setState(79);
			match(Assign);
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(81);
			match(ArithmeticOperation);
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(83);
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
		enterRule(_localctx, 18, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Const);
			setState(86);
			match(Identifier);
			setState(87);
			match(Word);
			setState(88);
			match(Assign);
			setState(89);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(90);
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
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(93);
			match(RelationalOperation);
			setState(94);
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
		enterRule(_localctx, 22, RULE_stat);
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				assigmentStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				arithmeticStat();
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LeftBrace);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Word || _la==LeftBrace) {
				{
				{
				setState(102);
				stat();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		enterRule(_localctx, 26, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(Else);
			setState(111);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+t\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\3\3\3\3\3\3\4\3\4\7\4"+
		"\'\n\4\f\4\16\4*\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rf\n\r\3\16"+
		"\3\16\7\16j\n\16\f\16\16\16m\13\16\3\16\3\16\3\17\3\17\3\17\3\17\2\2\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\13\fs\2\37\3\2\2\2\4!\3\2"+
		"\2\2\6$\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f>\3\2\2\2\16C\3\2\2\2\20H\3"+
		"\2\2\2\22P\3\2\2\2\24W\3\2\2\2\26^\3\2\2\2\30e\3\2\2\2\32g\3\2\2\2\34"+
		"p\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\"\7\3\2\2"+
		"\"#\5\6\4\2#\5\3\2\2\2$(\7$\2\2%\'\5\b\5\2&%\3\2\2\2\'*\3\2\2\2(&\3\2"+
		"\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7%\2\2,\7\3\2\2\2-\66\5\6\4\2.\66"+
		"\5\n\6\2/\66\5\f\7\2\60\66\5\16\b\2\61\66\5\22\n\2\62\66\5\20\t\2\63\66"+
		"\5\24\13\2\64\66\7&\2\2\65-\3\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2"+
		"\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\t\3\2"+
		"\2\2\678\7\n\2\289\5\26\f\29:\7#\2\2:<\5\30\r\2;=\5\34\17\2<;\3\2\2\2"+
		"<=\3\2\2\2=\13\3\2\2\2>?\7\t\2\2?@\5\26\f\2@A\7#\2\2AB\5\30\r\2B\r\3\2"+
		"\2\2CD\7\13\2\2DE\7\33\2\2EF\t\2\2\2FG\7&\2\2G\17\3\2\2\2HI\7\4\2\2IL"+
		"\7\13\2\2JK\7\33\2\2KM\t\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7&\2\2"+
		"O\21\3\2\2\2PQ\7\13\2\2QR\7\33\2\2RS\t\2\2\2ST\7\6\2\2TU\t\2\2\2UV\7&"+
		"\2\2V\23\3\2\2\2WX\7\34\2\2XY\7\4\2\2YZ\7\13\2\2Z[\7\33\2\2[\\\t\2\2\2"+
		"\\]\7&\2\2]\25\3\2\2\2^_\t\2\2\2_`\7\5\2\2`a\t\2\2\2a\27\3\2\2\2bf\5\32"+
		"\16\2cf\5\16\b\2df\5\22\n\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\31\3\2\2\2"+
		"gk\7$\2\2hj\5\30\r\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2"+
		"mk\3\2\2\2no\7%\2\2o\33\3\2\2\2pq\7\b\2\2qr\5\30\r\2r\35\3\2\2\2\t\37"+
		"(\65<Lek";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}