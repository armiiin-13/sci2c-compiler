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
       dcllist[$p.getConstants(), $p.getMain().getLocalVariables()] cabecera[$p.getFunctions()] sentlist[null]{
            $p.getMain().setBlock($sentlist.body);
       } 'END' 'PROGRAM' IDENT subproglist[$p] {$p.exportProgram();};

dcllist[List<Constant> constants, List<Tuple<String, List<Parameter>>> variables] : dcl[$constants, $variables] dcllist[$constants, $variables] | ;
cabecera[List<Function> functions] : 'INTERFACE' cablist[$functions] 'END' 'INTERFACE' | ;
cablist[List<Function> functions] : decproc {$functions.add($decproc.function);} decsubprog[$functions]
                                  | decfun {$functions.add($decfun.function);} decsubprog[$functions];
decsubprog[List<Function> functions] : decproc {$functions.add($decproc.function);} decsubprog[$functions]
                                     | decfun {$functions.add($decfun.function);} decsubprog[$functions] | ;
sentlist[String funcName] returns [Body body]: sent[$funcName] sentlist2[$funcName] {
    $body = new Body();
    $body.addSentence($sent.s);

    if ($sentlist2.body != null) {
        for (Sentence sen : $sentlist2.body.getSentences()){
            $body.addSentence(sen);
        }
    }
};

sentlist2[String funcName] returns [Body body]: sent[$funcName] sentlist2[$funcName] {
        $body = new Body();
        $body.addSentence($sent.s);

        if ($sentlist2.body != null){
            for (Sentence sen : $sentlist2.body.getSentences()){
                $body.addSentence(sen);
            }
        }
    }
    | {
        $body = new Body();
    };

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
                                 | STRING_CONST {
                                    String s = $STRING_CONST.text;

                                    if (s.startsWith("'")) {
                                        s = s.substring(1, s.length()-1);
                                        s = s.replace("''", "'");
                                        s = s.replace("\"", "\\\"");
                                        s = "\"" + s + "\"";
                                    } else {
                                        s = s.replace("\"\"", "\"");
                                    }

                                    $value = s;
                                 }
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

decproc returns [Function function]: 'SUBROUTINE' IDENT {
        $function = new Function(new Header("void", $IDENT.text), new Body());
    } formal_paramlist[$function.getHeader()] dec_s_paramlist[$function.getHeader()] 'END' 'SUBROUTINE' IDENT;
formal_paramlist[Header header] : '(' nomparamlist_init[$header] ')' | ;
nomparamlist_init[Header header] : IDENT {$header.addParam($IDENT.text);} nomparamlist[$header];
nomparamlist[Header header] : ',' nomparamlist_init[$header] | ;
dec_s_paramlist[Header header] : tipo ',' 'INTENT' '(' tipoparam ')' IDENT {
        Parameter param = $header.getParam($IDENT.text);
        param.setType($tipo.type);
        param.setPointer($tipoparam.value);
    }';' dec_s_paramlist[$header] | ;
tipoparam returns [boolean value] : 'IN' {$value = false;}| 'OUT' {$value = true;}| 'INOUT'{$value = true;};

decfun returns [Function function]: 'FUNCTION' IDENT {
        $function = new Function(new Header($IDENT.text), new Body());
    }'(' nomparamlist_init[$function.getHeader()] ')' tipo '::' IDENT {
        $function.getHeader().setType($tipo.type);
    }';' dec_f_paramlist[$function.getHeader()] 'END' 'FUNCTION' IDENT;
dec_f_paramlist[Header header] : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' {
        Parameter param = $header.getParam($IDENT.text);
        param.setType($tipo.type);
        param.setPointer($tipoparam.value);
    } dec_f_paramlist[$header]
    | ;

sent[String funcName] returns [Sentence s] :
    IDENT '=' exp ';' {
        if ($funcName != null && $IDENT.text.equals($funcName)) {
            $s = new Sentence(null, "return " + $exp.code + ";");
        } else {
            $s = new Sentence(null, $IDENT.text + " = " + $exp.code + ";");
        }

    } | proc_call ';' {
        $s = new Sentence(null, $proc_call.code + ";");
    } ;//| 'IF' '(' expcond ')' if_then | 'DO' do_body | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT';
