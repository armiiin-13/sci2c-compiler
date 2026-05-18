package entity.statement.switchcase;

import entity.routine.Body;
import entity.statement.Sentence;

public class SwitchCase {
    private String value;
    private Body body;

    public SwitchCase(String value){
        this.value = value;
        this.body = new Body();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void addSentenceToCase(Sentence sentence){
        this.body.addSentence(sentence);
    }
}
