package Stage1_4.Task5;

public class Fibonacci {
    private static boolean isFibonacci(int x) {
        return support(x, (n, r) -> n + r) || support(x, (n, r) -> n - r);
    }

    private static boolean support(int x, Operand<Double, Double, Double> function) {
        return Math.sqrt(function.apply(5d * x * x, 4d)) % 1 < 1e-6;
    }


    public static void main(String[] args) {
        System.out.println(Fibonacci.isFibonacci(6765));
        System.out.println(Fibonacci.isFibonacci(13));
    }

}
