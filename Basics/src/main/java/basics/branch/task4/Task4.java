package basics.branch.task4;

public class Task4 {
    /*
    4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
     */
    static void ifSubjectCanComeThru(int x, int y, int z) {
        int a = 10;
        int b = 25;
        if ((x < a & y < b) || (x < b & y < a) || (x < a & z < b) || (x < b & z < a) || (y < a & z < b) || (y < b & z < a)) {
            System.out.println("This subject can come thue the hole with size AB " + a + " " + b);
        } else {
            System.out.println("This subject canNOT come thue the hole with size AB " + a + " " + b);
        }
    }

    public static void main(String[] args) {
        ifSubjectCanComeThru(30, 20, 10);
    }
}