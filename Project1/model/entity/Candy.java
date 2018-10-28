package epam.java.model.entity;

public class Candy extends Sweet {
    String categorie;
    String taste;

    public Candy(String producer, String name, double weigth, double sugarContent, String categorie, String taste) {
        super(producer, name, weigth, sugarContent);
        this.categorie = categorie;
        this.taste = taste;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Candy candy = (Candy) o;

        if (categorie != null ? !categorie.equals(candy.categorie) : candy.categorie != null) return false;
        return taste != null ? taste.equals(candy.taste) : candy.taste == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (categorie != null ? categorie.hashCode() : 0);
        result = 31 * result + (taste != null ? taste.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " Candy{" + super.toString()+
                " categorie = '" + categorie + '\'' +
                ", taste = '" + taste + '\'' +
                '}';
    }
}
