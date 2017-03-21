grammar telnr;

        //2x nr '-' 8x nr
telnr:  NUM NUM dash NUM NUM NUM NUM NUM NUM NUM NUM  |
        //'+' 11x nr
        plus NUM NUM NUM NUM NUM NUM NUM NUM NUM NUM NUM ;

plus: '+';

NUM: [0-9];

dash: '-';

WS: [ \t\r\n]+ -> skip;