package epam.java;

import epam.java.view.View;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(View view, String message) {
        view.printMessage(message);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT + message);
            sc.next();
        }
        return sc.nextInt();
    }

}
