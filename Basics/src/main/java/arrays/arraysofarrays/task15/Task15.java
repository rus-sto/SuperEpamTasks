package arrays.arraysofarrays.task15;

import java.util.Scanner;

public class Task15 {
    /*
    15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of Strings");
        int n = scanner.nextInt();
        int m = (int) (Math.random() * (10 - (n + 1)) + n);
        int[][] array = new int[m][n];
              printNewArray(changeElementsForMax(createArray(array),findMaxElement(array)));

    }

    public static int[][] createArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - 0) + 0);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static int findMaxElement(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("\nMax = " + max);
        return max;
    }

    public static int[][] changeElementsForMax(int[][] array, int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }
        return array;
    }

    public static void printNewArray(int[][] array) {
        for (int[] ar : array) {
            for (int arr : ar) {
                System.out.print(arr + "\t");
            }
            System.out.println();
        }
    }
}
