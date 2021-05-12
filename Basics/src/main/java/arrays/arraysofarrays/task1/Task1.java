package arrays.arraysofarrays.task1;

import java.util.Scanner;

public class Task1 {
    /*
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of columns ");
        int n = scanner.nextInt();
        System.out.println("Enter number  of strings");
        int m = scanner.nextInt();
//        creatArray(n, m);

        printTask(creatArray(n,m));

    }

    static int[][] creatArray(int n, int m) {
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (9 - 1) + 1); //a=1, b=9, (int)Math.random()*(b-a)+a
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

//    static void printArray(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    static void printTask(int[][] array ) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0 && array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


