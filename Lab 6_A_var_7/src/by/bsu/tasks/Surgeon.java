package by.bsu.tasks;

//класс Хирург наследованный от интерфейса
public class Surgeon implements Doctor
{
    //поле имя
    private String Name;
    //поле опыт
    private int Experience;

    //конструктор по умолчанию
    public Surgeon()
    {
        this.Name = "";
        this.Experience = 0;
    }

    //конструктор с параметрами
    public Surgeon(String Name, int Experience)
    {
        this.Name = Name;
        this.Experience = Experience;
    }

    //возвращаем имя
    public String getName()
    {
        return Name;
    }

    //устанавливаем в поле имя переданный параметр
    public void setName(String Name) {
        this.Name = Name;
    }

    //перегрузка метода "лечить"
    @Override
    public void cure()
    {
        System.out.println("Вы успешно провели операцию!");
    }

    //перегрузка метода "обследовать"
    @Override
    public void examine() {
        System.out.println("Вы обследовали пациента и нашли болезнь!");
    }

    //возвращаем опыт
    public int getExperience()
    {
        return Experience;
    }

    //устанавливаем в поле опыт переданный параметр
    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    //перегрузка метода toString
    @Override
    public String toString() {
        return "Хирург " + Name + " с опытом " + Experience + " лет";
    }
}
