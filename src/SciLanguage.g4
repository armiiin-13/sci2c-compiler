grammar SciLanguage;

axiom : (IDENT | NUM_INT_CONST | NUM_REAL_CONST | COMMENTARY)* EOF;

// ------------ KEYWORDS TOKENS ------------


// ------------ GENERAL TOKENS ------------
IDENT : LETTER (LETTER | DIGIT | '_')*;
NUM_INT_CONST : SIGN DIGIT+;
NUM_REAL_CONST : SIGN DIGIT+ '.' DIGIT+
               | SIGN DIGIT+ ('e' | 'E') SIGN DIGIT+
               | SIGN DIGIT+ '.' DIGIT+ ('e' | 'E') SIGN DIGIT+
               ;
STRING_CONST : '\'' STRING_SIMPLE '\''
             | '"' STRING_DOUBLE '"'
             ;
COMMENTARY : '!' TEXT (EOL | EOF);

// ------------ FRAGMENTS ------------
fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
fragment SIGN : '-'?;
fragment STRING_SIMPLE : (~[\n\r] | '\'\'')*;
fragment STRING_DOUBLE : (~[\n\r] | '"''"')*;
fragment TEXT : ~[\r\n]+;
fragment EOL : '\r'? '\n';