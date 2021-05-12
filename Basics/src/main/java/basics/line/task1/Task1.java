package basics.line.task1;

public class Task1 {
/*
    Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

    static void  mathSolution (int a, int b, int c){
        int z;
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);

    }

    public static void main(String[] args) {
        mathSolution(2,0,5);
    }

}
