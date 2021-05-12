package basics.line.task2;

public class Task2 {
    /*
    2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
  ((b + sqr(b*b + 4ac))/2a) - a*a*a*c + 1/(b*b)
     */
    static double mathSolution (int b, int a, int c){
        double z;
        z = Math.sqrt(b * b + 4 * a * c);
        double s = Math.pow(a,3) * c + Math.pow(b,-2);
        double fin = z / 2 * a - s;
        System.out.println(fin);
        return fin;
    }

    public static void main(String[] args) {
        System.out.println(mathSolution(2, 3, 5));

    }
}
