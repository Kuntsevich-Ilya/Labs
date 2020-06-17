package by.bsu.tasks.hardware;

public class DiskStorage implements Cloneable {
    //Скорость чтения данных
    private int readSpeed;
    //Скорость записи данных
    private int writeSpeed;

    //Конструктор по умолчанию
    public DiskStorage() {
        this.readSpeed = 0;
        this.writeSpeed = 0;
    }

    //Конструктор с параметрами
    public DiskStorage(int readSpeed, int writeSpeed) {
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
    }

    //Конструктор копирования
    public DiskStorage(DiskStorage ds) {
        this.readSpeed = ds.readSpeed;
        this.writeSpeed = ds.writeSpeed;
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

    //Переопределение метода сравнения для объектов класса DiskStorage
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiskStorage that = (DiskStorage) o;

        if (readSpeed != that.readSpeed) return false;
        return writeSpeed == that.writeSpeed;
    }

    //Переопределение метода сравнения для получения хеш-кода объекта класса DiskStorage
    @Override
    public int hashCode() {
        int result = readSpeed;
        result = 31 * result + writeSpeed;
        return result;
    }

    //Переопределение метода для получения данных объекта в виде строки
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DiskStorage{");
        sb.append("readSpeed=").append(readSpeed);
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
