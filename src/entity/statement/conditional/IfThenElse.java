package entity.statement.conditional;

import entity.statement.Sentence;

import java.util.ArrayList;
import java.util.List;

public class IfThenElse extends Sentence {
    private List<IECondition> conditions;

    public IfThenElse() {
        super();
        this.conditions = new ArrayList<>();
    }

    public IECondition addNewCondition(IEConditionType type){
        IECondition cond = new IECondition(type);
        this.conditions.add(cond);
        return cond;
    }

    @Override
    public String toString(){
        return "";
    }
}
