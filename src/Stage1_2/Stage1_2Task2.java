package Stage1_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stage1_2Task2 {

    public static void cleanUpText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите предложение");
        String sentence = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-ZА-Яа-я\s]");
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()) {
            output.append(matcher.group());
        }
        System.out.println(output);
    }

}