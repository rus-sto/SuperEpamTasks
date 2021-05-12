package arrays.onesize.task1;

public class Task1 {
/*
 В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

   static  void  mathSolution (int []a, int k){
       int sum = 0;
//    for (int i =0; i < a.length; i++) {
//        if (a[i] % k == 0) {
//            sum += a[i];
//        }
//    }
//       System.out.println(sum);
//
    for (int c : a){
        if (c % k == 0){
        sum += c;}
    }
       System.out.println(sum);
   }

    public static void main(String[] args) {
       mathSolution(new int[] {3,5,6,2},2 );
    }
}
