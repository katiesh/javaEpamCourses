package epam.java.view;

import epam.java.model.Enum;
import epam.java.model.Enumaration;

public class View {

    public  void printMessage(String message){
        System.out.println(message);
    }

    public void printEnum(Enum element){
        System.out.println(element);
    }
    public void printValues(Enumaration model) {
        System.out.println("All seasons and amount of days of this season:");
        for (Enumaration value:model.values()) {
            System.out.println(value);
        }
    }

}
