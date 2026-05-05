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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(type).append(" ").append(name).append("(");

        if (params.isEmpty()){
            sb.append("void");
        } else {
            for (int i = 0; i < params.size(); i++) {
                sb.append(params.get(i).toString());
                if (i < params.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }
}