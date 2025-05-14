parser grammar angularParser;

options {
  tokenVocab=angularLexer;
}

program: statement+ EOF;

statement: importStatement+ (interfaceDeclaration)* componentDeclaration classDeclaration ;

importStatement: IMPORT ( LBRACE IDENTIFIER (COMMA IDENTIFIER)* COMMA? RBRACE | TIMES) FROM  STRING SEMICOLON;

interfaceDeclaration : INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE;

interfaceBody: (propertyDeclaration SEMICOLON)*;

componentDeclaration: AD COMPONENT LPAREN LBRACE componentConfig RBRACE RPAREN;  //edited

componentConfig: (propertyAssignment (COMMA propertyAssignment)*)? ;     //edited

propertyAssignment: selector | standalone | styles | importDeclaration | template ;

importDeclaration : IMPORTS COLON LBRACKET IDENTIFIER? RBRACKET;

selector :SELECTOR COLON STRING ;

standalone : STANDALONE COLON BOOLEAN ;

template : TEMPLATE COLON1 BACKTICK  element* BACKTICK1;

element : tag | TAG_NAME (COLON1)? | interpolation;

tag: openingTag element* closingTag | selfClosingTag;

openingTag : TAG_OPEN attributes* TAG_CLOSE;

closingTag : OPEN_TAG_CLOSE TAG_NAME TAG_CLOSE;

selfClosingTag : TAG_OPEN attributes* TAG_SELF_CLOSE;

attributes : TAG_NAME EQUALH STRING1 | DIRECTIVE_NAME EQUALH STRING1 | BINDING_PROPERTY EQUALH STRING1
             | STANDARD_EVENT EQUALH STRING1;

interpolation : OPEN_TS TAG_NAME CLOSE_TS;

styles :STYLES COLON2 OPEN_SQUARE bodyOfCss CLOSE_SQUARE COMMA2? ;

bodyOfCss : BACKTICK2  objects  BACKTICK2 COMMA2?;

objects : elementCss? (COMMA2? elementCss)*;

elementCss : DOT2 ID+ LBRACE2 bodyOfelement+ RBRACE2;

bodyOfelement : ID COLON2 valueCss SEMICOLON2;

valueCss : (PERCENT | ID) (ID ID?)? ;

// KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK

classDeclaration: EXPORT CLASS1 IDENTIFIER LBRACE (listDeclaration)* RBRACE;

listDeclaration: listStatement | property_declaration | forDeclaration;

listStatement : IDENTIFIER COLON IDENTIFIER LBRACKET RBRACKET EQUAL arrayExpression SEMICOLON ;

arrayExpression : LBRACKET objectExpressionList RBRACKET ;

objectExpressionList : objectExpression (COMMA objectExpression)* ;

objectExpression : LBRACE propertyList RBRACE ;

propertyList : property (COMMA property)* ;

property : IDENTIFIER COLON valueExpression ;

valueExpression : STRING | NUMBER | BOOLEAN;

property_declaration: IDENTIFIER COLON type (EQUAL type)? SEMICOLON;

type: single_type (OR single_type)*;

forDeclaration: IDENTIFIER LPAREN IDENTIFIER COLON IDENTIFIER RPAREN COLON TYPE LBRACE bodyFor RBRACE;

bodyFor: THIS DOT IDENTIFIER EQUAL IDENTIFIER SEMICOLON;

single_type: IDENTIFIER | TYPE;

propertyDeclaration: IDENTIFIER COLON TYPE;
