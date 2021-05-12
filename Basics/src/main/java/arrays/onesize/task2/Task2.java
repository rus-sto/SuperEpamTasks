package arrays.onesize.task2;

public class Task2 {
    /*
     Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
     большие данного Z, этим числом. Подсчитать количество замен.
          */
    static void mathRandom(int n, int z) {
        int a = 0; //start array  Начальное значение диапазона - "от"
        int b = 10;// fin array Конечное значение диапазона - "до"
        int[] array = new int[n];
        int count = 0;
        System.out.print("Array { ");
        for (int x : array) {
            x = a + ((int) (Math.random() * b));
 //           System.out.print(x + " ");
//        }
//        for (int y : array){System.out.print(y);}
//        for (int x : array) {
            if (x > z) {
                x = z;
                count++;
            }
  //          System.out.println();
            System.out.print(x + " ");

        }
        System.out.print("}");
        System.out.println();
        System.out.println("counter of changing - "+count);

    }

//    static  void mathSolution (int []array, int z){
//        int count = 0;
//        for ( int i = 0; i < array.length; i++){
//          if (array[i] > z){
//              array[i] = z;
//              count ++;
//        }
//            System.out.print(array[i]);
//    }
//        System.out.println();
//        System.out.println(count);
//}

    public static void main(String[] args) {
//        mathSolution( new int[]{1,3,5,6}, 4);
        mathRandom(6, 3);
    }
}
