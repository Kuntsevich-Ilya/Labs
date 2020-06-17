package by.bsu.study.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence {
    private ArrayList<Word> words;

    Sentence(String sentence){
        if (sentence.contains(".")){
            sentence = sentence.split("\\.")[0]; //get first words if there are more than one
        }
        this.words = new ArrayList<>();
        Arrays.stream(sentence.replaceAll("[\\s]{2,}", " ")
                .split(" "))
                .forEach(strWord -> this.words.add(new Word(strWord)));
    }

    public ArrayList<Word> getSentence() {
        return new ArrayList<>(words);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.size(); i++){
            builder.append(words.get(i).toString());
            if (i != words.size() - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
