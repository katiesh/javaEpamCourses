package epam.java.entities;

public class Symbol {
    char Symbol;

    public Symbol(char symbol) {
        Symbol = symbol;
    }

    public Symbol() {
    }

    public char getSymbol() {
        return Symbol;
    }

    public void setSymbol(char symbol) {
        Symbol = symbol;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "Symbol=" + Symbol +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol = (Symbol) o;

        return getSymbol() == symbol.getSymbol();
    }

    @Override
    public int hashCode() {
        return (int) getSymbol();
    }
}
