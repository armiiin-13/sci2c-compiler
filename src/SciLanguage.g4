grammar SciLanguage;

// imports
@header {
    import entity.exception.*;
    import entity.program.*;
    import entity.routine.*;
    import entity.statement.*;
    import entity.util.Tuple;
}

// ------------ GRAMMAR RULES ------------
prg returns [Program p]: 'PROGRAM' IDENT ';' {
            $p = new Program($IDENT.text);
       }
       dcllist[$p.getConstants(), $p.getMain().getLocalVariables()] cabecera[$p.getFunctions()] sentlist[$p, null,null]{
            $p.getMain().setBlock($sentlist.body);
       } 'END' 'PROGRAM' IDENT subproglist[$p] {$p.exportProgram();};

dcllist[List<Constant> constants, List<Tuple<String, List<Parameter>>> variables] : dcl[$constants, $variables] dcllist[$constants, $variables] | ;
cabecera[List<Function> functions] : 'INTERFACE' cablist[$functions] 'END' 'INTERFACE' | ;
cablist[List<Function> functions] : decproc {$functions.add($decproc.function);} decsubprog[$functions]
                                  | decfun {$functions.add($decfun.function);} decsubprog[$functions];
decsubprog[List<Function> functions] : decproc {$functions.add($decproc.function);} decsubprog[$functions]
                                     | decfun {$functions.add($decfun.function);} decsubprog[$functions] | ;
sentlist[Program p, String funcName, Header funcHeader] returns [Body body]: sent[$p, $funcName, funcHeader] sentlist2[$p, $funcName, funcHeader] {
    $body = new Body();
    $body.addSentence($sent.s);

    if ($sentlist2.body != null) {
        for (Sentence sen : $sentlist2.body.getSentences()){
            $body.addSentence(sen);
        }
    }
};

sentlist2[Program p, String funcName, Header funcHeader] returns [Body body]: sent[$p, $funcName, funcHeader] sentlist2[$p, $funcName, funcHeader] {
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

decproc returns [Function function]: 'SUBROUTINE' id1=IDENT {
        $function = new Function(new Header("void", $id1.text), new Body());
    } formal_paramlist[$function.getHeader()] dec_s_paramlist[$function.getHeader()] 'END' 'SUBROUTINE' id2=IDENT{
        if (! $id1.text.equals($id2.text)) {
            throw new SemanticException(
                    "Línea " + $id2.getLine() +
                    ": IDENT de apertura (" + $id1.text +
                    ") distinto del IDENT de cierre (" + $id2.text + ")"
                );
        }
    };
formal_paramlist[Header header] : '(' nomparamlist_init[$header] ')' | ;
nomparamlist_init[Header header] : IDENT {$header.addParam($IDENT.text);} nomparamlist[$header];
nomparamlist[Header header] : ',' nomparamlist_init[$header] | ;
dec_s_paramlist[Header header] : tipo ',' 'INTENT' '(' tipoparam ')' IDENT {
        Parameter param = $header.getParam($IDENT.text, $IDENT.getLine());
        param.setType($tipo.type);
        param.setPointer($tipoparam.value);
    }';' dec_s_paramlist[$header] | ;
tipoparam returns [boolean value] : 'IN' {$value = false;}| 'OUT' {$value = true;}| 'INOUT'{$value = true;};

formal_paramlist_dummy : '(' nomparamlist_dummy ')' | ;
nomparamlist_dummy : IDENT nomparamlist_dummy2;
nomparamlist_dummy2 : ',' IDENT nomparamlist_dummy2 | ;
dec_f_paramlist_dummy : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' dec_f_paramlist_dummy | ;

decfun returns [Function function]: 'FUNCTION' id1=IDENT {
        $function = new Function(new Header($id1.text), new Body());
    }'(' nomparamlist_init[$function.getHeader()] ')' tipo '::' IDENT {
        $function.getHeader().setType($tipo.type);
    }';' dec_f_paramlist[$function.getHeader()] 'END' 'FUNCTION' id2=IDENT {
        if (! $id1.text.equals($id2.text)){
            throw new SemanticException(
                    "Línea " + $id2.getLine() +
                    ": IDENT de apertura (" + $id1.text +
                    ") distinto del IDENT de cierre (" + $id2.text + ")"
                );
        }
    };
dec_f_paramlist[Header header] : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' {
        Parameter param = $header.getParam($IDENT.text, $IDENT.getLine());
        param.setType($tipo.type);
        param.setPointer($tipoparam.value);
    } dec_f_paramlist[$header]
    | {
        $header.checkIfNoTypeParam(_localctx.getStart().getLine());
    };

sent[Program p, String funcName, Header funcHeader] returns [Sentence s] :
    IDENT '=' exp[funcHeader] ';' {
        if ($funcName != null && $IDENT.text.equals($funcName)) {
            $s = new Sentence("return " + $exp.code + ";");
        } else {
            String left = $funcHeader != null && $funcHeader.isParameter($IDENT.text) &&
                $funcHeader.getParam($IDENT.text,$IDENT.getLine()).isPointer()
                        ? "*" + $IDENT.text
                        : $IDENT.text;

            $s = new Sentence(left + " = " + $exp.code + ";");
        }

    } | proc_call[p] ';' {
        $s = new Sentence($proc_call.code + ";");
    } ;
    // | 'IF' '(' expcond ')' if_then | 'DO' do_body | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT';
