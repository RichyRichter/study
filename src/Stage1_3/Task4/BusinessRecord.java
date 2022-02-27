package Stage1_3.Task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class BusinessRecord {
    private LocalDateTime executeDate;
    private LocalDateTime createdWhen;
    private Word[] wordsMass;
    private int wordsCount;

    public BusinessRecord(String[] words) {
        createdWhen = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        setWordsMass(words);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        return "Дата создания: "+ formatter.format(createdWhen) + " Запись: " + getOriginal();
    }

    public int getWordsCount() {
        return wordsCount;
    }

    public Word getWordByPosition(int pos) {
        return wordsMass[pos];
    }

    public void setWordsMass(String[] words) {
        this.wordsCount = words.length;
        this.wordsMass = new Word[wordsCount];

        for (int i = 0; i < wordsCount; i++) wordsMass[i] = new Word(words[i]);
    }

    public String getOriginal() {
        StringBuilder sentence = new StringBuilder();
        for (Word word : wordsMass)
            sentence.append(word.getOriginalWord()).append(" ");
        return sentence.toString();
    }

    public LocalDateTime getCreatedWhen() {
        return createdWhen;
    }
}
