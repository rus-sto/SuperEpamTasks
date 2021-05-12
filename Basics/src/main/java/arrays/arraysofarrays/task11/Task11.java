package arrays.arraysofarrays.task11;

public class Task11 {
    /*
    11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.
     */
    public static void main(String[] args) {
        int[][] array = new int[10][20];

//        createArray(array);
        printTheArray(createArray(array));
        printStringsNumbers(array);
    }

    static int[][] createArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() *(15 - 0) + 0);
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
        return array;
    }

    static void printTheArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void printStringsNumbers(int [][]array){
        System.out.println(" the strings are : ");


        for (int i = 0; i < array.length; i++) {
            int count5 = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count5++;
                }
             if (count5 >= 3) {
                System.out.println("[ " + i + " ]" );
                break;


               // System.out.print(array[i][j] + "\t");
    }}}
}
}