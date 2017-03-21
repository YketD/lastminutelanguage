grammar language;

statement: vardecl* FUNCDECL*;

ARGLIST: VALUE (','VALUE)*;
VARVALSTR: '"' ([a-z]|[A-Z]|[0-9])* '"';
VARVALNUM: MINUS? INT ;
VARVALCHAR: '\'' ([a-z]|[A-Z]|[0-9]) '\'';
VARVALARRAY: '<' ARGLIST? '>';
funcbody: vardecl | FUNCCALL | VARSTAT;
IDENTIFIER: [a-zA-Z]+;
VALUE: (VARVALSTR|VARVALNUM|VARVALCHAR|VARVALARRAY);

VARSTAT: IDENTIFIER ('+=' | '-=' | '*=' | '/=') VARVALNUM ENDL;
vardecl: IDENTIFIER EQUALS VALUE ENDL;
FUNCCALL: IDENTIFIER ('()' | '(' VALUE (','VALUE)* ')') ENDL;
funcdecl: FUNCHEAD funcbody* FUNCEND;
FUNCHEAD: IDENTIFIER ('()' | '(' IDENTIFIER (','IDENTIFIER)* ')') '{';
FUNCEND: '}';

MINUS: '-';
INT: [0-9]+;

ENDL: ';';

EQUALS: ':';
WS: [ \n\t\r]+ -> skip;
