package entity.statement;

public class Sentence{
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public Sentence(){
        this.sentence = null;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
