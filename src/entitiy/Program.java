package entitiy;

import util.Tuple;

import java.util.ArrayList;
import java.util.List;

public class Program{
    private String name;
    private ArrayList<Constant> constants;
    private ArrayList<Tuple<String, List<Parameter>>> parameters;
    private ArrayList<Function> functions;
    private Function main;

    public Program() {
        this.constants = new ArrayList<>();
        this.parameters = new ArrayList<>();
        this.functions = new ArrayList<>();
        this.main = new Function(new Header("void","main"), new Body());
    }

    public Program(String name){
        this();
        this.name = name;

        // DEBUG
        System.out.println("Program Created with name = " + this.name);
    }

    public void addParameter(Tuple tuple){
        this.parameters.add(tuple);
    }

    public void printProgram(){
        System.out.println("Program with name: " + this.name);
        for (Constant constant : constants){
            System.out.println("#define " + constant.getName() + " " + constant.getValue()); //PROVISIONAL
        }

        for (Tuple<String, List<Parameter>> paramList : parameters){

            String type = paramList.getType();
            List<Parameter> vars = paramList.getList();

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < vars.size(); i++) {
                Parameter p = vars.get(i);

                String varName = p.getName();
                String value = p.getValue();

                // Manejo especial para char arrays
                if (type.startsWith("char[")) {
                    String size = type.substring(type.indexOf("["));
                    varName = varName + size;
                }

                line.append(varName);

                if (value != null) {
                    line.append(" = ").append(value);
                }

                if (i < vars.size() - 1) {
                    line.append(", ");
                }
            }

            // Imprimir tipo base
            if (type.startsWith("char[")) {
                System.out.println("char " + line.toString() + ";");
            } else {
                System.out.println(type + " " + line.toString() + ";");
            }

        }

        for (Function function : functions){
            function.printHeader();
        }

        main.printFunction();

        for (Function function : functions){
            function.printFunction();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tuple<String, List<Parameter>>> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Tuple<String, List<Parameter>>> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<Constant> getConstants() {
        return constants;
    }

    public void setConstants(ArrayList<Constant> constants) {
        this.constants = constants;
    }

    public ArrayList<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(ArrayList<Function> functions) {
        this.functions = functions;
    }

    public Function getMain() {
        return main;
    }

    public void setMain(Function main) {
        this.main = main;
    }
}