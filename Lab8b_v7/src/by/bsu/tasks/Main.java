package by.bsu.tasks;


import by.bsu.tasks.ammunition.*;
import by.bsu.tasks.exception.AskToBuyException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //функция заполняющая массив амуниции экземплярами наших классов
    public static ArrayList<Ammunition> fillAmmunition() {
        ArrayList<Ammunition> AllAmmunition = new ArrayList<>();
        AllAmmunition.add(new Helmet());
        AllAmmunition.add(new Boots());
        AllAmmunition.add(new Gloves());
        AllAmmunition.add(new Pants());
        AllAmmunition.add(new Jacket());
        return AllAmmunition;
    }

    //выводим отсортированный по весу массив нашей амуниции
    public static void sortWeight(ArrayList<Ammunition> Ammunition) {
        ArrayList<Ammunition> Amm = new ArrayList<>(Ammunition);
        for (int i = 0; i < Amm.size() - 1; i++) {
            for (int j = 0; j < Amm.size() - i - 1; j++) {
                if (Amm.get(j + 1).getWeight() < Amm.get(j).getWeight()) {
                    Ammunition temp = Amm.get(j);
                    Amm.set(j, Amm.get(j + 1));
                    Amm.set(j + 1, temp);
                }
            }
        }
        for (Ammunition ammunition : Amm) {
            System.out.println(ammunition.toString());
        }
    }

    public static void askToBuyAmmunition(Scanner in, ArrayList<Ammunition> motorcyclist , Ammunition amm)
            throws AskToBuyException {
        int a;

        System.out.println(amm.toString());
        System.out.println("Для покупки введите 1:");
        System.out.println("Для выхода введите 2:");

        try {
            a = in.nextInt();
        } catch (InputMismatchException e) {
            //пропускаем строку с ошибкой
            in.nextLine();
            throw new AskToBuyException("Введен символ вместо номера. Возврат в меню", -1);
        }

        if (a != 1 && a != 2) {
            throw new AskToBuyException("Выбран неправильный номер, возврат в меню. ", a);
        }

        motorcyclist.add(amm);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //массив экипировки мотоциклиста
        ArrayList<Ammunition> motorcyclist = new ArrayList<>();
        //массив всей амуниции
        ArrayList<Ammunition> AllAmmunition = fillAmmunition();

        while (true) {
            System.out.println("\nДля вывода информации о шлеме нажмите 1:");
            System.out.println("Для вывода информации о ботинках нажмите 2:");
            System.out.println("Для вывода информации о перчатках нажмите 3:");
            System.out.println("Для вывода информации о штанах нажмите 4:");
            System.out.println("Для вывода информации о куртке нажмите 5:");
            System.out.println("Для сортировки и вывода аммуниции по весу нажмите 6:");
            System.out.println("Для подсчета стоимости и вывода купленной аммуниции нажмите 7:");
            System.out.println("Для вывода аммуниции в заданном ценовом диапазоне нажмите 8:");
            System.out.println("Для выхода нажмите любую другую цифру:");
            boolean inputSuccess = false;
            int a = 0;
            while (!inputSuccess) {
                try {
                    a = in.nextInt();
                    inputSuccess = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода, введите еще раз:");
                    //пропускаем строку с ошибкой
                    in.nextLine();
                }
            }

            switch (a) {
                case 1:
                    //обращаемся к нулевому элементу нашего массива(шлем)
                    try {
                        askToBuyAmmunition(in, motorcyclist, AllAmmunition.get(0));
                    } catch (AskToBuyException e) {
                            System.out.println(e.getMessage() +
                                    ((e.getChoice() == -1) ? " " : "Неправильный номер - " + e.getChoice())
                            );
                    }
                    break;
                case 2:
                    //обращаемся к первому элементу нашего массива(ботинки)
                    try {
                        askToBuyAmmunition(in, motorcyclist, AllAmmunition.get(1));
                    } catch (AskToBuyException e) {
                        System.out.println(e.getMessage() +
                                ((e.getChoice() == -1) ? " " : "Неправильный номер - " + e.getChoice())
                        );
                    }
                    break;
                case 3:
                    //обращаемся ко второму элементу нашего массива(перчатки)
                    try {
                        askToBuyAmmunition(in, motorcyclist, AllAmmunition.get(2));
                    } catch (AskToBuyException e) {
                        System.out.println(e.getMessage() +
                                ((e.getChoice() == -1) ? " " : "Неправильный номер - " + e.getChoice())
                        );
                    }
                    break;
                case 4:
                    //обращаемся к третьему элементу нашего массива(штаны)
                    try {
                        askToBuyAmmunition(in, motorcyclist, AllAmmunition.get(3));
                    } catch (AskToBuyException e) {
                        System.out.println(e.getMessage() +
                                ((e.getChoice() == -1) ? " " : "Неправильный номер - " + e.getChoice())
                        );
                    }
                    break;
                case 5:
                    //обращаемся к четвертому элементу нашего массива(куртка)
                    try {
                        askToBuyAmmunition(in, motorcyclist, AllAmmunition.get(4));
                    } catch (AskToBuyException e) {
                        System.out.println(e.getMessage() +
                                ((e.getChoice() == -1) ? " " : "Неправильный номер - " + e.getChoice())
                        );
                    }
                    break;
                case 6:
                    sortWeight(AllAmmunition);
                    AllAmmunition.clear();
                    AllAmmunition = fillAmmunition();
                    break;
                case 7:
                    double sum = 0;
                    //считаем общую стоимость купленной экипировки
                    for (Ammunition ammunition : motorcyclist) {
                        sum += ammunition.getCost();
                        System.out.println(ammunition.toString());
                    }
                    System.out.println("Общая стоимость равна " + sum + " бел. рублей");
                    break;
                case 8:
                    double x = 0, y = 0;
                    System.out.println("Введите ценовой диапазон:");
                    System.out.println("От До:");
                    inputSuccess = false;
                    while (!inputSuccess) {
                        try {
                            x = in.nextDouble();
                            y = in.nextDouble();
                            inputSuccess = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Ошибка ввода, введите еще раз:");
                            //пропускаем строку с ошибкой
                            in.nextLine();
                        }
                    }
                    //выводим элементы амуниции в заданном ценовом диапазоне
                    for (Ammunition ammunition : AllAmmunition) {
                        if (ammunition.getCost() > x && ammunition.getCost() < y) {
                            System.out.println(ammunition.toString());
                        }
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
