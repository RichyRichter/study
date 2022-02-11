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
        boolean priority = checkPriority(list);
        for (int i = 0; i < list.size(); i++) {
            if ("/".equals(list.get(i))) {
                int res = Integer.parseInt(list.get(i - 1)) / Integer.parseInt(list.get(i + 1));
                list.set(i - 1, String.valueOf(res));
                list.remove(i);
                list.remove(i);
            } else if ("*".equals(list.get(i))) {
                int res = Integer.parseInt(list.get(i - 1)) * Integer.parseInt(list.get(i + 1));
                list.set(i - 1, String.valueOf(res));
                list.remove(i);
                list.remove(i);
            } else if ("+".equals(list.get(i)) && priority) {
                int res = Integer.parseInt(list.get(i - 1)) + Integer.parseInt(list.get(i + 1));
                list.set(i - 1, String.valueOf(res));
                list.remove(i);
                list.remove(i);
            } else if ("-".equals(list.get(i)) && priority) {
                int res = Integer.parseInt(list.get(i - 1)) - Integer.parseInt(list.get(i + 1));
                list.set(i - 1, String.valueOf(res));
                list.remove(i);
                list.remove(i);
            }
        }
    }
    private static boolean checkPriority(ArrayList<String> list) {
        if (list.contains("*")||list.contains("/"))
            return false;
        else return true;
    }

}

