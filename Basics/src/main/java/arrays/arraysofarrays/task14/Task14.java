package arrays.arraysofarrays.task14;

import java.util.Scanner;

public class Task14 {
    /*
    14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of Strings");
        int n = scanner.nextInt();
        int m = (int) (Math.random() * (10 - (n + 1)) + n);
        int[][] array = new int[m][n];
        printArray(createArray(array));

    }

    public static int[][] createArray(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < j; i++) {
                array[i][j] = 1;

            }
            for (int i = 0; i > j; i++) {

                array[i][j] = 0;

            }
        }
        return array;

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
