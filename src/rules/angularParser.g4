parser grammar angularParser;

options {
  tokenVocab=angularLexer;
}

program: statement+ EOF ;

// ANGULAR
statement: importStatement+ (interfaceDeclaration)* componentDeclaration classDeclaration ;

importStatement: IMPORT ( LBRACE IDENTIFIER (COMMA IDENTIFIER)* COMMA? RBRACE | TIMES) FROM  STRING SEMICOLON;

interfaceDeclaration : INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE;

interfaceBody: (propertyDeclaration SEMICOLON)*;

componentDeclaration: AD COMPONENT LPAREN LBRACE componentConfig RBRACE RPAREN;  //edited

componentConfig: (propertyAssignment (COMMA propertyAssignment)*)? ;     //edited

propertyAssignment:
    selector          # SelectorProperty
  | standalone       # StandaloneProperty
  | styles           # StylesProperty
  | importDeclaration # ImportProperty
  | template         # TemplateProperty
  ;
importDeclaration : IMPORTS COLON LBRACKET IDENTIFIER? RBRACKET;

selector :SELECTOR COLON STRING ;

standalone : STANDALONE COLON BOOLEAN ;

// HTML MODE
template : TEMPLATE COLON1 BACKTICK  element* BACKTICK1;

element :
    tag                        # TagElement
  | TAG_NAME (COLON1)?         # TagNameElement
  | interpolation              # InterpolationElement
  ;



tag:
    openingTag element* closingTag   # StandardTag
  | selfClosingTag                   # SelfClosingTagElement
  ;

openingTag : TAG_OPEN attributes* TAG_CLOSE;

closingTag : OPEN_TAG_CLOSE TAG_NAME TAG_CLOSE;

selfClosingTag : TAG_OPEN attributes* TAG_SELF_CLOSE;

attributes:
    TAG_NAME EQUALH STRING1         # HtmlAttribute
  | DIRECTIVE_NAME EQUALH STRING1   # DirectiveAttribute
  | BINDING_PROPERTY EQUALH STRING1 # BindingAttribute
  | STANDARD_EVENT EQUALH STRING1   # EventAttribute
  ;

interpolation : OPEN_TS TAG_NAME CLOSE_TS;

// CSS MODE
styles :STYLES COLON2 OPEN_SQUARE bodyOfCss CLOSE_SQUARE COMMA2? ;

bodyOfCss : BACKTICK2  objects  BACKTICK2 COMMA2?;

objects : elementCss? (COMMA2? elementCss)*;

elementCss : DOT2 ID+ LBRACE2 bodyOfelement+ RBRACE2;

bodyOfelement : ID COLON2 valueCss SEMICOLON2;

valueCss : (PERCENT | ID) (ID ID?)? ;

// ANGULAR CODE COMPLETION
classDeclaration: EXPORT CLASS1 IDENTIFIER LBRACE (listDeclaration)* RBRACE;

listDeclaration:
    listStatement        # ListStatement_Declaration
  | property_declaration # DeclarationProperty
  | functionDeclaration  # Function_Declaration
  ;

listStatement : IDENTIFIER COLON IDENTIFIER LBRACKET RBRACKET EQUAL arrayExpression SEMICOLON ;

arrayExpression : LBRACKET objectExpressionList RBRACKET ;

objectExpressionList : objectExpression (COMMA objectExpression)* ;

objectExpression : LBRACE propertyList RBRACE ;

propertyList : property (COMMA property)* ;

property : IDENTIFIER COLON valueExpression ;

property_declaration: IDENTIFIER COLON type (EQUAL type)? SEMICOLON;

type: single_type (OR single_type)*;


functionDeclaration: IDENTIFIER LPAREN parameters? RPAREN COLON type? LBRACE (functionBody)* RBRACE;
parameters: parameter (COMMA parameter)*;
parameter: IDENTIFIER COLON single_type;


functionBody:
    THIS DOT IDENTIFIER EQUAL IDENTIFIER SEMICOLON           # SimpleAssignment
  | THIS DOT IDENTIFIER EQUAL valueExpression SEMICOLON     # ComplexAssignment
  | valueExpression SEMICOLON                               # ExpressionStatement
  ;
functionCall: IDENTIFIER LPAREN valueExpression* RPAREN;

valueExpression:
    STRING      # StringValue
  | NUMBER      # NumericValue
  | BOOLEAN     # BooleanValue
  | functionCall # FunctionCallValue
  ;

single_type:
    IDENTIFIER  # IdentifierType
  | TYPE        # ConcreteType
  ;
propertyDeclaration: IDENTIFIER COLON TYPE;

