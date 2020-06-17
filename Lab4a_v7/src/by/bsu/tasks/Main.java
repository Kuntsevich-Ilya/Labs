package by.bsu.tasks;

import by.bsu.tasks.hardware.CPU;
import by.bsu.tasks.hardware.DiskStorage;
import by.bsu.tasks.hardware.HDD;
import by.bsu.tasks.hardware.RAM;

public class Main {

    public static void main(String[] args) {
        //Создаем объект класса PC и заполняем его данными
        PC pc = new PC(new HDD(1024, 140, 140),
                        new DiskStorage(24,24),
                        new RAM(16, "DDR4"),
                        new CPU(3200, 4100, 4));
        //Вызываем функция проверки на вирусы, она не сработает пока не включен компьютер
        pc.checkViruses();
        //Вызываем функцию включение компьютера
        pc.switchOn();
        //Вызываем функцию вывода размера винчестера
        pc.printHDDSize();
        //Вызываем функцию проверки на вирусы
        pc.checkViruses();
        //Выключаем компьютер
        pc.switchOff();
    }
}
