package epam.java.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(View view,String message) {
        int input = 0;
        check:
        while( input<=0) {
            view.printMessage(message);
            if (!sc.hasNextInt()) {
                view.printMessage(message);
                sc.next();
            }
            else{
                input = sc.nextInt();
                continue check;
            }
        }
        return input;
    }

    public static String inputStringWithScanner(View view, String message) {
        view.printMessage(message);
        return sc.next();
    }
}
