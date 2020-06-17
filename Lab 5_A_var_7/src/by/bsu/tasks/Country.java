package by.bsu.tasks;

//класс страна
public class Country {
    //поле с названием страны
    private String name;
    //поле с численностью населения страны в миллионах
    private double population;

    //конструктор по умолчанию
    public Country() {
        this.name = "";
        this.population = 0;
    }

    //конструктор с параметрами
    public Country(String name, double population) {
        this.name = name;
        this.population = population;
    }

    //метод, устанавливающий в поле названия страны переданный параметр
    public void setName(String name) {
        this.name = name;
    }

    //метод, устанавливающий в поле численности населения страны переданный параметр
    public void setPopulation(double population) {
        this.population = population;
    }

    //возвращаем численность населения
    public double getPopulation() {
        return this.population;
    }

    //возвращаем название страны
    public String getName() {
        return this.name;
    }

    //перегрузка метода toString для страны
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Name = ").append(name);
        sb.append(", population = ").append(population);
        sb.append("M\n");
        return sb.toString();
    }
}
