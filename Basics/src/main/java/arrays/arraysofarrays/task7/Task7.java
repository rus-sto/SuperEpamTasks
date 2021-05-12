package arrays.arraysofarrays.task7;

import java.util.Scanner;

public class Task7 {
    /*
    7. Сформировать квадратную матрицу порядка N по правилу:
            A[i,j] = sin ((i*i + j*j)/N
и подсчитать количество положительных элементов в ней.
{{1,2,3}, {4,5,6}}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size N");
        int n = scanner.nextInt();
        double[][] array = new double[n][n];
//        createArray(array,n);
        countPositive(createArray(array, n));

    }

    static double[][] createArray(double[][] array, int n) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.round(Math.sin((i * i + j * j) / n));
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        return array;
    }

    static void countPositive(double[][] array) {
        System.out.println();
        int count = 0;
        for (double[] ar : array) {
            for (double ar1 : ar) {
                if (ar1 > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
