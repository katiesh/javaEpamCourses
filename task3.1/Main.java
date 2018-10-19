package epam.java;

import epam.java.controller.Controller;
import epam.java.model.GameRoom;
import epam.java.view.View;

public class Main {

    public static void main(String[] args) {
        GameRoom model = new GameRoom();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.run();

    }
}
