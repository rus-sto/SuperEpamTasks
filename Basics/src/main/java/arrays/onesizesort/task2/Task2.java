package arrays.onesizesort.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*
    2. Даны две последовательности a1 <= a2 <= .... <=  an и b1 <= b2 <= ...<=  bm.
    Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
    Примечание. Дополнительный массив не использовать.
int [] array1 = {1,2,3,4,5};    135
int [] array2 = {4,6,8};         246000
1,2,3,4,4,5,6,8                  123456

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array 1 length");
        int n = scanner.nextInt();
        System.out.println("input array 2 length");
        int m = scanner.nextInt();

        int[] array1 = createArray1(n);
        int[] array2 = createArray2(n, m);

        printArray(array1);
        System.out.println();
        printArray(array2);
        System.out.println();
        System.out.println("New Array");
        addingArrays(array1, array2, m);
        printArray(array2);
        System.out.println();
        sortedArray(array2);
        printArray(array2);
    }

    public static int[] createArray1(int n) {
        int[] array1 = new int[n];
        array1[0] = (int) (Math.random() * 10);
        for (int i = 1; i < array1.length; i++) {
            array1[i] = array1[i - 1] + 1;
        }
        return array1;
    }

    public static int[] createArray2(int n, int m) {
        int[] array2 = new int[n + m];
        array2[0] = (int) (Math.random() * 10);
        for (int i = 1; i < m; i++) {
            array2[i] = array2[i - 1] + 2;
        }
        return array2;
    }

    public static void printArray(int[] array) {
        for (int ar : array) {
            System.out.print(ar + " ");
        }
    }

    public static int[] addingArrays(int[] array1, int[] array2, int m) {
        for (int i = m; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array2[i] = array1[j];
                i++;
            }
        }
        return array2;
    }

    public static int[] sortedArray(int[] array) {
//        int max;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    max = array[i];
//                    array[i] = array[j];
//                    array[j] = max;
//                }
//            }
//        }
        Arrays.sort(array);
        return array;
    }

}
