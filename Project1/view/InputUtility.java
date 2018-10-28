package epam.java.view;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(View view,String message) {
        view.printMessage(message);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT + message);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String inputStringWithScanner(View view, String message) {
        view.printMessage(message);
        return sc.next();
    }

    public static boolean inputBooleanValue(View view, String message){
        view.printMessage(message);
        if (!sc.hasNextBoolean()){
            sc.next();
            view.printMessage(view.WRONG_INPUT);
        }
        return sc.nextBoolean();
    }
}
