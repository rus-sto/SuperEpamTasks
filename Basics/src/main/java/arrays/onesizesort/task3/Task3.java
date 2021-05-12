package arrays.onesizesort.task3;

import java.util.Scanner;

public class Task3 {
    /*
    3. !!!!Сортировка выбором.!!!!
    Дана последовательность чисел   a1 <= a2 <= ...<= an.
Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
1,2,3,4,5 -> 5,2,3,4,1 -> 5,4,3,2,1
5,4,3,2,1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int n = scanner.nextInt();
        int[] array = new int[n];
        createArray(array, n);
        printArray(array);

        System.out.println("\nNew array");
        remakeArray(array);
        printArray(array);

    }

    public static int[] createArray(int[] array, int n) {
        array[0] = (int) (Math.random() * 15);
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 1;
        }
        return array;
    }

    public static int[] remakeArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            int max = array[i];
            int indexMax = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    indexMax = j;
                }
            }
            array[indexMax] = array[i];
            array[i] = max;
            count ++;
        }
        System.out.println("Total count of changes = " + count);
        return array;
    }

    public static void printArray(int[] array) {
        for (int ar : array) {
            System.out.print(ar + " ");
        }
    }
}
