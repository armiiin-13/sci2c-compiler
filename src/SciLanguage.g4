grammar SciLanguage;

// imports
@header {
    import entitiy.*;
    import util.Tuple;
}

// ------------ GRAMMAR RULES ------------
prg returns [Program p]: 'PROGRAM' IDENT ';' {
            $p = new Program($IDENT.text);
       }
       dcllist[$p.getConstants(), $p.getParameters()] {$p.printProgram();} cabecera sentlist 'END' 'PROGRAM' IDENT /*subproglist*/;

dcllist[List<Constant> constants, List<Tuple<String, List<Parameter>>> variables] : dcl[$constants, $variables] dcllist[$constants, $variables] | ;
cabecera : 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist : decproc decsubprog | decfun decsubprog;
decsubprog : decproc decsubprog | decfun decsubprog | ;
sentlist : sent sentlist2 ;
sentlist2 : sent sentlist2 | ;

dcl[List<Constant> constants, List<Tuple<String, List<Parameter>>> variables] : tipo dcl2[$constants, $variables, $tipo.type];

dcl2[List<Constant> constants, List<Tuple<String, List<Parameter>>> variables, String type] : defcte[$constants] | defvar[$variables, $type] ;

defcte[List<Constant> constants] : ',' 'PARAMETER' '::' IDENT '=' simpvalue {
                            Constant newConstant = new Constant($simpvalue.value, $IDENT.text);
                            $constants.add(newConstant);
                         }
                         ctelist[$constants] ';' ;
ctelist[List<Constant> constants] : ',' IDENT '=' simpvalue{
                            Constant newConstant = new Constant($simpvalue.value, $IDENT.text);
                            $constants.add(newConstant);
                         } ctelist[$constants] | ;
simpvalue returns [String value] : NUM_INT_CONST {$value = $NUM_INT_CONST.text;}
                                 | NUM_REAL_CONST {$value = $NUM_REAL_CONST.text;}
                                 | STRING_CONST {$value = $STRING_CONST.text;}
                                 | NUM_INT_CONST_B {$value = $NUM_INT_CONST_B.text;}
                                 | NUM_INT_CONST_O {$value = $NUM_INT_CONST_O.text;}
                                 | NUM_INT_CONST_H {$value = $NUM_INT_CONST_H.text;};

defvar[List<Tuple<String, List<Parameter>>> variables, String type] : '::' varlist[$variables, $type] ';' ;

tipo returns [String type]: 'INTEGER' {$type = "int";}| 'REAL' {$type = "float";}| 'CHARACTER' charlength {$type = "char" + $charlength.length;};
charlength returns [String length]: '(' NUM_INT_CONST ')' {$length = "["+ $NUM_INT_CONST.text +"]";} | {$length = "[]";};

varlist[List<Tuple<String, List<Parameter>>> variables, String type] : IDENT init[$type, $IDENT.text] {
    List<Parameter> parametros = new ArrayList<>();
    parametros.add($init.newParam);
} varlist2[$variables, $type, parametros] ;

varlist2[List<Tuple<String, List<Parameter>>> variables, String type, List<Parameter> parametros] : ',' IDENT init[$type, $IDENT.text]
    {$parametros.add($init.newParam);} varlist2[$variables, $type, $parametros]
    | {variables.add(new Tuple<>(type,parametros));};    //Final de varlist, añadimos tupla<tipo, lista<parametros>>

init[String type, String name] returns [Parameter newParam]: '=' simpvalue { $newParam = new Parameter(type, name, $simpvalue.value); }
    | { $newParam = new Parameter(type, name); };

decproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT;
formal_paramlist : '(' nomparamlist_init ')' | ;
nomparamlist_init : IDENT nomparamlist;
nomparamlist : ',' nomparamlist_init | ;
dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' dec_s_paramlist | ;
tipoparam : 'IN' | 'OUT' | 'INOUT';
decfun : 'FUNCTION' IDENT '(' nomparamlist_init ')' tipo '::' IDENT ';' dec_f_paramlist 'END' 'FUNCTION' IDENT;
dec_f_paramlist : tipo ',' 'INTENT' '(' dec_paramlist;
dec_paramlist : 'IN' ')' IDENT ';' dec_f_paramlist | tipoparam ')' IDENT ';'; //LL(2)

