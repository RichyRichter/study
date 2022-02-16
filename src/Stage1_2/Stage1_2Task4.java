package Stage1_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Stage1_2Task4 {
    public static void extremeWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String[] splitList = scanner.nextLine().split(" ");

        int max = 0;

        int min = splitList[0].length();
        for (String item : splitList) {
            int length = item.length();
            if (length > max) max = length;
            if (length < min) min = length;
        }
        StringBuilder minWords = new StringBuilder(String.format("C минимальной длинной(%d):",min));
        StringBuilder maxWords = new StringBuilder(String.format("\nC максимальной длинной(%d):",max));
        for (String item : splitList) {
            if (item.length() == min) minWords.append(item).append(";");
            if (item.length() == max) maxWords.append(item).append(";");
        }

        System.out.println(minWords.toString() + maxWords);
    }
}
