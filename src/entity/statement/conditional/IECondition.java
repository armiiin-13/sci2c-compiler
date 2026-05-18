package entity.statement.conditional;

import entity.routine.Body;

public class IECondition {
    private String condition;
    private Body conditionBody;
    private IEConditionType type;

    public IECondition(IEConditionType type) {
        this.condition = null;
        this.conditionBody = new Body();
        this.type = type;
    }

    public IECondition(IEConditionType type, String condition) {
        this.condition = condition;
        this.conditionBody = new Body();
        this.type = type;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Body getConditionBody() {
        return conditionBody;
    }

    public void setConditionBody(Body conditionBody) {
        this.conditionBody = conditionBody;
    }

    public IEConditionType getType() {
        return type;
    }

    public void setType(IEConditionType type) {
        this.type = type;
    }
}
