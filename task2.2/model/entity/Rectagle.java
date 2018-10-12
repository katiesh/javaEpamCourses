package epam.java.model.entity;

public class Rectagle extends Shape {
    double a;
    double b;

    public Rectagle(String shapeColor, double a, double b) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        calcArea();
    }

    public Rectagle() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectagle rectagle = (Rectagle) o;

        if (Double.compare(rectagle.a, a) != 0) return false;
        return Double.compare(rectagle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a=" + a +
                ", b=" + b;
    }

    @Override
    public void calcArea(){
        setArea(a*b);
    }
}
