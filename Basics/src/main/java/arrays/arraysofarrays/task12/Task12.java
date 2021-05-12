package arrays.arraysofarrays.task12;

import java.util.Scanner;

public class Task12 {
    /*
    12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    2 5 2       2 2 5
    3 7 7       3 7 7
    5 6 1       1 5 6

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input matrix size");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        //    createArray(array);
        sortArrayByStringsElements(createArray(array));
    }

    public static int[][] createArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - 0) + 0);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        return array;
    }

    public static int[][] sortArrayByStringsElements(int[][] array) {
        System.out.println(" sorted matrix");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j+1; k < array[i].length; k++) {
                    if (array[i][j] > array[i][k]) {
                        int max = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = max;

                    }}
                    System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        return array;
    }
}