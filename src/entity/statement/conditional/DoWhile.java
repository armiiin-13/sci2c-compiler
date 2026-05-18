package entity.statement.conditional;

import entity.routine.Body;
import entity.statement.Sentence;

public class DoWhile extends Sentence {
    // sentence of father is the condition
    private Body doWhileBody;

    public DoWhile(String sentence) {
        super(sentence);
        this.doWhileBody = new Body();
    }

    public Body getDoWhileBody() {
        return doWhileBody;
    }

    public void setDoWhileBody(Body doWhileBody) {
        this.doWhileBody = doWhileBody;
    }

    @Override
    public String toString(){
        return "";
    }
}
