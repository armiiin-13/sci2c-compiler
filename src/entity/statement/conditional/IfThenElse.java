package entity.statement.conditional;

import entity.routine.Body;
import entity.statement.Sentence;

import java.util.ArrayList;
import java.util.List;

public class IfThenElse extends Sentence {
    // sentence of father is the condition
    private Body ifBody;
    private Body elseBody;

    public IfThenElse(String condition) {
        super(condition);
        this.ifBody = new Body();
        this.elseBody = new Body();
    }

    public Body getIfBody() {
        return ifBody;
    }

    public void setIfBody(Body ifBody) {
        this.ifBody = ifBody;
    }

    public Body getElseBody() {
        return elseBody;
    }

    public void setElseBody(Body elseBody) {
        this.elseBody = elseBody;
    }

    @Override
    public String toString(){
        return "";
    }
}
