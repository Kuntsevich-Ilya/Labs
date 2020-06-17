package by.bsu.tasks;

import by.bsu.tasks.hardware.CPU;
import by.bsu.tasks.hardware.DiskStorage;
import by.bsu.tasks.hardware.HDD;
import by.bsu.tasks.hardware.RAM;

import java.util.Objects;

//Класс Компьютер, реальзует интерфейс клонирования объектов
public class PC implements Cloneable {
    //Винчестер
    private HDD hdd;
    //Дисковод
    private DiskStorage diskStorage;
    //Оперативная память
    private RAM ram;
    //Процессор
    private CPU cpu;
    //Переменная для хранения состояния включен ли компьютер
    private boolean isEnabled;

    //Конструктор по умолчанию
    public PC() {
        this.hdd = new HDD();
        this.diskStorage = new DiskStorage();
        this.ram = new RAM();
        this.cpu = new CPU();
        this.isEnabled = false;
    }

    //Конструктор с параметрами
    public PC(HDD hdd, DiskStorage diskStorage, RAM ram, CPU cpu) {
        //Записываем в переменные копии объектов
        try {
            this.hdd = (HDD) hdd.clone();
            this.diskStorage = (DiskStorage) diskStorage.clone();
            this.ram = (RAM) ram.clone();
            this.cpu = (CPU) cpu.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        this.isEnabled = false;
    }

    //Конструктор копирования
    public PC(PC pc) {
        //Вызываем конструктор с параметрами
        this(pc.hdd, pc.diskStorage, pc.ram, pc.cpu);
        this.isEnabled = pc.isEnabled;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        try {
            this.hdd = (HDD) hdd.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public DiskStorage getDiskStorage() {
        return diskStorage;
    }

    public void setDiskStorage(DiskStorage diskStorage) {
        try {
            this.diskStorage = (DiskStorage) diskStorage.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        try {
            this.ram = (RAM) ram.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        try {
            this.cpu = (CPU) cpu.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    //Функция для включения компьютера
    public void switchOn() throws Exception {
        //Проверяем что в компьютере есть все компоненты
        if ((this.hdd == null) || (this.diskStorage == null) || (this.ram == null) || (this.cpu == null)) {
            throw new Exception("Не хватает компонент для включения компьютера");
        }
        //Проверка на то, что компьютер был выключен
        if (this.isEnabled) {
            throw new Exception("Компьютер был уже включен");
        }
        this.isEnabled = true;
        System.out.println("Компьютер включен");
    }

    //Функция для выключения компьютера
    public void switchOff() throws Exception {
        //Проврека на то, что компьютер был включен
        if (!this.isEnabled){
            throw new Exception("Компьютер уже выключен");
        }
        this.isEnabled = false;
        System.out.println("Компьютер выключен");
    }

    //Функция для вывода размера винчестера
    public void printHDDSize() throws Exception {
        //Проврека на то, что компьютер был включен
        if (!this.isEnabled){
            throw new Exception("Сначала включите компьютер");
        }
        System.out.println("Размер винчестера: " + this.hdd.getSize());
    }

    //Функция для проверки на вирусы
    public boolean checkViruses() throws Exception {
        //Проврека на то, что компьютер был включен
        if (!this.isEnabled){
            throw new Exception("Сначала включите компьютер");
        }
        System.out.println("Вирусов не обнаружено");
        return true;
    }

    //Переопределение метода сравнения для объектов класса PC
    @Override
    public boolean equals(Object o) {
        //Если передали этот же объект
        if (this == o) return true;
        //Если переданный объект null или классы объектов не совпадают
        if (o == null || getClass() != o.getClass()) return false;

        PC pc = (PC) o;

        //Проверяем совпадение полей
        if (isEnabled != pc.isEnabled) return false;
        if (!Objects.equals(hdd, pc.hdd)) return false;
        if (!Objects.equals(diskStorage, pc.diskStorage)) return false;
        if (!Objects.equals(ram, pc.ram)) return false;
        return Objects.equals(cpu, pc.cpu);
    }

    //Переопределение метода сравнения для получения хеш-кода объекта класса PC
    @Override
    public int hashCode() {
        int result = hdd != null ? hdd.hashCode() : 0;
        result = 31 * result + (diskStorage != null ? diskStorage.hashCode() : 0);
        result = 31 * result + (ram != null ? ram.hashCode() : 0);
        result = 31 * result + (cpu != null ? cpu.hashCode() : 0);
        result = 31 * result + (isEnabled ? 1 : 0);
        return result;
    }

    //Переопределение метода для получения данных объекта в виде строки
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PC{");
        sb.append("hdd=").append(hdd);
        sb.append(", diskStorage=").append(diskStorage);
        sb.append(", ram=").append(ram);
        sb.append(", cpu=").append(cpu);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append('}');
        return sb.toString();
    }

    //Переопределение метода для создания копии объекта
    @Override
    public PC clone() {
        PC pc = null;
        try {
            pc = (PC) super.clone();
            pc.hdd = (HDD) this.hdd.clone();
            pc.diskStorage = (DiskStorage) this.diskStorage.clone();
            pc.ram = (RAM) this.ram.clone();
            pc.cpu = (CPU) this.cpu.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pc;
    }
}
