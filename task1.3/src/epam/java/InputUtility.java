package epam.java;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(View view) {
        view.printMessage(view.INPUT_HEIGHT);
        int inputNumber=0;
        while(inputNumber<1 || inputNumber>9) {
            if (sc.hasNextInt()) {
                inputNumber = sc.nextInt();
                if(inputNumber<1 || inputNumber>9){
                    view.printMessage(view.WRONG_INPUT + view.INPUT_HEIGHT);
                }
            } else {
                view.printMessage(view.WRONG_INPUT + view.INPUT_HEIGHT);
                sc.next();
            }
        }
        return inputNumber;
    }
}
