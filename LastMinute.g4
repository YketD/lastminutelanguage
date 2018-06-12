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
        funccall|
        funcdecl)*
    ;

    comment
    :       MULTCOMMENT
    |       COMMENT;

    varcalc
    :
        identifier (INCVAR|DECVAR) ENDL         #IncrementVariable
    |   vartrans                                #TransformVariable;

    // The variable declaration
    vardecl
    :       identifier MAKEEQUAL varvalue ENDL      #SetVariable;


    vartrans
    :       identifier (PLUS|MINUS|TIMES|DIVIDE|MODULO) MAKEEQUAL varvalue ENDL;

        //All possible variable value's
        varvalue
    :       varvalfloat
    |       varvalnum
    |       varvalchar
    |       varvalarray
    |       varvalbool
    |       identifier
    |       calculation
    |       varvalstring
    ;

            //Float
            varvalfloat
    :   MINUS? INT DOT INT
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
            funcbody*
            funcreturn
            CLOSEBRACES
            ;

    funcreturn
    :
     RETURN returnVar=varvalue ENDL
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
            vardecl condition ENDL varcalc
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
|     TEXT ARRAYINDEX
;



//Calculations
calcVal: (varvalfloat | varvalnum | identifier);

calculation:
    (OPENPAR calculation CLOSEPAR) calcMore*
    |
    calcVal calcMore+
;

calcMore: (PLUS | MINUS | TIMES | DIVIDE | MODULO | POWER) (calculation | calcVal);

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

DOT: '.';
ENDL:       ';';
MAKEEQUAL:  ':';

OPENPAR:        '(';
CLOSEPAR:       ')';
OPENBRACES:     '{';
CLOSEBRACES:    '}';
OPENBRACKET:    '[';
CLOSEBRACKET:   ']';

PLUS:       '+';
MINUS:      '-';
TIMES:      '*';
DIVIDE:        '/';
MODULO:     '%';
POWER:      '^';
STRING: QUOTE   ANYCHAR  QUOTE;
CHAR:   SQUOTE  [a-zA-Z]    SQUOTE;

TEXT:       [a-zA-Z0-9]+;
COMMENT: (COMMENT2|COMMENT3) ~('\r' | '\n')* ('\r' | '\n');
MULTCOMMENT: MULTCOMMENTOPEN ANYCHAR MULTCOMMENTCLOSE;
COMMENT2: '//';
COMMENT3: '##';
MULTCOMMENTOPEN: '/*';
MULTCOMMENTCLOSE: '*/';

ARRAYINDEX: OPENBRACKET INT CLOSEBRACKET;

INCVAR: '++';
DECVAR: '--';

fragment ANYCHAR: .*?;

WS: [ \n\t\r]+ -> skip;