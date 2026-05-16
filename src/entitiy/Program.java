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
    }

    public void printProgram(){
        for (Constant constant : constants){
            System.out.println("#define " + constant.getName() + " " + constant.getValue()); //PROVISIONAL
        }

        System.out.println();

        for (Function function : functions){
            function.printHeader();
            System.out.println();
        }

        System.out.println();

        main.printFunction();

        System.out.println();

        for (Function function : functions){
            function.printFunction();
            System.out.println();
        }
    }

    public void addFunction(Function f){

        for (int i = 0; i < functions.size(); i++) {
            Function existing = functions.get(i);

            if (existing.getHeader().getName().equals(f.getHeader().getName())) {
                functions.set(i, f);
                return;
            }
        }

        functions.add(f);

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