parser grammar angularParser;

options {
  tokenVocab=angularLexer;
}

program: statement+ EOF;

statement: importStatement+ (interfaceDeclaration)* componentDeclaration classDeclaration ;

importStatement: IMPORT ( LBRACE IDENTIFIER (COMMA IDENTIFIER)* COMMA? RBRACE | TIMES) FROM  STRING SEMICOLON;

interfaceDeclaration : INTERFACE IDENTIFIER LBRACE interfaceBody RBRACE;

interfaceBody: (propertyDeclaration SEMICOLON)*;

componentDeclaration: AD COMPONENT LPAREN componentConfig RPAREN;

componentConfig: LBRACE (propertyAssignment (COMMA propertyAssignment)*)? RBRACE;

propertyAssignment: IDENTIFIER COLON propertyValue;

propertyValue: valueExpression | arrayLiteral |  htmlElement ;

htmlElement:   BACKTICK  (attribute)* TAG_CLOSE (elements)* CLOSING_TAG_CLOSE  BACKTICK1;

elements: tagStatement | comment | interpolation | imgTag | STRING_LITERAL;

tagStatement: OPEN_TAG TAGS (attribute)* TAG_CLOSE (elements)* CLOSING_TAG_CLOSE TAGS TAG_CLOSE;

imgTag: OPEN_TAG IMG (attribute)* SELF_CLOSING_TAG_CLOSE;

comment: OPEN_COMMENT .*? CLOSE_COMMENT;

attribute:  (propertyBinding EQUALH attributeValue)
           | (eventBinding EQUALH attributeValue)
           | (DIRECTIVE_NAME EQUALH attributeValue)
           | (STANDARD_ATTRIBUTE EQUALH attributeValue);

attributeValue: STRING_LITERAL | interpolation  ;

classDeclaration: EXPORT CLASS1 IDENTIFIER LBRACE (listDeclaration)* RBRACE;

listDeclaration: listStatement | property_declaration | forDeclaration;

listStatement : IDENTIFIER COLON IDENTIFIER LBRACKET RBRACKET EQUAL arrayExpression SEMICOLON ;

arrayExpression : LBRACKET objectExpressionList RBRACKET ;

objectExpressionList : objectExpression (COMMA objectExpression)* ;

objectExpression : LBRACE propertyList RBRACE ;

propertyList : property (COMMA property)* ;

property : IDENTIFIER COLON valueExpression ;

property_declaration: IDENTIFIER COLON type (EQUAL type)? SEMICOLON;

type: single_type (OR single_type)*;

forDeclaration: IDENTIFIER LPAREN IDENTIFIER COLON IDENTIFIER RPAREN COLON TYPE LBRACE bodyFor RBRACE;

bodyFor: THIS DOT IDENTIFIER EQUAL IDENTIFIER SEMICOLON;

single_type: IDENTIFIER | TYPE;

arrayLiteral: LBRACKET (IDENTIFIER (COMMA IDENTIFIER)*)? RBRACKET;

eventBinding: OPEN_PAREN STANDARD_EVENT CLOSE_PAREN ;

interpolation: OPEN_TS STRING_LITERAL CLOSE_TS;

propertyBinding: OPEN_SQUARE_TAG SRC CLOSE_SQUARE_TAG ;

valueExpression : STRING | NUMBER | BOOLEAN;

propertyDeclaration: IDENTIFIER COLON TYPE;
