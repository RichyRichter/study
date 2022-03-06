package Stage1_4.Task6;

import java.util.stream.IntStream;

public class PrimeGenerator {

    public static void printPrimeNumbers(int count) {
        IntStream.rangeClosed(2, Integer.MAX_VALUE)
                .filter(PrimeGenerator::isPrime)
                .limit(count)
                .forEach(x -> System.out.print(x + " "));
    }

    private static boolean isPrime(int num) {
        double sqrt = Math.sqrt(num) + 1;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for (int i = 3; i < sqrt; i+=2)
            if (num % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        printPrimeNumbers(10);
    }
}


