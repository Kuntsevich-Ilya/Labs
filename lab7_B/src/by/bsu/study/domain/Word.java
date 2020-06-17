package by.bsu.study.domain;

import java.util.ArrayList;

public class Word {
    private ArrayList<Symbol> symbols;

    public Word(String word){
        setSymbols(word);
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }
    public void setSymbols(String word) {
        symbols = new ArrayList<>();
        word.chars().forEachOrdered(ch ->
                symbols.add(new Symbol((char)ch))
        );
    }
    public int getSize(){
        return symbols.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Symbol symbol: symbols){
            builder.append(symbol);
        }
        return builder.toString();
    }
}
