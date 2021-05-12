package arrays.onesize.task9;

import java.util.Scanner;

public class Task9 {
    /*
     В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
    */
    static void mathSolution(int[] array, int a, int b, int n) {
//        int a = 0;
//        int b = 10;
//        int[] array = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = a + (int) (Math.random() * b);
            System.out.print(array[i] + " ");
        }

        int countMax = 1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (j == array.length - 1) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                array2[i] = count;
                if (count > countMax) {
                    countMax = count;
                }


//            System.out.println();
//            System.out.println("for element with index i = " + i + " counter = " + count);


//            System.out.println("array2[i] from index " + i +array2[i]);
                System.out.print("\n[" + i + "]: " + array2[i] + ",");

            }
        }}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter min and max value of array");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        mathSolution(array, a, b, n);
    }
}
