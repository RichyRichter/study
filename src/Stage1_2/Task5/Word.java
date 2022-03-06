package Stage1_2.Task5;

import java.util.Arrays;

public class Word {
    private char[] symblos;

    public Word(String word) {
        this.symblos = word.toCharArray();
    }

    public int getSymbolsCount() {
        return symblos.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Arrays.equals(symblos, word.symblos);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(symblos);
    }

    public String getOriginalWord() {
        StringBuilder word = new StringBuilder(symblos.length);
        for (Character c : symblos)
            word.append(c.charValue());
        return word.toString();
    }
}


