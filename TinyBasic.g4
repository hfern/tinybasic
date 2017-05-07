grammar TinyBasic;

program: line*;

line:
        number statement CR
    |   statement CR
    |   CR;

statement:
        PRINT exprlist COMMA?
    |   IF expression (RELOP | '=') expression THEN statement
    |   GOTO expression
    |   INPUT varlist
    |   LET VAR '=' expression
    |   GOSUB expression
    |   RETURN
    |   CLEAR
    |   LIST
    |   RUN
    |   END;

PRINT: 'PRINT';
IF: 'IF';
THEN: 'THEN';
GOTO: 'GOTO';
INPUT: 'INPUT';
LET: 'LET';
GOSUB: 'GOSUB';
RETURN: 'RETURN';
CLEAR: 'CLEAR';
LIST: 'LIST';
RUN: 'RUN';
END: 'END';

exprlist: (STRING|expression) (COMMA (STRING|expression) )*;

varlist: VAR (COMMA VAR)*;

expression: (ADD|SUB|) term ((ADD | SUB) term)*;

term: factor ((MUL|DIV) factor)*;

factor: VAR | number | LPAREN expression RPAREN;

VAR: [A-Z]+;

number: DIGIT DIGIT*;

DIGIT: [0-9];
CR: [\r?\n]+;

fragment ESCAPED_QUOTE : '\\"';
STRING: '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';

EQUALS : '=' ;
COMMA : ',' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
LPAREN : '(' ;
RPAREN : ')' ;

RELOP: '<>' | '><' | '<=' | '>=' | '<' | '>' | EQUALS ;

// Handle whitespace, annoying!
WS : (' ' | '\t')+ -> channel(HIDDEN);
COMMENT: '//' ~('\r' | '\n')* -> channel(HIDDEN);
