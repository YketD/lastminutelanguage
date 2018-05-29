grammar LastMinute;

/*
PARSER RULES
*/

// First all the global variables, then all the functions
statement
    :
        (comment|
        varcalc|
        vardecl|
        funcdecl)*
    ;

    comment
    :       MULTCOMMENT
    |       COMMENT;

    varcalc
    :
        identifier (INCVAR|DECVAR) ENDL;

    // The variable declaration
    vardecl
    :       identifier MAKEEQUAL varvalue ENDL   #SetVariable;
    |       identifier INCREMENT ENDL
    |       vartrans;

    vartrans
    :       identifier (PLUS|MINUS|TIMES|DIVIDE|MODULO) MAKEEQUAL varvalue ENDL;

        //All possible variable value's
        varvalue
    :       varvalnum
    |       varvalstring
    |       varvalchar
    |       varvalarray
    |       varvalbool
    |       identifier
    |       calculation
    ;

            //Integer
            varvalnum
    :   MINUS? INT
    ;

            //String
            varvalstring
    :   STRING
    ;

            //Character
            varvalchar
    :   CHAR
    ;

            //Array
            varvalarray
    :   LT
        (varvalue (COMMA varvalue)*)+
        GT
    ;

            //Boolean
            varvalbool
    :   LITERALBOOL
    ;

                LITERALBOOL
        :   'true'
        |   'false'
        ;

//Function Declarations
funcdecl
:           identifier
            OPENPAR params CLOSEPAR
            OPENBRACES
            funcbody* RETURN varvalue ENDL
            CLOSEBRACES
            ;

    //parameters, zero or one to start, when one, the next all need to have comma's in front
    params
    :   (
        identifier
        (COMMA identifier)*
        )?
    ;

    extendedparams
    :   (
        varvalue
        (COMMA varvalue)*
        )?
    ;

    funcbody
    :   vardecl
    |   varcalc
    |   funccall
    |   loop
    |   if_else
    |   calculation
    |   comment
    ;

        body
        :
        OPENBRACES funcbody* CLOSEBRACES
        ;

        conditionalbody
        :
            OPENPAR condition CLOSEPAR
            body
        ;

        condition
        :   NOT condition                           #InverseCondition
        |   varvalue EQUALS varvalue                #CompareCondition
        |   varvalue NOTEQUAL varvalue            #NotEqualCondition
        |   condition AND condition                 #AndCondition
        |   condition OR condition                  #OrCondition
        |   varvalbool                              #BoolCondition
        |   varvalue operator varvalue            #OperatorCondition
        ;

        operator
        :   LT
        |   GT
        |   EQUALS
        |   NOTEQUAL
        |   GTE
        |   LTE
        ;

        if_else
        :   IF
            conditionalbody
            ((ELSE if_else)*
             (ELSE body)?)
        ;

        loop
        :   forloop
        |   whileloop
        ;

        whileloop
        :   WHILE
            conditionalbody
        ;

        forloop
        :   FOR
            OPENPAR
            vardecl condition ENDL calculation
            CLOSEPAR
            body
        ;

    funccall
    :   identifier
        OPENPAR extendedparams CLOSEPAR
        ENDL
    ;

identifier
:     TEXT
;

//Calculations
calculation
    :   addition
    |   multiplication
    |   power

    ;

    addition
    :   value  ((PLUS | MINUS)  (value | calculation))+
    ;

    multiplication
    :   value  ((TIMES | DIVIDE) (value | calculation))+
    ;

    power
    :   value  ((MODULO | POWER) (value | calculation))+
    ;

    value
    :   INT
    |   identifier
    |   OPENPAR addition CLOSEPAR
    ;


/*
LEXER RULES
*/

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
DIVIDE:        '/';
MODULO:     '%';
POWER:      '^';
STRING: QUOTE   ANYCHAR  QUOTE;
CHAR:   SQUOTE  [a-zA-Z]    SQUOTE;

TEXT:       [a-zA-Z]+;
COMMENT: (COMMENT2|COMMENT3) ~('\r' | '\n')* ('\r' | '\n');
MULTCOMMENT: MULTCOMMENTOPEN ANYCHAR MULTCOMMENTCLOSE;
COMMENT2: '//';
COMMENT3: '##';
MULTCOMMENTOPEN: '/*';
MULTCOMMENTCLOSE: '*/';

INCVAR: '++';
DECVAR: '--';

ANYCHAR: .*?;

WS: [ \n\t\r]+ -> skip;