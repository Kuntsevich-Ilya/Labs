package by.bsu.tasks.ammunition;

//класс ботинки наследуемый от амуниции
public class Boots extends Ammunition
{
    //устанавливаем вес и цену ботинок в конструкторе
    public Boots ()
    {
        setWeight(0.4);
        setCost(348);
    }
    //перегруженный toString
    @Override
    public String toString() {
        return "Название - Ботинки, " + "Вес: " + getWeight() + "кг " + "Цена: " + getCost() + " бел. рублей";
    }
}
