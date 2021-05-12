package basics.branch.task2;

public class Task2 {
/*
Найти max{min(a, b), min(c, d)}.
 */
    int a, b, c, d;
static void findMAxOfTwoMin (int a, int b, int c,  int d){
    int e, f;
    if (a < b){
        e = a;
    } else {e = b;
    }
    if (c < d) {
        f = c;
    }else {f = d;
    }

    if  (e < f){
        System.out.println("Max Number of two min numbers is  " + f);
    }else {System.out.println("Max Number of two min numbers is  " + e);}
}

    public static void main(String[] args) {
        findMAxOfTwoMin(3,6,2,9);
    }
}
