package by.bsu.tasks;

import MotorcyclistAmmunition.*;

import java.io.*;

public class InputData {
    //заполняем объект класса шлем данными о стоимости и весе товара
    private static void inputHelmet(Helmet helmet) {
        try (FileReader reader = new FileReader("data" + File.separator + "inputHelmet.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            helmet.setWeight(Double.parseDouble(bufferedReader.readLine()));
            helmet.setCost(Double.parseDouble(bufferedReader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //заполняем объект класса ботинки данными о стоимости и весе товара
    private static void inputBoots(Boots boots) {
        try (FileReader reader = new FileReader("data" + File.separator + "inputBoots.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            boots.setWeight(Double.parseDouble(bufferedReader.readLine()));
            boots.setCost(Double.parseDouble(bufferedReader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //заполняем объект класса перчатки данными о стоимости и весе товара
    private static void inputGloves(Gloves gloves) {
        try (FileReader reader = new FileReader("data" + File.separator + "inputGloves.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            gloves.setWeight(Double.parseDouble(bufferedReader.readLine()));
            gloves.setCost(Double.parseDouble(bufferedReader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //заполняем объект класса штаны данными о стоимости и весе товара
    private static void inputPants(Pants pants) {
        try (FileReader reader = new FileReader("data" + File.separator + "inputPants.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            pants.setWeight(Double.parseDouble(bufferedReader.readLine()));
            pants.setCost(Double.parseDouble(bufferedReader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //заполняем объект класса куртка данными о стоимости и весе товара
    private static void inputJacket(Jacket jacket) {
        try (FileReader reader = new FileReader("data" + File.separator + "inputJacket.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            jacket.setWeight(Double.parseDouble(bufferedReader.readLine()));
            jacket.setCost(Double.parseDouble(bufferedReader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //заполняем объект класса амуниция в зависимости от типа хранящегося в нем данными о стоимости и весе товара
    public static void inputAmmunition(Ammunition ammunition)  {
        if(ammunition instanceof Helmet)
        {
            inputHelmet((Helmet) ammunition);
        }
        if(ammunition instanceof Boots)
        {
            inputBoots((Boots) ammunition);
        }
        if(ammunition instanceof Gloves)
        {
            inputGloves((Gloves) ammunition);
        }
        if(ammunition instanceof Pants)
        {
            inputPants((Pants) ammunition);
        }
        if(ammunition instanceof Jacket)
        {
            inputJacket((Jacket) ammunition);
        }
    }

}
