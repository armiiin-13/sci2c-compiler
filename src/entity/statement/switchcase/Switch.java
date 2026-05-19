package entity.statement.switchcase;

import entity.statement.Sentence;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Sentence {
    // sentence is the selector
    private List<SwitchCase> cases;
    private SwitchCase defaultCase;

    public Switch(String selector) {
        super(selector);
        this.cases = new ArrayList<>();
        this.defaultCase = new SwitchCase(null);
    }

    public List<SwitchCase> getCases() {
        return cases;
    }

    public void setCases(List<SwitchCase> cases) {
        this.cases = cases;
    }

    public SwitchCase addCase(String value){
        SwitchCase newCase = new SwitchCase(value);
        this.cases.add(newCase);
        return (newCase);
    }

    public SwitchCase addCase(SwitchCase newCase){
        this.cases.add(newCase);
        return (newCase);
    }

    public SwitchCase getDefaultCase() {
        return defaultCase;
    }

    public void setDefaultCase(SwitchCase defaultCase) {
        this.defaultCase = defaultCase;
    }

    @Override
    public String toString(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("switch(").append(this.getSentence()).append("){\n");
        String doubleIndent = indent + "\t";
        for (SwitchCase switchCase: this.cases){
            sb.append(switchCase.toString(doubleIndent));
            sb.append(doubleIndent).append("\t").append("break;\n");
        }
        if (! this.defaultCase.getBody().getSentences().isEmpty()){
            sb.append(doubleIndent).append("default:\n");
            sb.append(this.defaultCase.getBody().toString(doubleIndent + "\t"));
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
