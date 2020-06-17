package MotorcyclistAmmunition;

//класс штаны наследуемый от амуниции
public class Pants extends Ammunition
{
    //конструктор по умолчанию
    public Pants ()
    {

    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Штаны, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

