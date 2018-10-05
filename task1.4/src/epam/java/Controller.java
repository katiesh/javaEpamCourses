package epam.java;

public class Controller {
    Model model = new Model();
    View view = new View();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void rotate(){
        model.setSize(InputUtility.inputIntValueWithScanner(view));
        view.printMessage(view.PRINT_MATRIX);
        model.setMatrix();
        view.printMatrix(model.getMatrix(),model.getSize());
        model.rotateMatrix();
        view.printMessage(view.PRINT_RESULT_MATRIX);
        view.printMatrix(model.getMatrix(),model.getSize());
    }
}
