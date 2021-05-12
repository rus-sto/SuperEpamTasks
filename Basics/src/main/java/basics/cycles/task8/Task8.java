package basics.cycles.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    //. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
// for example 2478 & 11092   = 2





    public static ArrayList numberEnterA(int a) {
        ArrayList<Integer> arrayA = new ArrayList<Integer>();
        while (a > 0) {
            arrayA.add(0, a % 10);
            a = a / 10;
         }
        return arrayA;
    }

    public static ArrayList numberEnterB(int b) {
        ArrayList<Integer> arrayB = new ArrayList<Integer>();
        while (b > 0) {
            int i = 0;
            arrayB.add(i, b % 10);
            b = b / 10;
            i++;
        }
        return arrayB;
    }
    static void mathSolution(int a, int b) {
        List<Integer> arrayA = numberEnterA( a);
        List<Integer> arrayB = numberEnterB( b);
        for (int  ai : arrayA){
            for ( int bj : arrayB){
                if (ai == bj){
                    System.out.print(ai + " ");
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        System.out.println("Цифры которые входят в число a: " + numberEnterA(a));
        System.out.println("Цифры которые входят в число b: " + numberEnterB(b));
        System.out.println("Common numbers are: ");
        mathSolution(a, b);
    }
}
