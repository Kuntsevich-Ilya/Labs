package MotorcyclistAmmunition;

//класс шлем наследуемый от амуниции
public class Helmet extends Ammunition
{
    //конструктор по умолчанию
    public Helmet ()
    {

    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Шлем, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

