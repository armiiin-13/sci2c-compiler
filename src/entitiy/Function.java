package entitiy;

import util.Tuple;

import java.util.ArrayList;
import java.util.List;



public class Function{

    private static final String INDENT_SPACE = "    "; // 4 espacios

    private Header header;
    private Body block;
    private ArrayList<Tuple<String, List<Parameter>>> localVariables;

    public Function(Header header, Body block) {
        this.header = header;
        this.block = block;
        this.localVariables = new ArrayList<>();
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBlock() {
        return block;
    }

    public void setBlock(Body block) {
        this.block = block;
    }

    public ArrayList<Tuple<String, List<Parameter>>> getLocalVariables() {
        return localVariables;
    }

    public void setLocalVariables(ArrayList<Tuple<String, List<Parameter>>> localVariables) {
        this.localVariables = localVariables;
    }

    public void printHeader(){
        System.out.print(header.toString() + ";");    //PROVISIONAL
    }

    public void printFunction(){

        // Print Header
        System.out.println(header.toString() + " {");

        // Print Local Variables
        for (Tuple<String, List<Parameter>> decl : localVariables) {
            printDeclTuple(decl);
        }

        // Print Body
        System.out.print(block.toString(INDENT_SPACE));

        // Close Function
        System.out.println("}");

    }

    private static void printDeclTuple(Tuple<String, List<Parameter>> decl) {
        String type = decl.getFirst();
        List<Parameter> params = decl.getSecond();

        String baseType = type;
        String arraySuffix = "";

        if (type.startsWith("char") && type.contains("[")) {
            int idx = type.indexOf('[');
            baseType = type.substring(0, idx);
            arraySuffix = type.substring(idx);
        }

        System.out.print(INDENT_SPACE + baseType + " ");

        for (int i = 0; i < params.size(); i++) {
            Parameter p = params.get(i);

            String name = p.getName() + arraySuffix;
            String v = p.getValue();
            if (v != null) {
                if (!arraySuffix.isEmpty()) {
                    v = fortranStringToCString(v);
                }
                System.out.print(name + " = " + v);
            } else {
                System.out.print(name);
            }
            if (i < params.size() - 1) System.out.print(", ");
        }
        System.out.println(";");
    }


    private static String fortranStringToCString(String value) {
        if (value == null) return null;

        // 'Hola'
        if (value.startsWith("'") && value.endsWith("'")) {
            String inner = value.substring(1, value.length() - 1);
            inner = inner.replace("''", "'");      // Fortran escape
            inner = inner.replace("\\", "\\\\");   // C escape
            inner = inner.replace("\"", "\\\"");
            return "\"" + inner + "\"";
        }

        // "Hola"
        if (value.startsWith("\"") && value.endsWith("\"")) {
            String inner = value.substring(1, value.length() - 1);
            inner = inner.replace("\"\"", "\"");   // Fortran escape
            inner = inner.replace("\\", "\\\\");
            inner = inner.replace("\"", "\\\"");
            return "\"" + inner + "\"";
        }

        // por seguridad
        return "\"" + value + "\"";
    }

}
