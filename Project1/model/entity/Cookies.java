package epam.java.model.entity;

public class Cookies extends Sweet {
    private int quintity;
    private String categorie;

    public Cookies(String producer, String name, double weigth, double sugarContent, int quintity, String categorie) {
        super(producer, name, weigth, sugarContent);
        this.quintity = quintity;
        this.categorie = categorie;
    }

    public int getQuintity() {
        return quintity;
    }

    public String getCategorie() {
        return categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cookies cookies = (Cookies) o;

        if (getQuintity() != cookies.getQuintity()) return false;
        return getCategorie() != null ? getCategorie().equals(cookies.getCategorie()) : cookies.getCategorie() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getQuintity();
        result = 31 * result + (getCategorie() != null ? getCategorie().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " Cookies{" + super.toString()+
                " quintity = " + quintity +
                ", categorie = '" + categorie + '\'' +
                '}';
    }
}
