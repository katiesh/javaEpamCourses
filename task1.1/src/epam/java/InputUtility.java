package epam.java;

import java.util.Scanner;
import epam.java.view.View;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(View view) {
        view.printMessage(view.INPUT_NUMBER);
        int input = -1;
        while (input<0) {
            if (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT);
                sc.next();
            }
            else {
                input = sc.nextInt();
                if(input<0) {
                    view.printMessage(view.WRONG_INPUT);
                }
           }
        }
        return input;
    }
    public static int inputNumSystemValueWithScanner(View view) {
        view.printMessage(view.CHOOSE_SYSTEM);
        int choice = sc.nextInt();
        while( choice!=2 && choice!=8 && choice!=16) {
            view.printMessage(view.WRONG_INPUT );
        }
        return choice;
    }
}
