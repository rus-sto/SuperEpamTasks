package arrays.onesize.task7;

import java.util.Scanner;

public class Test7 {
/*Даны действительные числа  a1 a2  .. an  Найти
max( a1 + a2n , a2 + a2n−1 , ... , an + an+1)
2,1,6,3,8,4
(2+4), (1+8), (6+3)
2,4,6,8,1
(2+1), (4+8), (6+6)  ==  3,12,12  ==  max = 12
*/


static void findMaxOfNewArray ( int [] array , int n){

//int []array = new int[n];
    if (n % 2 == 0) {
        int[] array1 = new int[n / 2];
        for (int i = 0; i < (n / 2); i++) {
            array1[i] = array[i] + array[n - 1 - i];
            System.out.print(array1[i] + " ");
        }
        int ar1Max = Integer.MIN_VALUE;
        for (int ar : array1) {
            if (ar > ar1Max) {
                ar1Max = ar;
            }
                                    }
        System.out.println();
        System.out.println(ar1Max);
    }else {
        int[] array1 = new int[n / 2 +1];
        for (int i = 0; i < (n / 2) + 1; i++) {
            array1[i] = array[i] + array[n - 1 - i];
            System.out.print(array1[i] + " ");
        }
        int ar1Max = Integer.MIN_VALUE;
        for (int ar : array1) {
            if (ar > ar1Max) {
                ar1Max = ar;
            }
        }
        System.out.println();
        System.out.println(ar1Max);
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scanner.nextInt();
        int []array = new int[n];
        System.out.println("enter each number of array");
        for (int i = 0; i < n; i++) { // i < n можно заменить на i < a.length
            array[i] = scanner.nextInt();
        }
        findMaxOfNewArray(array,n);
    }

}
