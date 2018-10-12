package epam.java;

import epam.java.controller.Controller;
import epam.java.model.Shapes;
import epam.java.view.View;

public class Main {

    public static void main(String[] args) {
        Shapes model = new Shapes();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.run();
    }
}
