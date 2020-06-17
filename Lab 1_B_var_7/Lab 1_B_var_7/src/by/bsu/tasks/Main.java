package by.bsu.tasks;
import java.util.Scanner;

public class Main {
    //принимает 2 числа и возвращает их НОД
    public static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }
    //принимает 2 числа и возвращает их НОК
    public static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = in.nextInt();
        System.out.println("Введите массив");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++)
        {
            arr[i] = in.nextInt();
        }
        //присваеваем нашим НОД и НОК первый элемент массива
        long gcdAll = arr[0], lcmAll = arr[0];
        //вызываем поиск НОД и НОк для всех элементов массива
        for (int i = 0; i < n ; i++)
        {
            gcdAll = gcd(gcdAll, arr[i]);
            lcmAll = lcm(lcmAll, arr[i]);
        }
        //выводим наши общие НОД и НОк
        System.out.println("Наибольший общий делитель равен " + gcdAll);
        System.out.println("Наименьшее общее кратное равно " + lcmAll);
    }
}
