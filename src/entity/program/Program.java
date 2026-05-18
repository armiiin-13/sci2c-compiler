package entity.program;

import entity.exception.SemanticException;
import entity.routine.Body;
import entity.routine.Function;
import entity.routine.Header;

import java.io.FileWriter;
import java.io.IOException;
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

    public Function getFunction(String name){
        for(Function function: this.functions){
            if (function.getHeader().getName().equals(name)){
                return function;
            }
        }
        return null;
    }

    public void exportProgram(){
        String path = "src/file/output/" + this.name + ".c";
        try{
            FileWriter writer = new FileWriter(path);
            for (Constant constant : constants){
                writer.write("#define " + constant.getName() + " " + constant.getValue());
                writer.write("\n");
            }
            writer.write("\n");

            for (Function function : functions){
                writer.write(function.headerToString());
                writer.write("\n");
            }

            writer.write("\n");
            writer.write(main.toString());
            writer.write("\n");
            writer.write("\n");

            for (Function function : functions){
                writer.write(function.toString());
                writer.write("\n");
                writer.write("\n");
            }

            writer.close();

        } catch(IOException e){
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

}