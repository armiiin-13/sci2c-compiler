grammar SciLanguage;

axiom : (VOWEL | OTHER)* EOF ;

VOWEL : [aeiou]+ {
                    String up = getText().toUpperCase();
                    setText(up);
                    System.out.print(up);
                 };
OTHER : . {System.out.print(getText());};