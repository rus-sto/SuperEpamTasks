package basics.cycles.task6;

public class Task6 {
    //Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    char a;


    static void inToComputerCode( char a) {
        int a1 =  a;
        System.out.println("a = " + a1);
    }

    public static void main(String[] args) {
      inToComputerCode('t');
    }

}


