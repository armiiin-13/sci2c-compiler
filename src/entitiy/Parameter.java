package entitiy;

import java.util.ArrayList;

public class Parameter {
    private String type;
    private String name;
    private String value;
    private boolean pointer;

    public Parameter(String type, String name, String value){
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public Parameter(String type, String name){
        this.type = type;
        this.name = name;
        this.value = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
