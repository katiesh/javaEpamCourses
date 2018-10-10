package epam.java;

import epam.java.view.BooksView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(BooksView view,String message) {
        view.printMessage(message);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT + message);
            sc.next();
        }
        return sc.nextInt();
    }
    public static String inputAuthorWithScanner(BooksView view, String message) {
        view.printMessage(message);
        return sc.next();
    }
}