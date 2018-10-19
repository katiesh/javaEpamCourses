package epam.java.model;

public class Doll extends Toy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doll doll = (Doll) o;

        return getName() != null ? getName().equals(doll.getName()) : doll.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "Doll{" +
                "name='" + name + '\'' +
                '}';
    }
}
