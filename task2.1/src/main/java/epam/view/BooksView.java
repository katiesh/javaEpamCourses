package main.java.epam.view;

import main.java.epam.model.entity.Book;

import java.io.FileWriter;
import java.io.IOException;

public class BooksView {
    public static final String CHOICE = "What do you whant to do with a list of books?" +
            "\n1.Print it.\n2.Print books written by selected author.\n3.Print books published after selected year.\n" +
            "4.Order books by publisher.\n5.Print books written by selected publisher.\n" +
            "Press 0 to exit";
    public static final String ENTER_AUTHOR = "Please enter name of author";
    public static final String ENTER_PUBLISHER = "Please enter name of publisher";
    public static final String WRONG_INPUT = "Try to make choice one more time(you can enter 0,1,2 or 4)";
    public  static final String ENTER_YEAR = "Please enter year";
    public void printBooks(String message,Book[] books){
        System.out.println(message);
        for(Book book : books){
            System.out.println(book);
        }
    }
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printResultInFile(String fileAdress, Book[] books){
        try(FileWriter writer = new FileWriter(fileAdress)){
            for (Book book:books) {
                writer.write(book.toString());
                writer.flush();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
