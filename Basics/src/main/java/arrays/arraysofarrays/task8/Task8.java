package arrays.arraysofarrays.task8;

import java.util.Scanner;

public class Task8 {
    /*
    8. В числовой матрице поменять местами два  любых столбца,
      т.е. все элементы одного столбца поставить
      на соответствующие им позиции другого, а его элементы второго переместить в первый.
      Номера столбцов вводит пользователь с клавиатуры.
        6  2(0a)  3  6  6(0b)
        4  7(1a)  6  6  4(1b)
        6  3(2a)  6  4  4(2b)

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the height  N");
        int n = scanner.nextInt();
        System.out.println("Input the length  M");
        int m = scanner.nextInt();
        System.out.println("Input the numbers of colons to exchange  a & b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array = new int [n][m];
//        createArray(array,m,n);
        printNewArray(exchangeArrayColonsAandB(createArray(array,m,n),a,b));
    }
    static int [][] createArray(int [][] array, int m,int n) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*(9-1)+1);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        return array;
    }
static int [][] exchangeArrayColonsAandB(int [][] array, int a,int b){
    for (int i = 0; i < array.length; i++) {
             int z = array[i][a];
             array[i][a] =  array[i][b];
              array[i][b] = z;

    }return array;
    }
    static void printNewArray(int [][]array){
        System.out.println();
        for (int []ar : array){
            for (int ar1 : ar){
                System.out.print(ar1 + "  ");
            }
            System.out.println();
        }
    }
}
