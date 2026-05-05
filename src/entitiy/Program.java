package entitiy;

import util.Tuple;

import java.util.ArrayList;
import java.util.List;

public class Program{
    private String name;
    private List<Constant> constants;
    private List<Function> functions;
    private Function main;

    public Program() {
        this.constants = new ArrayList<>();
        this.functions = new ArrayList<>();
        this.main = new Function(new Header("void","main"), new Body());
    }

    public Program(String name){
        this();
        this.name = name;

        // DEBUG
        System.out.println("Program Created with name = " + this.name);
    }

    public void printProgram(){
        System.out.println("Program with name: " + this.name);
        for (Constant constant : constants){
            System.out.println("#define " + constant.getName() + " " + constant.getValue()); //PROVISIONAL
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

    public List<Constant> getConstants() {
        return constants;
    }

    public void setConstants(ArrayList<Constant> constants) {
        this.constants = constants;
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(ArrayList<Function> functions) {
        this.functions = functions;
    }

    public Function getMain() {
        return this.main;
    }

    public void setMain(Function main) {
        this.main = main;
    }
}