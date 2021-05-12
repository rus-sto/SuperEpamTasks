package withclasses.simple.task2;

public class Test2 {
  //  2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьтe
  // конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 // класса.
int a;
int b;

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Test2() {
        this.a = 2;
        this.b = 5;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
    }
}
