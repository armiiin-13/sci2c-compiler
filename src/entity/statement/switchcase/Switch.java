package entity.statement.switchcase;

import entity.statement.Sentence;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Sentence {
    private List<SwitchCase> cases;
    private SwitchCase defaultCase;

    public Switch() {
        super();
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

    public SwitchCase getDefaultCase() {
        return defaultCase;
    }

    public void setDefaultCase(SwitchCase defaultCase) {
        this.defaultCase = defaultCase;
    }

    @Override
    public String toString(){
        return "";
    }
}
