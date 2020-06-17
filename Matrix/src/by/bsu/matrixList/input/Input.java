package by.bsu.matrixList.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Input {
    public static List<Integer> inputList(String file) {
        List<Integer> list = new ArrayList<>();
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)) {   // выполняем считывание с помощью буффера
            String regex = "(\\s+)";      // разделитель, с помощью которого строку разбиваем на отдельные числа
            for(int i=0; i<5 ; i++) {                                // считываем матрицу из файла
                String line = bufferedReader.readLine();
                String lineNotZero = line.replaceAll("0", ""); // здесь все нули удаляем
                String[] arrayString = lineNotZero.split(regex);     //получаем массив слов , которые не являются нулями
                int size = arrayString.length;
                int[] arrayInt = new int[size];
                for (int j = 0; j < size; j++) {
                    arrayInt[j] = Integer.parseInt(arrayString[j]);   //получаем из массива слов массив ненулевых чисел
                }
                for (int j = 0; j < size; j++) {
                    list.add(arrayInt[j]);   //добавляем все ненулевые числа в массив
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

