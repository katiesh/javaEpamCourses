package epam.java.controller;

import epam.java.model.Journal;
import epam.java.model.entity.RecordInJournal;
import epam.java.view.InputUtility;
import epam.java.view.MenuItems;
import epam.java.view.View;

public class Controller {
    private Journal model;
    private View view;

    public Controller(Journal model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
        run:
        while(true){
            switch (MenuItems.valueOf(InputUtility.InputMenuItem(view))){
                case ADD:{
                    RecordInJournal record = new RecordInJournal(
                            InputUtility.InputDataWithScanner(view, View.NAME_INPUT, InputUtility.patternName),
                            InputUtility.InputDataWithScanner(view, View.SURNAME_INPUT, InputUtility.patternName),
                            InputUtility.InputDataWithScanner(view, View.DATE_INPUT, InputUtility.patternDate),
                            InputUtility.InputDataWithScanner(view, View.TELEPHONE_INPUT, InputUtility.patternTel),
                            InputUtility.InputDataWithScanner(view, View.ADDRESS_INPUT, InputUtility.patternAddress));
                    model.addRecord(record);
                    break;
                }
                case PRINT:{
                    view.printRecords("All records in journal", model.getRecords());
                    break;
                }
                case EXIT: {
                    break run;
                }
            }
        }

    }
}
