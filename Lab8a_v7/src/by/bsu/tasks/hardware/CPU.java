package by.bsu.tasks.hardware;

public class CPU implements Cloneable {
    //Минимальная частота процессора
    private int minClockFrequency;
    //Максимальная частота процессора
    private int maxClockFrequency;
    //Количество ядер
    private int countCores;

    //Конструктор по умолчанию
    public CPU() {
        this.minClockFrequency=0;
        this.maxClockFrequency=0;
        this.countCores=0;
    }

    //Конструктор с параметрами
    public CPU(int minClockFrequency, int maxClockFrequency, int countCores) {
        if (minClockFrequency <= 0 || maxClockFrequency <= 0 || countCores <= 0) {
            throw new IllegalArgumentException();
        }
        this.minClockFrequency = minClockFrequency;
        this.maxClockFrequency = maxClockFrequency;
        this.countCores = countCores;
    }

    //Конструктор копирования
    public CPU(CPU cpu) {
        this.minClockFrequency=cpu.minClockFrequency;
        this.maxClockFrequency=cpu.maxClockFrequency;
        this.countCores=cpu.countCores;
    }

    public int getMinClockFrequency() {
        return minClockFrequency;
    }

    public void setMinClockFrequency(int minClockFrequency) {
        this.minClockFrequency = minClockFrequency;
    }

    public int getMaxClockFrequency() {
        return maxClockFrequency;
    }

    public void setMaxClockFrequency(int maxClockFrequency) {
        this.maxClockFrequency = maxClockFrequency;
    }

    public int getCountCores() {
        return countCores;
    }

    public void setCountCores(int countCores) {
        this.countCores = countCores;
    }

    //Переопределение метода сравнения для объектов класса CPU
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPU cpu = (CPU) o;

        if (minClockFrequency != cpu.minClockFrequency) return false;
        if (maxClockFrequency != cpu.maxClockFrequency) return false;
        return countCores == cpu.countCores;
    }

    //Переопределение метода сравнения для получения хеш-кода объекта класса CPU
    @Override
    public int hashCode() {
        int result = minClockFrequency;
        result = 31 * result + maxClockFrequency;
        result = 31 * result + countCores;
        return result;
    }

    //Переопределение метода для получения данных объекта в виде строки
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CPU{");
        sb.append("minClockFrequency=").append(minClockFrequency);
        sb.append(", maxClockFrequency=").append(maxClockFrequency);
        sb.append(", countCores=").append(countCores);
        sb.append('}');
        return sb.toString();
    }

    //Переопределение метода для создания копии объекта
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
