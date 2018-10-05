package epam.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.findPerfectNumbers();
    }
}
