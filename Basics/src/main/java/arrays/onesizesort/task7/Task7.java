package arrays.onesizesort.task7;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    /*
    7. Пусть даны две неубывающие последовательности действительных чисел
a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности
b1 <= b2 <= ... <= bm. в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N - size of first array");
        int n = scanner.nextInt();
        System.out.println("Input M - size of first array");
        int m = scanner.nextInt();
        int[] arrayN = new int[n];
        int[] arrayM = new int[m];
        createArray(arrayN);
        System.out.println("The N array");
        System.out.println(Arrays.toString(arrayN));
        createArray(arrayM);
        System.out.println("The M array");
        System.out.println(Arrays.toString(arrayM));
        System.out.println();
        mainTask(arrayN, arrayM);

    }

    public static int[] createArray(int[] array) {
        array[0] = (int) (Math.random() * 15);
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 2;
        }
        return array;
    }


    public static void mainTask(int[] arrayN, int[] arrayM) {
        for (int i = 1; i < arrayN.length; i++) {
            for (int j = 0; j < arrayM.length; j++) {
                if (arrayN[i] >= arrayM[j] && arrayM[j] > arrayN[i - 1]) {
                    System.out.println("Element '" + arrayM[j]
                            + "' from  arrayM, should be put between elements "
                            + "[" + (i - 1) + "]" + "=" + arrayN[i - 1] + " and "
                            + "[" + i + "]" + "=" + arrayN[i] +  " of arrayN ");
                }else {
                    if (arrayN[i] >= arrayM[j] && i == 1){
                        System.out.println("Element '" + arrayM[j]
                                + "' from  arrayM, should be put in front of the element "
                                + "[" + i + "]" + "=" + arrayN[i] +  " of arrayN ");
                    } else {
                        if (arrayN[i] <= arrayM[j] && i == arrayN.length - 1){
                            System.out.println("Element '" + arrayM[j]
                                    + "' from  arrayM, should be put after the element "
                                    + "[" + i + "]" + "=" + arrayN[i] +  " of arrayN ");

                        }
                    }
                }
            }
        }


    }

}

