import java.util.Scanner;

public class Task9 {
    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите фразу");
        String str = scanner.nextLine().toLowerCase().replace(" ", "");
        boolean check = true;

        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Это не палиндром");
                check = false;
                break;
            }
        if(check)
            System.out.println("Это палиндром");
    }
}

