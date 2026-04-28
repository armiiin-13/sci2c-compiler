package entitiy;

import java.util.ArrayList;

public class Program{
    private ArrayList<Constant> constants;
    private ArrayList<Function> functions;
    private Function main;

    public Program() {
        this.constants = new ArrayList<>();
        this.functions = new ArrayList<>();
        this.main = new Function(new Header("void","main"), new Body());
    }

    public void printProgram(){
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