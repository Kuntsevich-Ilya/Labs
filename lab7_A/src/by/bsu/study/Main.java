package by.bsu.study;

import by.bsu.study.service.TextHandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main menu = new Main();
        menu.cleanTextMenu();
    }

    private void cleanTextMenu(){
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        System.out.println("Lab 7. Work with strings\n------");
        System.out.print("Enter your text\n>> ");
        while (sc.hasNextLine()) {
            String next = sc.nextLine();
            // if entered empty line
            if(next.equals("")) {
                break;
            }
            text.append(next).append("\n");
        }
        TextHandler handler = new TextHandler();

        System.out.println("Renewed text:");
        System.out.println("\"" + handler.clean(text.toString()) + "\"");

        System.out.println("------");
    }
}
