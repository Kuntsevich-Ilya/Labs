package by.bsu.tasks;

public class Main {

    public static void main(String[] args) {
        //создаем объект класса Хирург
        Surgeon d1 = new Surgeon("Misha", 8);
        //создаем объект класса НейроХирург
        NeuroSurgeon d2 = new NeuroSurgeon("Denis", 15);
        //вызываем методы для Хирурга
        System.out.println(d1.toString());
        d1.examine();
        d1.cure();
        //вызываем методы для НейроХирурга
        System.out.println(d2.toString());
        d2.examine();
        d2.cure();
    }
}
