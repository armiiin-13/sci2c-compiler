grammar SciLanguage;

prg : 'PROGRAM' IDENT ';' dcllist cabecera sentlist 'END' ;

// ------------ KEYWORDS TOKENS ------------

dcllist : dcl dcllist | ;
cabecera : ;
cablist : ;
decsubprog : ;
sentlist : ;

dcl : tipo dcl2 ;
dcl2 : defcte | defvar ;
defcte : ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;
ctelist : ',' IDENT '=' simpvalue ctelist | ;
simpvalue : NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST ;
defvar : '::' varlist ';' ;
tipo : 'INTEGER' | 'REAL' | 'CHARACTER' charlength ;
charlength : '(' NUM_INIT_CONST ')' | ;
varlist : IDENT init varlist2 ;
varlist2 : ',' IDENT init varlist2 | ;
init : '=' simpvalue | ;

decproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT ;
formal_paramlist : '(' nomparamlist ')' | ;
nomparamlist : IDENT nomparamlist2 ;
nomparamlist2 : ',' IDENT nomparamlist2 | ;
dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' dec_s_paramlist | ;
tipoparam : 'IN' | 'OUT' | 'INOUT' ;
decfun : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist 'END' 'FUNCTION' IDENT ;
dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' dec_f_paramlist | ;

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