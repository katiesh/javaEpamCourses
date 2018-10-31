package epam.java;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(String message) {
        int input = -1;
        check:
        while( input<0) {
            System.out.println(message + "(number should be integer and positive)");
            if (!sc.hasNextInt()) {
                System.out.println(message + "(number should be integer and positive)");
                sc.next();
            }
            else{
                input = sc.nextInt();
                continue check;
            }
        }
        return input;
    }
}
