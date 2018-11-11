package epam.java.controller;

import epam.java.entities.Sentence;
import epam.java.entities.Text;
import epam.java.entities.Word;
import epam.java.model.Model;
import epam.java.view.InputUtility;
import epam.java.view.View;

public class Controller {
    private Model model;
    private View view;
    private Text text;

    public Controller() {
        this.model = new Model();
        this.view = new View();
        this.text = new Text();
    }

    public void run(){
        text = new Text(InputUtility.inputStringWithScanner(view, "Enter the adress of the file"));
        model.setText(text);
        int length = InputUtility.inputIntValueWithScanner(view, "Enter the length of words," +
                " which should be fined");
        model.searchWordsByLength(length);
        view.printSetInFile(text.getFileAddress() + "searchedWordsWithLength" + length +".txt", model.getWords());
    }
}
