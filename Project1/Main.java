package epam.java;

import epam.java.controller.Controller;
import epam.java.model.NewYearPresent;
import epam.java.model.entity.Sweet;
import epam.java.services.search.SearchCookies;
import epam.java.services.search.SearchSweets;
import epam.java.view.View;

public class Main {

    public static void main(String[] args) {
        NewYearPresent<Sweet> model = new NewYearPresent();
        View <Sweet> view = new View<>();
        Controller controller = new Controller(model, view);
        controller.run();
    }
}
