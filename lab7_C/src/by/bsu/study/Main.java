package by.bsu.study;

import by.bsu.study.service.PhoneHandler;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main menu = new Main();
        menu.SortTextMenu();
    }

    private void SortTextMenu(){
        int phoneNum = 54642652;

        System.out.println("Lab 7 C. Work with text and strings\n------");
        PhoneHandler decoder = new PhoneHandler();
        String path = "./res/dictionary.txt";

        try {
            ArrayList<String> words = decoder.getFileArray(path);
            System.out.println("Words from dictionary:");
            for(int i = 0; i < words.size(); i++){
                System.out.println((i+1) + ". " + words.get(i));
            }
            decoder.setDictionary(words);
        } catch (IOException e){
            e.printStackTrace();
            return;
        }

        System.out.println("\nPhone number: " + phoneNum);

        ArrayList<String> decodedNums = decoder.getDecodedNumbers(phoneNum);
        System.out.println("\nDecoded numbers: " + decodedNums.size());
        for(int i = 0; i < decodedNums.size(); i++){
                System.out.println((i+1) + ". " + decodedNums.get(i));
        }

        System.out.println("\nMaximal substrings from dictionary: ");
        ArrayList<String> substrings =  decoder.getSubstringsOfNum(phoneNum);
        for(int i = 0; i < substrings.size(); i++){
            System.out.println((i+1) + ". " + substrings.get(i));
        }
        if (substrings.size() == 0){
            System.out.println("There are no such words in dictionary");
        }

        System.out.println("------");
    }
}
