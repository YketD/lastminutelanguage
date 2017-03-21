grammar LastMinute;

statement: vardecl* funcdecl*;

vardecl:    identifier ((PLUS | MINUS | MODULO | DIVIDE | TIMES)? MAKEEQUAL)
           (varvalue | calculation | identifier | bool) ENDL;

funcdecl:   identifier OPENPAR params CLOSEPAR OPENBRACES funcbody (RETURN (identifier| varvalue) ENDL)? CLOSEBRACES;

funcbody: (vardecl | funccall | loop | lm_if | (calculation ENDL))*;
identifier:     TEXT;

loop: forloop | whileloop;

lm_if:      IF OPENPAR condition CLOSEPAR OPENBRACES funcbody CLOSEBRACES
    (ELSE IF OPENPAR condition CLOSEPAR OPENBRACES funcbody CLOSEBRACES)*
    (ELSE OPENBRACES funcbody CLOSEBRACES)?
;
whileloop:WHILE OPENPAR condition CLOSEPAR OPENBRACES funcbody CLOSEBRACES;

forloop: FOR OPENPAR vardecl condition ENDL calculation CLOSEPAR OPENBRACES funcbody CLOSEBRACES;

calculation:    (varvalnum | identifier) ((multiplication | divide | addition | subtraction | increment | decrement)* |
       (OPENPAR (varvalnum | identifier)  (multiplication | divide | addition | subtraction | increment | decrement)* CLOSEPAR)*);
condition:(
((NOT? (identifier | bool)) | lm_boolean)
((AND lm_boolean) | (OR lm_boolean))*);

lm_boolean: (NOT?(varvalnum | identifier) calculation* operator (varvalnum | identifier)) | NOT? bool | NOT? identifier;
operator : LT|GT|EQUALS|NOTEQUAL|GTE|LTE;
funccall: identifier OPENPAR extendedparams CLOSEPAR ENDL;
//calculations
addition: PLUS (varvalnum | identifier);
subtraction: MINUS (varvalnum | identifier);
multiplication: TIMES (varvalnum | identifier);
divide: DIVIDE (varvalnum | identifier);
increment: PLUS PLUS;
decrement: MINUS MINUS;

varvalue:       varvalnum | varvalstring | varvalchar | varvalarray ;
arrayval:       varvalnum | varvalstring | varvalchar;
varvalnum:      MINUS? INT;
varvalstring:   STRING;
varvalchar:     CHAR;
varvalarray:    LT ((arrayval (COMMA arrayval)*)+) GT;

params:         (identifier (COMMA identifier)*)?;
bool: TRUE | FALSE;
extendedparams:
            ((identifier | calculation | varvalnum | funccall)
      (COMMA (identifier | calculation | varvalnum | funccall))*)?;

STRING: QUOTE   [ a-zA-Z]+  QUOTE;
CHAR:   SQUOTE  [a-zA-Z]    SQUOTE;

//bool
EQUALS:     '==';
NOTEQUAL:   '!=';
GT:         '>';
LT:         '<';
GTE:        '>=';
LTE:        '<=';

AND: '&&';
OR: '||';
NOT: '!';



RETURN: 'return' ;
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
TEXT:       [a-zA-Z]+;
INT:        [0-9]+;

TRUE: 'true' | '1';
FALSE: 'false' | '0';
COMMA:      ',';
QUOTE:      '"';
SQUOTE:     '\'';


ENDL:       ';';
MAKEEQUAL:  ':';

OPENPAR:        '(';
CLOSEPAR:       ')';
OPENBRACES:     '{';
CLOSEBRACES:    '}';

PLUS:       '+';
MINUS:      '-';
TIMES:      '*';
DIVIDE:     '/';
MODULO:     '%';
POWER:      '^';


WS: [ \n\t\r]+ -> skip;
