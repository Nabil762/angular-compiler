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
IMPORTS : 'imports';
EXPORT: 'export';
COMPONENT: 'component';
FROM : 'from';
THIS:'this';
SELECTOR: 'selector';
STANDALONE: 'standalone';
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
AND: '&&';
EQUAL_EQUAL: '==';
NOT_EQUAL: '!=';
STYLES : 'styles' ->pushMode(CSS);
TEMPLATE: 'template' ->pushMode(TEMPLATE_MODE);

// Identifiers and Literals
IDENTIFIER: [*a-zA-Z_$][.a-zA-Z0-9_$]*;
NUMBER: [0-9]+;
STRING: '"' (~["\r\n])* '"' | '\'' (~["\r\n])* '\'' | '`' (~["\r\n])* '`' ;
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[ \r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
fragment ESC : '\\'[nt"];

mode CSS ;
BACKTICK2: '`';
COLON2 : ':';
COMMA2: ',';
// End of the template block
OPEN_SQUARE : '[';
CLOSE_SQUARE :']'->popMode;
DOT2: '.';
PX   : 'px';
EM   : 'em';
REM  : 'rem';
SEMICOLON2 : ';';
LBRACE2     : '{';
RBRACE2    : '}';
PERCENT : '%';
WS2         : [ \t\r\n]+ -> skip;
LINE_COMMENT2: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT2: '/*' .*? '*/' -> skip;
ID  : [0-9]+ (PX | EM | REM | PERCENT)?
    |'#'[a-zA-Z_][a-zA-Z0-9_]*
    | [a-zA-Z_-][a-zA-Z0-9_-]*;


mode TEMPLATE_MODE ;

BACKTICK:   '`';
LINE_COMMENT_HTML: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT_HTML: '/*' .*? '*/' -> skip;
TAG_OPEN   : '<' TAG_NAME;
OPEN_TAG_CLOSE   : '</' ;
TAG_CLOSE     : '>';
TAG_SELF_CLOSE           : '/>';
EQUALH  : '=';
STRING1            : '"' (~["\r\n])* '"';
DIRECTIVE_NAME   : '*' TAG_NAME;
BINDING_PROPERTY           : '[' TAG_NAME ']';
STANDARD_EVENT     : '(' TAG_NAME ')';
COLON1             : ':';
OPEN_TS : '{{';
CLOSE_TS  : '}}';
DOT1               : '.';
TAG_NAME: [a-zA-Z_][a-zA-Z0-9_!.-]*;
WS_HTML                : [ \t\r\n]+ -> skip;
BACKTICK1 : '`,' -> popMode;

