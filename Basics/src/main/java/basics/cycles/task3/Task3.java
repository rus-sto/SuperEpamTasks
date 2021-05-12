package basics.cycles.task3;

public class Task3 {
    /*
     Найти сумму квадратов первых ста чисел.
     */
    static void mathSolution(int a){
        int sum = 0;
            for (int i=a; i<=(a+100); i++){
                sum=sum+i*i;
                System.out.println(sum);
            }
        System.out.println("summa kvadratov pervyh STA chisel  nachinaya s chisla -'"+a+"' ravno  = "+sum);
    }

    public static void main(String[] args) {
        mathSolution(2);
    }
}
