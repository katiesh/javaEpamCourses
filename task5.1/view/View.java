package epam.java.view;

import epam.java.model.entity.RecordInJournal;

import java.util.List;

public class View {
    public static final String WRONG_INPUT= "Wrong input";
    public static final String MENU = "Enter PRINT to print all records in journal\nEnter ADD to add record in journal";
    public static final String NAME_INPUT = "Enter name(first letter should be in upper case, rest - in lower case(max 30 symbols)";
    public static final String SURNAME_INPUT = "Enter surname(first letter should be in upper case, rest - in lower case(max 30 symbols)";
    public static final String TELEPHONE_INPUT = "Enter telephone number(Example: +380(50)1234567 ";
    public static final String DATE_INPUT = "Enter the date of birth(Example: 01.02.1990 or 1.1.1990(from 01.01.1900 to 31.12.2018)";
    public static final String ADDRESS_INPUT = "Enter home address(Example: ul. Panasa Myrnoho 9A, 122";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRecords(String message, List<RecordInJournal> records){
        System.out.println(message);
        for (RecordInJournal record:records) {
            System.out.println(record);
        }
    }

}
