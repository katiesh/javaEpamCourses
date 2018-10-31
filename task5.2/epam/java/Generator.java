package epam.java;

public abstract class Generator {
    private int amount;
    private int maxNumber;
    private int minNumber;

    public Generator(int amount, int maxNumber, int minNumber) {
        this.amount = amount;
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    public Generator() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public abstract void generate();
}
