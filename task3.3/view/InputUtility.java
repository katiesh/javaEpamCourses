package epam.java.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static String inputStringWithScanner(View view, String message) {
        view.printMessage(message);
        return sc.next();
    }
}
