package by.bsu.matrixList;

import by.bsu.matrixList.input.Input;
import by.bsu.matrixList.operations.Operations;

import java.util.ArrayList;
import java.util.List;

/*Во входном файле хранятся две разреженные матрицы — А и В. Построить
        списки СА и СВ, содержащие ненулевые элементы
        соответственно матриц А и В. Просматривая списки, вычислить: а) сумму
        S = A + B; б) произведение P = A × B.*/

public class Main {

    public static void main(String[] args) {
            List<Integer> CA = new ArrayList<>(Input.inputList("data/matrix1.txt"));
            List<Integer> CB = new ArrayList<>(Input.inputList("data/matrix2.txt"));
        System.out.println("Список A, полученный из первой разреженной матрицы: ");
            System.out.println(CA);
        System.out.println("Список B, полученный из второй разреженной матрицы: ");
            System.out.println(CB);
        System.out.println("Произведение A на B: ");
        int P = Operations.composition(CA, CB);
        System.out.println(P);
        System.out.println("Сумма A и B: ");
        List<Integer> S = new ArrayList<>(Operations.sum(CA,CB));
        System.out.println(S);

    }
}
