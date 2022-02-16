package Stage1_2.Task5;

public class Word {
    private char[] symblos;

    public Word(String word) {
        this.symblos = word.toCharArray();
    }

    public int getSymbolsCount() {
        return symblos.length;
    }

    public String getOriginalWord() {
        StringBuilder word = new StringBuilder(symblos.length);
        for (Character c : symblos)
            word.append(c.charValue());
        return word.toString();
    }
}


