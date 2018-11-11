package epam.java.model;

import epam.java.entities.PunctuationMark;
import epam.java.entities.Sentence;
import epam.java.entities.Text;
import epam.java.entities.Word;

import java.util.*;

public class Model {
    private Text text;
    private List <Sentence> questions;
    private Set <Word> words;

    public Model() {
        this.questions = new ArrayList<>();
        this.words = new HashSet<>();
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Set<Word> getWords() {
        return words;
    }

    public List<Sentence> getQuestions() {
        return questions;
    }

    public void findAllQuestionsInText(){
        for (Sentence sentence: text.getSentences()) {
            if(sentence.getSentence().charAt(sentence.getSentence().length()-1)
                    == PunctuationMark.QUESTION_MARK.getPunctuationMark().getSymbol()){
                questions.add(sentence);
            }
        }
    }

    public void searchWordsByLength(int length){
        findAllQuestionsInText();
        for (Sentence sentence:questions) {
            for (Word word:sentence.getWordsOfSentence()) {
                if(word.getWordSize() == length){
                    words.add(word);
                }
            }
        }
    }
}
