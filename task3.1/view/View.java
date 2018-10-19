package epam.java.view;

import epam.java.model.Toy;

public class View <T extends Toy>{
    public static String WRONG_INPUT = "Wrong input";

    public void printMessage(String message){
        System.out.println(message);
    }

    public static void printMessageAndValue(String message, int value){
        System.out.print(message + " " + value);
    }
    public void printToys(String message, T[] toys){
        System.out.println(message);
        for (T toy:toys) {
            System.out.println(toy);
        }
    }
}
