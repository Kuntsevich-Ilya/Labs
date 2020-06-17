package by.bsu.Stack.readStack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReadStack {
    public static Deque<String> read(String file) {
        Deque<String> Stack = new ArrayDeque<>();
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)) {   // считываем данные из файла с помощью буффера
            String line = bufferedReader.readLine();         //считываем всю строку из файла
            String regex = "(\\s+)";
            String[] lineSplit = line.split(regex); // с помощью пробелов разбиваем строку на массив слов
            int size = lineSplit.length;             // количество слов в полученном массиве
            for (int i = 0; i < size; i++) {
                Stack.addLast(lineSplit[i]);      // заполняем стек
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Stack;
    }
}
