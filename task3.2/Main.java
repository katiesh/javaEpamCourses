package epam.java;

import epam.java.contoller.Controller;
import epam.java.model.Shops;
import epam.java.view.View;

public class Main {

    public static void main(String[] args) {
        Shops model = new Shops();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.run();
    }
}
