package arrays.arraysofarrays.task6;

public class Task6 {
    /*
    6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
            1 (00)   1 (01)   1 (02)   1 (03)   1 (04)   1 (05)
            0 (10)   1 (11)   1 (12)   1 (13)   1 (14)   0 (15)
            0 (20)   0 (21)   1 (22)   1 (23)   0 (24)   0 (25)
            0 (30)   0 (31)   1 (32)   1 (33)   0 (34)   0 (35)
            0 (40)   1 (41)   1 (42)   1 (43)   1 (44)   0 (45)
            1 (50)   1 (51)   1 (52)   1 (53)   1 (54)   1 (55)
     */
    public static void main(String[] args) {
        createArray(8);
    }
    static void createArray(int n) {
        if (n % 2 != 0) {
            System.out.println("N - must be chetnoe");
        } else {
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < n / 2 && (i > 0  && (j <= i - 1  || j >= n - i  ))){
     //60  n=8  67      0<=6-1=5   n-j           0 >=8-(6+1)=1    && j<=(n-6+ 1)
                        array[i][j] = 0;
                    }else if (i >= n / 2 && (i < n - 1 && (j<(n-(i + 1))  || j >= n -(n-i-1)  ))){
                        array[i][j] = 0;
                    }else {
                    array[i][j] = 1;}
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
