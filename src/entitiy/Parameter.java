package entitiy;

import util.Tuple;

import java.util.ArrayList;
import java.util.List;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {

        if (value == null) {
            this.value = null;
            return;
        }

        if (type.startsWith("char")) {
            if (value.startsWith("'") && value.endsWith("'")) {
                this.value = "\"" + value.substring(1, value.length() - 1) + "\"";
            } else {
                this.value = value;
            }
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
}
