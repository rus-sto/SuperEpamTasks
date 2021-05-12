package arrays.onesizesort.task6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    /*
    6. !!!Сортировка Шелла!!!. Дан массив n действительных чисел. Требуется упорядочить его
    по возрастанию. Делается это следующим образом: сравниваются два соседних элемента
ai и a(i+1). Если ai <= a(i+1) , то продвигаются на один элемент вперед. Если
ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
2   5   1   3   3   0
2   1   5   3   3   0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size - N ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        createArray(array);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        // Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    int temp;
                    if (array[c] > array[c + gap]) {
                        temp = array[c];
                        array[c] = array[c + gap];
                        array[c + gap] = temp;
//                        swap(array, c, c + gap);
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
        return array;
    }

//    private static void swap(int[] array, int c, int i) {
//    }

}
