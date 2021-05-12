package arrays.onesizesort.task1;

import java.util.Scanner;

public class Task1 {
    /*
    . Заданы два одномерных массива с различным количеством элементов и натуральное число k.
     Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
     при этом не используя дополнительный массив.

     int [] array1 = {1(0)     2(1)     3(2)      4(3)       5(k)   6(k+1)) ;
     int [] array2 = {10    20  30};
     int [] newarray = {1   2   3   4   5   10  20  30  6};
      */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array 1 length");
        int l1 = scanner.nextInt();
        System.out.println("input array 2 length");
        int l2 = scanner.nextInt();
        System.out.println("input K (must be less then array1.length)");
        int k = scanner.nextInt();

        int[] array1 = createArray1(l1);
        int[] array2 = createArray2(l2);
        printArray(array1);
        System.out.println();
        printArray(array2);
        System.out.println();
        System.out.println("New Array");
        printArray1FirstPart(array1, k);
        printArray(array2);
        printArray1SecondPart(array1, k);


    }

    public static int[] createArray1(int l1) {
        int[] array1 = new int[l1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        return array1;
    }

    public static int[] createArray2(int l2) {
        int[] array2 = new int[l2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }
        return array2;
    }

    public static void printArray1FirstPart(int[] array1, int k) {
        if (k >= array1.length - 1) {
            System.out.println("\n incorrect input");
        } else {
            for (int i = 0; i <= k; i++) {
                System.out.print(array1[i] + " ");
            }
        }
    }

    public static void printArray1SecondPart(int[] array1, int k) {
        if (k >= array1.length - 1) {
            System.out.println("\nincorrect input");
        } else {
            for (int i = k + 1; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }
        }
    }

    public static void printArray(int[] array) {
        for (int ar : array) {
            System.out.print(ar + " ");
        }
    }
}
