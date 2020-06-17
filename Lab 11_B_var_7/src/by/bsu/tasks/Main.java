package by.bsu.tasks;

import by.bsu.tasks.MotorcyclistAmmunition.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //функция заполняющая массив амуниции экземплярами наших классов
    public synchronized static ArrayList<Ammunition> fillAmmunition()  {
        ArrayList<Ammunition> allAmmunition = new ArrayList<>();
        allAmmunition.add(new Helmet());
        allAmmunition.add(new Boots());
        allAmmunition.add(new Gloves());
        allAmmunition.add(new Pants());
        allAmmunition.add(new Jacket());
        for(Ammunition ammunition : allAmmunition) {
            InputData.inputAmmunition(ammunition);
        }
        return allAmmunition;
    }

    // метод, показывающий работу аттрибута synchronized
    // если убрать synchronized, то в консоли будет кривой вывод
    public synchronized static void showAmmunition(ArrayList<Ammunition> amm, int i) {
        System.out.println("\nПроцесс " + i);
        for (Ammunition am: amm) {
            System.out.println(am.toString());
       }
    }

    //выводим отсортированный по весу массив нашей амуниции
    public static void sortWeight(ArrayList<Ammunition> amm) {
        for (int i = 0; i < amm.size() - 1; i++) {
            for (int j = 0; j < amm.size() - i - 1; j++) {
                if (amm.get(j + 1).getWeight() < amm.get(j).getWeight()) {
                    Ammunition temp = amm.get(j);
                    amm.set(j, amm.get(j + 1));
                    amm.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //массив экипировки мотоциклиста
        ArrayList<Ammunition> motorcyclist = new ArrayList<>();
        //массив всей амуниции
        ArrayList<Ammunition> allAmm = fillAmmunition();

        while (true) {
            System.out.println("\nДля вывода информации о шлеме нажмите 1:");
            System.out.println("Для вывода информации о ботинках нажмите 2:");
            System.out.println("Для вывода информации о перчатках нажмите 3:");
            System.out.println("Для вывода информации о штанах нажмите 4:");
            System.out.println("Для вывода информации о куртке нажмите 5:");
            System.out.println("Для сортировки и вывода аммуниции по весу нажмите 6:");
            System.out.println("Для подсчета стоимости и вывода купленной аммуниции нажмите 7:");
            System.out.println("Для вывода аммуниции в заданном ценовом диапазоне нажмите 8:");
            System.out.println("Для теста синхронизации нажмите 9:");
            System.out.println("Для выхода нажмите любую другую цифру:");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    System.out.println();
                    //обращаемся к нулевому элементу нашего массива(шлем)
                    System.out.println(allAmm.get(0).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    if (a == 1) {
                        motorcyclist.add(allAmm.get(0));
                        System.out.println("Покупка успешно добавлена в корзину!");
                        pause();
                    }
                    break;
                case 2:
                    System.out.println();
                    //обращаемся к первому элементу нашего массива(ботинки)
                    System.out.println(allAmm.get(1).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    if (a == 1) {
                        motorcyclist.add(allAmm.get(1));
                        System.out.println("Покупка успешно добавлена в корзину!");
                        pause();
                    }
                    break;
                case 3:
                    System.out.println();
                    //обращаемся ко второму элементу нашего массива(перчатки)
                    System.out.println(allAmm.get(2).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    if (a == 1) {
                        motorcyclist.add(allAmm.get(2));
                        System.out.println("Покупка успешно добавлена в корзину!");
                        pause();
                    }
                    break;
                case 4:
                    //обращаемся к третьему элементу нашего массива(штаны)
                    System.out.println();
                    System.out.println(allAmm.get(3).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    if (a == 1) {
                        motorcyclist.add(allAmm.get(3));
                        System.out.println("Покупка успешно добавлена в корзину!");
                        pause();
                    }
                    break;
                case 5:
                    System.out.println();
                    //обращаемся к четвертому элементу нашего массива(куртка)
                    System.out.println(allAmm.get(4).toString());
                    System.out.println("Для покупки введите 1:");
                    System.out.println("Для выхода введите 2:");
                    a = in.nextInt();
                    if (a == 1) {
                        motorcyclist.add(allAmm.get(4));
                        System.out.println("Покупка успешно добавлена в корзину!");
                        pause();
                    }
                    break;
                case 6:
                    sortWeight(allAmm);
                    System.out.println();
                    for (Ammunition ammunition : allAmm) {
                        System.out.println(ammunition.toString());
                    }
                    allAmm.clear();
                    allAmm = fillAmmunition();
                    pause();
                    break;
                case 7:
                    double sum = 0;
                    //считаем общую стоимость купленной экипировки
                    System.out.println();
                    for (Ammunition ammunition : motorcyclist) {
                        sum += ammunition.getCost();
                        System.out.println(ammunition.toString());
                    }
                    System.out.println("Общая стоимость равна " + sum + " бел. рублей");
                    pause();
                    break;
                case 8:
                    System.out.println("\nВведите ценовой диапазон:");
                    System.out.println("От До:");
                    double x = in.nextDouble();
                    double y = in.nextDouble();
                    //выводим элементы амуниции в заданном ценовом диапазоне
                    for (Ammunition ammunition : allAmm) {
                        if (ammunition.getCost() > x && ammunition.getCost() < y) {
                            System.out.println(ammunition.toString());
                        }
                    }
                    pause();
                    break;
                case 9:
                    System.out.println("Введите сколько процессов вывода информации из файлов нужно вызвать: ");
                    int num = in.nextInt();
                    // Создаем потоки
                    Thread[] processes = new Thread[num];
                    for (int i = 0; i < num; i++) {
                        int finalI = i + 1;
                        processes[i] = new Thread( () -> {
                            try {
                                // Отсрачиваем запуск процесса
                                Thread.sleep(new Random().nextInt(10));
                            } catch (InterruptedException ignored) { }
                            // вызываем synchronized метод
                            showAmmunition(fillAmmunition(), finalI);
                        });
                    }
                    // Запускаем созданные процессы
                    for (Thread process: processes) {
                        process.start();
                    }
                    pause();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static void pause(){
        System.out.print("Введите любой символ, чтобы продолжить...");
        new Scanner(System.in).next();
        System.out.println();
    }
}
