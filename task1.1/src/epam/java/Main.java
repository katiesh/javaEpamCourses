package epam.java;

import epam.java.model.Model;
import epam.java.view.View;
import epam.java.controller.Controller;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.transfer();

    }
}
