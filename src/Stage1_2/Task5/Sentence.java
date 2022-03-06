package Stage1_2.Task5;

public class Sentence {
    private Word[] wordsMass;
    private int wordsCount;

    public Word[] getWordsMass() {
        return wordsMass;
    }

    public Sentence(String[] words) {
        this.wordsCount = words.length;
        this.wordsMass = new Word[wordsCount];

        for (int i = 0; i < wordsCount; i++)
            wordsMass[i] = new Word(words[i]);
    }

    public int getWordsCount() {
        return wordsCount;
    }

    public Word getWordByPosition(int pos) {
        return wordsMass[pos];
    }

    public String getOriginalSentence() {
        StringBuilder sentence = new StringBuilder();
        for (Word word : wordsMass)
            sentence.append(word.getOriginalWord()).append(" ");
        return sentence.toString();
    }
}
