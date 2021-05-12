package arrays.onesizesort.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    /*
    5. !!!Сортировка вставками!!!.
    Дана последовательность чисел a1, a2, ..., an.
    Требуется переставить числа в порядке возрастания. Делается это следующим образом.
     Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an.
    Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы
от i+1 до n не будут перебраны.
Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
3   8   4   1   7
3   4   8   1   7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size - n");
        int n = scanner.nextInt();
        int[] array = new int[n];
        createArray(array);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println();
        System.out.println(Arrays.toString(array));

    }

    public static int[] createArray(int[] array) {
        for (int i = 0; i < array.length; i ++){
            array [i] = (int)(Math.random()*15);
        }
        return array;
    }

    public static int [] sortArray (int []array){
        for (int i = 0; i < array.length; i ++){
            int value = array[i];
            int j;
            for ( j = i-1; j >= 0; j--){
                if (value<array[j]) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array [j+1] = value;
        }
        return array;
    }
}
