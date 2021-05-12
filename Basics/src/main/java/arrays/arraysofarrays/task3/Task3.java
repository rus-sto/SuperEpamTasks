package arrays.arraysofarrays.task3;

import java.util.Scanner;

public class Task3 {
    /*
    . Дана матрица. Вывести k-ю строку и p-й столбец матрицы
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of colons ");
//        int n = scanner.nextInt();
//        System.out.println("Enter number of stings");
//        int m = scanner.nextInt();
        int[][] array = new int[3][5];
        System.out.println("Enter The number of needed colon n=k");
        int k = scanner.nextInt();
            System.out.println("Enter The number of needed sting m=p");
        int p = scanner.nextInt();
        if (k < 0 || k >= 5 || p < 0 || p >= 3 ){
            System.out.println("incorrect enter. Try again");}else{
        printTask(createArray(array),  k, p);}

//        try {
//            printTask(createArray(array),  k, p);
//
//        } catch (Exception e) {
//            System.out.println("Make correct input");
//
//        }


    }

    static int[][] createArray(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (6 - 1) + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    static void printTask(int[][] array, int k, int p) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                if (i == p) {
                    System.out.print(" " + array[i][j] + " ");
                }
                if (j == k) {
                    System.out.print("\n " + array[i][j] + " ");
                }
            }
        }
    }
}
