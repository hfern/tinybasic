grammar TinyBasic;

line: 
        number statement CR
    |   statement CR;

statement:
        PRINT exprlist
    |   IF expression RELOP expression THEN statement
    |   GOTO expression
    |   INPUT varlist
    |   LET VAR '=' expression
    |   GOSUB expression
    |   RETURN
    |   CLEAR
    |   LIST
    |   RUN
    |   END;


exprlist: (STRING|expression) (',' (STRING|expression) )*;

varlist: VAR (',' VAR)*;

expression: ('+'|'-'|) term (('+'|'-') term)*;

term: factor (('*'|'/') factor)*;

factor: VAR | number | '(' expression ')';

VAR: [A-Z]+;

number: DIGIT DIGIT*;

DIGIT: [0-9];
CR: [\r?\n]+;
STRING: '"' [^"]* '"';
RELOP: '<' ('>'|'='|) | '>' ('<'|'='|) | '=';
