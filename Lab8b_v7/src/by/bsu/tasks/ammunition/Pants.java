package by.bsu.tasks.ammunition;

//класс штаны наследуемый от амуниции
public class Pants extends Ammunition
{
    //устанавливаем вес и цену штанов в конструкторе
    public Pants ()
    {
        setWeight(0.3);
        setCost(438);
    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Штаны, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

