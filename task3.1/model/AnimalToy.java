package epam.java.model;

public class AnimalToy extends Toy{
    private String animal;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalToy animalToy = (AnimalToy) o;

        return getAnimal() != null ? getAnimal().equals(animalToy.getAnimal()) : animalToy.getAnimal() == null;
    }

    @Override
    public int hashCode() {
        return getAnimal() != null ? getAnimal().hashCode() : 0;
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalToy{" +
                "animal='" + animal + '\'' +
                '}';
    }
}
