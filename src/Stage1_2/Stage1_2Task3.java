package Stage1_2;

import java.util.Scanner;

public class Stage1_2Task3 {

    public static void replaceByIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String[] splitList = scanner.nextLine().split(" ");
        System.out.println("Введите символ для замены");
        String replace = scanner.nextLine();
        System.out.println("Введите номер позиции для замены");
        int index = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (String item : splitList) {
            if (item.length() >= index) {
                result.append((new StringBuilder(item + " ")).replace(index - 1, index, replace));
            } else {
                result.append(item).append(" ");
            }
        }
        System.out.println(result);
    }
}
