package Stage1_4.Task2;

import Stage1_2.Task5.Sentence;
import Stage1_2.Task5.Word;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChanger {
    public static Word[] deleteDuplicates(Word[] words) {
        return Arrays.stream(words).distinct().toArray(Word[]::new);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] splitList = scanner.nextLine().split(" ");
        Sentence sentence = new Sentence(splitList);
        Word[] res = deleteDuplicates(sentence.getWordsMass());
    }
}
