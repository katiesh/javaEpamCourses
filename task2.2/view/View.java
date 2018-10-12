package epam.java.view;

import epam.java.model.entity.Shape;

public class View {
    public static final String CHOICE = "What do you want to do with list of shapes?\n1.Print\n2.Calculate total area of all shapes" +
            "\n3.Calculate total area of selected type of shapes\n4.Order shapes by area\n5. Order shapes by color\n" +
            "Press 0 to exit\n";
    public static final String CHOOSE_SHAPE = "What shape do you want to choose?\n1.Triangle\n2.Rectagle\n3.Circle\n" +
            "Press 0 to exit\n";
    public static final String WRONG_INPUT = "Try to make choice one more time. Enter 1,2 etc.";
    public void printShapes(String message, Shape[] shapes){
        System.out.println(message);
        for (Shape i: shapes) {
            System.out.println(i.draw());
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndValue(String message, double value){
        System.out.println(message + value);
    }

    public void printShapesAndArea(String message, Shape[] shapes){
        System.out.println(message);
        for (Shape i: shapes) {
            System.out.print(i.draw());
        }
    }

}
