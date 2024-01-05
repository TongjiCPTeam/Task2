grammar PL0;

// Parser rules

start : program EOF ;

program : programHeader subprogram ;

programHeader : PROGRAM identifier ;

subprogram : constDeclaration? varDeclaration? statementPart ;

constDeclaration : CONST constDefinition (COMMA constDefinition)* SEMI;

constDefinition : identifier ASSIGN unsignedInteger ;

unsignedInteger : DIGIT (COMMA? DIGIT)* ;

varDeclaration : VAR identifier (COMMA identifier)* SEMI;

statementPart : statement | compoundStatement ;

compoundStatement : BEGIN statement (SEMI statement)* END ;

statement : assignmentStatement
          | conditionalStatement
          | loopStatement
          | compoundStatement
          | emptyStatement
          ;

assignmentStatement : identifier ASSIGN expression ;

expression : ADD_OPERATOR? term | expression ADD_OPERATOR term ;

term : factor | term MUL_OPERATOR factor ;

factor : identifier | constant | LPAREN expression RPAREN ;

conditionalStatement : IF condition THEN statement ;

loopStatement : WHILE condition DO statement ;

condition : expression relOperator expression ;

relOperator : EQ | NEQ | LT | LTE | GT | GTE ;

// Lexer rules

PROGRAM : WS* 'PROGRAM' WS ;
BEGIN : 'BEGIN' ;
END : 'END' ;
CONST : 'CONST' ;
VAR : 'VAR' ;
WHILE : 'WHILE' ;
DO : 'DO' ;
IF : 'IF' ;
THEN : 'THEN' ;

identifier : WS* LETTER (LETTER | DIGIT)* WS* ;

constant : DIGIT+ ;

LETTER : [a-zA-Z] ;

DIGIT : [0-9] ;

ADD_OPERATOR : '+' | '-' ;

MUL_OPERATOR : '*' | '/' ;

ASSIGN : ':=' ;

EQ : '=' ;

NEQ : '<>' ;

GT : '>' ;

GTE : '>=' ;

LT : '<' ;

LTE : '<=' ;

LPAREN : '(' ;
RPAREN : ')' ;
SEMI : ';' ;
COMMA : ',' ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

emptyStatement : /* empty */ ;
