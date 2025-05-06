lexer grammar angularLexer;

IF: 'if';
ELSE: 'else';
FOR: 'for';
DO: 'do';
WHILE: 'while';
FUNCTION: 'function';
RETURN: 'return';
TYPE: 'number' | 'string' | 'boolean' | 'void' | 'any' | 'undefined' | 'null';
VARIABLE_TYPE : 'var' | 'let' | 'const';
ACCESS_TYPE : 'public' | 'private' | 'protected';
NEW : 'new';
IMPORT : 'import';
EXPORT: 'export';
COMPONENT: 'component';
FROM : 'from';
THIS:'this';
CLASS1: 'class' [ \t\r\n]*;
DASH: '-';
BOOLEAN: 'true' | 'false';
INTERFACE : 'interface';
EXTEND : 'extends';
IMPLEMENT : 'implement';
AD : '@';

// Operators and Symbols
PLUS: '+';
TIMES: '*';
DIVIDE: '/';
EQUAL: '=';
GREATER: '>';
GREATER_EQUAL: '>=';
FIRST_TAG: '<';
LESS_EQUAL: '<=';
INCREMENT: '++';
DECREMENT: '--';
PLUS_EQUAL : '+=';
MINUS_EQUAL : '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{' [ \t\r\n]*;
RBRACE: '}' [ \t\r\n]*;
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
DOT: '.';
OR: '|';
ARROW: '=>';
BACKTICK: '`<div' ->pushMode(TEMPLATE_MODE);


// Logical Operators
AND: '&&';
EQUAL_EQUAL: '==';
NOT_EQUAL: '!=';

// Identifiers and Literals
IDENTIFIER: [*a-zA-Z_$][.a-zA-Z0-9_$]*;
NUMBER: [0-9]+;
STRING: '"' (~["\r\n])* '"' | '\'' (~["\r\n])* '\'' | '`' (~["\r\n])* '`' ;
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[ \r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
fragment ESC : '\\'[nt"];

mode TEMPLATE_MODE;

SCRIPT                  : 'script';
SRC                     : 'src';
IMG                     : 'img';

DIRECTIVE_NAME          : '*ngIf' | '*ngFor';
TAGS                    : 'div' | 'ul' | 'li' | 'ng-container' | 'ng-template' | 'h1' | 'h2' | 'h3' | 'span';
STANDARD_ATTRIBUTE      : 'class' | 'key' | 'title' | 'style' | 'alt' | 'href';
STANDARD_EVENT          : 'click' | 'change' | 'submit' | 'keydown' | 'keyup' | 'input' | 'mouseleave' | 'focus';
OPEN_COMMENT            : '<!--';
CLOSE_COMMENT           : '-->';
SLASH                   : '/';
TAG_CLOSE               : '>';
SELF_CLOSING_TAG_CLOSE  : '/>';
CLOSING_TAG_CLOSE       : '</';
ATTRIBUTE_VALUE         : '"' (~["\r\n])* '"';
OPEN_TS                 : '{{';
CLOSE_TS                : '}}';
OPEN_PAREN              : '(';
CLOSE_PAREN             : ')';
OPEN_SQUARE_TAG         : '[';
CLOSE_SQUARE_TAG        : ']';
HASHTAG                 : '#';
ELSEH                   : 'else';
EQUALH                  : '=';
ANGULAR_EVENT           : 'ng' [A-Za-z]+;
STANDARD_PROP           : [a-zA-Z]+ ;
OPEN_TAG                : '<';
ATTRIBUTE_NAME: [a-zA-Z][a-zA-Z0-9-]*;
ID: [*a-zA-Z_$][.a-zA-Z0-9_$]*;
STRING_LITERAL: '"' (~["\\\r\n] | EscapeSequence)* '"'
              | '\'' (~['\\\r\n] | EscapeSequence)* '\'';
fragment EscapeSequence: '\\' [btnfr'"\\];
TEXT                    : [#*+a-zA-Z0-9\-!.,:]+ ;
WS: [ \t\r\n]+ -> skip;
BACKTICK1: 'div>`' -> popMode;