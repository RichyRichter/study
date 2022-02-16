package Stage1_1;

public class Task5 {
    public static void showNumberOfChar(){
        String str = "Hello World!";

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            System.out.println(chr + ":" + (int)chr);
        }
    }
}
