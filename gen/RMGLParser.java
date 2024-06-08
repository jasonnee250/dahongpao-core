// Generated from /Users/nijiaxin/Codes/dahongpao-core/src/parser/grammar/RMGLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RMGLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Rect=1, Circle=2, Diamond=3, Parallelogram=4, Trapezoid=5, Triangle=6, 
		Line=7, SimpleLine=8, PolyLine=9, CurveLine=10, LArrow=11, RArrow=12, 
		X=13, Y=14, W=15, H=16, Angle=17, Color=18, Text=19, Alpha=20, BorderWidth=21, 
		BorderColor=22, BorderAlpha=23, FontSize=24, FontColor=25, Comma=26, Semicolon=27, 
		Quotation=28, Slash=29, TokenChar=30, NL=31, Space=32, Char=33, AnnotationQuotation=34, 
		AnnotationChar=35, LineAnnotationNL=36, LineAnnotationChar=37;
	public static final int
		RULE_statement = 0, RULE_variableName = 1, RULE_charText = 2, RULE_annotationText = 3, 
		RULE_lineAnnotationText = 4, RULE_lineGraphicDefine = 5, RULE_graphicType = 6, 
		RULE_propertyDefine = 7, RULE_textDefine = 8, RULE_annotationDefine = 9, 
		RULE_linkDefine = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "variableName", "charText", "annotationText", "lineAnnotationText", 
			"lineGraphicDefine", "graphicType", "propertyDefine", "textDefine", "annotationDefine", 
			"linkDefine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Rect'", "'Circle'", "'Diamond'", "'Parallelogram'", "'Trapezoid'", 
			"'Triangle'", "'--'", "'-line-'", "'-poly-'", "'-curve-'", "'<'", "'>'", 
			"'x'", "'y'", "'w'", "'h'", "'angle'", "'color'", "'text'", "'alpha'", 
			"'borderWidth'", "'borderColor'", "'borderAlpha'", "'fontSize'", "'fontColor'", 
			"','", "';'", null, "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Rect", "Circle", "Diamond", "Parallelogram", "Trapezoid", "Triangle", 
			"Line", "SimpleLine", "PolyLine", "CurveLine", "LArrow", "RArrow", "X", 
			"Y", "W", "H", "Angle", "Color", "Text", "Alpha", "BorderWidth", "BorderColor", 
			"BorderAlpha", "FontSize", "FontColor", "Comma", "Semicolon", "Quotation", 
			"Slash", "TokenChar", "NL", "Space", "Char", "AnnotationQuotation", "AnnotationChar", 
			"LineAnnotationNL", "LineAnnotationChar"
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

	@Override
	public String getGrammarFileName() { return "RMGLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RMGLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(RMGLParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RMGLParser.NL, i);
		}
		public List<LineGraphicDefineContext> lineGraphicDefine() {
			return getRuleContexts(LineGraphicDefineContext.class);
		}
		public LineGraphicDefineContext lineGraphicDefine(int i) {
			return getRuleContext(LineGraphicDefineContext.class,i);
		}
		public List<AnnotationDefineContext> annotationDefine() {
			return getRuleContexts(AnnotationDefineContext.class);
		}
		public AnnotationDefineContext annotationDefine(int i) {
			return getRuleContext(AnnotationDefineContext.class,i);
		}
		public List<LinkDefineContext> linkDefine() {
			return getRuleContexts(LinkDefineContext.class);
		}
		public LinkDefineContext linkDefine(int i) {
			return getRuleContext(LinkDefineContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitStatement(this);
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(22);
				match(NL);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Rect:
				case Circle:
				case Diamond:
				case Parallelogram:
				case Trapezoid:
				case Triangle:
					{
					setState(28);
					lineGraphicDefine();
					}
					break;
				case Slash:
					{
					setState(29);
					annotationDefine();
					}
					break;
				case TokenChar:
					{
					setState(30);
					linkDefine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1610612862L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode TokenChar() { return getToken(RMGLParser.TokenChar, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TokenChar);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharTextContext extends ParserRuleContext {
		public TerminalNode TokenChar() { return getToken(RMGLParser.TokenChar, 0); }
		public CharTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterCharText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitCharText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitCharText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharTextContext charText() throws RecognitionException {
		CharTextContext _localctx = new CharTextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(TokenChar);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTextContext extends ParserRuleContext {
		public List<TerminalNode> AnnotationChar() { return getTokens(RMGLParser.AnnotationChar); }
		public TerminalNode AnnotationChar(int i) {
			return getToken(RMGLParser.AnnotationChar, i);
		}
		public AnnotationTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterAnnotationText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitAnnotationText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitAnnotationText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTextContext annotationText() throws RecognitionException {
		AnnotationTextContext _localctx = new AnnotationTextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotationText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationChar) {
				{
				{
				setState(39);
				match(AnnotationChar);
				}
				}
				setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineAnnotationTextContext extends ParserRuleContext {
		public List<TerminalNode> LineAnnotationChar() { return getTokens(RMGLParser.LineAnnotationChar); }
		public TerminalNode LineAnnotationChar(int i) {
			return getToken(RMGLParser.LineAnnotationChar, i);
		}
		public LineAnnotationTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineAnnotationText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterLineAnnotationText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitLineAnnotationText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitLineAnnotationText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineAnnotationTextContext lineAnnotationText() throws RecognitionException {
		LineAnnotationTextContext _localctx = new LineAnnotationTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lineAnnotationText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineAnnotationChar) {
				{
				{
				setState(45);
				match(LineAnnotationChar);
				}
				}
				setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineGraphicDefineContext extends ParserRuleContext {
		public GraphicTypeContext graphicType() {
			return getRuleContext(GraphicTypeContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(RMGLParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RMGLParser.Comma, i);
		}
		public List<PropertyDefineContext> propertyDefine() {
			return getRuleContexts(PropertyDefineContext.class);
		}
		public PropertyDefineContext propertyDefine(int i) {
			return getRuleContext(PropertyDefineContext.class,i);
		}
		public List<TextDefineContext> textDefine() {
			return getRuleContexts(TextDefineContext.class);
		}
		public TextDefineContext textDefine(int i) {
			return getRuleContext(TextDefineContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(RMGLParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RMGLParser.NL, i);
		}
		public LineGraphicDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineGraphicDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterLineGraphicDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitLineGraphicDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitLineGraphicDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineGraphicDefineContext lineGraphicDefine() throws RecognitionException {
		LineGraphicDefineContext _localctx = new LineGraphicDefineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lineGraphicDefine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			graphicType();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					variableName();
					setState(53);
					match(Comma);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(60);
			variableName();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67100672L) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case X:
				case Y:
				case W:
				case H:
				case Angle:
				case Color:
				case Alpha:
				case BorderWidth:
				case BorderColor:
				case BorderAlpha:
				case FontSize:
				case FontColor:
					{
					setState(61);
					propertyDefine();
					}
					break;
				case Text:
					{
					setState(62);
					textDefine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(68);
				match(NL);
				}
				}
				setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GraphicTypeContext extends ParserRuleContext {
		public TerminalNode Rect() { return getToken(RMGLParser.Rect, 0); }
		public TerminalNode Circle() { return getToken(RMGLParser.Circle, 0); }
		public TerminalNode Diamond() { return getToken(RMGLParser.Diamond, 0); }
		public TerminalNode Parallelogram() { return getToken(RMGLParser.Parallelogram, 0); }
		public TerminalNode Trapezoid() { return getToken(RMGLParser.Trapezoid, 0); }
		public TerminalNode Triangle() { return getToken(RMGLParser.Triangle, 0); }
		public GraphicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterGraphicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitGraphicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitGraphicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphicTypeContext graphicType() throws RecognitionException {
		GraphicTypeContext _localctx = new GraphicTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_graphicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDefineContext extends ParserRuleContext {
		public CharTextContext charText() {
			return getRuleContext(CharTextContext.class,0);
		}
		public TerminalNode X() { return getToken(RMGLParser.X, 0); }
		public TerminalNode Y() { return getToken(RMGLParser.Y, 0); }
		public TerminalNode W() { return getToken(RMGLParser.W, 0); }
		public TerminalNode H() { return getToken(RMGLParser.H, 0); }
		public TerminalNode Angle() { return getToken(RMGLParser.Angle, 0); }
		public TerminalNode Color() { return getToken(RMGLParser.Color, 0); }
		public TerminalNode Alpha() { return getToken(RMGLParser.Alpha, 0); }
		public TerminalNode BorderColor() { return getToken(RMGLParser.BorderColor, 0); }
		public TerminalNode BorderWidth() { return getToken(RMGLParser.BorderWidth, 0); }
		public TerminalNode BorderAlpha() { return getToken(RMGLParser.BorderAlpha, 0); }
		public TerminalNode FontSize() { return getToken(RMGLParser.FontSize, 0); }
		public TerminalNode FontColor() { return getToken(RMGLParser.FontColor, 0); }
		public TerminalNode Comma() { return getToken(RMGLParser.Comma, 0); }
		public TerminalNode Semicolon() { return getToken(RMGLParser.Semicolon, 0); }
		public PropertyDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterPropertyDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitPropertyDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitPropertyDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDefineContext propertyDefine() throws RecognitionException {
		PropertyDefineContext _localctx = new PropertyDefineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66576384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
			charText();
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==Comma || _la==Semicolon) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextDefineContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(RMGLParser.Text, 0); }
		public TerminalNode Quotation() { return getToken(RMGLParser.Quotation, 0); }
		public AnnotationTextContext annotationText() {
			return getRuleContext(AnnotationTextContext.class,0);
		}
		public TerminalNode AnnotationQuotation() { return getToken(RMGLParser.AnnotationQuotation, 0); }
		public TerminalNode Comma() { return getToken(RMGLParser.Comma, 0); }
		public TerminalNode Semicolon() { return getToken(RMGLParser.Semicolon, 0); }
		public TextDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterTextDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitTextDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitTextDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextDefineContext textDefine() throws RecognitionException {
		TextDefineContext _localctx = new TextDefineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Text);
			setState(81);
			match(Quotation);
			setState(82);
			annotationText();
			setState(83);
			match(AnnotationQuotation);
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==Comma || _la==Semicolon) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationDefineContext extends ParserRuleContext {
		public TerminalNode Slash() { return getToken(RMGLParser.Slash, 0); }
		public LineAnnotationTextContext lineAnnotationText() {
			return getRuleContext(LineAnnotationTextContext.class,0);
		}
		public TerminalNode LineAnnotationNL() { return getToken(RMGLParser.LineAnnotationNL, 0); }
		public List<TerminalNode> NL() { return getTokens(RMGLParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RMGLParser.NL, i);
		}
		public AnnotationDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterAnnotationDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitAnnotationDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitAnnotationDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDefineContext annotationDefine() throws RecognitionException {
		AnnotationDefineContext _localctx = new AnnotationDefineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotationDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Slash);
			setState(87);
			lineAnnotationText();
			setState(88);
			match(LineAnnotationNL);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(89);
				match(NL);
				}
				}
				setState(94);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkDefineContext extends ParserRuleContext {
		public List<TerminalNode> TokenChar() { return getTokens(RMGLParser.TokenChar); }
		public TerminalNode TokenChar(int i) {
			return getToken(RMGLParser.TokenChar, i);
		}
		public TerminalNode Line() { return getToken(RMGLParser.Line, 0); }
		public TerminalNode SimpleLine() { return getToken(RMGLParser.SimpleLine, 0); }
		public TerminalNode PolyLine() { return getToken(RMGLParser.PolyLine, 0); }
		public TerminalNode CurveLine() { return getToken(RMGLParser.CurveLine, 0); }
		public TerminalNode Comma() { return getToken(RMGLParser.Comma, 0); }
		public TerminalNode Semicolon() { return getToken(RMGLParser.Semicolon, 0); }
		public TerminalNode LArrow() { return getToken(RMGLParser.LArrow, 0); }
		public TerminalNode RArrow() { return getToken(RMGLParser.RArrow, 0); }
		public List<TerminalNode> NL() { return getTokens(RMGLParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RMGLParser.NL, i);
		}
		public LinkDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).enterLinkDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RMGLParserListener ) ((RMGLParserListener)listener).exitLinkDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RMGLParserVisitor ) return ((RMGLParserVisitor<? extends T>)visitor).visitLinkDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkDefineContext linkDefine() throws RecognitionException {
		LinkDefineContext _localctx = new LinkDefineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_linkDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TokenChar);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LArrow) {
				{
				setState(96);
				match(LArrow);
				}
			}

			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RArrow) {
				{
				setState(100);
				match(RArrow);
				}
			}

			setState(103);
			match(TokenChar);
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==Comma || _la==Semicolon) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(105);
				match(NL);
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

	public static final String _serializedATN =
		"\u0004\u0001%p\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018\b\u0000"+
		"\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000 \b\u0000\u000b\u0000\f\u0000!\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0005\u0003)\b\u0003\n\u0003\f\u0003,\t\u0003"+
		"\u0001\u0004\u0005\u0004/\b\u0004\n\u0004\f\u00042\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u00058\b\u0005\n\u0005\f\u0005"+
		";\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005@\b\u0005\n\u0005"+
		"\f\u0005C\t\u0005\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t[\b\t\n\t\f\t^\t\t\u0001\n\u0001\n\u0003\nb\b"+
		"\n\u0001\n\u0001\n\u0003\nf\b\n\u0001\n\u0001\n\u0001\n\u0005\nk\b\n\n"+
		"\n\f\nn\t\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0004\u0001\u0000\u0001\u0006\u0002\u0000\r\u0012"+
		"\u0014\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u0007\nr\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004%\u0001\u0000"+
		"\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000"+
		"\n3\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eL\u0001\u0000"+
		"\u0000\u0000\u0010P\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000"+
		"\u0014_\u0001\u0000\u0000\u0000\u0016\u0018\u0005\u001f\u0000\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001f\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		" \u0003\n\u0005\u0000\u001d \u0003\u0012\t\u0000\u001e \u0003\u0014\n"+
		"\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0001\u0001"+
		"\u0000\u0000\u0000#$\u0005\u001e\u0000\u0000$\u0003\u0001\u0000\u0000"+
		"\u0000%&\u0005\u001e\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\')\u0005"+
		"#\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0007\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-/\u0005%\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u00001\t\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000039\u0003"+
		"\f\u0006\u000045\u0003\u0002\u0001\u000056\u0005\u001a\u0000\u000068\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<A\u0003\u0002\u0001\u0000=@\u0003\u000e"+
		"\u0007\u0000>@\u0003\u0010\b\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BG\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"DF\u0005\u001f\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u000b\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0007\u0000\u0000\u0000"+
		"K\r\u0001\u0000\u0000\u0000LM\u0007\u0001\u0000\u0000MN\u0003\u0004\u0002"+
		"\u0000NO\u0007\u0002\u0000\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0013\u0000\u0000QR\u0005\u001c\u0000\u0000RS\u0003\u0006\u0003\u0000"+
		"ST\u0005\"\u0000\u0000TU\u0007\u0002\u0000\u0000U\u0011\u0001\u0000\u0000"+
		"\u0000VW\u0005\u001d\u0000\u0000WX\u0003\b\u0004\u0000X\\\u0005$\u0000"+
		"\u0000Y[\u0005\u001f\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0013"+
		"\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\u0005\u001e\u0000"+
		"\u0000`b\u0005\u000b\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0007\u0003\u0000\u0000df\u0005"+
		"\f\u0000\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0005\u001e\u0000\u0000hl\u0007\u0002\u0000\u0000"+
		"ik\u0005\u001f\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0015\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000\r\u0019\u001f!*09?AG\\ae"+
		"l";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}