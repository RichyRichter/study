package Stage1_4.Task3;

import java.util.function.Predicate;

public class IsMultiply {
    public static void main(String[] args) {
        Predicate<Integer> isMultiply = x -> x % 13 == 0;
        System.out.println(isMultiply.test(13));
        System.out.println(isMultiply.test(12));
    }
}
