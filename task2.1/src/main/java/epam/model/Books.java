package main.java.epam.model;

import main.java.epam.model.entity.Book;

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
        Arrays.sort(books, new main.java.epam.model.BooksPublisherComparator());
    }

    public Book[] getAfterYear(int year){
        Arrays.sort(books,new main.java.epam.model.BooksYearComparator());
        return Arrays.copyOfRange(books,indexAfterYearSearch(year),books.length);
    }

    /**
     * Search for an index of the element in array
     * @param year is the number which index should be searched in the array
     * @return the index of the element which is searched if the array has it or the index of the first element
     * which is larger than element which is searched
     */
    private int indexAfterYearSearch(int year){
        int left = 0;
        int right = books.length;
        int currentIndex=0;
        while(true){
            if(right<=left){
                if(books[currentIndex].getYear()>year){
                    return currentIndex;
                }
                else {
                    while(currentIndex<books.length && books[currentIndex].getYear()<year){
                        currentIndex++;
                    }
                    return currentIndex;
                }
            }
            currentIndex=left + (right - left)/2;
            if (books[currentIndex].getYear() == year) {
                while(books[currentIndex].getYear()== year){
                    currentIndex++;
                }
                return currentIndex;
            }
            if (books[currentIndex].getYear()>year) {
                right = currentIndex;
            }
            else{
                left = currentIndex+1;
            }
        }
    }

}
