package by.bsu.Stack.change;

import java.util.Deque;

//функция меняет два стека местами, в соответствии с тем принципом, по которому работает стек

public class ChangeStack {
    public static void change(Deque<String> firstStack, Deque<String> secondStack){
        int size = firstStack.size();                          //находим количество элементов в первом стеке
        String[] intermediate = new String[size];              // создаём и заполняем промежуточный массив элементами первого стека
        for (int i = 0; i < size; i++){
            intermediate[i] = firstStack.removeLast();
        }
        while(!secondStack.isEmpty()){                          // заполняем первый стек элементами второго
             firstStack.addLast(secondStack.removeLast());
         }
        for (int i = 0; i < size; i++){                         // заполняем второй массив элементами из массива
             secondStack.addLast(intermediate[i]);
        }
        System.out.println("Первый стек: ");
        System.out.println(firstStack);
        System.out.println("Вторпой стек: ");
        System.out.println(secondStack);
    }
}
