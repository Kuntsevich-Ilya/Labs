package by.bsu.tasks.MotorcyclistAmmunition;

import by.bsu.tasks.MotorcyclistAmmunition.Ammunition;

//класс шлем наследуемый от амуниции
public class Helmet extends Ammunition {
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Шлем, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

