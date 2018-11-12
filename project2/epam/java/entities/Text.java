package epam.java.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Text {
    final static EnumSet<PunctuationMark> endOfSentencePunctuation = EnumSet.range(PunctuationMark.POINT, PunctuationMark.EXCLAMATION_MARK);
    private String allText;
    private List<Sentence> sentences;
    private String fileAddress;

    public Text(String fileAddress) {
        this.fileAddress = fileAddress;
        setAllText();
        setSentences();
    }

    public Text() {
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getAllText() {
        return allText;
    }

    public void setAllText() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileAddress))){
            StringBuilder wholeTextBuilder = new StringBuilder();
            while (reader.ready()) {
                String buffer = reader.readLine();
                buffer = buffer.replaceAll("\\s+", " ");
                wholeTextBuilder.append(buffer);
                wholeTextBuilder.append('\r');
            }
            allText = wholeTextBuilder.toString();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences() {
        sentences = new ArrayList<>();
        int startIndex = 0;
        if(allText!=null){
            for(int currentIndex = startIndex; currentIndex<allText.length(); currentIndex++) {
                if ((allText.charAt(currentIndex) == PunctuationMark.DOUBLE_QUOTE.getPunctuationMark().getSymbol() ||
                        allText.charAt(currentIndex) == PunctuationMark.OPEN_BRACKET.getPunctuationMark().getSymbol())) {
                    currentIndex++;
                    while (!(allText.charAt(currentIndex) == PunctuationMark.DOUBLE_QUOTE.getPunctuationMark().getSymbol() ||
                            allText.charAt(currentIndex) == PunctuationMark.CLOSE_BRACKET.getPunctuationMark().getSymbol())) {
                        currentIndex++;
                    }
                }
                for (PunctuationMark punctuation : endOfSentencePunctuation) {
                    if (allText.charAt(currentIndex) == punctuation.getPunctuationMark().getSymbol()) {
                        Sentence newSentence = new Sentence(allText.substring(startIndex, currentIndex+1));
                        sentences.add(newSentence);
                        startIndex = currentIndex+1;
                        break;
                    }
                }
            }
            if (allText.length() > startIndex) {
                sentences.add(new Sentence(allText.substring(startIndex, allText.length())));
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        return getAllText() != null ? getAllText().equals(text.getAllText()) : text.getAllText() == null;
    }

    @Override
    public int hashCode() {
        return getAllText() != null ? getAllText().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Text{" +
                "allText='" + allText + '\'' +
                '}';
    }
}
