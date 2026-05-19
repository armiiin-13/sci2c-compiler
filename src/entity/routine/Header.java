package entity.routine;

import entity.error.ErrorManager;
import entity.error.SemanticException;

import java.util.ArrayList;

public class Header{
    private String type;
    private String name;
    private ArrayList<Parameter> params;

    public Header(String type, String name) {
        this.type = type;
        this.name = name;
        this.params = new ArrayList<>();
    }

    public Header(String name) {
        this.type = null;
        this.name = name;
        this.params = new ArrayList<>();
    }

    public void addParam(String name){
        if (!isParameter(name)) {
            params.add(new Parameter(name));
        }

    }

    public Parameter getParam(String name, int line, int column, ErrorManager errorManager){
        for(Parameter param: this.params){
            if (param.getName().equals(name)){
                return param;
            }
        }
        errorManager.addError(Integer.toString(line), Integer.toString(column), "El parámetro " + name
                + " no ha sido declarado en la cabecera de la subrutina '" + this.name + "'.");
        return null;
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

    public void checkIfNoTypeParam(int line, int column, ErrorManager errorManager){
        for (Parameter param : this.params){
            if (param.getType() == null){
                errorManager.addError(Integer.toString(line), Integer.toString(column), "El parámetro '" + param.getName() +
                "' declarado en la cabecera de la subrutina '" +
                        this.name + "' debe tener un tipo declarado explícitamente.");
            }
        }
    }

    public boolean isParameter(String name){
        for (Parameter param: this.params){
            if (param.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(type).append(" ").append(name).append(" (");

        if (params.isEmpty()){
            sb.append("void");
        } else {
            for (int i = 0; i < params.size(); i++) {
                sb.append(params.get(i).paramHeaderDeclaration());
                if (i < params.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }
}