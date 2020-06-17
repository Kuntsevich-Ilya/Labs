package by.bsu.tasks.MotorcyclistAmmunition;

//класс ботинки наследуемый от амуниции
public class Boots extends Ammunition {
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Ботинки, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}
