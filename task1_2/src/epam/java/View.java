package epam.java;

import java.util.ArrayList;

public class View {
    public static final String INPUT_MESSAGE = "Please enter maximum number";
    public static final String RESULT_MESSAGE = "Perfect numbers are ";
    public static final String WRONG_INPUT = "Please enter another positive number";
    public void printMessage (String message){
        System.out.println(message);
    }
    public void printResult(String message, ArrayList<Integer> array){
        System.out.print(RESULT_MESSAGE);
        for (int i:array){
            System.out.print(i+", ");
        }
    }
}
