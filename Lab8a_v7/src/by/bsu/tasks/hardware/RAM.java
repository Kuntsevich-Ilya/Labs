package by.bsu.tasks.hardware;

import java.util.Objects;

public class RAM implements Cloneable {
    //Количество памяти
    private int size;
    //Тип памяти
    private String type;

    //Конструктор по умолчанию
    public RAM() {
        this.size = 0;
        this.type = "";
    }

    //Конструктор с параметрами
    public RAM(int size, String type) {
        if (size <= 0){
            throw new IllegalArgumentException();
        }
        this.size = size;
        this.type = type;
    }

    //Конструктор копирования
    public RAM(RAM ram) {
        this.size = ram.size;
        this.type = ram.type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 0){
            throw new IllegalArgumentException();
        }
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Переопределение метода сравнения для объектов класса RAM
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RAM ram = (RAM) o;

        if (size != ram.size) return false;
        return Objects.equals(type, ram.type);
    }

    //Переопределение метода сравнения для получения хеш-кода объекта класса RAM
    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    //Переопределение метода для получения данных объекта в виде строки
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RAM{");
        sb.append("size=").append(size);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Переопределение метода для создания копии объекта
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
