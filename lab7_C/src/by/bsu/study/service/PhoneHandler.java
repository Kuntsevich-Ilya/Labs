package by.bsu.study.service;

import by.bsu.study.domain.Translation;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*. Буквенная запись телефонных номеров основана на том, что каждой цифре
соответствует несколько английских букв: 2 — ABC, 3 — DEF, 4 — GHI,
5 — JKL, 6 — MNO, 7 — PQRS, 8 — TUV, 9 — WXYZ. Написать программу,
которая находит в заданном телефонном номере подстроку максимальной длины,
соответствующую слову из словаря.*/
public class PhoneHandler {
    private ArrayList<String> dictionary;

    public PhoneHandler(){
        dictionary = new ArrayList<>();
    }

    // основной метод, возвращает все подстроки
    public ArrayList<String> getSubstringsOfNum(int phoneNum) {
        ArrayList<String> decodedNumbers = getDecodedNumbers(phoneNum);

        ArrayList<String> substrings = new ArrayList<>();
        int previousLength = 0;
        for (String word : dictionary) {
            if (word.length() != previousLength && previousLength != 0){
                break;
            }
            for (String num: decodedNumbers) {
                if (num.contains(word.toUpperCase())) {
                    substrings.add(word);
                    previousLength = word.length();
                    break;
                }
            }
        }

        return substrings;
    }

    // возвращает декодированные строки
    public ArrayList<String> getDecodedNumbers(int phoneNum) {
        Translation[] decodeList = Translation.values();
        String phoneStr = String.valueOf(phoneNum).replaceAll("[01]", "");

        ArrayList<String> decodedNums = new ArrayList<>();
        decodedNums.add(phoneStr);
        for (int i = 0; i < decodeList.length; i++) {
            String[] symbols = decodeList[i].getDecode().split("");
            String toReplace = String.valueOf(i+2);
            while (phoneStr.contains(toReplace)){
                phoneStr = phoneStr.replaceFirst(toReplace, "");
                decodedNums = replaceOneOnSeveral(decodedNums, toReplace, symbols);
            }
        }

        return decodedNums;
    }

    // заменяет в каждом из слов массива нужный символ на каждый символ
    // из массива replacers. В итоге, если в слове был такой символ, то
    // из одной строки получаем replacers.size() строк.
    private ArrayList<String> replaceOneOnSeveral(ArrayList<String> nums, String toReplace, String[] replacers) {
        ArrayList<String> replaced = new ArrayList<>();

        for (String num: nums) {
            for (String replacer : replacers) {
                replaced.add(num.replaceFirst(toReplace, replacer));
            }
        }

        return replaced;
    }

    public ArrayList<String> getFileArray(String filePath) throws IOException {
        FileReader sonnetStream = new FileReader(filePath); // create stream from file
        Scanner fileScanner = new Scanner(sonnetStream); // wrap up stream by scanner
        ArrayList<String> fileStrings = new ArrayList<>();

        while (fileScanner.hasNextLine()) { // while not all lines are read
            fileStrings.add(fileScanner.nextLine());
        }

        fileStrings.sort(Comparator.comparingInt(String::length).reversed());

        return fileStrings;
    }

    public void setDictionary(ArrayList<String> dictionary) {
        this.dictionary = dictionary;
    }
}
