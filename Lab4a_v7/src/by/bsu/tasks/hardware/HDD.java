package by.bsu.tasks.hardware;

//Класс Винчестер, реальзует интерфейс клонирования объектов
public class HDD implements Cloneable {
    //Размер винчестера
    private int size;
    //Скорость чтения данных
    private int readSpeed;
    //Скорость записи данных
    private int writeSpeed;

    //Конструктор по умолчанию
    public HDD() {
        this.size = 0;
        this.readSpeed = 0;
        this.writeSpeed = 0;
    }

    //Конструктор с параметрами
    public HDD(int size, int readSpeed, int writeSpeed) {
        this.size = size;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
    }

    //Конструктор копирования
    public HDD(HDD hdd) {
        this.size = hdd.size;
        this.readSpeed = hdd.readSpeed;
        this.writeSpeed = hdd.writeSpeed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    //Переопределение метода сравнения для объектов класса HDD
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HDD that = (HDD) o;

        if (size != that.size) return false;
        if (readSpeed != that.readSpeed) return false;
        return writeSpeed == that.writeSpeed;
    }

    //Переопределение метода сравнения для получения хеш-кода объекта класса HDD
    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + readSpeed;
        result = 31 * result + writeSpeed;
        return result;
    }

    //Переопределение метода для получения данных объекта в виде строки
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HardDiskDrive{");
        sb.append("size=").append(size);
        sb.append(", readSpeed=").append(readSpeed);
        sb.append(", writeSpeed=").append(writeSpeed);
        sb.append('}');
        return sb.toString();
    }

    //Переопределение метода для создания копии объекта
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}