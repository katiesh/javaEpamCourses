package epam.java;

import epam.java.controller.Controller;
import epam.java.model.Journal;
import epam.java.view.View;

public class Main {

    public static void main(String[] args) {
        Journal model = new Journal();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.run();
    }
}
