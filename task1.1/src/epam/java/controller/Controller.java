package epam.java.controller;


import epam.java.InputUtility;
import epam.java.model.Model;
import epam.java.view.View;

public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

        public void transfer(){
            model.setNum(InputUtility.inputIntValueWithScanner(view));
            model.transferToAnotherNumSystem( InputUtility.inputNumSystemValueWithScanner(view));
            view.printMessageAndResult(view.RESULT,model.getTransferedNum());
        }
}
