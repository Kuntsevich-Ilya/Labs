package by.bsu.tasks.MotorcyclistAmmunition;

//класс куртка наследуемый от амуниции
public class Jacket extends Ammunition {
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Куртка, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

