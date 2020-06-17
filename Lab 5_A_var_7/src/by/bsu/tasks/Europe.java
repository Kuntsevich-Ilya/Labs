package by.bsu.tasks;

import java.io.*;
import java.util.ArrayList;

//основной класс Европа
public class Europe {

    //массив содержащий различные века истории Европы
    private ArrayList<Century> centuries = new ArrayList<>();

    //конструктор по умолчанию
    public Europe() {
        //заполняем массив с 11 века по 20 из файла
        centuries.add(new Century("data"+ File.separator +"input_c11.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c12.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c13.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c14.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c15.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c16.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c17.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c18.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c19.txt"));
        centuries.add(new Century("data"+ File.separator +"input_c20.txt"));
    }

    //статический вложенный класс век
    public static class Century
    {
        //массив содержащий самые большие 5 стран в определенный момент истории Европы
        private ArrayList<Country> topCountry = new ArrayList<>();

        //внутренний класс страна
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

        //конструктор с параметром(названием файла, откуда брать информацию)
        public Century(String file) {
            //считываем информацию о каждой стране и заполняем массив
            try(FileReader reader = new FileReader(file))
            {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String name;
                double population;
                for (int i = 0; i < 5; i++)
                {
                    name = bufferedReader.readLine();
                    population = Double.parseDouble(bufferedReader.readLine());
                    topCountry.add(new Country(name, population));
                }
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

        }

        //перегрузка оператора toString для века
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("");
            sb.append("The 5 biggest country: \n").append(topCountry);
            sb.append('\n');
            return sb.toString();
        }
    }

    //метод выводящий на консоль информацию об определенном веке истории Европы
    public void show(int i)
    {
        System.out.println(centuries.get(i).toString());
    }

    //перегрузка метода toString для Европы
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Europe\n");
        for (int i = 0; i < 10; i++)
        {
            sb.append("Century ").append(i+11).append('\n');
            sb.append(centuries.get(i).toString());
        }
        sb.append('\n');
        return sb.toString();
    }
}