package epam.java.entities;

import epam.java.entities.Symbol;

public enum PunctuationMark {
    POINT('.'),TWO_POINTS('‥'), THREE_POINTS('…'),QUESTION_MARK('?'), EXCLAMATION_MARK('!'),COLON(':'), SEMICOLON(';'),COMMA(','),
    DASH('-'), OPEN_BRACKET('('), CLOSE_BRACKET(')'), DOUBLE_QUOTE('"');

    private Symbol punctuationMark;
    PunctuationMark (char mark){
        this.punctuationMark = new Symbol(mark);
    }

    public Symbol getPunctuationMark() {
        return punctuationMark;
    }
}
