package basics.branch.task5;

public class Task5 {
    /*
    5. Вычислить значение функции:
        { x*x - 3x + 9 ,   if x <= 3
F(x) =  { 1/(x*x*x +6),    if x > 3
     */
    static void mathSolution (int x){
        double a;
        if (x <= 3){ a= Math.pow(x,2) - 3 * x + 9;}
              else {a = 1 / (Math.pow(x,3) + 6);}
        System.out.println(" Pri x = "+x+" the function result will be = "+a);
    }

    public static void main(String[] args) {
        mathSolution(0);
    }
}
