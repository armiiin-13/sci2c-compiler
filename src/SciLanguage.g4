grammar SciLanguage;

// ------------ GRAMMAR RULES ------------
prg : 'PROGRAM' IDENT ';' dcllist cabecera sentlist 'END' ;

dcllist : dcl dcllist | ;
cabecera : 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist : decproc decsubprog | decfun decsubprog;
decsubprog : decproc decsubprog | decfun decsubprog | ;
sentlist : sent sentlist2 ;
sentlist2 : sent sentlist2 | ;

dcl : tipo dcl2 ;
dcl2 : defcte | defvar ;
defcte : ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' ;
ctelist : ',' IDENT '=' simpvalue ctelist | ;
simpvalue : NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST ;
defvar : '::' varlist ';' ;
tipo : 'INTEGER' | 'REAL' | 'CHARACTER' charlength ;
charlength : '(' NUM_INT_CONST ')' | ;
varlist : IDENT init varlist2 ;
varlist2 : ',' IDENT init varlist2 | ;
init : '=' simpvalue | ;

decproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT;
formal_paramlist : '(' nomparamlist_init ')' | ;
nomparamlist_init : IDENT nomparamlist;
nomparamlist : ',' nomparamlist_init | ;
dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' dec_s_paramlist | ;
tipoparam : 'IN' | 'OUT' | 'INOUT';
decfun : 'FUNCTION' IDENT '(' nomparamlist_init ')' tipo '::' IDENT ';' dec_fd_paramlist 'END' 'FUNCTION' IDENT;
dec_fd_paramlist : tipo ',' 'INTENT' '(' dec_paramlist;
dec_paramlist : 'IN' ')' IDENT ';' dec_fd_paramlist | tipoparam ')' IDENT ';'; //LL(2)

sent : IDENT '=' exp ';' | proc_call ';' ;
exp : factor exp2 ;
exp2 : op factor exp2 | ;
op : oparit ;
oparit : '+' |'-' | '*' | '/' ;
factor : simpvalue | '(' exp ')' | IDENT factor2 ;
factor2 : '(' exp explist ')' | ;
explist : ',' exp explist | ;
proc_call : 'CALL' IDENT subpparamlist ;
subpparamlist : '(' exp explist ')' | ;

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