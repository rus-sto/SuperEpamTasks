package arrays.decompositions.task2;

import java.util.Scanner;

public class Task2 {
    /*
    2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("Input four natural numbers A (enter) B (enter) C (enter) D (enter)");
        int a = scanner.nextInt();
        int b  = scanner.nextInt();
        int c  = scanner.nextInt();
        int d  = scanner.nextInt();

        taskSolution(a,b,c,d);
    }

    public static void taskSolution(int a, int b, int c, int d) {
        int nod2, nod3, nod4, nod;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        nod2 = a + b;
        System.out.println("nod2 = " + nod2);

        while (c != 0 && nod2 != 0) {
            if (c > nod2) {
                c %= nod2;
            } else {
                nod2 %= c;
            }
        }
        nod3 = c + nod2;
        System.out.println("nod3 = " + nod3);

        while (d != 0 && nod3 != 0) {
            if (d > nod3) {
                d %= nod3;
            } else {
                nod3 %= d;
            }
        }
        nod4 = d + nod3;
        nod = nod4;

        System.out.println("nod = " + nod);
    }

}
