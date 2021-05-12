package basics.cycles.task2;

public class Task2 {
    /*
    Вычислить значения функции на отрезке [а,b] c шагом h:
    y = {x , x>2
        {-x, x<=2
     */

    static void mathSolution(int a, int b, int h) {
        int y;
        for (int x = a; x <= b; x = x + h) {

            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        mathSolution(1,5,2);
    }
}