package epam.java.model;

public class Car extends Toy{
    private String color;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getColor() != null ? !getColor().equals(car.getColor()) : car.getColor() != null) return false;
        return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getColor() != null ? getColor().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
