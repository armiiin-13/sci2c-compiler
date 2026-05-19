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

    public String toString(String indent){
        StringBuilder sb = new StringBuilder();
        String[] cases = this.value.split(" , ");
        for (String switchCase: cases){
            sb.append(indent).append(switchCase).append(":\n");
        }
        String doubleIndent = indent + "\t";
        sb.append(this.body.toString(doubleIndent));
        return sb.toString();
    }
}
