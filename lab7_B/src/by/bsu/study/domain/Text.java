package by.bsu.study.domain;

import java.io.*;
import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> sentences;

    public Text(String textPath) throws IOException {
        File file = new File(textPath);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        StringBuilder builder = new StringBuilder();

        String line = "";
        while (line != null) {
            builder.append(line);
            line = reader.readLine();
        }

        sentences = new ArrayList<>();

        String[] fileText = builder.toString().trim().split("[.]");
        for (String sentence: fileText){
            sentences.add(new Sentence(sentence.trim()));
        }
    }

    public ArrayList<Sentence> getSentences() {
        return new ArrayList<>(sentences);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sentence: sentences){
            builder.append(sentence.toString()).append(". ");
        }
        return builder.toString();
    }
}
