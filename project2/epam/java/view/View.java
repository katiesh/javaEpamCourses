package epam.java.view;

import epam.java.entities.Word;

import java.io.*;
import java.util.Set;

public class View {
    public static final String WRONG_INPUT = "Wrong input";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printSetInFile(String fileAdress, Set <Word> words) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileAdress);
            for (Word word: words) {
                writer.write(word.getWord());
                writer.append(' ');
                writer.flush();
            }
        } catch (IOException e){
        System.out.println(e.getMessage());
        } finally {
            if(writer != null){
                writer.close();
            }
        }
    }
}
