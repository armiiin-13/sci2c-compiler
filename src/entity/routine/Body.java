package entity.routine;

import entity.statement.Sentence;

import java.util.ArrayList;

public class Body{
    private ArrayList<Sentence> sentences;

    public Body() {
        this.sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence){
        this.sentences.add(sentence);
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }


    @Override
    public String toString() {
        return toString("  "); // por defecto, 2 espacios para sentencias
    }

    public String toString(String indent) {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences) {
            sb.append(indent).append(s.getSentence()).append("\n");
        }
        return sb.toString();
    }


    }