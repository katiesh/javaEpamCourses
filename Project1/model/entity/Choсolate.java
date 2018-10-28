package epam.java.model.entity;

public class Choсolate extends Sweet {
    private double percentOfCocoa;
    private boolean containsNuts;
    private boolean containsRaisins;
    private boolean containsFruits;

    public Choсolate(String producer, String name, double weigth, double sugarContent, double percentOfCocoa,
                     boolean containsNuts, boolean containsRaisins, boolean containsFruits) {
        super(producer, name, weigth, sugarContent);
        this.percentOfCocoa = percentOfCocoa;
        this.containsNuts = containsNuts;
        this.containsRaisins = containsRaisins;
        this.containsFruits = containsFruits;
    }

    public double getPercentOfCocoa() {
        return percentOfCocoa;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public boolean isContainsRaisins() {
        return containsRaisins;
    }

    public boolean isContainsFruits() {
        return containsFruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Choсolate choсolate = (Choсolate) o;

        if (Double.compare(choсolate.getPercentOfCocoa(), getPercentOfCocoa()) != 0) return false;
        if (isContainsNuts() != choсolate.isContainsNuts()) return false;
        if (isContainsRaisins() != choсolate.isContainsRaisins()) return false;
        return isContainsFruits() == choсolate.isContainsFruits();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getPercentOfCocoa());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isContainsNuts() ? 1 : 0);
        result = 31 * result + (isContainsRaisins() ? 1 : 0);
        result = 31 * result + (isContainsFruits() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return " Choсolate{" + super.toString()+
                " percentOfCocoa = " + percentOfCocoa +
                ", containsNuts = " + containsNuts +
                ", containsRaisins = " + containsRaisins +
                ", containsFruits = " + containsFruits +
                '}';
    }
}
