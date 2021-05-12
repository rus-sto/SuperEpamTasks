package arrays.arraysofarrays.task4;

public class Task4 {
    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        1    2   3  ... n                       1(00)   2(01)   3(02)   4(03)
        n   n-1  n-2 ...1                       4(10)   3(11)   2(12)   1(13)
        1    2   3  ... n                       1(20)   2(21)   3(22)   4(23)
        n   n-1  n-2 ...1                       4(30)   3(31)   2(32)   1(33)
        :    :    :     :
        n   n-1  n-2 ...1
     */
    public static void main(String[] args) {
createArray(10);
    }
    static void createArray (int n){
        if (n % 2 != 0){
            System.out.println("N - must be chetnoe");
        }else{
            int [][] array = new int[n][n];
            for( int i = 0; i < n; i ++){
                for (int j = 0; j < n; j++){
                    if (i % 2 == 0){
                        array[i][j] = 1 + j;
                    } else {
                        array[i][j] = n - j;
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
