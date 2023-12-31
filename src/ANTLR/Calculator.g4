grammar Calculator;

start : expr EOF;

expr : expr ('*'|'/') expr
     | expr ('+'|'-') expr
     | INT
     | '(' expr ')'
     ;

INT : [0-9]+;

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
