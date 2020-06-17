package by.bsu.tasks.ammunition;

//класс перчатки наследуемый от амуниции
public class Gloves extends Ammunition
{
    //устанавливаем вес и цену перчаток в конструкторе
    public Gloves ()
    {
        setWeight(0.2);
        setCost(218);
    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Перчатки, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}

