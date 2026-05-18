package entity.statement.conditional;

import entity.routine.Body;
import entity.statement.Sentence;

public class While extends Sentence {
    // sentence of father is the condition
    private Body whileBody;

    public While(String sentence) {
        super(sentence);
        this.whileBody = new Body();
    }

    public Body getWhileBody() {
        return whileBody;
    }

    public void setWhileBody(Body whileBody) {
        this.whileBody = whileBody;
    }

    @Override
    public String toString(){
        return "";
    }
}
