package by.bsu.tasks.MotorcyclistAmmunition;

//класс штаны наследуемый от амуниции
public class Pants extends Ammunition {
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Штаны, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