exp  returns [String code] : factor exp2 {
    $code = $factor.code + $exp2.code;
};

exp2 returns [String code] : op factor exp2 {
    $code = " " + $op.text + " " + $factor.code + $exp2.code;
} | {
    $code = "";
};

op : oparit ;
oparit : '+' |'-' | '*' | '/' ;
factor returns [String code] : simpvalue {
    $code = $simpvalue.value;
} | '(' exp ')' {
    $code = "(" + $exp.code + ")";
} | IDENT factor2 {
    $code = $IDENT.text + $factor2.code;
};
factor2 returns [String code]
    : '(' exp explist ')' {
        $code = "(" + $exp.code + $explist.code + ")";
    }
    | {
        $code = "";
    };
explist returns [String code] : ',' exp explist {
    $code = ", " + $exp.code + $explist.code;
} | {
    $code = "";
};
proc_call returns [String code] : 'CALL' IDENT subpparamlist {
    $code = $IDENT.text + $subpparamlist.code;
};
subpparamlist returns [String code]: '(' exp explist ')' {
    $code = "(" + $exp.code + $explist.code + ")";
} | {
    $code = "()";
};

subproglist[Program p] : codproc {$p.addFunction($codproc.func);} subproglist[$p] | codfun {$p.addFunction($codfun.func);} subproglist[$p] | ;

codproc returns [Function func] : 'SUBROUTINE' beginId=IDENT {
    $func = new Function(new Header("void", $beginId.text), new Body());
    } formal_paramlist[$func.getHeader()] dec_s_paramlist[$func.getHeader()] dcllist[new ArrayList<Constant>(), $func.getLocalVariables()] sentlist[null] {$func.setBlock($sentlist.body);}
    'END' 'SUBROUTINE' endId=IDENT {
        if(!$beginId.text.equals($endId.text)){
            System.err.println("ERROR: nombres distintos");
        }
    };

codfun returns [Function func]  : 'FUNCTION' beginId=IDENT {
    $func = new Function(new Header(null, $beginId.text), new Body());
    }'(' nomparamlist_init[$func.getHeader()] ')' tipo '::' IDENT
    {
        $func.getHeader().setType($tipo.type);
    }
    ';' dec_f_paramlist[$func.getHeader()] dcllist[new ArrayList<Constant>(), $func.getLocalVariables()] sentlist[$beginId.text] {
        $func.setBlock($sentlist.body);
    } IDENT '=' exp {$func.getBlock().addSentence(new Sentence(null, "return " + $exp.code + ";"));} ';' 'END' 'FUNCTION' endId=IDENT {
        if(!$beginId.text.equals($endId.text)){
            System.err.println("ERROR: nombres distintos");
        }
    };

// ------------ GRAMMAR RULES: VOLUNTARY PART ------------
/*
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
*/

// ------------ KEYWORDS TOKENS ------------

// ------------ GENERAL TOKENS ------------
IDENT : LETTER IDENT_2 ;
NUM_INT_CONST : SIGN DIGIT DIGIT_2;
NUM_REAL_CONST : SIGN DIGIT DIGIT_2 '.' DIGIT DIGIT_2
               | SIGN DIGIT DIGIT_2 ('e' | 'E') SIGN DIGIT DIGIT_2
               | SIGN DIGIT DIGIT_2 '.' DIGIT DIGIT_2 ('e' | 'E') SIGN DIGIT DIGIT_2
               ;

STRING_CONST
 : '\'' ( '\'\'' | ~['\r\n] )* '\''
 | '"'  ( '""'   | ~["\r\n] )* '"'
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
//fragment STRING_SIMPLE : (~[\n\r] | '\'\'') STRING_SIMPLE | ;
//fragment STRING_DOUBLE : (~[\n\r] | '""') STRING_DOUBLE | ;
fragment TEXT : ~[\r\n] TEXT | ;
//fragment TEXT_LAMBDA : ~[\r\n] | ;
fragment EOL : '\r' '\n' | '\n';

fragment SINTAX_B : [0-1];
fragment SINTAX_O : [0-7];
fragment SINTAX_H : [A-F0-9];
fragment DIGIT_B : SINTAX_B DIGIT_B | ;
fragment DIGIT_O : SINTAX_O DIGIT_O | ;
fragment DIGIT_H : SINTAX_H DIGIT_H | ;