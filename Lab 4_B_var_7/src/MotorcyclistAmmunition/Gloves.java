package MotorcyclistAmmunition;

//класс перчатки наследуемый от амуниции
public class Gloves extends Ammunition
{
    //конструктор по умолчанию
    public Gloves ()
    {

    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Перчатки, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

