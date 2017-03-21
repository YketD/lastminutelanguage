grammar methodcall;

method: NAME bracket ((ARGUMENT comma)* ARGUMENT)? bracketclose semicolon;

NAME:
    [a-zA-Z]+;

bracket:
    '(';

ARGUMENT:
('-')? [0-9]+;

comma:',';

bracketclose:
')';

semicolon:
';';