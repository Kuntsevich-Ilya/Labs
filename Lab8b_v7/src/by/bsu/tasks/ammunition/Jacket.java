package by.bsu.tasks.ammunition;

//класс куртка наследуемый от амуниции
public class Jacket extends Ammunition
{
    //устанавливаем вес и цену куртки в конструкторе
    public Jacket ()
    {
        setWeight(0.7);
        setCost(598);
    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Куртка, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

