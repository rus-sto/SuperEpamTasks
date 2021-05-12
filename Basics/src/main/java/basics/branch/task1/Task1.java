package basics.branch.task1;

public class Task1 {
    /* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
*/
    static  void ifIsSuchTriangle (int a, int b){
        if ((a + b) < 180 && (a + b) > 0 ){
            System.out.println("Takoi treugolnic mozhet byt");
            if ((a + b) == 90){
                System.out.println("Etot treugolnic PRYAMOUGOLNY");
            }
        }else {
            System.out.println("Takogo treugolnika NET");
        }
    }

    public static void main(String[] args) {
        ifIsSuchTriangle(310,60);
    }
}
