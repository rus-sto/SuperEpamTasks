package arrays.onesizesort.task8;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    /*
    8.Даны дроби p1/q1 , p2/q2, ..., pn/qn   pi , qi - натуральные).
    Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
1/2, 1/3, 1/4, 1/5, 1/6, 1/7, 1/8, 1/9
72
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input arrays size - N");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int[] arrayUp = createArray(array);
        int[] arrayDown = createArray(array);
        printStartArray(arrayUp, arrayDown);
        int commonNumber = findCommonNumber(arrayDown);
        createNewArray(arrayUp, arrayDown,commonNumber);
        System.out.println(Arrays.toString(arrayUp));
    }

    public static int[] createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 +1);
        }
        return array;
    }

    public static void printStartArray(int[] arrayUp, int[] arrayDown) {
        for (int i = 0; i < arrayUp.length; i++) {
            System.out.print(arrayUp[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arrayUp.length; i++) {
            System.out.print("--\t");
        }
        System.out.println();
        for (int j = 0; j < arrayDown.length; j++) {
            System.out.print(arrayDown[j] + "\t");
        }
    }

    public static int findCommonNumber(int[] arrayDown) {
        int commonNumber = 1;
        for (int i = 0; i < arrayDown.length; i++) {
            commonNumber *= arrayDown[i];
        }
        System.out.println("\ncommonNumber = " + commonNumber);
        return commonNumber;
    }
    public static int [] createNewArray (int [] arrayU, int [] arrayD, int c){
        for (int i = 0; i < arrayU.length; i ++){
            int value = arrayU[i];
            for (int j = i; j == i; j ++){
                arrayU[i] = value * (c / arrayD[j]);
            }
        }return arrayU;
    }
}
