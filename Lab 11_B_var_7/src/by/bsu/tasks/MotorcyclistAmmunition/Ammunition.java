package by.bsu.tasks.MotorcyclistAmmunition;

//базовый класс амуниции мотоциклиста
public class Ammunition {
    private double weight;
    private double cost;
    //конструктор по умолчанию
    public Ammunition() {
        this.weight = 0;
        this.cost = 0;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}



