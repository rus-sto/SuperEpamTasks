package basics.line.task3;

public class Task3 {
    static void  mathSolution(double x, double y){
        /*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦))∗ 𝑡𝑔 𝑥𝑦
         */
        double z;
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }

    public static void main(String[] args) {
        mathSolution(0.5,0.5);
    }
}
