package by.bsu.Stack;

import by.bsu.Stack.change.ChangeStack;
import by.bsu.Stack.readStack.ReadStack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/*Задать два стека, поменять информацию местами*/

public class Main {

    public static void main(String[] args) {
            Deque<String> firstStack = new ArrayDeque<>(ReadStack.read("data/input1.txt"));
            Deque<String> secondStack = new ArrayDeque<>(ReadStack.read("data/input2.txt"));
            System.out.println("Первый стек: ");
            System.out.println(firstStack);
            System.out.println("Второй стек: ");
            System.out.println(secondStack);
        ChangeStack.change(firstStack, secondStack);

    }
}
