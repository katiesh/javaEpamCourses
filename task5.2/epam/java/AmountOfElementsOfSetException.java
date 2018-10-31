package epam.java;

public class AmountOfElementsOfSetException extends Exception {
    @Override
    public String getMessage(){
        return "Not within the required range";
    }
}
