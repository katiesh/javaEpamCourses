package epam.java.model.entity;

public abstract class Shape implements Drawable {
    String shapeColor;
    double area;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape() {
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void calcArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "shapeColor='" + shapeColor + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return getShapeColor() != null ? getShapeColor().equals(shape.getShapeColor()) : shape.getShapeColor() == null;
    }

    @Override
    public int hashCode() {
        return getShapeColor() != null ? getShapeColor().hashCode() : 0;
    }

    public String draw(){
        return toString() + " " + area;
    }
}
