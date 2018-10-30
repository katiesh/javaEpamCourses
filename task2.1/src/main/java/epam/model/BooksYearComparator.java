package main.java.epam.model;

import main.java.epam.model.entity.Book;

import java.util.Comparator;

public class BooksYearComparator implements Comparator {
    public int compare(Object o1, Object o2){
        Book book1 = (Book)o1;
        Book book2 = (Book)o2;
        return book1.getYear()-book2.getYear();
    }
}
