package main.java.epam.data;

import main.java.epam.model.entity.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataSource {
    public static Book[] getBooks(){
        return new Book[] {
                new Book("Title1", "Shevchenko", "BXV", 2010,320,450.0),
                new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
                new Book("Title3", "Franko", "Knyga", 1999,210,325.0),
                new Book("Title4", "Hohol", "BXV", 1980,450,500.0),
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0),
                new Book("Title6", "Kosach-Kvitka", "Ranok", 2000,240,250.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0),
                new Book("Title8", "Hohol", "BXV", 1980,375,500.0)
        };
    }

    public static Book[] getBooksFromFile(String fileAdress){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileAdress))){
            return new Book[]{
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine())),
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine())),
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine())),
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine())),
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine())),
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine())),
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine())),
                    new Book(reader.readLine(), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()),
                            Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine()))
            };
        }catch (IOException e){
            System.out.println(e.getMessage());
            return getBooks();
        }
    }
}
