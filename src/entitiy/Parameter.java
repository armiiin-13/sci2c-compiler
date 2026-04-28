package entitiy;

import java.util.ArrayList;

public class Parameter {
    private String type;
    private ArrayList<String> names;
    private String value;
    private boolean pointer;

    public Parameter(String type){
        this.type = type;
        this.names = new ArrayList<>();
    }

    public void addParameter(String name){
        this.names.add(name);
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

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public boolean isPointer() {
        return pointer;
    }

    public void setPointer(boolean pointer) {
        this.pointer = pointer;
    }
}
