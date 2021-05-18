package arrays.decompositions.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Bazi4 {
    /*
        4. На плоскости заданы своими координатами n точек. Написать метод(методы),
    определяющие, между какими из пар точек самое большое расстояние.
    Указание. Координаты точек занести в массив.
         */
    public static void main(String[] args) {

        int[][] array = {{0, 0}, {2, 0}, {2, 4}, {1, 4}, {1, 0}};//массив координат точек
        double[] ar1 = new double[5]; // массив расстояний

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        findOutTheDistance(array, ar1);
    }

    // public static int[][] inputDotsToArray(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 10);
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        return array;
//    }

    public static double findOutTheDistance2(int x1, int y1, int x2, int y2) {
        double l12 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("dist between A and B = " + l12);
        return l12;
    }

    public static double[] findOutTheDistance(int[][] array, double[] ar1) {

        for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1) {
                    ar1[i] = findOutTheDistance2(array[i][0], array[i][1], array[i + 1][0], array[i +1][1]);
                } else if (i == array.length - 1) {
                    ar1[i] = findOutTheDistance2(array[i][0], array[i][1], array[0][0], array[0][1]);
                }
            }
        System.out.println(Arrays.toString(ar1));
        return ar1;
    }

}
