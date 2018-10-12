package epam.java.model.entity;

public class Cirkle extends Shape {
    double r;

    public Cirkle(String shapeColor, double r) {
        super(shapeColor);
        this.r = r;
        calcArea();
    }

    public Cirkle() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cirkle cirkle = (Cirkle) o;

        return Double.compare(cirkle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "r=" + r;
    }

    @Override
    public void calcArea(){
        setArea(Math.PI*Math.pow(r,2));
    }
}
