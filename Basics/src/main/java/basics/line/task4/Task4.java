package basics.line.task4;

public class Task4 {
    /*   4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.
         */
    static void mathSolutions(double r) {
//    r = 111.222;
        int a = (int) r;
        double d = (double) a;
        double f = r - a;
        double g = f * 1000;
        double fin = g + a / 1000.0;
        System.out.printf("%.3f", fin);

    }

    public static void main(String[] args) {
        mathSolutions(555.222);
    }
}
