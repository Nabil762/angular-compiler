// Generated from /home/nabil_al-hamza/IdeaProjects/angular-compiler/src/rules/angularParser.g4 by ANTLR 4.13.1
package rules;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class angularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, DO=4, WHILE=5, FUNCTION=6, RETURN=7, TYPE=8, VARIABLE_TYPE=9, 
		ACCESS_TYPE=10, NEW=11, IMPORT=12, EXPORT=13, COMPONENT=14, FROM=15, THIS=16, 
		CLASS1=17, DASH=18, BOOLEAN=19, INTERFACE=20, EXTEND=21, IMPLEMENT=22, 
		AD=23, PLUS=24, TIMES=25, DIVIDE=26, EQUAL=27, GREATER=28, GREATER_EQUAL=29, 
		FIRST_TAG=30, LESS_EQUAL=31, INCREMENT=32, DECREMENT=33, PLUS_EQUAL=34, 
		MINUS_EQUAL=35, MUL_ASSIGN=36, DIV_ASSIGN=37, MOD_ASSIGN=38, LPAREN=39, 
		RPAREN=40, LBRACKET=41, RBRACKET=42, LBRACE=43, RBRACE=44, SEMICOLON=45, 
		COMMA=46, COLON=47, DOT=48, OR=49, ARROW=50, BACKTICK=51, AND=52, EQUAL_EQUAL=53, 
		NOT_EQUAL=54, IDENTIFIER=55, NUMBER=56, STRING=57, WHITESPACE=58, COMMENT=59, 
		BLOCK_COMMENT=60, SCRIPT=61, SRC=62, IMG=63, DIRECTIVE_NAME=64, TAGS=65, 
		STANDARD_ATTRIBUTE=66, STANDARD_EVENT=67, OPEN_COMMENT=68, CLOSE_COMMENT=69, 
		SLASH=70, TAG_CLOSE=71, SELF_CLOSING_TAG_CLOSE=72, CLOSING_TAG_CLOSE=73, 
		ATTRIBUTE_VALUE=74, OPEN_TS=75, CLOSE_TS=76, OPEN_PAREN=77, CLOSE_PAREN=78, 
		OPEN_SQUARE_TAG=79, CLOSE_SQUARE_TAG=80, HASHTAG=81, ELSEH=82, EQUALH=83, 
		ANGULAR_EVENT=84, STANDARD_PROP=85, OPEN_TAG=86, ATTRIBUTE_NAME=87, ID=88, 
		STRING_LITERAL=89, TEXT=90, WS=91, BACKTICK1=92;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_interfaceDeclaration = 3, 
		RULE_interfaceBody = 4, RULE_componentDeclaration = 5, RULE_componentConfig = 6, 
		RULE_propertyAssignment = 7, RULE_propertyValue = 8, RULE_htmlElement = 9, 
		RULE_elements = 10, RULE_tagStatement = 11, RULE_imgTag = 12, RULE_comment = 13, 
		RULE_attribute = 14, RULE_attributeValue = 15, RULE_classDeclaration = 16, 
		RULE_listDeclaration = 17, RULE_listStatement = 18, RULE_arrayExpression = 19, 
		RULE_objectExpressionList = 20, RULE_objectExpression = 21, RULE_propertyList = 22, 
		RULE_property = 23, RULE_property_declaration = 24, RULE_type = 25, RULE_forDeclaration = 26, 
		RULE_bodyFor = 27, RULE_single_type = 28, RULE_arrayLiteral = 29, RULE_eventBinding = 30, 
		RULE_interpolation = 31, RULE_propertyBinding = 32, RULE_valueExpression = 33, 
		RULE_propertyDeclaration = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatement", "interfaceDeclaration", "interfaceBody", 
			"componentDeclaration", "componentConfig", "propertyAssignment", "propertyValue", 
			"htmlElement", "elements", "tagStatement", "imgTag", "comment", "attribute", 
			"attributeValue", "classDeclaration", "listDeclaration", "listStatement", 
			"arrayExpression", "objectExpressionList", "objectExpression", "propertyList", 
			"property", "property_declaration", "type", "forDeclaration", "bodyFor", 
			"single_type", "arrayLiteral", "eventBinding", "interpolation", "propertyBinding", 
			"valueExpression", "propertyDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", null, "'for'", "'do'", "'while'", "'function'", "'return'", 
			null, null, null, "'new'", "'import'", "'export'", "'component'", "'from'", 
			"'this'", null, "'-'", null, "'interface'", "'extends'", "'implement'", 
			"'@'", "'+'", "'*'", null, null, null, "'>='", null, "'<='", "'++'", 
			"'--'", "'+='", "'-='", "'*='", "'/='", "'%='", null, null, null, null, 
			null, null, "';'", "','", "':'", "'.'", "'|'", "'=>'", "'`<div'", "'&&'", 
			"'=='", "'!='", null, null, null, null, null, null, "'script'", "'src'", 
			"'img'", null, null, null, null, "'<!--'", "'-->'", null, null, "'/>'", 
			"'</'", null, "'{{'", "'}}'", null, null, null, null, "'#'", null, null, 
			null, null, null, null, null, null, null, null, "'div>`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "DO", "WHILE", "FUNCTION", "RETURN", "TYPE", 
			"VARIABLE_TYPE", "ACCESS_TYPE", "NEW", "IMPORT", "EXPORT", "COMPONENT", 
			"FROM", "THIS", "CLASS1", "DASH", "BOOLEAN", "INTERFACE", "EXTEND", "IMPLEMENT", 
			"AD", "PLUS", "TIMES", "DIVIDE", "EQUAL", "GREATER", "GREATER_EQUAL", 
			"FIRST_TAG", "LESS_EQUAL", "INCREMENT", "DECREMENT", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "LBRACE", "RBRACE", "SEMICOLON", "COMMA", "COLON", "DOT", 
			"OR", "ARROW", "BACKTICK", "AND", "EQUAL_EQUAL", "NOT_EQUAL", "IDENTIFIER", 
			"NUMBER", "STRING", "WHITESPACE", "COMMENT", "BLOCK_COMMENT", "SCRIPT", 
			"SRC", "IMG", "DIRECTIVE_NAME", "TAGS", "STANDARD_ATTRIBUTE", "STANDARD_EVENT", 
			"OPEN_COMMENT", "CLOSE_COMMENT", "SLASH", "TAG_CLOSE", "SELF_CLOSING_TAG_CLOSE", 
			"CLOSING_TAG_CLOSE", "ATTRIBUTE_VALUE", "OPEN_TS", "CLOSE_TS", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_SQUARE_TAG", "CLOSE_SQUARE_TAG", "HASHTAG", "ELSEH", 
			"EQUALH", "ANGULAR_EVENT", "STANDARD_PROP", "OPEN_TAG", "ATTRIBUTE_NAME", 
			"ID", "STRING_LITERAL", "TEXT", "WS", "BACKTICK1"
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(75);
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
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				importStatement();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERFACE) {
				{
				{
				setState(82);
				interfaceDeclaration();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			componentDeclaration();
			setState(89);
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
			setState(91);
			match(IMPORT);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(92);
				match(LBRACE);
				setState(93);
				match(IDENTIFIER);
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						match(COMMA);
						setState(95);
						match(IDENTIFIER);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(101);
					match(COMMA);
					}
				}

				setState(104);
				match(RBRACE);
				}
				break;
			case TIMES:
				{
				setState(105);
				match(TIMES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			match(FROM);
			setState(109);
			match(STRING);
			setState(110);
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
			setState(112);
			match(INTERFACE);
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(LBRACE);
			setState(115);
			interfaceBody();
			setState(116);
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
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(118);
				propertyDeclaration();
				setState(119);
				match(SEMICOLON);
				}
				}
				setState(125);
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
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
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
			setState(126);
			match(AD);
			setState(127);
			match(COMPONENT);
			setState(128);
			match(LPAREN);
			setState(129);
			componentConfig();
			setState(130);
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
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
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
			setState(132);
			match(LBRACE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(133);
				propertyAssignment();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(134);
					match(COMMA);
					setState(135);
					propertyAssignment();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
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
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(angularParser.COLON, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(COLON);
			setState(147);
			propertyValue();
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
	public static class PropertyValueContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propertyValue);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				valueExpression();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				arrayLiteral();
				}
				break;
			case BACKTICK:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				htmlElement();
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
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode BACKTICK() { return getToken(angularParser.BACKTICK, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(angularParser.TAG_CLOSE, 0); }
		public TerminalNode CLOSING_TAG_CLOSE() { return getToken(angularParser.CLOSING_TAG_CLOSE, 0); }
		public TerminalNode BACKTICK1() { return getToken(angularParser.BACKTICK1, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(BACKTICK);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 40965L) != 0)) {
				{
				{
				setState(155);
				attribute();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(TAG_CLOSE);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 2359425L) != 0)) {
				{
				{
				setState(162);
				elements();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(CLOSING_TAG_CLOSE);
			setState(169);
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
	public static class ElementsContext extends ParserRuleContext {
		public TagStatementContext tagStatement() {
			return getRuleContext(TagStatementContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public ImgTagContext imgTag() {
			return getRuleContext(ImgTagContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(angularParser.STRING_LITERAL, 0); }
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elements);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				tagStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				comment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				interpolation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				imgTag();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(STRING_LITERAL);
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
	public static class TagStatementContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(angularParser.OPEN_TAG, 0); }
		public List<TerminalNode> TAGS() { return getTokens(angularParser.TAGS); }
		public TerminalNode TAGS(int i) {
			return getToken(angularParser.TAGS, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(angularParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(angularParser.TAG_CLOSE, i);
		}
		public TerminalNode CLOSING_TAG_CLOSE() { return getToken(angularParser.CLOSING_TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public TagStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterTagStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitTagStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitTagStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagStatementContext tagStatement() throws RecognitionException {
		TagStatementContext _localctx = new TagStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tagStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OPEN_TAG);
			setState(179);
			match(TAGS);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 40965L) != 0)) {
				{
				{
				setState(180);
				attribute();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(TAG_CLOSE);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 2359425L) != 0)) {
				{
				{
				setState(187);
				elements();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(CLOSING_TAG_CLOSE);
			setState(194);
			match(TAGS);
			setState(195);
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
	public static class ImgTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(angularParser.OPEN_TAG, 0); }
		public TerminalNode IMG() { return getToken(angularParser.IMG, 0); }
		public TerminalNode SELF_CLOSING_TAG_CLOSE() { return getToken(angularParser.SELF_CLOSING_TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ImgTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterImgTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitImgTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitImgTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgTagContext imgTag() throws RecognitionException {
		ImgTagContext _localctx = new ImgTagContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imgTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(OPEN_TAG);
			setState(198);
			match(IMG);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 40965L) != 0)) {
				{
				{
				setState(199);
				attribute();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(SELF_CLOSING_TAG_CLOSE);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OPEN_COMMENT() { return getToken(angularParser.OPEN_COMMENT, 0); }
		public TerminalNode CLOSE_COMMENT() { return getToken(angularParser.CLOSE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(OPEN_COMMENT);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(208);
					matchWildcard();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(214);
			match(CLOSE_COMMENT);
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
	public static class AttributeContext extends ParserRuleContext {
		public PropertyBindingContext propertyBinding() {
			return getRuleContext(PropertyBindingContext.class,0);
		}
		public TerminalNode EQUALH() { return getToken(angularParser.EQUALH, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public TerminalNode DIRECTIVE_NAME() { return getToken(angularParser.DIRECTIVE_NAME, 0); }
		public TerminalNode STANDARD_ATTRIBUTE() { return getToken(angularParser.STANDARD_ATTRIBUTE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attribute);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE_TAG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(216);
				propertyBinding();
				setState(217);
				match(EQUALH);
				setState(218);
				attributeValue();
				}
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(220);
				eventBinding();
				setState(221);
				match(EQUALH);
				setState(222);
				attributeValue();
				}
				}
				break;
			case DIRECTIVE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(224);
				match(DIRECTIVE_NAME);
				setState(225);
				match(EQUALH);
				setState(226);
				attributeValue();
				}
				}
				break;
			case STANDARD_ATTRIBUTE:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(227);
				match(STANDARD_ATTRIBUTE);
				setState(228);
				match(EQUALH);
				setState(229);
				attributeValue();
				}
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
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(angularParser.STRING_LITERAL, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributeValue);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_TS:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
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
		enterRule(_localctx, 32, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(EXPORT);
			setState(237);
			match(CLASS1);
			setState(238);
			match(IDENTIFIER);
			setState(239);
			match(LBRACE);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(240);
				listDeclaration();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
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
		public ListStatementContext listStatement() {
			return getRuleContext(ListStatementContext.class,0);
		}
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listDeclaration);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				listStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				property_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				forDeclaration();
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
		enterRule(_localctx, 36, RULE_listStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IDENTIFIER);
			setState(254);
			match(COLON);
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(LBRACKET);
			setState(257);
			match(RBRACKET);
			setState(258);
			match(EQUAL);
			setState(259);
			arrayExpression();
			setState(260);
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
		enterRule(_localctx, 38, RULE_arrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LBRACKET);
			setState(263);
			objectExpressionList();
			setState(264);
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
		enterRule(_localctx, 40, RULE_objectExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			objectExpression();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				objectExpression();
				}
				}
				setState(273);
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
		enterRule(_localctx, 42, RULE_objectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(LBRACE);
			setState(275);
			propertyList();
			setState(276);
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
		enterRule(_localctx, 44, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			property();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(280);
				property();
				}
				}
				setState(285);
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
		enterRule(_localctx, 46, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(IDENTIFIER);
			setState(287);
			match(COLON);
			setState(288);
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
		enterRule(_localctx, 48, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(COLON);
			setState(292);
			type();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(293);
				match(EQUAL);
				setState(294);
				type();
				}
			}

			setState(297);
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
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			single_type();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(300);
				match(OR);
				setState(301);
				single_type();
				}
				}
				setState(306);
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
	public static class ForDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(angularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(angularParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(angularParser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(angularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(angularParser.COLON, i);
		}
		public TerminalNode RPAREN() { return getToken(angularParser.RPAREN, 0); }
		public TerminalNode TYPE() { return getToken(angularParser.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(angularParser.LBRACE, 0); }
		public BodyForContext bodyFor() {
			return getRuleContext(BodyForContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(angularParser.RBRACE, 0); }
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IDENTIFIER);
			setState(308);
			match(LPAREN);
			setState(309);
			match(IDENTIFIER);
			setState(310);
			match(COLON);
			setState(311);
			match(IDENTIFIER);
			setState(312);
			match(RPAREN);
			setState(313);
			match(COLON);
			setState(314);
			match(TYPE);
			setState(315);
			match(LBRACE);
			setState(316);
			bodyFor();
			setState(317);
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
	public static class BodyForContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(angularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(angularParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(angularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(angularParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(angularParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(angularParser.SEMICOLON, 0); }
		public BodyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterBodyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitBodyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitBodyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyForContext bodyFor() throws RecognitionException {
		BodyForContext _localctx = new BodyForContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bodyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(THIS);
			setState(320);
			match(DOT);
			setState(321);
			match(IDENTIFIER);
			setState(322);
			match(EQUAL);
			setState(323);
			match(IDENTIFIER);
			setState(324);
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
	public static class Single_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(angularParser.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(angularParser.TYPE, 0); }
		public Single_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterSingle_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitSingle_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitSingle_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_typeContext single_type() throws RecognitionException {
		Single_typeContext _localctx = new Single_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_single_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==IDENTIFIER) ) {
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(angularParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(angularParser.RBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(angularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(angularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(angularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(angularParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LBRACKET);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(329);
				match(IDENTIFIER);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(330);
					match(COMMA);
					setState(331);
					match(IDENTIFIER);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339);
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
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(angularParser.OPEN_PAREN, 0); }
		public TerminalNode STANDARD_EVENT() { return getToken(angularParser.STANDARD_EVENT, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(angularParser.CLOSE_PAREN, 0); }
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(OPEN_PAREN);
			setState(342);
			match(STANDARD_EVENT);
			setState(343);
			match(CLOSE_PAREN);
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
		public TerminalNode STRING_LITERAL() { return getToken(angularParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 62, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(OPEN_TS);
			setState(346);
			match(STRING_LITERAL);
			setState(347);
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
	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_TAG() { return getToken(angularParser.OPEN_SQUARE_TAG, 0); }
		public TerminalNode SRC() { return getToken(angularParser.SRC, 0); }
		public TerminalNode CLOSE_SQUARE_TAG() { return getToken(angularParser.CLOSE_SQUARE_TAG, 0); }
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_propertyBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPEN_SQUARE_TAG);
			setState(350);
			match(SRC);
			setState(351);
			match(CLOSE_SQUARE_TAG);
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
		public TerminalNode STRING() { return getToken(angularParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(angularParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(angularParser.BOOLEAN, 0); }
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof angularParserListener ) ((angularParserListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof angularParserVisitor ) return ((angularParserVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_valueExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 216172782114308096L) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(IDENTIFIER);
			setState(356);
			match(COLON);
			setState(357);
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
		"\u0004\u0001\\\u0168\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0004\u0000H\b\u0000\u000b\u0000\f\u0000I\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001O\b\u0001\u000b\u0001\f\u0001P\u0001\u0001\u0005"+
		"\u0001T\b\u0001\n\u0001\f\u0001W\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002a\b\u0002\n\u0002\f\u0002d\t\u0002\u0001\u0002\u0003\u0002g\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"z\b\u0004\n\u0004\f\u0004}\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006\u008c\t\u0006\u0003"+
		"\u0006\u008e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0099\b\b\u0001\t\u0001"+
		"\t\u0005\t\u009d\b\t\n\t\f\t\u00a0\t\t\u0001\t\u0001\t\u0005\t\u00a4\b"+
		"\t\n\t\f\t\u00a7\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00b1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00b6\b\u000b\n\u000b\f\u000b\u00b9\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00bd\b\u000b\n\u000b\f\u000b\u00c0\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c9\b"+
		"\f\n\f\f\f\u00cc\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00d2\b\r"+
		"\n\r\f\r\u00d5\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00e7\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00eb\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00f2"+
		"\b\u0010\n\u0010\f\u0010\u00f5\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00fc\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u010e\b\u0014\n\u0014\f\u0014\u0111"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u011a\b\u0016\n\u0016\f\u0016\u011d\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0128\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u012f\b\u0019"+
		"\n\u0019\f\u0019\u0132\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u014d\b\u001d\n"+
		"\u001d\f\u001d\u0150\t\u001d\u0003\u001d\u0152\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\u00d3\u0000#\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BD\u0000\u0002\u0002\u0000\b\b77\u0002\u0000\u0013\u0013"+
		"89\u0166\u0000G\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000"+
		"\u0004[\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\b{\u0001"+
		"\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000"+
		"\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u0098\u0001\u0000\u0000"+
		"\u0000\u0012\u009a\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000\u0000"+
		"\u0000\u0016\u00b2\u0001\u0000\u0000\u0000\u0018\u00c5\u0001\u0000\u0000"+
		"\u0000\u001a\u00cf\u0001\u0000\u0000\u0000\u001c\u00e6\u0001\u0000\u0000"+
		"\u0000\u001e\u00ea\u0001\u0000\u0000\u0000 \u00ec\u0001\u0000\u0000\u0000"+
		"\"\u00fb\u0001\u0000\u0000\u0000$\u00fd\u0001\u0000\u0000\u0000&\u0106"+
		"\u0001\u0000\u0000\u0000(\u010a\u0001\u0000\u0000\u0000*\u0112\u0001\u0000"+
		"\u0000\u0000,\u0116\u0001\u0000\u0000\u0000.\u011e\u0001\u0000\u0000\u0000"+
		"0\u0122\u0001\u0000\u0000\u00002\u012b\u0001\u0000\u0000\u00004\u0133"+
		"\u0001\u0000\u0000\u00006\u013f\u0001\u0000\u0000\u00008\u0146\u0001\u0000"+
		"\u0000\u0000:\u0148\u0001\u0000\u0000\u0000<\u0155\u0001\u0000\u0000\u0000"+
		">\u0159\u0001\u0000\u0000\u0000@\u015d\u0001\u0000\u0000\u0000B\u0161"+
		"\u0001\u0000\u0000\u0000D\u0163\u0001\u0000\u0000\u0000FH\u0003\u0002"+
		"\u0001\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0000\u0000\u0001L\u0001\u0001\u0000\u0000\u0000MO\u0003\u0004"+
		"\u0002\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QU\u0001\u0000\u0000\u0000"+
		"RT\u0003\u0006\u0003\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0003\n\u0005\u0000YZ\u0003 "+
		"\u0010\u0000Z\u0003\u0001\u0000\u0000\u0000[j\u0005\f\u0000\u0000\\]\u0005"+
		"+\u0000\u0000]b\u00057\u0000\u0000^_\u0005.\u0000\u0000_a\u00057\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000eg\u0005.\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0005,\u0000\u0000ik\u0005"+
		"\u0019\u0000\u0000j\\\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0005\u000f\u0000\u0000mn\u00059\u0000\u0000"+
		"no\u0005-\u0000\u0000o\u0005\u0001\u0000\u0000\u0000pq\u0005\u0014\u0000"+
		"\u0000qr\u00057\u0000\u0000rs\u0005+\u0000\u0000st\u0003\b\u0004\u0000"+
		"tu\u0005,\u0000\u0000u\u0007\u0001\u0000\u0000\u0000vw\u0003D\"\u0000"+
		"wx\u0005-\u0000\u0000xz\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\t\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u0017\u0000\u0000\u007f\u0080\u0005\u000e\u0000\u0000\u0080\u0081\u0005"+
		"\'\u0000\u0000\u0081\u0082\u0003\f\u0006\u0000\u0082\u0083\u0005(\u0000"+
		"\u0000\u0083\u000b\u0001\u0000\u0000\u0000\u0084\u008d\u0005+\u0000\u0000"+
		"\u0085\u008a\u0003\u000e\u0007\u0000\u0086\u0087\u0005.\u0000\u0000\u0087"+
		"\u0089\u0003\u000e\u0007\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005,\u0000\u0000\u0090\r\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u00057\u0000\u0000\u0092\u0093\u0005/\u0000\u0000\u0093\u0094\u0003\u0010"+
		"\b\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u0099\u0003B!\u0000"+
		"\u0096\u0099\u0003:\u001d\u0000\u0097\u0099\u0003\u0012\t\u0000\u0098"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0011\u0001\u0000\u0000\u0000\u009a"+
		"\u009e\u00053\u0000\u0000\u009b\u009d\u0003\u001c\u000e\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a5"+
		"\u0005G\u0000\u0000\u00a2\u00a4\u0003\u0014\n\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"I\u0000\u0000\u00a9\u00aa\u0005\\\u0000\u0000\u00aa\u0013\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b1\u0003\u0016\u000b\u0000\u00ac\u00b1\u0003\u001a"+
		"\r\u0000\u00ad\u00b1\u0003>\u001f\u0000\u00ae\u00b1\u0003\u0018\f\u0000"+
		"\u00af\u00b1\u0005Y\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u0015\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005V\u0000\u0000\u00b3\u00b7"+
		"\u0005A\u0000\u0000\u00b4\u00b6\u0003\u001c\u000e\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00be\u0005"+
		"G\u0000\u0000\u00bb\u00bd\u0003\u0014\n\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005I\u0000"+
		"\u0000\u00c2\u00c3\u0005A\u0000\u0000\u00c3\u00c4\u0005G\u0000\u0000\u00c4"+
		"\u0017\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005V\u0000\u0000\u00c6\u00ca"+
		"\u0005?\u0000\u0000\u00c7\u00c9\u0003\u001c\u000e\u0000\u00c8\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"H\u0000\u0000\u00ce\u0019\u0001\u0000\u0000\u0000\u00cf\u00d3\u0005D\u0000"+
		"\u0000\u00d0\u00d2\t\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005E\u0000\u0000\u00d7"+
		"\u001b\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003@ \u0000\u00d9\u00da\u0005"+
		"S\u0000\u0000\u00da\u00db\u0003\u001e\u000f\u0000\u00db\u00e7\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0003<\u001e\u0000\u00dd\u00de\u0005S\u0000\u0000"+
		"\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005@\u0000\u0000\u00e1\u00e2\u0005S\u0000\u0000\u00e2\u00e7"+
		"\u0003\u001e\u000f\u0000\u00e3\u00e4\u0005B\u0000\u0000\u00e4\u00e5\u0005"+
		"S\u0000\u0000\u00e5\u00e7\u0003\u001e\u000f\u0000\u00e6\u00d8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00dc\u0001\u0000\u0000\u0000\u00e6\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e7\u001d\u0001\u0000"+
		"\u0000\u0000\u00e8\u00eb\u0005Y\u0000\u0000\u00e9\u00eb\u0003>\u001f\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u001f\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\r\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0011\u0000\u0000\u00ee\u00ef\u00057\u0000\u0000\u00ef\u00f3"+
		"\u0005+\u0000\u0000\u00f0\u00f2\u0003\"\u0011\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		",\u0000\u0000\u00f7!\u0001\u0000\u0000\u0000\u00f8\u00fc\u0003$\u0012"+
		"\u0000\u00f9\u00fc\u00030\u0018\u0000\u00fa\u00fc\u00034\u001a\u0000\u00fb"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc#\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u00057\u0000\u0000\u00fe\u00ff\u0005/\u0000\u0000\u00ff\u0100\u00057"+
		"\u0000\u0000\u0100\u0101\u0005)\u0000\u0000\u0101\u0102\u0005*\u0000\u0000"+
		"\u0102\u0103\u0005\u001b\u0000\u0000\u0103\u0104\u0003&\u0013\u0000\u0104"+
		"\u0105\u0005-\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		")\u0000\u0000\u0107\u0108\u0003(\u0014\u0000\u0108\u0109\u0005*\u0000"+
		"\u0000\u0109\'\u0001\u0000\u0000\u0000\u010a\u010f\u0003*\u0015\u0000"+
		"\u010b\u010c\u0005.\u0000\u0000\u010c\u010e\u0003*\u0015\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110)\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005"+
		"+\u0000\u0000\u0113\u0114\u0003,\u0016\u0000\u0114\u0115\u0005,\u0000"+
		"\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u011b\u0003.\u0017\u0000\u0117"+
		"\u0118\u0005.\u0000\u0000\u0118\u011a\u0003.\u0017\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c-\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u00057\u0000"+
		"\u0000\u011f\u0120\u0005/\u0000\u0000\u0120\u0121\u0003B!\u0000\u0121"+
		"/\u0001\u0000\u0000\u0000\u0122\u0123\u00057\u0000\u0000\u0123\u0124\u0005"+
		"/\u0000\u0000\u0124\u0127\u00032\u0019\u0000\u0125\u0126\u0005\u001b\u0000"+
		"\u0000\u0126\u0128\u00032\u0019\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005-\u0000\u0000\u012a1\u0001\u0000\u0000\u0000\u012b\u0130"+
		"\u00038\u001c\u0000\u012c\u012d\u00051\u0000\u0000\u012d\u012f\u00038"+
		"\u001c\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u01313\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u00057\u0000\u0000\u0134\u0135\u0005\'\u0000\u0000"+
		"\u0135\u0136\u00057\u0000\u0000\u0136\u0137\u0005/\u0000\u0000\u0137\u0138"+
		"\u00057\u0000\u0000\u0138\u0139\u0005(\u0000\u0000\u0139\u013a\u0005/"+
		"\u0000\u0000\u013a\u013b\u0005\b\u0000\u0000\u013b\u013c\u0005+\u0000"+
		"\u0000\u013c\u013d\u00036\u001b\u0000\u013d\u013e\u0005,\u0000\u0000\u013e"+
		"5\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0010\u0000\u0000\u0140\u0141"+
		"\u00050\u0000\u0000\u0141\u0142\u00057\u0000\u0000\u0142\u0143\u0005\u001b"+
		"\u0000\u0000\u0143\u0144\u00057\u0000\u0000\u0144\u0145\u0005-\u0000\u0000"+
		"\u01457\u0001\u0000\u0000\u0000\u0146\u0147\u0007\u0000\u0000\u0000\u0147"+
		"9\u0001\u0000\u0000\u0000\u0148\u0151\u0005)\u0000\u0000\u0149\u014e\u0005"+
		"7\u0000\u0000\u014a\u014b\u0005.\u0000\u0000\u014b\u014d\u00057\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0151\u0149\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0005*\u0000\u0000"+
		"\u0154;\u0001\u0000\u0000\u0000\u0155\u0156\u0005M\u0000\u0000\u0156\u0157"+
		"\u0005C\u0000\u0000\u0157\u0158\u0005N\u0000\u0000\u0158=\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0005K\u0000\u0000\u015a\u015b\u0005Y\u0000\u0000"+
		"\u015b\u015c\u0005L\u0000\u0000\u015c?\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0005O\u0000\u0000\u015e\u015f\u0005>\u0000\u0000\u015f\u0160\u0005P"+
		"\u0000\u0000\u0160A\u0001\u0000\u0000\u0000\u0161\u0162\u0007\u0001\u0000"+
		"\u0000\u0162C\u0001\u0000\u0000\u0000\u0163\u0164\u00057\u0000\u0000\u0164"+
		"\u0165\u0005/\u0000\u0000\u0165\u0166\u0005\b\u0000\u0000\u0166E\u0001"+
		"\u0000\u0000\u0000\u001bIPUbfj{\u008a\u008d\u0098\u009e\u00a5\u00b0\u00b7"+
		"\u00be\u00ca\u00d3\u00e6\u00ea\u00f3\u00fb\u010f\u011b\u0127\u0130\u014e"+
		"\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}