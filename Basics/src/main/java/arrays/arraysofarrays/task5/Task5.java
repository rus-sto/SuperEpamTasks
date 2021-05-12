package arrays.arraysofarrays.task5;

public class Task5 {
    /*
    5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
            1(00)   1(01)   1(02)   1(03)
            2(10)   2(11)   2(12)   0(13)
            3(20)   3(21)   0(22)   0(23)
            4(30)   0(31)   0(30)   0(33)
     */
    public static void main(String[] args) {
        createArray(4);
    }

    static void createArray(int n) {
        if (n % 2 != 0) {
            System.out.println("N - must be chetnoe");
        } else {
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = i + 1;
                    if (j >= n - i) {
                        array[i][j] = 0;
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
