package entitiy;

public class Sentence{
    private String sentence;
    private Body block; //--> puede ser null

    public Sentence(Body block, String sentence) {
        this.block = block;
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Body getBlock() {
        return block;
    }

    public void setBlock(Body block) {
        this.block = block;
    }
}
