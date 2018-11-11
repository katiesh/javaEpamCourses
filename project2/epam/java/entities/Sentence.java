package epam.java.entities;

import java.util.HashSet;
import java.util.Set;

public class Sentence {
    private String sentence;
    private Set<Word> wordsOfSentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
        setWordsOfSentence();
    }

    public Sentence() {
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Set<Word> getWordsOfSentence() {
        if(wordsOfSentence == null){
            setWordsOfSentence();
        }
        return wordsOfSentence;
    }

    public void setWordsOfSentence() {
       wordsOfSentence = new HashSet<>();
       int startIndex = 0;
       for(int currentIndex = startIndex; currentIndex<sentence.length(); currentIndex++){
           for (PunctuationMark punctuation: PunctuationMark.values()) {
               if((sentence.charAt(currentIndex)==' ') ||
                       (sentence.charAt(currentIndex) == punctuation.getPunctuationMark().getSymbol())
                       || sentence.charAt(currentIndex)=='\r'){
                   Word newWord = new Word(sentence.substring(startIndex, currentIndex));
                   if(!newWord.equals("")) {
                       wordsOfSentence.add(newWord);
                   }
                   startIndex = currentIndex+1;
                   break;
               }
           }
       }
       if(startIndex < sentence.length()){
       wordsOfSentence.add(new Word(sentence.substring(startIndex,sentence.length())));
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence1 = (Sentence) o;

        return getSentence() != null ? getSentence().equals(sentence1.getSentence()) : sentence1.getSentence() == null;
    }

    @Override
    public int hashCode() {
        return getSentence() != null ? getSentence().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                '}';
    }
}
