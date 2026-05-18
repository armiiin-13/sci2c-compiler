package entity.routine;

import entity.util.Tuple;

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

    public String headerToString(){
        return header.toString() + ";";
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        // Add header
        sb.append(header.toString());
        sb.append("{\n");

        // Add Local Variables
        for (Tuple<String, List<Parameter>> decl : localVariables) {
            sb.append(printDeclTuple(decl));
            sb.append("\n");
        }

        // Print Body
        sb.append(block.toString(INDENT_SPACE));

        // Close Function
        sb.append("}");

        return sb.toString();
    }

    private static String printDeclTuple(Tuple<String, List<Parameter>> decl) {
        StringBuilder sb = new StringBuilder();
        String type = decl.getFirst();
        List<Parameter> params = decl.getSecond();

        String baseType = type;
        String arraySuffix = "";

        if (type.startsWith("char") && type.contains("[")) {
            int idx = type.indexOf('[');
            baseType = type.substring(0, idx);
            arraySuffix = type.substring(idx);
        }

        sb.append(INDENT_SPACE);
        sb.append(baseType);
        sb.append(" ");

        for (int i = 0; i < params.size(); i++) {
            Parameter p = params.get(i);

            String name = p.getName() + arraySuffix;
            String v = p.getValue();
            if (v != null) {
                if (!arraySuffix.isEmpty()) {
                    v = fortranStringToCString(v);
                }
                sb.append(name);
                sb.append(" = ");
                sb.append(v);
            } else {
                sb.append(name);
            }
            if (i < params.size() - 1) sb.append(", ");
        }
        sb.append(";");
        return sb.toString();
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
