package arrays.onesize.task5;

public class Task5 {
/*
 Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
 */
static void printInfo ( int [] array) {
    for (int a : array){
        System.out.print(a + " ");
    }
    System.out.println();
    for (int i = 0; i < array.length; i++){
        if (array[i] > i){
            System.out.print(array[i] + " ");
        }
         }
}
    public static void main(String[] args) {
        printInfo(new int [] {3,6,1,0,3,5,2,9});
    }

}
