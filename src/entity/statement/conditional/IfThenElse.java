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
    public String toString(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("if (").append(this.getSentence()).append("){\n");
        String doubleIndent = indent + "  ";
        sb.append(this.ifBody.toString(doubleIndent));
        sb.append(indent).append("\n}");
        if (!this.elseBody.getSentences().isEmpty()){
            sb.append(" else {\n");
            sb.append(this.elseBody.toString(doubleIndent));
            sb.append(indent).append("}");
        }
        return sb.toString();
    }
}
