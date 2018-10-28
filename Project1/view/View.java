package epam.java.view;

import epam.java.model.entity.Sweet;

import java.util.List;

public class View <T extends Sweet> {
    public static final String CHOICE =  "What do you whant to do? Please enter one of the following items\nPRINT\nPRINT_TOTAL_WEIGHT" +
            "\nSORT_BY_WEIGHT\nSORT_BY_SUGAR_CONTENT\nSORT_BY_PRODUCER\nSORT_BY_NAME\nSELECT_BY_WEIGHT\nSELECT_BY_PRODUCER\nSELECT_BY_NAME\nSELECT_BY_SUGAR_CONTENT\n" +
            "SELECT_CANDIES\nSELECT_CHOCOLATE\nSELECT_COOKIES\nSELECT_CANDIES_BY_TASTE\nSELECT_CANDIES_BY_CATEGORIE\n" +
            "SELECT_CHOCOLATE_WITH_NUTS\nSELECT_CHOCOLATE_WITH_RAISINS\nSELECT_CHOCOLATE_WITH_FRUITS\n" +
            "SELECT_CHOCOLATE_BY_PERCENT_OF_COCOA\nSELECT_COOKIES_BY_QUANTITY\nSELECT_COOKIES_BY_CATEGORIE\nDELETE_FILTERS\nEXIT";

    public static final String WRONG_INPUT = "Wrong input!";

    public void printList(String message, List<T> list){
        System.out.println(message);
        for (T element: list
                ) {
            System.out.println(element);
        }
        System.out.println("------------------------------------------------");
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndValue(String message, double value){
        System.out.print(message + " " + value);
    }
}
