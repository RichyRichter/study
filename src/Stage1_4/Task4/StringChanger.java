package Stage1_4.Task4;

import java.util.Arrays;

public class StringChanger {
    public static String[] changeString(String input, int n, int l) {
        return  Arrays.stream(input.split(" "))
                .map(e -> e + ", ")
                .map(e -> e.repeat(n))
                .flatMap(e -> Arrays.stream(e.split(" ")))
                .limit(l)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String test = "Слово1 Слово2 Слово3 Слово4 Слово5 Слово6 Слово7";
        Arrays.stream(changeString(test, 3, 5)).forEach(System.out::print);

    }
}
