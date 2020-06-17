package by.bsu.tasks.MotorcyclistAmmunition;

//класс перчатки наследуемый от амуниции
public class Gloves extends Ammunition {
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Перчатки, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

