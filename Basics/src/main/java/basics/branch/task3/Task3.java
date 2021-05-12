package basics.branch.task3;

public class Task3 {
    /*
     Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
     Определить, будут ли они расположены на одной прямой.
          */
    static  void ifTheseThreePointsOnTheLine (int x1, int y1, int x2, int y2, int x3, int y3){
 //       if ((y1 / x1 == y2 / x2) && (y1 / x1 == y3 / x3) && (y2 / x2 == y3 / x3));

     if ((x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1) == 0) { //это формула площади треугольника 123.
         System.out.println("All three points are on the same line");
     }else {
         System.out.println("These points aren't on the same line");
     }
    }

    public static void main(String[] args) {
        ifTheseThreePointsOnTheLine(1,1, 2,2, 7,0);
    }
}
