package by.bsu.tasks;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    //переворот матрицы на 90 градусов против часовой стрелки
    public static void rotate90Left(int[][] array) {
        int[][] tmp = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                tmp[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = tmp[j][array.length - i - 1];
            }
        }
    }

    //переворот матрицы на 90 градусов против часовой стрелки определенное количество раз
    public static int[][] rotateLeft(int[][] array, int rotateCount) {

        int[][] rotateArray = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                rotateArray[i][j] = array[i][j];
            }
        }
        //вызываем функцию переворота переданное количество раз
        for (int k = 0; k < rotateCount; k++) {
            rotate90Left(rotateArray);
        }
        return rotateArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int n = Math.abs(input.nextInt());
        int[][] arr = new int[n][n];
        //заполняем матрицу случайными числами в диапазоне [-n;n]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * (2 * n + 1)) - n;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        while (true) {
            System.out.println("Для поворота на 90 градусов нажмите 1:");
            System.out.println("Для поворота на 180 градусов нажмите 2:");
            System.out.println("Для поворота на 270 градусов нажмите 3:");
            System.out.println("Для выхода нажмите любую цифру:");
            int a = input.nextInt();
            switch (a) {
                case 1:
                    arr = rotateLeft(arr, a);
                    System.out.println("Поворот на 90 градусов");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    arr = rotateLeft(arr, a);
                    System.out.println("Поворот на 180 градусов");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    arr = rotateLeft(arr, a);
                    System.out.println("Поворот на 270 градусов");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Программа завершена!");
                    System.exit(0);
            }
        }
    }
}
