package by.bsu.tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //объект класса Scanner для ввода данных с консоли
        Scanner in = new Scanner(System.in);
        //создаем объект класса Европа
        Europe europe = new Europe();
        while(true)
        {
            System.out.println("Для вывода информации о странах Европы в 11 веке, нажмите 1:");
            System.out.println("Для вывода информации о странах Европы в 12 веке, нажмите 2:");
            System.out.println("Для вывода информации о странах Европы в 13 веке, нажмите 3:");
            System.out.println("Для вывода информации о странах Европы в 14 веке, нажмите 4:");
            System.out.println("Для вывода информации о странах Европы в 15 веке, нажмите 5:");
            System.out.println("Для вывода информации о странах Европы в 16 веке, нажмите 6:");
            System.out.println("Для вывода информации о странах Европы в 17 веке, нажмите 7:");
            System.out.println("Для вывода информации о странах Европы в 18 веке, нажмите 8:");
            System.out.println("Для вывода информации о странах Европы в 19 веке, нажмите 9:");
            System.out.println("Для вывода информации о странах Европы в 20 веке, нажмите 10:");
            System.out.println("Для вывода информации о странах Европы c 11 векa по 20 век сразу, нажмите 11:");
            System.out.println("Для выхода, нажмите 0:");
            int i = in.nextInt();
            switch(i)
            {
                case 1:
                    europe.show(i-1);
                    break;
                case 2:
                    europe.show(i-1);
                    break;
                case 3:
                    europe.show(i-1);
                    break;
                case 4:
                    europe.show(i-1);
                    break;
                case 5:
                    europe.show(i-1);
                    break;
                case 6:
                    europe.show(i-1);
                    break;
                case 7:
                    europe.show(i-1);
                    break;
                case 8:
                    europe.show(i-1);
                    break;
                case 9:
                    europe.show(i-1);
                    break;
                case 10:
                    europe.show(i-1);
                    break;
                case 11:
                    System.out.println(europe.toString()
                    );
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
