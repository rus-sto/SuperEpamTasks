package basics.line.task5;

public class Task5 {
    /*
    5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.

     */
    static boolean fildSolution (int x, int y){
        if ((x <= 2 && x >= -2 && y >=0 && y <= 4) || (x <= 4 && x >= -4 && y <=0 && y >= 3)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(fildSolution(0  , 4));
    }
}
