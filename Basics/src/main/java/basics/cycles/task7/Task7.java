package basics.cycles.task7;

public class Task7 {
//  Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
    // m<6<n (1)?+2?+3?-4?-5?(6)
    static  void mathSolution (int m, int n){

        for (int i = m; i<=n; i++) {
            for (int j = i-1; j > 1; j--) {
                if (i % j == 0) {
                    System.out.println("for number  = '" + i + "' , Divs will be = " + j);
                }
       //         else {                System.out.println(i+" prostnoe chislo");}
            }
        }}

    public static void main(String[] args) {
        mathSolution(0,10);
    }
}
