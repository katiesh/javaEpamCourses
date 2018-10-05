package epam.java;

public class Controller {
    Model model = new Model();
    View view = new View();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void printTriangle(){
        model.setHeigth(InputUtility.inputIntValueWithScanner(view));
        model.makeTriangle();
        view.printTriangle(model.getTriangle(),model.getHeigth());
    }
}
