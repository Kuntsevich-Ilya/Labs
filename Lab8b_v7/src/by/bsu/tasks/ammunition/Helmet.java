package by.bsu.tasks.ammunition;

//класс шлем наследуемый от амуниции
public class Helmet extends Ammunition
{
    //устанавливаем вес и цену шлема в конструкторе
    public Helmet ()
    {
        setWeight(0.7);
        setCost(558);
    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Шлем, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

