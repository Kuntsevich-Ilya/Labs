package by.bsu.tasks;

//класс НейроХирург наследованный от класса Хирург
public class NeuroSurgeon extends Surgeon
{

    //конструктор по умолчанию
    public NeuroSurgeon()
    {
        //вызываем конструткор базового класса
        super();
    }

    //конструктор с параметрами
    public NeuroSurgeon(String Name, int Experience)
    {
        //вызываем конструктор базового класса
        super(Name, Experience);
    }

    //перегрузка метода "лечить"
    @Override
    public void cure()
    {
        System.out.println("Вы успешно провели операцию на мозг!");
    }

    //перегрузка метода "обследовать"
    @Override
    public void examine() {
        System.out.println("Вы обследовали мозг пациента и нашли болезнь!");
    }

    //перегрузка метода toString
    @Override
    public String toString() {
        return "Нейрохирург " + super.getName() + " с опытом " + super.getExperience() + " лет";
    }

}
