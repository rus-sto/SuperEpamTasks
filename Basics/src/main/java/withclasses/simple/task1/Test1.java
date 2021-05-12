package withclasses.simple.task1;

public class Test1 {
    //Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    //переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    //наибольшее значение из этих двух переменных
    static int a;
    static int b;

    static void printInfo() {
        System.out.println(a);
        System.out.println(b);
    }

    static int setA(int c) {
        a = c;
        System.out.println(a);
        return a;
    }

    static int setB(int d) {
        b = d;
        System.out.println(b);
        return b;
    }

    static int sum() {
        int sumAB = a + b;
        System.out.println(sumAB);
        return sumAB;
    }

    static int backMaxOfThisTwo() {
        if (a > b) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(b);
            return b;
        }
    }

    public static void main(String[] args) {
        printInfo();
        setA(3);
        setB(5);
        printInfo();
        sum();
        backMaxOfThisTwo();

    }

}
