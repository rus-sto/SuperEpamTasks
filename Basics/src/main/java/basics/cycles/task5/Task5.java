package basics.cycles.task5;

public class Task5 {
    /*
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид:
    a(n) = 1/(2 in degree n) + 1/(3 in degree n)
     */

    double a;
    static  void  mathOperation (int n1, int n2, int e){

        double sum = 0;
        for (int i =n1; i<=n2; i++ ) {
            double a = (Math.pow(2, -i)) + (Math.pow(3, -i));
            System.out.println("a = "+a);
            if (Math.abs(a) >= e) {
                sum += a;
                System.out.println("sum = "+sum);
            }
        }
        System.out.println("fin sum = "+sum);
    }

    public static void main(String[] args) {
       mathOperation(-10,18,3);
    }
}
