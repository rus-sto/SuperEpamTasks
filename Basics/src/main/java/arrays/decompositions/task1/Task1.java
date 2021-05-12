package arrays.decompositions.task1;

import java.util.Scanner;

public class Task1 {
    /*
    1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
    кратного двух натуральных чисел: NOK(A,B) = A*B / NOD(A,B)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input two numbers A (enter) B");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        taskSolution(a, b);

    }

    public static void taskSolution(int a, int b) {
        int c = a*b;
        System.out.println("c = " + c);
        int nod;
        { while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
          nod = a + b;}

//        int nod = a * b;
        int nok = c / nod;

        System.out.println("nod = " + nod);
        System.out.println("nok = " + nok);
    }
}
