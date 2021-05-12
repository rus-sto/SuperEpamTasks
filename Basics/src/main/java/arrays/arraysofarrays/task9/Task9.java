package arrays.arraysofarrays.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Task9 {
    /*
    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
     */

    public static void main(String[] args) {
        //throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number of strings n");
        int n = scanner.nextInt();
        System.out.println("Input Number of colons m");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        System.out.println(n + m);
        //      createArray(array, n, m);
//        sumColon(createArray(array, n,m));
        maxColumn(sumColon(createArray(array, n, m)));
    }

    static int[][] createArray(int[][] array, int n, int m) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (8 - 0) + 0);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    //    static void sumColon(int[][] array) {
//        int sum = 0;
//
//
//    }
    static int[] sumColon(int[][] array) {
        System.out.println("sum of columns");
        int[] sumArray = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                sumArray[j] += array[i][j];

            }

            System.out.print(sumArray[j] + " ");

        }
        return sumArray;
    }

    static void maxColumn(int[] sumArray) {
        System.out.println();
        System.out.println(" The biggest column sum is - ");
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] > max) {
                max = sumArray[i];
                maxIndex = i;
            }
        }
        System.out.println("[ " + maxIndex + " ]");
    }
//    static int[] createSumOneLineArray(int[][] array, int m) {
//        int[] sumArray = new int[m];
//
//
//        for (int j = 0; j < array[0].length; j++) {
//            for (int i = 0; i < array.length; i++) {
//                sumArray[j] += array[i][j];
//                System.out.println(sumArray[j]);
//            }
//
//        }
//        return sumArray;
//    }


}