grammar Calculator;

formula:    BRACKETOPEN calculation BRACKETCLOSE |
            BRACKETOPEN NUM+        BRACKETCLOSE |
            BRACKETOPEN formula     BRACKETCLOSE |
            calculation |
            calculation formula;

calculation: NUM+ (operator NUM+)+;
operator: MIN | PLUS | TIMES | DIVIDE;


NUM: MIN? [0-9];

MIN:    '-';
PLUS:   '+';
TIMES:  '*';
DIVIDE: '/';
BRACKETOPEN:    '(';
BRACKETCLOSE:   ')';
