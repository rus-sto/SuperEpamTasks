package arrays.arraysofarrays.task13;

import java.util.Scanner;

public class Task13 {
    /*
    13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Matrix size");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
            int[][] ma = createArray(array);
            printNewArray(ma);
//        sortArray(ma);
        printNewArray( sortArray(ma));
    }

    public static int[][] createArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (10 - 0) + 0);
//                System.out.print(array[i][j] + " ");
            }
//            System.out.println();
        }
        return array;
    }

    public static int[][] sortArray(int[][] array) {
//        System.out.println();
//        System.out.println("sorted array");
//        int max;
//        for (int j = 0; j < array[0].length; j++) {
//            for (int i = 0; i < array.length; i++) {
//                for (int k = i + 1; k < array.length; k++) {
//                    if (array[i][j] > array[k][j]) {
//                         max = array[i][j];
//                        array[i][j] = array[k][j];
//                        array[k][i] = max;
//                    }
//                }
////                System.out.print(array[i][j] + " ");
//            }
////            System.out.println();
//        }
//        return array;
        System.out.println("\narray in ascending order");
        int temp;

        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                for (int p = i + 1; p < array.length; p++) {

                    if (array[i][j] > array[p][j]) {
                        temp = array[i][j];
                        array[i][j] = array[p][j];
                        array[p][j] = temp;
                    }
                }
            }
        }
        return array;
    }
    public  static void printNewArray(int [][]array){
        System.out.println("new array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
    }}
}