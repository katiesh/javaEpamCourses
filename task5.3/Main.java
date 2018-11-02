package epam.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Translator translator = new Translator();
        Scanner sc = new Scanner(System.in);
        String addWord = "add";
        String addTranslation = "добавить";
        System.out.println("Add english word");
        while(!addWord.equals("0")){
            System.out.println("Add english word. Enter \"0\" to finish input");
            addWord = sc.next();
            System.out.println("Add translation");
            addTranslation = sc.next();
            translator.add(addWord, addTranslation);
        }
        System.out.println("Enter string to translete");
        sc.nextLine();
        String strForTranslation = sc.nextLine();
        String copyOfStr = strForTranslation;
        sc = new Scanner(copyOfStr).useDelimiter("\\W");
        Pattern notLetter = Pattern.compile("\\W");
        //Scanner scForNotWords = new Scanner(strForTranslation).useDelimiter("\\s");
        String word;
        while (sc.hasNext()) {
                word = sc.next();
                notLetter.split(word);
                translator.translateToRus(word);
                translator.translateToRus(" ");
        }
        System.out.println(translator.getTranslated());
        sc.close();
    }
}
