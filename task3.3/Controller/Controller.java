package epam.java.Controller;

import epam.java.model.Enumaration;
import epam.java.view.InputUtility;
import epam.java.view.View;

public class Controller {
    Enumaration model;
    View view = new View();

    public void run(){
        view.printValues(model);
        makeChoice();
    }

    private void makeChoice(){
        String inputStr;
        while(true) {
            inputStr = InputUtility.inputStringWithScanner(view, "Enter season to find out weather and how many days has this season" +
                    "\n Enter EXIT to exit");
            model.valueOf(inputStr);
            if (inputStr.equals(model.WINTER.name())) {
                view.printMessage("It is cold");
            } else if (inputStr.equals(model.SPRING.name())) {
                view.printMessage("It is getting warmer");
            } else if (inputStr.equals(model.SUMMER.name())) {
                view.printMessage("It is hot");
            } else if (inputStr.equals(model.AUTUMN.name())) {
                view.printMessage("It is raining");
            } else if(inputStr.equals("EXIT")){
                break;
            }else {
                view.printMessage(inputStr+"Try to input season one  more time");
            }
        }
    }


}