sent : IDENT '=' exp ';' | proc_call ';'
    | 'IF' '(' expcond ')' if_then | 'DO' do_body | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT';
exp : factor exp2 ;
exp2 : op factor exp2 | ;
op : oparit ;
oparit : '+' |'-' | '*' | '/' ;
factor : simpvalue | '(' exp ')' | IDENT factor2 ;
factor2 : '(' exp explist ')' | ;
explist : ',' exp explist | ;
proc_call : 'CALL' IDENT subpparamlist ;
subpparamlist : '(' exp explist ')' | ;

//subproglist : codproc subproglist | codfun subproglist | ;
// codproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sentlist 'END' 'SUBROUTINE' IDENT ;
// codfun : 'FUNCTION' IDENT '(' nomparamlist_init ')' tipo '::' IDENT ';' dec_f_paramlist dcllist sentlist IDENT '=' exp ';' 'END' 'FUNCTION' IDENT ;

// ------------ GRAMMAR RULES: VOLUNTARY PART ------------

expcond : factorcond expcond2 ;
expcond2 : oplog factorcond expcond2 | ;
oplog : '.OR.' | '.AND.' | '.EQV.' | '.NEQV.' ;
factorcond : exp opcomp exp | '(' expcond ')' | '.NOT.' factorcond | '.TRUE.' | '.FALSE.' ; //LL(2)
opcomp : '<' | '>' | '<=' | '>=' | '==' | '/=' ;

if_then : sent | 'THEN' sentlist then_else;
then_else : 'ENDIF' | 'ELSE' sentlist 'ENDIF';
do_body : 'WHILE' '(' expcond ')' sentlist 'ENDDO' | IDENT '=' doval ',' doval ',' doval sentlist 'ENDDO';
doval : NUM_INT_CONST | IDENT;

casos : 'CASE' casos2 | ;
casos2 : '(' etiquetas ')' sentlist casos | 'DEFAULT' sentlist;
etiquetas :  simpvalue etiquetas2 | ':' simpvalue;
etiquetas2 : listaetiqetas | ':' etiquetas3;
etiquetas3 : simpvalue | ;
listaetiqetas : ',' simpvalue listaetiqetas | ;

// ------------ KEYWORDS TOKENS ------------

// ------------ GENERAL TOKENS ------------
IDENT : LETTER IDENT_2 ;
NUM_INT_CONST : SIGN DIGIT DIGIT_2;
NUM_REAL_CONST : SIGN DIGIT DIGIT_2 '.' DIGIT DIGIT_2
               | SIGN DIGIT DIGIT_2 ('e' | 'E') SIGN DIGIT DIGIT_2
               | SIGN DIGIT DIGIT_2 '.' DIGIT DIGIT_2 ('e' | 'E') SIGN DIGIT DIGIT_2
               ;
STRING_CONST : '\'' STRING_SIMPLE '\''
             | '"' STRING_DOUBLE '"'
             ;
COMMENTARY : '!' TEXT (EOL | EOF) -> skip;

TABS : (EOL | '\t' | ' ') -> skip;

NUM_INT_CONST_B : 'b`' SINTAX_B DIGIT_B '`';
NUM_INT_CONST_O : 'o`' SINTAX_O DIGIT_O '`';
NUM_INT_CONST_H : 'z`' SINTAX_H DIGIT_H '`';

// ------------ FRAGMENTS ------------
fragment IDENT_2 : (LETTER | DIGIT | '_') IDENT_2 | ;
fragment DIGIT_2: DIGIT DIGIT_2 | ;
fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
fragment SIGN : '-' | ;
fragment STRING_SIMPLE : (~[\n\r] | '\'\'') STRING_SIMPLE | ;
fragment STRING_DOUBLE : (~[\n\r] | '"''"') STRING_DOUBLE | ;
fragment TEXT : ~[\r\n] TEXT | ;
//fragment TEXT_LAMBDA : ~[\r\n] | ;
fragment EOL : '\r' '\n' | '\n';

fragment SINTAX_B : [0-1];
fragment SINTAX_O : [0-7];
fragment SINTAX_H : [A-F0-9];
fragment DIGIT_B : SINTAX_B DIGIT_B | ;
fragment DIGIT_O : SINTAX_O DIGIT_O | ;
fragment DIGIT_H : SINTAX_H DIGIT_H | ;