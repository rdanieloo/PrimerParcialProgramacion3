grammar Ejemplos;

// Regla inicial
program : statement+ ;

statement
    : assignment SEMI
    | declaration SEMI
    | ifStatement
    ;

// 1. Asignaciones tipo a = b + c;
assignment
    : ID ASSIGN expr
    ;

// 2. Declaración de arreglo
declaration
    : 'string' ID LBRACK INT RBRACK ASSIGN LBRACE STRING RBRACE
    ;

// 3. If simple
ifStatement
    : 'if' LPAREN expr RPAREN
    ;

// Expresiones matemáticas
expr
    : expr op=(MULT|DIV) expr
    | expr op=(PLUS|MINUS) expr
    | LPAREN expr RPAREN
    | INT
    | FLOAT
    | ID
    ;

// TOKENS
STRING : '"' .*? '"' ;
ID     : [a-zA-Z_][a-zA-Z0-9_]* ;
INT    : [0-9]+ ;
FLOAT  : [0-9]+'.'[0-9]+ ;
WS     : [ \t\r\n]+ -> skip ;

// Operadores
PLUS   : '+' ;
MINUS  : '-' ;
MULT   : '*' ;
DIV    : '/' ;

// Asignación
ASSIGN : '=' ;

// Paréntesis y llaves
LPAREN : '(' ;
RPAREN : ')' ;

LBRACK : '[' ;
RBRACK : ']' ;

LBRACE : '{' ;
RBRACE : '}' ;

// PUNTO Y COMA
SEMI   : ';' ;