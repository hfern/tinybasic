// Generated from TinyBasic.g4 by ANTLR 4.7
package com.hfernandes.tinybasic.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyBasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, IF=2, THEN=3, GOTO=4, INPUT=5, LET=6, GOSUB=7, RETURN=8, CLEAR=9, 
		LIST=10, RUN=11, END=12, VAR=13, DIGIT=14, CR=15, STRING=16, EQUALS=17, 
		COMMA=18, ADD=19, SUB=20, MUL=21, DIV=22, LPAREN=23, RPAREN=24, RELOP=25, 
		WS=26, COMMENT=27;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_exprlist = 3, 
		RULE_varlist = 4, RULE_expression = 5, RULE_term = 6, RULE_factor = 7, 
		RULE_number = 8;
	public static final String[] ruleNames = {
		"program", "line", "statement", "exprlist", "varlist", "expression", "term", 
		"factor", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PRINT'", "'IF'", "'THEN'", "'GOTO'", "'INPUT'", "'LET'", "'GOSUB'", 
		"'RETURN'", "'CLEAR'", "'LIST'", "'RUN'", "'END'", null, null, null, null, 
		"'='", "','", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT", "IF", "THEN", "GOTO", "INPUT", "LET", "GOSUB", "RETURN", 
		"CLEAR", "LIST", "RUN", "END", "VAR", "DIGIT", "CR", "STRING", "EQUALS", 
		"COMMA", "ADD", "SUB", "MUL", "DIV", "LPAREN", "RPAREN", "RELOP", "WS", 
		"COMMENT"
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
	public String getGrammarFileName() { return "TinyBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyBasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << GOTO) | (1L << INPUT) | (1L << LET) | (1L << GOSUB) | (1L << RETURN) | (1L << CLEAR) | (1L << LIST) | (1L << RUN) | (1L << END) | (1L << DIGIT) | (1L << CR))) != 0)) {
				{
				{
				setState(18);
				line();
				}
				}
				setState(23);
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

	public static class LineContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CR() { return getToken(TinyBasicParser.CR, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				number();
				setState(25);
				statement();
				setState(26);
				match(CR);
				}
				break;
			case PRINT:
			case IF:
			case GOTO:
			case INPUT:
			case LET:
			case GOSUB:
			case RETURN:
			case CLEAR:
			case LIST:
			case RUN:
			case END:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				statement();
				setState(29);
				match(CR);
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(CR);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TinyBasicParser.PRINT, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TinyBasicParser.COMMA, 0); }
		public TerminalNode IF() { return getToken(TinyBasicParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(TinyBasicParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RELOP() { return getToken(TinyBasicParser.RELOP, 0); }
		public TerminalNode GOTO() { return getToken(TinyBasicParser.GOTO, 0); }
		public TerminalNode INPUT() { return getToken(TinyBasicParser.INPUT, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode LET() { return getToken(TinyBasicParser.LET, 0); }
		public TerminalNode VAR() { return getToken(TinyBasicParser.VAR, 0); }
		public TerminalNode GOSUB() { return getToken(TinyBasicParser.GOSUB, 0); }
		public TerminalNode RETURN() { return getToken(TinyBasicParser.RETURN, 0); }
		public TerminalNode CLEAR() { return getToken(TinyBasicParser.CLEAR, 0); }
		public TerminalNode LIST() { return getToken(TinyBasicParser.LIST, 0); }
		public TerminalNode RUN() { return getToken(TinyBasicParser.RUN, 0); }
		public TerminalNode END() { return getToken(TinyBasicParser.END, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(PRINT);
				setState(35);
				exprlist();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(36);
					match(COMMA);
					}
				}

				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(IF);
				setState(40);
				expression();
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==RELOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				expression();
				setState(43);
				match(THEN);
				setState(44);
				statement();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(GOTO);
				setState(47);
				expression();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(INPUT);
				setState(49);
				varlist();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(LET);
				setState(51);
				match(VAR);
				setState(52);
				match(EQUALS);
				setState(53);
				expression();
				}
				break;
			case GOSUB:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				match(GOSUB);
				setState(55);
				expression();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				match(RETURN);
				}
				break;
			case CLEAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(CLEAR);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				match(LIST);
				}
				break;
			case RUN:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				match(RUN);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 11);
				{
				setState(60);
				match(END);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(TinyBasicParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TinyBasicParser.STRING, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TinyBasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TinyBasicParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(63);
				match(STRING);
				}
				break;
			case VAR:
			case DIGIT:
			case ADD:
			case SUB:
			case LPAREN:
				{
				setState(64);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(COMMA);
					setState(70);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(68);
						match(STRING);
						}
						break;
					case VAR:
					case DIGIT:
					case ADD:
					case SUB:
					case LPAREN:
						{
						setState(69);
						expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(TinyBasicParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(TinyBasicParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TinyBasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TinyBasicParser.COMMA, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(VAR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78);
				match(COMMA);
				setState(79);
				match(VAR);
				}
				}
				setState(84);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(TinyBasicParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(TinyBasicParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(TinyBasicParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(TinyBasicParser.SUB, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(85);
				match(ADD);
				}
				break;
			case SUB:
				{
				setState(86);
				match(SUB);
				}
				break;
			case VAR:
			case DIGIT:
			case LPAREN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			term();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				term();
				}
				}
				setState(97);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(TinyBasicParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(TinyBasicParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TinyBasicParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TinyBasicParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			factor();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				factor();
				}
				}
				setState(105);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TinyBasicParser.VAR, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TinyBasicParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TinyBasicParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(VAR);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				number();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(LPAREN);
				setState(109);
				expression();
				setState(110);
				match(RPAREN);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TinyBasicParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TinyBasicParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(DIGIT);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(115);
				match(DIGIT);
				}
				}
				setState(120);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\5\4(\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\5\5D\n\5\3\5\3\5\3\5"+
		"\5\5I\n\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6\7\6S\n\6\f\6\16\6V\13\6"+
		"\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7\3\b\3\b\3\b"+
		"\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\3\n\7\n"+
		"w\n\n\f\n\16\nz\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\4\2\23\23\33"+
		"\33\3\2\25\26\3\2\27\30\2\u008b\2\27\3\2\2\2\4\"\3\2\2\2\6?\3\2\2\2\b"+
		"C\3\2\2\2\nO\3\2\2\2\fZ\3\2\2\2\16d\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24"+
		"\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30"+
		"\3\3\2\2\2\31\27\3\2\2\2\32\33\5\22\n\2\33\34\5\6\4\2\34\35\7\21\2\2\35"+
		"#\3\2\2\2\36\37\5\6\4\2\37 \7\21\2\2 #\3\2\2\2!#\7\21\2\2\"\32\3\2\2\2"+
		"\"\36\3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%\'\5\b\5\2&(\7\24\2\2\'"+
		"&\3\2\2\2\'(\3\2\2\2(@\3\2\2\2)*\7\4\2\2*+\5\f\7\2+,\t\2\2\2,-\5\f\7\2"+
		"-.\7\5\2\2./\5\6\4\2/@\3\2\2\2\60\61\7\6\2\2\61@\5\f\7\2\62\63\7\7\2\2"+
		"\63@\5\n\6\2\64\65\7\b\2\2\65\66\7\17\2\2\66\67\7\23\2\2\67@\5\f\7\28"+
		"9\7\t\2\29@\5\f\7\2:@\7\n\2\2;@\7\13\2\2<@\7\f\2\2=@\7\r\2\2>@\7\16\2"+
		"\2?$\3\2\2\2?)\3\2\2\2?\60\3\2\2\2?\62\3\2\2\2?\64\3\2\2\2?8\3\2\2\2?"+
		":\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AD\7\22\2"+
		"\2BD\5\f\7\2CA\3\2\2\2CB\3\2\2\2DL\3\2\2\2EH\7\24\2\2FI\7\22\2\2GI\5\f"+
		"\7\2HF\3\2\2\2HG\3\2\2\2IK\3\2\2\2JE\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2M\t\3\2\2\2NL\3\2\2\2OT\7\17\2\2PQ\7\24\2\2QS\7\17\2\2RP\3\2\2\2S"+
		"V\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\13\3\2\2\2VT\3\2\2\2W[\7\25\2\2X[\7\26"+
		"\2\2Y[\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\a\5\16\b\2]^"+
		"\t\3\2\2^`\5\16\b\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2\2\2"+
		"ca\3\2\2\2di\5\20\t\2ef\t\4\2\2fh\5\20\t\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2"+
		"\2ij\3\2\2\2j\17\3\2\2\2ki\3\2\2\2ls\7\17\2\2ms\5\22\n\2no\7\31\2\2op"+
		"\5\f\7\2pq\7\32\2\2qs\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2s\21\3\2\2"+
		"\2tx\7\20\2\2uw\7\20\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\23\3"+
		"\2\2\2zx\3\2\2\2\17\27\"\'?CHLTZairx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}