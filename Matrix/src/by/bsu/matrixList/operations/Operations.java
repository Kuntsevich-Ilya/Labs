package by.bsu.matrixList.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Operations {
    public static int composition(List<Integer> list1, List<Integer> list2){
        Iterator<Integer> integerIterator1 = list1.iterator();   //создаём два итератора(счётчика) с помощью которых
        Iterator<Integer> integerIterator2 = list2.iterator();    // можем бегать по спискам
        int result = 0;
        while (integerIterator1.hasNext() && integerIterator2.hasNext()){
            result += ((int)integerIterator1.next())*((int)integerIterator2.next());  // считаем произведение
        }
        return result;
    }

    public static List<Integer> sum(List<Integer> list1, List<Integer> list2){
        Iterator<Integer> integerIterator1 = list1.iterator();
        Iterator<Integer> integerIterator2 = list2.iterator();
        List<Integer> result = new ArrayList<>();     // про итераторы то, что и выше, а тут создаём список для результата сложения
        while (integerIterator1.hasNext() && integerIterator2.hasNext()){
            result.add(((int)integerIterator1.next())+((int)integerIterator2.next()));  // считаем сложение
        }
        return result;
    }
}
