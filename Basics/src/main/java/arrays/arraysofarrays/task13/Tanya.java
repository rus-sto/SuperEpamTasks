package arrays.arraysofarrays.task13;

public class Tanya {

    private static int[][] sortTheArrayInAscendingOrder(int[][] array) {
       /*  1(00)   1(01)   1(02)   0(03)
           2(10)   2(11)   2(12)   0(13) // 4 - 1

           {{0,2,1},{3,2,1}}*/
        System.out.println("\narray in ascending order");
        int temp;

        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                for (int p = i + 1; p < array.length; p++) {

                    if (array[i][j] > array[p][j]) {
                        temp = array[i][j];
                        array[i][j] = array[p][j];
                        array[p][j] = temp;
                    }
                }
            }
        }
        return array;
    }
}
