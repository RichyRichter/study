import java.util.HashMap;
import java.util.Map;


public class Task6 {
    public static void charCounter() {
        String str = "Hello World!";
        Map<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (dictionary.containsKey(chr)) {
                dictionary.computeIfPresent(chr, (k, v) -> v + 1);
            } else {
                dictionary.put(chr, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: dictionary.entrySet())
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " повторяеться " + entry.getValue() + " раз(а)");
            }
        //System.out.println(dictionary.toString());
    }
}

