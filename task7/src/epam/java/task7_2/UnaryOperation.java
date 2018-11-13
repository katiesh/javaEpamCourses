package epam.java.task7_2;

public class UnaryOperation {
    private double value;

    public UnaryOperation(double value) {
        this.value = value;
    }

    public UnaryOperation() {
        this(100.0);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UnaryOperation{" +
                "value=" + value +
                '}';
    }

    public void increment(){
        value++;
    }

    public void decrement(){
        value--;
    }

    public void unsigned(){
        value = -value;
    }


}
