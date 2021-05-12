package arrays.onesize.task4;

public class Task4 {
/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
    static void changeMinAndMax (int [] array){
        for (int a :array){
            System.out.print(a + " ");
        }
        int indexMin = 0;
        int indexMax = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        int max = 0;
//        int min = 0;
        for (int  i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min){
                min = array[i];
                indexMin = i;
            }
        } int x = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = x;
        System.out.println();
        for (int a :array){
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        changeMinAndMax(new int []{5,2,4,7,3,34,0,9});
    }
}
