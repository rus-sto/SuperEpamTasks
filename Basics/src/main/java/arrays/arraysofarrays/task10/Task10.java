package arrays.arraysofarrays.task10;

import java.util.Scanner;

public class Task10 {
    /*
    10. Найти положительные элементы главной диагонали квадратной матрицы
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size N");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
//        createArray(array);
        printPositiveElementsOFMain(createArray(array));

    }

    static int[][] createArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (5 + 5) - 5);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        return array;
    }

    static void printPositiveElementsOFMain(int[][] array) {
        System.out.println("Positive elements of main diagonal");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) && (array[i][j] > 0)){
                    System.out.print (array[i][j] + " ");
                }
            }
        }
    }
}
