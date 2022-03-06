package Stage1_4.Task7;

import Stage1_2.Task5.Word;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Predicate;

public class TextAnalyzer {

    public static Word[] readWordsFromFile(String name) throws IOException {
        return Files
                .lines(Paths.get(name))
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .filter(x-> !x.isEmpty())
                .map(Word::new)
                .toArray(Word[]::new);
    }


    public static void wordArrayAnalysis(Word[] words) throws IOException {
        Predicate<Word> startsWithVowel = x -> x.getOriginalWord().matches("^([аоэиуыеёюя]).*" +
                "||^([АОЭИУЫЕЁЮЯ]).*");
        int vowelsCount = (int) Arrays.stream(words)
                .filter(startsWithVowel)
                .count();
        int consonantCount = words.length - vowelsCount;

        File result = new File("result.txt");
        if (!result.exists()) result.createNewFile();

        PrintWriter printWriter = new PrintWriter("result.txt");
        printWriter.print(String.format("""
                Анализ текста.\s
                Всего слов - %d
                Из них:
                Начинаются c гласной - %d
                Начинаются с согласной - %d""", words.length, vowelsCount, consonantCount));

        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        Word[] words = readWordsFromFile("text.txt");
        //words = ArrayChanger.deleteDuplicates(words);
        wordArrayAnalysis(words);
    }
}

