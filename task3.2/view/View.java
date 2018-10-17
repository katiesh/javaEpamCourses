package epam.java.view;

import epam.java.model.entity.Shop;

import java.util.ArrayList;

public class View {
    public static final String ENTER_SHOP_NUM = "Please enter number of shops";
    public static final String ENTER_SHOP_NAME = "Please enter the name of shop";
    public static final String ENTER_DEPARTMENT_NAME = "Please enter the name of department";
    public static final String ENTER_DEPARTMENT_LOCATION = "Please enter the location of department";
    public static final String ENTER_DEPARTMENT_SERVICES = "Please enter services of department";
    public static final String ENTER_DEPARTMENT_TYPE_OF_GOODS = "Please enter type of goods of department";
    public static final String WRONG_INPUT = "Wrong input";
    public static final String CHOICE = "What do you want to do?\n1.Add department\2.Delete department\n3.Print all shops and departments" +
            "\n4.Sort deparments by location\n5.Sort shops by name\n6.Add Shop\nPress 0 to exit";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printShops(String message, ArrayList<Shop> shops){
        printMessage(message);
        for (Shop shop:shops) {
            System.out.println(shop);
        }
    }
}
