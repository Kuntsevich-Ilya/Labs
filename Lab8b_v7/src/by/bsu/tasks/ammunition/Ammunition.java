package by.bsu.tasks.ammunition;

//базовый класс амуниции мотоциклиста
public class Ammunition
{
    private double weight;
    private double cost;
    //конструктор по умолчанию
    public Ammunition()
    {
        this.weight = 0;
        this.cost = 0;
    }
    //конструктор с параметрами вес и цена
    public Ammunition(double weight, double cost)
    {
        if (weight < 0 || cost < 0) {
            throw new IllegalArgumentException();
        }
        this.weight = weight;
        this.cost = cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException();
        }
        this.cost = cost;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException();
        }
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

}



