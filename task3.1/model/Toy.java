package epam.java.model;

public class Toy {
    String material;
    int price;

    public Toy(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public Toy() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "material='" + material + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (getPrice() != toy.getPrice()) return false;
        return getMaterial() != null ? getMaterial().equals(toy.getMaterial()) : toy.getMaterial() == null;
    }

    @Override
    public int hashCode() {
        int result = getMaterial() != null ? getMaterial().hashCode() : 0;
        result = 31 * result + getPrice();
        return result;
    }
}
