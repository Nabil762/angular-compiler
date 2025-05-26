// Generated from C:/Users/ASUS/Desktop/compiler-angular-end/src/rules/angularParser.g4 by ANTLR 4.13.2
package rules;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class angularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, DO=4, WHILE=5, FUNCTION=6, RETURN=7, TYPE=8, VARIABLE_TYPE=9, 
		ACCESS_TYPE=10, NEW=11, IMPORT=12, IMPORTS=13, EXPORT=14, COMPONENT=15, 
		FROM=16, THIS=17, SELECTOR=18, STANDALONE=19, CLASS1=20, DASH=21, BOOLEAN=22, 
		INTERFACE=23, EXTEND=24, IMPLEMENT=25, AD=26, PLUS=27, TIMES=28, DIVIDE=29, 
		EQUAL=30, GREATER=31, GREATER_EQUAL=32, FIRST_TAG=33, LESS_EQUAL=34, INCREMENT=35, 
		DECREMENT=36, PLUS_EQUAL=37, MINUS_EQUAL=38, MUL_ASSIGN=39, DIV_ASSIGN=40, 
		MOD_ASSIGN=41, LPAREN=42, RPAREN=43, LBRACKET=44, RBRACKET=45, LBRACE=46, 
		RBRACE=47, SEMICOLON=48, COMMA=49, COLON=50, DOT=51, OR=52, ARROW=53, 
		AND=54, EQUAL_EQUAL=55, NOT_EQUAL=56, STYLES=57, TEMPLATE=58, IDENTIFIER=59, 
		NUMBER=60, STRING=61, WHITESPACE=62, COMMENT=63, BLOCK_COMMENT=64, BACKTICK2=65, 
		COLON2=66, COMMA2=67, OPEN_SQUARE=68, CLOSE_SQUARE=69, DOT2=70, PX=71, 
		EM=72, REM=73, SEMICOLON2=74, LBRACE2=75, RBRACE2=76, PERCENT=77, WS2=78, 
		LINE_COMMENT2=79, BLOCK_COMMENT2=80, ID=81, BACKTICK=82, LINE_COMMENT_HTML=83, 
		BLOCK_COMMENT_HTML=84, TAG_OPEN=85, OPEN_TAG_CLOSE=86, TAG_CLOSE=87, TAG_SELF_CLOSE=88, 
		EQUALH=89, STRING1=90, DIRECTIVE_NAME=91, BINDING_PROPERTY=92, STANDARD_EVENT=93, 
		COLON1=94, OPEN_TS=95, CLOSE_TS=96, DOT1=97, TAG_NAME=98, WS_HTML=99, 
		BACKTICK1=100;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_interfaceDeclaration = 3, 
		RULE_interfaceBody = 4, RULE_componentDeclaration = 5, RULE_componentConfig = 6, 
		RULE_propertyAssignment = 7, RULE_importDeclaration = 8, RULE_selector = 9, 
		RULE_standalone = 10, RULE_template = 11, RULE_element = 12, RULE_tag = 13, 
		RULE_openingTag = 14, RULE_closingTag = 15, RULE_selfClosingTag = 16, 
		RULE_attributes = 17, RULE_interpolation = 18, RULE_styles = 19, RULE_bodyOfCss = 20, 
		RULE_objects = 21, RULE_elementCss = 22, RULE_bodyOfelement = 23, RULE_valueCss = 24, 
		RULE_classDeclaration = 25, RULE_listDeclaration = 26, RULE_listStatement = 27, 
		RULE_arrayExpression = 28, RULE_objectExpressionList = 29, RULE_objectExpression = 30, 
		RULE_propertyList = 31, RULE_property = 32, RULE_property_declaration = 33, 
		RULE_type = 34, RULE_functionDeclaration = 35, RULE_parameters = 36, RULE_parameter = 37, 
		RULE_functionBody = 38, RULE_functionCall = 39, RULE_valueExpression = 40, 
		RULE_single_type = 41, RULE_propertyDeclaration = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatement", "interfaceDeclaration", "interfaceBody", 
			"componentDeclaration", "componentConfig", "propertyAssignment", "importDeclaration", 
			"selector", "standalone", "template", "element", "tag", "openingTag", 
			"closingTag", "selfClosingTag", "attributes", "interpolation", "styles", 
			"bodyOfCss", "objects", "elementCss", "bodyOfelement", "valueCss", "classDeclaration", 
			"listDeclaration", "listStatement", "arrayExpression", "objectExpressionList", 
			"objectExpression", "propertyList", "property", "property_declaration", 
			"type", "functionDeclaration", "parameters", "parameter", "functionBody", 
			"functionCall", "valueExpression", "single_type", "propertyDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'do'", "'while'", "'function'", "'return'", 
			null, null, null, "'new'", "'import'", "'imports'", "'export'", "'component'", 
			"'from'", "'this'", "'selector'", "'standalone'", null, "'-'", null, 
			"'interface'", "'extends'", "'implement'", "'@'", "'+'", "'*'", "'/'", 
			null, null, "'>='", "'<'", "'<='", "'++'", "'--'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'('", "')'", null, null, null, null, null, null, null, 
			null, "'|'", "'=>'", "'&&'", "'=='", "'!='", "'styles'", "'template'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'px'", "'em'", "'rem'", null, "'{'", "'}'", "'%'", null, null, null, 
			null, null, null, null, null, "'</'", null, "'/>'", null, null, null, 
			null, null, null, "'{{'", "'}}'", null, null, null, "'`,'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "DO", "WHILE", "FUNCTION", "RETURN", "TYPE", 
			"VARIABLE_TYPE", "ACCESS_TYPE", "NEW", "IMPORT", "IMPORTS", "EXPORT", 
			"COMPONENT", "FROM", "THIS", "SELECTOR", "STANDALONE", "CLASS1", "DASH", 
			"BOOLEAN", "INTERFACE", "EXTEND", "IMPLEMENT", "AD", "PLUS", "TIMES", 
			"DIVIDE", "EQUAL", "GREATER", "GREATER_EQUAL", "FIRST_TAG", "LESS_EQUAL", 
			"INCREMENT", "DECREMENT", "PLUS_EQUAL", "MINUS_EQUAL", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"LBRACE", "RBRACE", "SEMICOLON", "COMMA", "COLON", "DOT", "OR", "ARROW", 
			"AND", "EQUAL_EQUAL", "NOT_EQUAL", "STYLES", "TEMPLATE", "IDENTIFIER", 
			"NUMBER", "STRING", "WHITESPACE", "COMMENT", "BLOCK_COMMENT", "BACKTICK2", 
			"COLON2", "COMMA2", "OPEN_SQUARE", "CLOSE_SQUARE", "DOT2", "PX", "EM", 
			"REM", "SEMICOLON2", "LBRACE2", "RBRACE2", "PERCENT", "WS2", "LINE_COMMENT2", 
			"BLOCK_COMMENT2", "ID", "BACKTICK", "LINE_COMMENT_HTML", "BLOCK_COMMENT_HTML", 
			"TAG_OPEN", "OPEN_TAG_CLOSE", "TAG_CLOSE", "TAG_SELF_CLOSE", "EQUALH", 
			"STRING1", "DIRECTIVE_NAME", "BINDING_PROPERTY", "STANDARD_EVENT", "COLON1", 
			"OPEN_TS", "CLOSE_TS", "DOT1", "TAG_NAME", "WS_HTML", "BACKTICK1"
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
	public String getGrammarFileName() { return "angularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public angularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(angularParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(91);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				importStatement();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERFACE) {
				{
				{
				setState(98);
				interfaceDeclaration();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			componentDeclaration();
			setState(105);
			classDeclaration();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(angularParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(angularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(angularParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(angularParser.SEMICOLON, 0); }
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(angularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(angularParser.IDENTIFIER, i);
		}
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
		public TerminalNode TIMES() { return getToken(angularParser.TIMES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(angularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(angularParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IMPORT);
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(108);
				match(LBRACE);
				setState(109);
				match(IDENTIFIER);
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						match(COMMA);
						setState(111);
						match(IDENTIFIER);
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(117);
					match(COMMA);
					}
				}

				setState(120);
				match(RBRACE);
				}
				break;
			case TIMES:
				{
				setState(121);
				match(TIMES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			match(FROM);
			setState(125);
			match(STRING);
			setState(126);
			match(SEMICOLON);
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(angularParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(INTERFACE);
			setState(129);
			match(IDENTIFIER);
			setState(130);
			match(LBRACE);
			setState(131);
			interfaceBody();
			setState(132);
			match(RBRACE);
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
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(angularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(angularParser.SEMICOLON, i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(134);
				propertyDeclaration();
				setState(135);
				match(SEMICOLON);
				}
				}
				setState(141);
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode AD() { return getToken(angularParser.AD, 0); }
		public TerminalNode COMPONENT() { return getToken(angularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(angularParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(angularParser.RPAREN, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(AD);
			setState(143);
			match(COMPONENT);
			setState(144);
			match(LPAREN);
			setState(145);
			match(LBRACE);
			setState(146);
			componentConfig();
			setState(147);
			match(RBRACE);
			setState(148);
			match(RPAREN);
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
	public static class ComponentConfigContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(angularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(angularParser.COMMA, i);
		}
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterComponentConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitComponentConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitComponentConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345564228362240L) != 0)) {
				{
				setState(150);
				propertyAssignment();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					propertyAssignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropertyContext extends PropertyAssignmentContext {
		public StandaloneContext standalone() {
			return getRuleContext(StandaloneContext.class,0);
		}
		public StandalonePropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterStandaloneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitStandaloneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitStandaloneProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportPropertyContext extends PropertyAssignmentContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ImportPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterImportProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitImportProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitImportProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends PropertyAssignmentContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TemplatePropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends PropertyAssignmentContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SelectorPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterSelectorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitSelectorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitSelectorProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropertyContext extends PropertyAssignmentContext {
		public StylesContext styles() {
			return getRuleContext(StylesContext.class,0);
		}
		public StylesPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterStylesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitStylesProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitStylesProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyAssignment);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				selector();
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				standalone();
				}
				break;
			case STYLES:
				_localctx = new StylesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				styles();
				}
				break;
			case IMPORTS:
				_localctx = new ImportPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				importDeclaration();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				template();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(angularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(angularParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(angularParser.RBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(IMPORTS);
			setState(168);
			match(COLON);
			setState(169);
			match(LBRACKET);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(170);
				match(IDENTIFIER);
				}
			}

			setState(173);
			match(RBRACKET);
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
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(angularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(angularParser.STRING, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(SELECTOR);
			setState(176);
			match(COLON);
			setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(angularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(angularParser.BOOLEAN, 0); }
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(STANDALONE);
			setState(180);
			match(COLON);
			setState(181);
			match(BOOLEAN);
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
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(angularParser.TEMPLATE, 0); }
		public TerminalNode COLON1() { return getToken(angularParser.COLON1, 0); }
		public TerminalNode BACKTICK() { return getToken(angularParser.BACKTICK, 0); }
		public TerminalNode BACKTICK1() { return getToken(angularParser.BACKTICK1, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(TEMPLATE);
			setState(184);
			match(COLON1);
			setState(185);
			match(BACKTICK);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 9217L) != 0)) {
				{
				{
				setState(186);
				element();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(BACKTICK1);
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
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationElementContext extends ElementContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public InterpolationElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagElementContext extends ElementContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TagElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagNameElementContext extends ElementContext {
		public TerminalNode TAG_NAME() { return getToken(angularParser.TAG_NAME, 0); }
		public TerminalNode COLON1() { return getToken(angularParser.COLON1, 0); }
		public TagNameElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterTagNameElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitTagNameElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitTagNameElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_element);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new TagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				tag();
				}
				break;
			case TAG_NAME:
				_localctx = new TagNameElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(TAG_NAME);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON1) {
					{
					setState(196);
					match(COLON1);
					}
				}

				}
				break;
			case OPEN_TS:
				_localctx = new InterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				interpolation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagContext extends ParserRuleContext {
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
	 
		public TagContext() { }
		public void copyFrom(TagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagElementContext extends TagContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingTagElementContext(TagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterSelfClosingTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitSelfClosingTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitSelfClosingTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardTagContext extends TagContext {
		public OpeningTagContext openingTag() {
			return getRuleContext(OpeningTagContext.class,0);
		}
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public StandardTagContext(TagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterStandardTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitStandardTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitStandardTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tag);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new StandardTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				openingTag();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 9217L) != 0)) {
					{
					{
					setState(203);
					element();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				closingTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingTagElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				selfClosingTag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpeningTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(angularParser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(angularParser.TAG_CLOSE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public OpeningTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterOpeningTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitOpeningTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitOpeningTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeningTagContext openingTag() throws RecognitionException {
		OpeningTagContext _localctx = new OpeningTagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_openingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(TAG_OPEN);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 135L) != 0)) {
				{
				{
				setState(215);
				attributes();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(TAG_CLOSE);
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
	public static class ClosingTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_CLOSE() { return getToken(angularParser.OPEN_TAG_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(angularParser.TAG_NAME, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(angularParser.TAG_CLOSE, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_closingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(OPEN_TAG_CLOSE);
			setState(224);
			match(TAG_NAME);
			setState(225);
			match(TAG_CLOSE);
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(angularParser.TAG_OPEN, 0); }
		public TerminalNode TAG_SELF_CLOSE() { return getToken(angularParser.TAG_SELF_CLOSE, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(TAG_OPEN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 135L) != 0)) {
				{
				{
				setState(228);
				attributes();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(TAG_SELF_CLOSE);
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
	public static class AttributesContext extends ParserRuleContext {
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	 
		public AttributesContext() { }
		public void copyFrom(AttributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventAttributeContext extends AttributesContext {
		public TerminalNode STANDARD_EVENT() { return getToken(angularParser.STANDARD_EVENT, 0); }
		public TerminalNode EQUALH() { return getToken(angularParser.EQUALH, 0); }
		public TerminalNode STRING1() { return getToken(angularParser.STRING1, 0); }
		public EventAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterEventAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitEventAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitEventAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BindingAttributeContext extends AttributesContext {
		public TerminalNode BINDING_PROPERTY() { return getToken(angularParser.BINDING_PROPERTY, 0); }
		public TerminalNode EQUALH() { return getToken(angularParser.EQUALH, 0); }
		public TerminalNode STRING1() { return getToken(angularParser.STRING1, 0); }
		public BindingAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveAttributeContext extends AttributesContext {
		public TerminalNode DIRECTIVE_NAME() { return getToken(angularParser.DIRECTIVE_NAME, 0); }
		public TerminalNode EQUALH() { return getToken(angularParser.EQUALH, 0); }
		public TerminalNode STRING1() { return getToken(angularParser.STRING1, 0); }
		public DirectiveAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterDirectiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitDirectiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitDirectiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends AttributesContext {
		public TerminalNode TAG_NAME() { return getToken(angularParser.TAG_NAME, 0); }
		public TerminalNode EQUALH() { return getToken(angularParser.EQUALH, 0); }
		public TerminalNode STRING1() { return getToken(angularParser.STRING1, 0); }
		public HtmlAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attributes);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				_localctx = new HtmlAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(TAG_NAME);
				setState(237);
				match(EQUALH);
				setState(238);
				match(STRING1);
				}
				break;
			case DIRECTIVE_NAME:
				_localctx = new DirectiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(DIRECTIVE_NAME);
				setState(240);
				match(EQUALH);
				setState(241);
				match(STRING1);
				}
				break;
			case BINDING_PROPERTY:
				_localctx = new BindingAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(BINDING_PROPERTY);
				setState(243);
				match(EQUALH);
				setState(244);
				match(STRING1);
				}
				break;
			case STANDARD_EVENT:
				_localctx = new EventAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(STANDARD_EVENT);
				setState(246);
				match(EQUALH);
				setState(247);
				match(STRING1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode OPEN_TS() { return getToken(angularParser.OPEN_TS, 0); }
		public TerminalNode TAG_NAME() { return getToken(angularParser.TAG_NAME, 0); }
		public TerminalNode CLOSE_TS() { return getToken(angularParser.CLOSE_TS, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(OPEN_TS);
			setState(251);
			match(TAG_NAME);
			setState(252);
			match(CLOSE_TS);
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
	public static class StylesContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(angularParser.STYLES, 0); }
		public TerminalNode COLON2() { return getToken(angularParser.COLON2, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(angularParser.OPEN_SQUARE, 0); }
		public BodyOfCssContext bodyOfCss() {
			return getRuleContext(BodyOfCssContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(angularParser.CLOSE_SQUARE, 0); }
		public TerminalNode COMMA2() { return getToken(angularParser.COMMA2, 0); }
		public StylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesContext styles() throws RecognitionException {
		StylesContext _localctx = new StylesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_styles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(STYLES);
			setState(255);
			match(COLON2);
			setState(256);
			match(OPEN_SQUARE);
			setState(257);
			bodyOfCss();
			setState(258);
			match(CLOSE_SQUARE);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA2) {
				{
				setState(259);
				match(COMMA2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyOfCssContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK2() { return getTokens(angularParser.BACKTICK2); }
		public TerminalNode BACKTICK2(int i) {
			return getToken(angularParser.BACKTICK2, i);
		}
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public TerminalNode COMMA2() { return getToken(angularParser.COMMA2, 0); }
		public BodyOfCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyOfCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterBodyOfCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitBodyOfCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitBodyOfCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyOfCssContext bodyOfCss() throws RecognitionException {
		BodyOfCssContext _localctx = new BodyOfCssContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bodyOfCss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(BACKTICK2);
			setState(263);
			objects();
			setState(264);
			match(BACKTICK2);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA2) {
				{
				setState(265);
				match(COMMA2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectsContext extends ParserRuleContext {
		public List<ElementCssContext> elementCss() {
			return getRuleContexts(ElementCssContext.class);
		}
		public ElementCssContext elementCss(int i) {
			return getRuleContext(ElementCssContext.class,i);
		}
		public List<TerminalNode> COMMA2() { return getTokens(angularParser.COMMA2); }
		public TerminalNode COMMA2(int i) {
			return getToken(angularParser.COMMA2, i);
		}
		public ObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitObjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectsContext objects() throws RecognitionException {
		ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(268);
				elementCss();
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA2 || _la==DOT2) {
				{
				{
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA2) {
					{
					setState(271);
					match(COMMA2);
					}
				}

				setState(274);
				elementCss();
				}
				}
				setState(279);
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
	public static class ElementCssContext extends ParserRuleContext {
		public TerminalNode DOT2() { return getToken(angularParser.DOT2, 0); }
		public TerminalNode LBRACE2() { return getToken(angularParser.LBRACE2, 0); }
		public TerminalNode RBRACE2() { return getToken(angularParser.RBRACE2, 0); }
		public List<TerminalNode> ID() { return getTokens(angularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(angularParser.ID, i);
		}
		public List<BodyOfelementContext> bodyOfelement() {
			return getRuleContexts(BodyOfelementContext.class);
		}
		public BodyOfelementContext bodyOfelement(int i) {
			return getRuleContext(BodyOfelementContext.class,i);
		}
		public ElementCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterElementCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitElementCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitElementCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCssContext elementCss() throws RecognitionException {
		ElementCssContext _localctx = new ElementCssContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elementCss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(DOT2);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				match(ID);
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(286);
			match(LBRACE2);
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				bodyOfelement();
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(292);
			match(RBRACE2);
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
	public static class BodyOfelementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(angularParser.ID, 0); }
		public TerminalNode COLON2() { return getToken(angularParser.COLON2, 0); }
		public ValueCssContext valueCss() {
			return getRuleContext(ValueCssContext.class,0);
		}
		public TerminalNode SEMICOLON2() { return getToken(angularParser.SEMICOLON2, 0); }
		public BodyOfelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyOfelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterBodyOfelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitBodyOfelement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitBodyOfelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyOfelementContext bodyOfelement() throws RecognitionException {
		BodyOfelementContext _localctx = new BodyOfelementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bodyOfelement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ID);
			setState(295);
			match(COLON2);
			setState(296);
			valueCss();
			setState(297);
			match(SEMICOLON2);
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
	public static class ValueCssContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(angularParser.PERCENT, 0); }
		public List<TerminalNode> ID() { return getTokens(angularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(angularParser.ID, i);
		}
		public ValueCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterValueCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitValueCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitValueCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueCssContext valueCss() throws RecognitionException {
		ValueCssContext _localctx = new ValueCssContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valueCss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==PERCENT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(300);
				match(ID);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(301);
					match(ID);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(angularParser.EXPORT, 0); }
		public TerminalNode CLASS1() { return getToken(angularParser.CLASS1, 0); }
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
		public List<ListDeclarationContext> listDeclaration() {
			return getRuleContexts(ListDeclarationContext.class);
		}
		public ListDeclarationContext listDeclaration(int i) {
			return getRuleContext(ListDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(EXPORT);
			setState(307);
			match(CLASS1);
			setState(308);
			match(IDENTIFIER);
			setState(309);
			match(LBRACE);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(310);
				listDeclaration();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(RBRACE);
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
	public static class ListDeclarationContext extends ParserRuleContext {
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
	 
		public ListDeclarationContext() { }
		public void copyFrom(ListDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationPropertyContext extends ListDeclarationContext {
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public DeclarationPropertyContext(ListDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterDeclarationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitDeclarationProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitDeclarationProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListStatement_DeclarationContext extends ListDeclarationContext {
		public ListStatementContext listStatement() {
			return getRuleContext(ListStatementContext.class,0);
		}
		public ListStatement_DeclarationContext(ListDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterListStatement_Declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitListStatement_Declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitListStatement_Declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_DeclarationContext extends ListDeclarationContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public Function_DeclarationContext(ListDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterFunction_Declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitFunction_Declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitFunction_Declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listDeclaration);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ListStatement_DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				listStatement();
				}
				break;
			case 2:
				_localctx = new DeclarationPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				property_declaration();
				}
				break;
			case 3:
				_localctx = new Function_DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				functionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(angularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(angularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(angularParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(angularParser.RBRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(angularParser.EQUAL, 0); }
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(angularParser.SEMICOLON, 0); }
		public ListStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterListStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitListStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitListStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStatementContext listStatement() throws RecognitionException {
		ListStatementContext _localctx = new ListStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(IDENTIFIER);
			setState(324);
			match(COLON);
			setState(325);
			match(IDENTIFIER);
			setState(326);
			match(LBRACKET);
			setState(327);
			match(RBRACKET);
			setState(328);
			match(EQUAL);
			setState(329);
			arrayExpression();
			setState(330);
			match(SEMICOLON);
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
	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(angularParser.LBRACKET, 0); }
		public ObjectExpressionListContext objectExpressionList() {
			return getRuleContext(ObjectExpressionListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(angularParser.RBRACKET, 0); }
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LBRACKET);
			setState(333);
			objectExpressionList();
			setState(334);
			match(RBRACKET);
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
	public static class ObjectExpressionListContext extends ParserRuleContext {
		public List<ObjectExpressionContext> objectExpression() {
			return getRuleContexts(ObjectExpressionContext.class);
		}
		public ObjectExpressionContext objectExpression(int i) {
			return getRuleContext(ObjectExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(angularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(angularParser.COMMA, i);
		}
		public ObjectExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterObjectExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitObjectExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitObjectExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionListContext objectExpressionList() throws RecognitionException {
		ObjectExpressionListContext _localctx = new ObjectExpressionListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			objectExpression();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(337);
				match(COMMA);
				setState(338);
				objectExpression();
				}
				}
				setState(343);
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
	public static class ObjectExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
		public ObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionContext objectExpression() throws RecognitionException {
		ObjectExpressionContext _localctx = new ObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(LBRACE);
			setState(345);
			propertyList();
			setState(346);
			match(RBRACE);
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
	public static class PropertyListContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(angularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(angularParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			property();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				property();
				}
				}
				setState(355);
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(IDENTIFIER);
			setState(357);
			match(COLON);
			setState(358);
			valueExpression();
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
	public static class Property_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(angularParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(angularParser.EQUAL, 0); }
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitProperty_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitProperty_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(IDENTIFIER);
			setState(361);
			match(COLON);
			setState(362);
			type();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(363);
				match(EQUAL);
				setState(364);
				type();
				}
			}

			setState(367);
			match(SEMICOLON);
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
	public static class TypeContext extends ParserRuleContext {
		public List<Single_typeContext> single_type() {
			return getRuleContexts(Single_typeContext.class);
		}
		public Single_typeContext single_type(int i) {
			return getRuleContext(Single_typeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(angularParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(angularParser.OR, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			single_type();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(370);
				match(OR);
				setState(371);
				single_type();
				}
				}
				setState(376);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(angularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(angularParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(IDENTIFIER);
			setState(378);
			match(LPAREN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(379);
				parameters();
				}
			}

			setState(382);
			match(RPAREN);
			setState(383);
			match(COLON);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==IDENTIFIER) {
				{
				setState(384);
				type();
				}
			}

			setState(387);
			match(LBRACE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266128289792L) != 0)) {
				{
				{
				setState(388);
				functionBody();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(RBRACE);
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(angularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(angularParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			parameter();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(397);
				match(COMMA);
				setState(398);
				parameter();
				}
				}
				setState(403);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public Single_typeContext single_type() {
			return getRuleContext(Single_typeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(IDENTIFIER);
			setState(405);
			match(COLON);
			setState(406);
			single_type();
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	 
		public FunctionBodyContext() { }
		public void copyFrom(FunctionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends FunctionBodyContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(angularParser.SEMICOLON, 0); }
		public ExpressionStatementContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssignmentContext extends FunctionBodyContext {
		public TerminalNode THIS() { return getToken(angularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(angularParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(angularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(angularParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(angularParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(angularParser.SEMICOLON, 0); }
		public SimpleAssignmentContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterSimpleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitSimpleAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitSimpleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexAssignmentContext extends FunctionBodyContext {
		public TerminalNode THIS() { return getToken(angularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(angularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(angularParser.EQUAL, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(angularParser.SEMICOLON, 0); }
		public ComplexAssignmentContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterComplexAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitComplexAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitComplexAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionBody);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(THIS);
				setState(409);
				match(DOT);
				setState(410);
				match(IDENTIFIER);
				setState(411);
				match(EQUAL);
				setState(412);
				match(IDENTIFIER);
				setState(413);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ComplexAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(THIS);
				setState(415);
				match(DOT);
				setState(416);
				match(IDENTIFIER);
				setState(417);
				match(EQUAL);
				setState(418);
				valueExpression();
				setState(419);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				valueExpression();
				setState(422);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(angularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(angularParser.RPAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(IDENTIFIER);
			setState(427);
			match(LPAREN);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266128158720L) != 0)) {
				{
				{
				setState(428);
				valueExpression();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(RPAREN);
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
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallValueContext extends ValueExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallValueContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterFunctionCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitFunctionCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitFunctionCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ValueExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(angularParser.BOOLEAN, 0); }
		public BooleanValueContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends ValueExpressionContext {
		public TerminalNode STRING() { return getToken(angularParser.STRING, 0); }
		public StringValueContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericValueContext extends ValueExpressionContext {
		public TerminalNode NUMBER() { return getToken(angularParser.NUMBER, 0); }
		public NumericValueContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitNumericValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitNumericValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_valueExpression);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumericValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				_localctx = new FunctionCallValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				functionCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Single_typeContext extends ParserRuleContext {
		public Single_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_type; }
	 
		public Single_typeContext() { }
		public void copyFrom(Single_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTypeContext extends Single_typeContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public IdentifierTypeContext(Single_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcreteTypeContext extends Single_typeContext {
		public TerminalNode TYPE() { return getToken(angularParser.TYPE, 0); }
		public ConcreteTypeContext(Single_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterConcreteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitConcreteType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitConcreteType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_typeContext single_type() throws RecognitionException {
		Single_typeContext _localctx = new Single_typeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_single_type);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(IDENTIFIER);
				}
				break;
			case TYPE:
				_localctx = new ConcreteTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(angularParser.TYPE, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(IDENTIFIER);
			setState(447);
			match(COLON);
			setState(448);
			match(TYPE);
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
		"\u0004\u0001d\u01c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0004\u0000X\b\u0000"+
		"\u000b\u0000\f\u0000Y\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"_\b\u0001\u000b\u0001\f\u0001`\u0001\u0001\u0005\u0001d\b\u0001\n\u0001"+
		"\f\u0001g\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002q\b\u0002\n\u0002"+
		"\f\u0002t\t\u0002\u0001\u0002\u0003\u0002w\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002{\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008a\b\u0004\n\u0004"+
		"\f\u0004\u008d\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u009a\b\u0006\n\u0006\f\u0006\u009d\t\u0006\u0003"+
		"\u0006\u009f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00a6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00ac\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00bc\b\u000b\n\u000b\f\u000b\u00bf\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00c6\b\f\u0001\f\u0003\f\u00c9\b\f\u0001"+
		"\r\u0001\r\u0005\r\u00cd\b\r\n\r\f\r\u00d0\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00d5\b\r\u0001\u000e\u0001\u000e\u0005\u000e\u00d9\b\u000e\n"+
		"\u000e\f\u000e\u00dc\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u00e6"+
		"\b\u0010\n\u0010\f\u0010\u00e9\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00f9\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0105\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u010b\b\u0014\u0001\u0015\u0003\u0015\u010e\b\u0015\u0001\u0015\u0003"+
		"\u0015\u0111\b\u0015\u0001\u0015\u0005\u0015\u0114\b\u0015\n\u0015\f\u0015"+
		"\u0117\t\u0015\u0001\u0016\u0001\u0016\u0004\u0016\u011b\b\u0016\u000b"+
		"\u0016\f\u0016\u011c\u0001\u0016\u0001\u0016\u0004\u0016\u0121\b\u0016"+
		"\u000b\u0016\f\u0016\u0122\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u012f\b\u0018\u0003\u0018\u0131\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0138\b\u0019\n"+
		"\u0019\f\u0019\u013b\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0142\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u0154\b\u001d\n\u001d\f\u001d\u0157\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0160\b\u001f\n\u001f\f\u001f\u0163\t\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u016e"+
		"\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u0175\b\"\n\"\f\"\u0178"+
		"\t\"\u0001#\u0001#\u0001#\u0003#\u017d\b#\u0001#\u0001#\u0001#\u0003#"+
		"\u0182\b#\u0001#\u0001#\u0005#\u0186\b#\n#\f#\u0189\t#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0005$\u0190\b$\n$\f$\u0193\t$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01a9\b&\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u01ae\b\'\n\'\f\'\u01b1\t\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0001(\u0003(\u01b9\b(\u0001)\u0001)\u0003)\u01bd\b)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0000\u0000+\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRT\u0000\u0001\u0002\u0000MMQQ\u01cb\u0000W\u0001\u0000\u0000"+
		"\u0000\u0002^\u0001\u0000\u0000\u0000\u0004k\u0001\u0000\u0000\u0000\u0006"+
		"\u0080\u0001\u0000\u0000\u0000\b\u008b\u0001\u0000\u0000\u0000\n\u008e"+
		"\u0001\u0000\u0000\u0000\f\u009e\u0001\u0000\u0000\u0000\u000e\u00a5\u0001"+
		"\u0000\u0000\u0000\u0010\u00a7\u0001\u0000\u0000\u0000\u0012\u00af\u0001"+
		"\u0000\u0000\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00b7\u0001"+
		"\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u00d4\u0001"+
		"\u0000\u0000\u0000\u001c\u00d6\u0001\u0000\u0000\u0000\u001e\u00df\u0001"+
		"\u0000\u0000\u0000 \u00e3\u0001\u0000\u0000\u0000\"\u00f8\u0001\u0000"+
		"\u0000\u0000$\u00fa\u0001\u0000\u0000\u0000&\u00fe\u0001\u0000\u0000\u0000"+
		"(\u0106\u0001\u0000\u0000\u0000*\u010d\u0001\u0000\u0000\u0000,\u0118"+
		"\u0001\u0000\u0000\u0000.\u0126\u0001\u0000\u0000\u00000\u012b\u0001\u0000"+
		"\u0000\u00002\u0132\u0001\u0000\u0000\u00004\u0141\u0001\u0000\u0000\u0000"+
		"6\u0143\u0001\u0000\u0000\u00008\u014c\u0001\u0000\u0000\u0000:\u0150"+
		"\u0001\u0000\u0000\u0000<\u0158\u0001\u0000\u0000\u0000>\u015c\u0001\u0000"+
		"\u0000\u0000@\u0164\u0001\u0000\u0000\u0000B\u0168\u0001\u0000\u0000\u0000"+
		"D\u0171\u0001\u0000\u0000\u0000F\u0179\u0001\u0000\u0000\u0000H\u018c"+
		"\u0001\u0000\u0000\u0000J\u0194\u0001\u0000\u0000\u0000L\u01a8\u0001\u0000"+
		"\u0000\u0000N\u01aa\u0001\u0000\u0000\u0000P\u01b8\u0001\u0000\u0000\u0000"+
		"R\u01bc\u0001\u0000\u0000\u0000T\u01be\u0001\u0000\u0000\u0000VX\u0003"+
		"\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0000\u0000\u0001\\\u0001\u0001\u0000\u0000\u0000]_\u0003"+
		"\u0004\u0002\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ae\u0001\u0000\u0000"+
		"\u0000bd\u0003\u0006\u0003\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0003\n\u0005\u0000ij\u0003"+
		"2\u0019\u0000j\u0003\u0001\u0000\u0000\u0000kz\u0005\f\u0000\u0000lm\u0005"+
		".\u0000\u0000mr\u0005;\u0000\u0000no\u00051\u0000\u0000oq\u0005;\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uw\u00051\u0000\u0000vu\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0005/\u0000\u0000y{\u0005"+
		"\u001c\u0000\u0000zl\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0005\u0010\u0000\u0000}~\u0005=\u0000\u0000"+
		"~\u007f\u00050\u0000\u0000\u007f\u0005\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0017\u0000\u0000\u0081\u0082\u0005;\u0000\u0000\u0082\u0083\u0005"+
		".\u0000\u0000\u0083\u0084\u0003\b\u0004\u0000\u0084\u0085\u0005/\u0000"+
		"\u0000\u0085\u0007\u0001\u0000\u0000\u0000\u0086\u0087\u0003T*\u0000\u0087"+
		"\u0088\u00050\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0086"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\t\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u001a\u0000\u0000\u008f\u0090\u0005\u000f\u0000\u0000\u0090\u0091\u0005"+
		"*\u0000\u0000\u0091\u0092\u0005.\u0000\u0000\u0092\u0093\u0003\f\u0006"+
		"\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0005+\u0000\u0000\u0095"+
		"\u000b\u0001\u0000\u0000\u0000\u0096\u009b\u0003\u000e\u0007\u0000\u0097"+
		"\u0098\u00051\u0000\u0000\u0098\u009a\u0003\u000e\u0007\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u0096"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\r\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a6\u0003\u0012\t\u0000\u00a1\u00a6\u0003\u0014"+
		"\n\u0000\u00a2\u00a6\u0003&\u0013\u0000\u00a3\u00a6\u0003\u0010\b\u0000"+
		"\u00a4\u00a6\u0003\u0016\u000b\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u000f\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\r\u0000\u0000\u00a8"+
		"\u00a9\u00052\u0000\u0000\u00a9\u00ab\u0005,\u0000\u0000\u00aa\u00ac\u0005"+
		";\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005-\u0000"+
		"\u0000\u00ae\u0011\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0012\u0000"+
		"\u0000\u00b0\u00b1\u00052\u0000\u0000\u00b1\u00b2\u0005=\u0000\u0000\u00b2"+
		"\u0013\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0013\u0000\u0000\u00b4"+
		"\u00b5\u00052\u0000\u0000\u00b5\u00b6\u0005\u0016\u0000\u0000\u00b6\u0015"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005:\u0000\u0000\u00b8\u00b9\u0005"+
		"^\u0000\u0000\u00b9\u00bd\u0005R\u0000\u0000\u00ba\u00bc\u0003\u0018\f"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005d\u0000\u0000\u00c1\u0017\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c9\u0003\u001a\r\u0000\u00c3\u00c5\u0005b\u0000\u0000\u00c4"+
		"\u00c6\u0005^\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0003$\u0012\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u0019\u0001"+
		"\u0000\u0000\u0000\u00ca\u00ce\u0003\u001c\u000e\u0000\u00cb\u00cd\u0003"+
		"\u0018\f\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0003\u001e\u000f\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d5\u0003 \u0010\u0000\u00d4\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u001b\u0001\u0000\u0000"+
		"\u0000\u00d6\u00da\u0005U\u0000\u0000\u00d7\u00d9\u0003\"\u0011\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005W\u0000\u0000\u00de\u001d\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005V\u0000\u0000\u00e0\u00e1\u0005b\u0000\u0000\u00e1\u00e2\u0005"+
		"W\u0000\u0000\u00e2\u001f\u0001\u0000\u0000\u0000\u00e3\u00e7\u0005U\u0000"+
		"\u0000\u00e4\u00e6\u0003\"\u0011\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005X\u0000\u0000\u00eb"+
		"!\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005b\u0000\u0000\u00ed\u00ee\u0005"+
		"Y\u0000\u0000\u00ee\u00f9\u0005Z\u0000\u0000\u00ef\u00f0\u0005[\u0000"+
		"\u0000\u00f0\u00f1\u0005Y\u0000\u0000\u00f1\u00f9\u0005Z\u0000\u0000\u00f2"+
		"\u00f3\u0005\\\u0000\u0000\u00f3\u00f4\u0005Y\u0000\u0000\u00f4\u00f9"+
		"\u0005Z\u0000\u0000\u00f5\u00f6\u0005]\u0000\u0000\u00f6\u00f7\u0005Y"+
		"\u0000\u0000\u00f7\u00f9\u0005Z\u0000\u0000\u00f8\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f8\u00ef\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f9#\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005_\u0000\u0000\u00fb\u00fc\u0005b\u0000\u0000\u00fc\u00fd"+
		"\u0005`\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u00ff\u00059"+
		"\u0000\u0000\u00ff\u0100\u0005B\u0000\u0000\u0100\u0101\u0005D\u0000\u0000"+
		"\u0101\u0102\u0003(\u0014\u0000\u0102\u0104\u0005E\u0000\u0000\u0103\u0105"+
		"\u0005C\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\'\u0001\u0000\u0000\u0000\u0106\u0107\u0005A"+
		"\u0000\u0000\u0107\u0108\u0003*\u0015\u0000\u0108\u010a\u0005A\u0000\u0000"+
		"\u0109\u010b\u0005C\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b)\u0001\u0000\u0000\u0000\u010c\u010e"+
		"\u0003,\u0016\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u0115\u0001\u0000\u0000\u0000\u010f\u0111\u0005"+
		"C\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0003,\u0016"+
		"\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116+\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0118\u011a\u0005F\u0000\u0000\u0119\u011b\u0005Q\u0000\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0001\u0000\u0000\u0000\u011e\u0120\u0005K\u0000\u0000\u011f\u0121\u0003"+
		".\u0017\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005L\u0000"+
		"\u0000\u0125-\u0001\u0000\u0000\u0000\u0126\u0127\u0005Q\u0000\u0000\u0127"+
		"\u0128\u0005B\u0000\u0000\u0128\u0129\u00030\u0018\u0000\u0129\u012a\u0005"+
		"J\u0000\u0000\u012a/\u0001\u0000\u0000\u0000\u012b\u0130\u0007\u0000\u0000"+
		"\u0000\u012c\u012e\u0005Q\u0000\u0000\u012d\u012f\u0005Q\u0000\u0000\u012e"+
		"\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0001\u0000\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u01311\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0005\u000e\u0000\u0000\u0133\u0134\u0005\u0014\u0000\u0000\u0134\u0135"+
		"\u0005;\u0000\u0000\u0135\u0139\u0005.\u0000\u0000\u0136\u0138\u00034"+
		"\u001a\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0005/\u0000\u0000\u013d3\u0001\u0000\u0000\u0000"+
		"\u013e\u0142\u00036\u001b\u0000\u013f\u0142\u0003B!\u0000\u0140\u0142"+
		"\u0003F#\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u01425\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005;\u0000\u0000\u0144\u0145\u00052\u0000\u0000\u0145"+
		"\u0146\u0005;\u0000\u0000\u0146\u0147\u0005,\u0000\u0000\u0147\u0148\u0005"+
		"-\u0000\u0000\u0148\u0149\u0005\u001e\u0000\u0000\u0149\u014a\u00038\u001c"+
		"\u0000\u014a\u014b\u00050\u0000\u0000\u014b7\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0005,\u0000\u0000\u014d\u014e\u0003:\u001d\u0000\u014e\u014f\u0005"+
		"-\u0000\u0000\u014f9\u0001\u0000\u0000\u0000\u0150\u0155\u0003<\u001e"+
		"\u0000\u0151\u0152\u00051\u0000\u0000\u0152\u0154\u0003<\u001e\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		";\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005.\u0000\u0000\u0159\u015a\u0003>\u001f\u0000\u015a\u015b\u0005/"+
		"\u0000\u0000\u015b=\u0001\u0000\u0000\u0000\u015c\u0161\u0003@ \u0000"+
		"\u015d\u015e\u00051\u0000\u0000\u015e\u0160\u0003@ \u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162?\u0001"+
		"\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0165\u0005"+
		";\u0000\u0000\u0165\u0166\u00052\u0000\u0000\u0166\u0167\u0003P(\u0000"+
		"\u0167A\u0001\u0000\u0000\u0000\u0168\u0169\u0005;\u0000\u0000\u0169\u016a"+
		"\u00052\u0000\u0000\u016a\u016d\u0003D\"\u0000\u016b\u016c\u0005\u001e"+
		"\u0000\u0000\u016c\u016e\u0003D\"\u0000\u016d\u016b\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u00050\u0000\u0000\u0170C\u0001\u0000\u0000\u0000\u0171"+
		"\u0176\u0003R)\u0000\u0172\u0173\u00054\u0000\u0000\u0173\u0175\u0003"+
		"R)\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000"+
		"\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177E\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0005;\u0000\u0000\u017a\u017c\u0005*\u0000\u0000\u017b\u017d"+
		"\u0003H$\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0005+\u0000"+
		"\u0000\u017f\u0181\u00052\u0000\u0000\u0180\u0182\u0003D\"\u0000\u0181"+
		"\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0187\u0005.\u0000\u0000\u0184\u0186"+
		"\u0003L&\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0005/\u0000\u0000\u018bG\u0001\u0000\u0000\u0000"+
		"\u018c\u0191\u0003J%\u0000\u018d\u018e\u00051\u0000\u0000\u018e\u0190"+
		"\u0003J%\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192I\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005;\u0000\u0000\u0195\u0196\u00052\u0000\u0000\u0196"+
		"\u0197\u0003R)\u0000\u0197K\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"\u0011\u0000\u0000\u0199\u019a\u00053\u0000\u0000\u019a\u019b\u0005;\u0000"+
		"\u0000\u019b\u019c\u0005\u001e\u0000\u0000\u019c\u019d\u0005;\u0000\u0000"+
		"\u019d\u01a9\u00050\u0000\u0000\u019e\u019f\u0005\u0011\u0000\u0000\u019f"+
		"\u01a0\u00053\u0000\u0000\u01a0\u01a1\u0005;\u0000\u0000\u01a1\u01a2\u0005"+
		"\u001e\u0000\u0000\u01a2\u01a3\u0003P(\u0000\u01a3\u01a4\u00050\u0000"+
		"\u0000\u01a4\u01a9\u0001\u0000\u0000\u0000\u01a5\u01a6\u0003P(\u0000\u01a6"+
		"\u01a7\u00050\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u0198"+
		"\u0001\u0000\u0000\u0000\u01a8\u019e\u0001\u0000\u0000\u0000\u01a8\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a9M\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005"+
		";\u0000\u0000\u01ab\u01af\u0005*\u0000\u0000\u01ac\u01ae\u0003P(\u0000"+
		"\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000"+
		"\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0005+\u0000\u0000\u01b3O\u0001\u0000\u0000\u0000\u01b4\u01b9"+
		"\u0005=\u0000\u0000\u01b5\u01b9\u0005<\u0000\u0000\u01b6\u01b9\u0005\u0016"+
		"\u0000\u0000\u01b7\u01b9\u0003N\'\u0000\u01b8\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9Q\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bd\u0005;\u0000\u0000\u01bb\u01bd\u0005\b\u0000\u0000\u01bc"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"S\u0001\u0000\u0000\u0000\u01be\u01bf\u0005;\u0000\u0000\u01bf\u01c0\u0005"+
		"2\u0000\u0000\u01c0\u01c1\u0005\b\u0000\u0000\u01c1U\u0001\u0000\u0000"+
		"\u0000*Y`ervz\u008b\u009b\u009e\u00a5\u00ab\u00bd\u00c5\u00c8\u00ce\u00d4"+
		"\u00da\u00e7\u00f8\u0104\u010a\u010d\u0110\u0115\u011c\u0122\u012e\u0130"+
		"\u0139\u0141\u0155\u0161\u016d\u0176\u017c\u0181\u0187\u0191\u01a8\u01af"+
		"\u01b8\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}