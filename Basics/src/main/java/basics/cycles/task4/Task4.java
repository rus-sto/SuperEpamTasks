package basics.cycles.task4;

public class Task4 {
    /*
     Составить программу нахождения произведения квадратов первых двухсот чисел
     */
    static  void  mathSolution (int a){
        long mult = 1;
        for (int i = a; i<=a+200; i++){
            mult = mult * (int)(Math.pow(i,2));
            System.out.println(mult);
        }
        System.out.println("Multiplication of first Two Hundred numbers in Second degree, starting with number - '"+a+"' is -'"+mult+"'");
    }

    public static void main(String[] args) {
        mathSolution(1);
    }
}
