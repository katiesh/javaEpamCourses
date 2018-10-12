package epam.java.model.entity;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
        calcArea();
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.getA(), getA()) != 0) return false;
        if (Double.compare(triangle.getB(), getB()) != 0) return false;
        return Double.compare(triangle.getC(), getC()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getA());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getC());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public void calcArea(){
        double p;
        p = 0.5*(a+b+c);
        setArea(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
