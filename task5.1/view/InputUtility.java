package epam.java.view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    private static String regExpName = "[A-Z][a-z]{1,29}";
    private static String regExpDate = "(\\d{1,2}[.]){2}(([1][9]\\d{2})|([2][0]\\d[0-8]))";
    private static String regExpTel = "[+][1-9]\\d{0,2}[(]\\d{2}[)](\\d{7})";
    private static String regExpAddress = "([ul]|[per]|[prosp]|[pl]|[bul])[.][ ][A-Z][a-z]{1,29}([ -][A-Z][a-z]{1,29}){0,2}[ ]" +
            "[1-9][0-9]{0,2}[A-Z]?[,][ ][1-9][\\d]{0,3}";
    private static String regExpMenuItem = "[PRINT]|[ADD]|[EXIT]";
    public static final Pattern patternName = Pattern.compile(regExpName);
    public static final Pattern patternDate = Pattern.compile(regExpDate);
    public static final Pattern patternTel = Pattern.compile(regExpTel);
    public static final Pattern patternAddress = Pattern.compile(regExpAddress);
    public static final Pattern patternMenuItem = Pattern.compile(regExpMenuItem);
    private static Matcher matcher;
    private static String input;

    public static String InputDataWithScanner(View view, String message, Pattern pattern){
        view.printMessage(message);
        input = sc.nextLine();
        matcher = pattern.matcher(input);
        while(!matcher.find()){
            view.printMessage(View.WRONG_INPUT + message);
            input = sc.nextLine();
            matcher = pattern.matcher(input);
        }
        return input;
    }

    public static String InputMenuItem(View view){
        view.printMessage(View.MENU);
        input = sc.next();
        input.toUpperCase();
        matcher = patternMenuItem.matcher(input);
        while(!matcher.find()){
            view.printMessage(View.WRONG_INPUT + View.MENU);
            input = sc.nextLine();
            matcher = patternMenuItem.matcher(input);
        }
        return input;
    }
}