exp[Header funcHeader]  returns [String code] : factor[funcHeader] exp2[funcHeader] {
    $code = $factor.code + $exp2.code;
};

exp2[Header funcHeader] returns [String code] : op factor[funcHeader] exp2[funcHeader] {
    $code = " " + $op.text + " " + $factor.code + $exp2.code;
} | {
    $code = "";
};

op : oparit ;
oparit : '+' |'-' | '*' | '/' ;
factor[Header funcHeader] returns [String code] : simpvalue {
    $code = $simpvalue.value;
} | '(' exp[funcHeader] ')' {
    $code = "(" + $exp.code + ")";
} | IDENT factor2[funcHeader] {
    String name = $IDENT.text;
    if ($funcHeader != null && $funcHeader.isParameter($IDENT.text) &&
        $funcHeader.getParam($IDENT.text,$IDENT.getLine()).isPointer() && $factor2.code.equals("")) {
            $code = "*" + name;
    } else {
        $code = name + $factor2.code;
    }
};
factor2[Header funcHeader] returns [String code]
    : '(' exp[funcHeader] explist[funcHeader] ')' {
        $code = "(" + $exp.code + $explist.code + ")";
    }
    | {
        $code = "";
    };
explist[Header funcHeader] returns [String code] : ',' exp[funcHeader] explist[$funcHeader] {
    $code = ", " + $exp.code + $explist.code;
} | {
    $code = "";
};
proc_call[Program p] returns [String code] : 'CALL' IDENT {
    Function function = $p.getFunction($IDENT.text);
    Header funcHeader = function != null ? function.getHeader() : null;
}subpparamlist[funcHeader] {
    $code = $IDENT.text + $subpparamlist.code;
};
subpparamlist[Header funcHeader] returns [String code]
    : '(' actual_params[funcHeader, 0] ')' {
        $code = "(" + $actual_params.code + ")";
    }
    | {
        $code = "()";
    };
actual_params[Header funcHeader, int idx] returns [String code]
    : exp[null] actual_params_tail[funcHeader, idx + 1] {
        String arg = $exp.code;

        if (funcHeader != null
            && funcHeader.getParams().get(idx).isPointer()) {
            arg = "&" + arg;
        }

        $code = arg + $actual_params_tail.code;
    };

actual_params_tail[Header funcHeader, int idx] returns [String code]
    : ',' exp[null] actual_params_tail[funcHeader, idx + 1] {
        String arg = $exp.code;

        if (funcHeader != null
            && funcHeader.getParams().get(idx).isPointer()) {
            arg = "&" + arg;
        }

        $code = ", " + arg + $actual_params_tail.code;
    }
    | {
        $code = "";
    };

subproglist[Program p] : codproc[$p] subproglist[$p] | codfun[$p] subproglist[$p] | ;

codproc[Program p]: 'SUBROUTINE' beginId=IDENT {
    Function func = $p.getFunction($beginId.text);
    } formal_paramlist_dummy dec_f_paramlist_dummy dcllist[new ArrayList<Constant>(), func.getLocalVariables()] sentlist[$p, null,func.getHeader()] {func.setBlock($sentlist.body);}
    'END' 'SUBROUTINE' endId=IDENT {
        if(!$beginId.text.equals($endId.text)){
            throw new SemanticException(
                "Línea " + $endId.getLine() +
                ": IDENT de apertura (" + $beginId.text +
                ") distinto del IDENT de cierre (" + $endId.text + ")"
            );
        }
    };

codfun[Program p] : 'FUNCTION' beginId=IDENT {
        Function func = $p.getFunction($beginId.text);
    }'(' {Header dummy = new Header("dummy");} nomparamlist_init[dummy] ')' tipo '::' IDENT
    ';' dec_f_paramlist[dummy] dcllist[new ArrayList<Constant>(), func.getLocalVariables()] sentlist[$p, $beginId.text, func.getHeader()] {
        func.setBlock($sentlist.body);
    } returnId=IDENT '=' exp[func.getHeader()] {func.getBlock().addSentence(new Sentence("return " + $exp.code + ";"));} ';' 'END' 'FUNCTION' endId=IDENT {
        if(!$beginId.text.equals($endId.text)){
            throw new SemanticException(
                    "Línea " + $endId.getLine() +
                    ": IDENT de apertura (" + $beginId.text +
                    ") distinto del IDENT de cierre (" + $endId.text + ")"
                );
        }
        if(! $returnId.text.equals($endId.text)){
            throw new SemanticException(
                    "Línea " + $returnId.getLine() +
                    ": IDENT del valor de retorno (" + $returnId.text +
                    ") distinto del IDENT de nombre de la función (" + $endId.text + ")"
                );
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