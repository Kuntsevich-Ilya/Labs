package MotorcyclistAmmunition;

//класс куртка наследуемый от амуниции
public class Jacket extends Ammunition
{
    //конструктор по умолчанию
    public Jacket ()
    {

    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Куртка, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

