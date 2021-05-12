package arrays.decompositions.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /*
    4. На плоскости заданы своими координатами n точек. Написать метод(методы),
    определяющие, между какими из пар точек самое большое расстояние.
    Указание. Координаты точек занести в массив.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input coordinate X (enter) and Y (enter) for dotA");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int[] dotA = new int[]{x1, y1};
        System.out.println("Input coordinate X (enter) and Y (enter) for dotB");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int[] dotB = new int[]{x2, y2};
        System.out.println("A " + Arrays.toString(dotA));
        System.out.println("B " + Arrays.toString(dotB));
        findOutTheDistance(x1, y1, x2, y2);
    }


    public static double findOutTheDistance(int x1, int y1, int x2, int y2) {

        double l12 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("dist between A and B = " + l12);
        return l12;
    }
}
