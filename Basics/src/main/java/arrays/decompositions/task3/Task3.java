package arrays.decompositions.task3;

import java.util.Scanner;

public class Task3 {
    /*
    3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A size of correct 6-size figure ");
        int a = scanner.nextInt();
        taskSolution(a);
    }
    public static void taskSolution (int a){
  //      int angle = 60;
        double triangleSquare = a * a * Math.sqrt(3) / 4;
        System.out.println("triangleSquare = " + triangleSquare);
        double totalSquare = triangleSquare * 6;

        System.out.println("totalSquare = " + totalSquare);
        String result = String.format("%.2f",totalSquare); // округление до 2-х знаков после запятой
        double resultM = Math.ceil(totalSquare);// округление до 2-х знаков после запятой математич
        double result2 = Math.round(totalSquare);// округление до 2-х знаков после запятой математич +++
        System.out.println("result = " + result);
        System.out.println("resultM = " + resultM);
        System.out.println("result2 = " + result2);
    }
}
