package by.bsu.study.service;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class TextHandler {
    /*7. Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
    последовательностями подряд идущих букв оставить хотя бы один пробел.*/
    public String clean(String str){
        return str.trim() //убираем пробельные символы из начала и конца строки
                .replaceAll("[^a-zA-Z\\sа-яА-Я]","") //убираем все не входящее в этот диапазон
                .replaceAll("[\\s]{2,}", " "); //заменяем любые два пробела и больше на один
    }
}
