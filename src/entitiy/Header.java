package entitiy;

import java.util.ArrayList;

class Header{
    private String type;
    private String name;
    private ArrayList<Parameter> params;

    public Header(String type, String name) {
        this.type = type;
        this.name = name;
        this.params = new ArrayList<>();
    }

    public void addParameter(Parameter param){
        this.params.add(param);
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

    public ArrayList<Parameter> getParams() {
        return params;
    }

    public void setParams(ArrayList<Parameter> params) {
        this.params = params;
    }
}