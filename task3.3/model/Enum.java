package epam.java.model;

public class Enum <E extends Enum<E>> implements Comparable<E> {
    private final String name;
    private final int ordinal;
    protected Enum(String name, int ordinal){
        this.name = name;
        this.ordinal = ordinal;
    }

    @Override
    public final boolean equals(Object other) {
        return this==other;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + ordinal;
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public final int compareTo(E o) {
        Enum<?> other = (Enum<?>)o;
        Enum<E> self = this;
        return self.ordinal - other.ordinal;
    }

    public final String name(){
        return name;
    }

    public final int ordinal(){
        return ordinal;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected final void finalize() { }
}
