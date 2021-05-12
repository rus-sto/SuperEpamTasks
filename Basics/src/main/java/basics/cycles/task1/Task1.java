package basics.cycles.task1;

public class Task1 {
    /*
    1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
     */
    static void summingFactorial (int a){
        int sum = 0;
        for (int i=1; i <= a; i++){
            sum = sum+i;
        }
        System.out.println("sum  = "+sum);
    }

    public static void main(String[] args) {
        summingFactorial(5);
    }
}
