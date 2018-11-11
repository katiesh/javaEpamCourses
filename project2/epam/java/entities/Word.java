package epam.java.entities;

public class Word {
    private String word;
    private int wordSize;

    public Word(String word) {
        this.word = word;
        this.wordSize = word.length();
    }

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getWordSize() {
        return wordSize;
    }

    public void setWordSize(int wordSize) {
        this.wordSize = word.length();
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", wordSize=" + wordSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        return getWord() != null ? getWord().equals(word1.getWord()) : word1.getWord() == null;
    }

    @Override
    public int hashCode() {
        return getWord() != null ? getWord().hashCode() : 0;
    }


}
