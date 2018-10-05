package epam.java;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(View view) {
        view.printMessage(view.INPUT_SIZE);
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
}
