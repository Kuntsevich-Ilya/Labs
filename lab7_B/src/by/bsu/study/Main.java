package by.bsu.study;

import by.bsu.study.domain.Text;
import by.bsu.study.service.TextHandler;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main menu = new Main();
        menu.SortTextMenu();
    }

    private void SortTextMenu(){
        System.out.println("Lab 7 B. Work with text and strings\n------");

        String textPath = "./res/example1.txt";
        Text text;
        try {
            text = new Text(textPath);
        }
        catch (IOException ex){
            ex.printStackTrace();
            return;
        }
        TextHandler handler = new TextHandler(text);

        System.out.println("\nText words sorted by vowels:");
        System.out.println(handler.sortByVowels());

        System.out.println("------");
    }
}
