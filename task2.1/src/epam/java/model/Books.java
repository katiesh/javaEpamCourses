package epam.java.model;

import epam.java.model.entity.Book;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Books {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getByAuthor(String author){
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (int i = 0; i < books.length ; i++) {
            if(books[i].getAuthor().equals(author)){
                temp[counter++] = books[i];
            }
        }
        return Arrays.copyOf(temp,counter);
    }

    public Book[] getByPublisher(String publisher){
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (int i = 0; i < books.length ; i++) {
            if(books[i].getPublisher().equals(publisher)){
                temp[counter++] = books[i];
            }
        }
        return Arrays.copyOf(temp,counter);
    }

    public void sortByPublisher(){
        Arrays.sort(books, new BooksPublisherComparator());
    }

    public Book[] getAfterYear(int year){
        Arrays.sort(books,new BooksYearComparator());
        System.out.println(indexAfterYearSearch(year));
        return Arrays.copyOfRange(books,indexAfterYearSearch(year),books.length-1);
    }

    private int indexAfterYearSearch(int year){
        int left = 0;
        int right = books.length;
        int i=0;
        while(true){
            if(right<=left){
                if(books[i].getYear()>year){
                    return i;
                }
                else {
                    return i++;
                }
            }
            i=left + (right - left)/2;
            if (books[i].getYear() == year) {
                while(books[i].getYear()== year){
                    i++;
                }
                return i;
            }
            if (books[i].getYear()>year) {
                right = i;
            }
            else{
                left = i+1;
            }
        }
    }

}
