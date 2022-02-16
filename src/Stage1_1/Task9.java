package Stage1_1;

import java.util.Scanner;

public class Task9 {
    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите фразу");
        String str = scanner.nextLine().toLowerCase().replace(" ", "");

        int halfLength = str.length() / 2;
        for (int i = 0; i < halfLength; i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Это не палиндром");
                return;
            }
        System.out.println("Это палиндром");
    }
}

