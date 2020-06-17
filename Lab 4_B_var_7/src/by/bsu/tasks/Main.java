package by.bsu.tasks;

import MotorcyclistAmmunition.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //функция заполняющая массив амуниции экземплярами наших классов
    public static ArrayList<Ammunition> fillAmmunition()  {
        ArrayList<Ammunition> AllAmmunition = new ArrayList<Ammunition>();
        AllAmmunition.add(new Helmet());
        AllAmmunition.add(new Boots());
        AllAmmunition.add(new Gloves());
        AllAmmunition.add(new Pants());
        AllAmmunition.add(new Jacket());
        for(Ammunition ammunition : AllAmmunition)
        {
            InputData.inputAmmunition(ammunition);
        }
        return AllAmmunition;
    }

    //выводим отсортированный по весу массив нашей амуниции
    public static void sortWeight(ArrayList<Ammunition> Ammunition) {
        ArrayList<Ammunition> Amm = Ammunition;
        for (int i = 0; i < Amm.size() - 1; i++) {
            for (int j = 0; j < Amm.size() - i - 1; j++) {
                if (Amm.get(j + 1).getWeight() < Amm.get(j).getWeight()) {
                    Ammunition temp = Amm.get(j);
                    Amm.set(j, Amm.get(j + 1));
                    Amm.set(j + 1, temp);
                }
            }
        }
        for (int i = 0; i < Amm.size(); i++) {
            System.out.println(Amm.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //массив экипировки мотоциклиста
        ArrayList<Ammunition> motorcyclist = new ArrayList<Ammunition>();
        //массив всей амуниции
        ArrayList<Ammunition> AllAmmunition = fillAmmunition();

        while (true) {
            System.out.println("Для вывода информации о шлеме нажмите 1:");
            System.out.println("Для вывода информации о ботинках нажмите 2:");
            System.out.println("Для вывода информации о перчатках нажмите 3:");
            System.out.println("Для вывода информации о штанах нажмите 4:");
            System.out.println("Для вывода информации о куртке нажмите 5:");
            System.out.println("Для сортировки и вывода аммуниции по весу нажмите 6:");
            System.out.println("Для подсчета стоимости и вывода купленной аммуниции нажмите 7:");
            System.out.println("Для вывода аммуниции в заданном ценовом диапазоне нажмите 8:");
            System.out.println("Для выхода нажмите любую другую цифру:");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    //обращаемся к нулевому элементу нашего массива(шлем)
                    System.out.println(AllAmmunition.get(0).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    switch (a) {
                        case 1:
                            motorcyclist.add(AllAmmunition.get(0));
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    //обращаемся к первому элементу нашего массива(ботинки)
                    System.out.println(AllAmmunition.get(1).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    switch (a) {
                        case 1:
                            motorcyclist.add(AllAmmunition.get(1));
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    //обращаемся ко второму элементу нашего массива(перчатки)
                    System.out.println(AllAmmunition.get(2).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    switch (a) {
                        case 1:
                            motorcyclist.add(AllAmmunition.get(2));
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    //обращаемся к третьему элементу нашего массива(штаны)
                    System.out.println(AllAmmunition.get(3).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    switch (a) {
                        case 1:
                            motorcyclist.add(AllAmmunition.get(3));
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    //обращаемся к четвертому элементу нашего массива(куртка)
                    System.out.println(AllAmmunition.get(4).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    switch (a) {
                        case 1:
                            motorcyclist.add(AllAmmunition.get(4));
                            break;
                        default:
                            break;
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
                    for (int i = 0; i < motorcyclist.size(); i++) {
                        sum += motorcyclist.get(i).getCost();
                        System.out.println(motorcyclist.get(i).toString());
                    }
                    System.out.println("Общая стоимость равна " + sum + " бел. рублей");
                    break;
                case 8:
                    double x = 0, y = 0;
                    System.out.println("Введите ценовой диапазон:");
                    System.out.println("От До:");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    //выводим элементы амуниции в заданном ценовом диапазоне
                    for (int i = 0; i < AllAmmunition.size(); i++) {
                        if (AllAmmunition.get(i).getCost() > x && AllAmmunition.get(i).getCost() < y) {
                            System.out.println(AllAmmunition.get(i).toString());
                        }
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
