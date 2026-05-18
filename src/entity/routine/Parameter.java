package entity.routine;

public class Parameter {
    private String type;
    private String name;
    private String value;
    private boolean pointer;

    public Parameter(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.setValue(value);
    }

    public Parameter(String type, String name) {
        this.type = type;
        this.name = name;
        this.value = null;
    }

    public Parameter(String name) {
        this.type = null;
        this.name = name;
        this.value = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value == null) {
            this.value = null;

        } else if (type.startsWith("char")) {
            this.value = toStrings(value);
            this.type = "CONSTINT";
        } else if (type.startsWith("b`")){
            this.value = toBinary(value);
            this.type = "CONSTINT";
        } else if (type.startsWith("o`")){
            this.value = toOctal(value);
            this.type = "CONSTINT";
        } else if (type.startsWith("z`")){
            this.value = toHexadecimal(value);
            this.type = "CONSTINT";
        } else {
            this.value = value;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPointer() {
        return pointer;
    }

    public void setPointer(boolean pointer) {
        this.pointer = pointer;
    }

    public String paramHeaderDeclaration(){
        StringBuilder sb = new StringBuilder();
        if(type.contains("char")){
            sb.append("char");
        } else {
            sb.append(this.type);
        }
        sb.append(" ");
        if(isPointer()){
            sb.append("*");
        }
        sb.append(this.name);
        if(type.startsWith("char")){
            if(type.contains("[")){
                sb.append("[]");
            }
        }
        return sb.toString();
    }

    // Prov
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        return sb.toString();
    }

    private String toBinary(String s) {
        String content = s.substring(2, s.length() - 1);
        return "0b" + content;
    }

    private String toOctal(String s) {
        String content = s.substring(2, s.length() - 1);
        return "0o" + content;
    }

    private String toHexadecimal(String s) {
        String content = s.substring(2, s.length() - 1);
        return "0x" + content;
    }

    private String toStrings(String value) {
        // Case: ''
        if (value.startsWith("'") && value.endsWith("'")) {
            String inner = value.substring(1, value.length() - 1);

            // Manejar escapes de Fortran:
            inner = inner.replace("''", "'");

            // Escapar comillas dobles para C
            inner = inner.replace("\"", "\\\"");

            return "\"" + inner + "\"";
        }

        // Case: ""
        else if (value.startsWith("\"") && value.endsWith("\"")) {
            String inner = value.substring(1, value.length() - 1);

            inner = inner.replace("\"\"", "\""); // escape Fortran
            inner = inner.replace("\"", "\\\"");

            return "\"" + inner + "\"";
        }
        else {
            return value;
        }
    }
}
