import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите выражение");
        String text = "0" + scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d+|[-+/*]");
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        while (list.size() > 1) {
            doArithmetic(list);
        }
        list.forEach(System.out::println);
    }

    private static void doArithmetic(ArrayList<String> list) {
        if (list.contains("*")) {
            calculateAndSet(list, "*");
            return;
        }
        if (list.contains("/")) {
            calculateAndSet(list, "/");
            return;
        }
        if (list.contains("-")) {
            calculateAndSet(list, "-");
            return;
        }
        if (list.contains("+")) {
            calculateAndSet(list, "+");
        }
    }

    private static void calculateAndSet(ArrayList<String> list, String chr) {
        int index = list.indexOf(chr);
        int firstNum = Integer.parseInt(list.get(index - 1));
        int secondNum = Integer.parseInt(list.get(index + 1));

        switch (chr) {
            case ("*") -> list.set(index - 1, String.valueOf(firstNum * secondNum));
            case ("/") -> list.set(index - 1, String.valueOf(firstNum / secondNum));
            case ("-") -> list.set(index - 1, String.valueOf(firstNum - secondNum));
            case ("+") -> list.set(index - 1, String.valueOf(firstNum + secondNum));
        }
        list.remove(index);
        list.remove(index);
    }
}


