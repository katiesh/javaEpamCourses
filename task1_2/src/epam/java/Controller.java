package epam.java;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void findPerfectNumbers(){
        model.setMaxNumber(InputUtility.inputIntValueWithScanner(view));
        model.searchPerfectNumbers();
        view.printResult(view.RESULT_MESSAGE, model.getPerfectNumbers());
    }
}
