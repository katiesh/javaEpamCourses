package epam.java.view;

public class View {
    public static final String  INPUT_NUMBER = "Input an integer number";
    public static final String CHOOSE_SYSTEM = "To what number system would you like transfer the number(press 2,8 or 16)?";
    public static final String RESULT = "Transfered number is ";
    public static final String WRONG_INPUT = "Try to input another number";

    public void printMessage(String Message){
        System.out.println(Message);
    }

    public void printMessageAndResult(String Message, int[] array) {
        System.out.print(Message);
        for(int i:array){
            System.out.print(i);
        }
    }

}
