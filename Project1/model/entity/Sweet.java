package epam.java.model.entity;

public class Sweet {
    protected String producer;
    protected String name;
    protected double weigth;
    protected double sugarContent;

    public Sweet(String producer, String name, double weigth, double sugarContent) {
        this.producer = producer;
        this.name = name;
        this.weigth = weigth;
        this.sugarContent = sugarContent;
    }

    public Sweet() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sweet sweets = (Sweet) o;

        if (Double.compare(sweets.weigth, weigth) != 0) return false;
        if (Double.compare(sweets.sugarContent, sugarContent) != 0) return false;
        if (producer != null ? !producer.equals(sweets.producer) : sweets.producer != null) return false;
        return name != null ? name.equals(sweets.name) : sweets.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producer != null ? producer.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(weigth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sugarContent);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "producer='" + producer + '\'' +
                ", name='" + name + '\'' +
                ", weigth=" + weigth +
                ", sugarContent=" + sugarContent;
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getSugarContent() {
        return sugarContent;
    }
}
