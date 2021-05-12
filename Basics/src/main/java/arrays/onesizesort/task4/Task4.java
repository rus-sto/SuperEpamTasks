package arrays.onesizesort.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /*
    4. !!!Сортировка обменами!!!.
    Дана последовательность чисел
a1 <= a2 <= ... <= an.  Требуется переставить числа в порядке возрастания.
Для этого сравниваются два соседних числа ai и a(i+1). Если ai > ai+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены
в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int n = scanner.nextInt();
        int[] array = new int[n];
        createArray(array,n);
        System.out.println(Arrays.toString(array));
//        printArray(array);

        System.out.println("\nNew array");
        remakeArray(array);
        System.out.println(Arrays.toString(array));
//        printArray(array);

    }

    public static int[] createArray(int[] array, int n) {
        array[0] = (int) (Math.random() * 15);
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 1;
        }
        return array;
    }

    public static int [] remakeArray (int [] array){
        int max;
        int count = 0;
        for (int i = 0; i < array.length; i ++){
            for (int j = i + 1; j < array.length; j ++){
                if (array[i] < array[j]) {
                    max = array[j];
                    array[j] = array[i];
                    array[i] = max;
                    count ++;
                }
            }
        }
        System.out.println("total count = " + count);
        return  array;
    }

    public static void printArray (int [] array){
        for(int ar :array){
            System.out.print(ar + " ");
        }
    }
}

