package entity.statement.conditional;

import entity.routine.Body;
import entity.statement.Sentence;

public class For extends Sentence {
    private String nameVariable;
    private String initValue;
    private String endValue;
    private String increment;
    private Body forBody;

    public For(String nameVariable, String initValue, String endValue, String increment) {
        this.nameVariable = nameVariable;
        this.initValue = initValue;
        this.endValue = endValue;
        this.increment = increment;
        this.forBody = new Body();
    }

    public String getNameVariable() {
        return nameVariable;
    }

    public void setNameVariable(String nameVariable) {
        this.nameVariable = nameVariable;
    }

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    public String getEndValue() {
        return endValue;
    }

    public void setEndValue(String endValue) {
        this.endValue = endValue;
    }

    public String getIncrement() {
        return increment;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public Body getForBody() {
        return forBody;
    }

    public void setForBody(Body forBody) {
        this.forBody = forBody;
    }

    @Override
    public String toString(){
        return "";
    }
}
