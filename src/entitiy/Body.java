package entitiy;

import java.util.ArrayList;

public class Body{
    private ArrayList<Sentence> sentences;

    public Body() {
        this.sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence){
        this.sentences.add(sentence);
    }

    @Override
    public String toString() {
        return "Body{" +
                "sentences=" + sentences +
                '}';
    }
}