package com.epam.task61.dao;

import com.epam.task61.model.entity.Book;

public interface BooksDAO {
    public static final String SELECT_ALL = "SELECT * FROM books";
    public static final String SELECT_BY_AUTHOR = "SELECT * FROM books WHERE author = ";
    public static final String SELECT_BY_PUBLISH = "SELECT * FROM books WHERE publish = ";
    public static final String SELECT_AFTER_YEAR = "SELECT * FROM books WHERE year>";
    public static final String SORT_BY_PUBLISH = "SELECT * FROM books ORDER BY publish";
    void update(Book book);
    void delete (Book book);
    //void close();
    Book read (int id);
//    Book[] searchByString(Book[] books, String columnName, String searchedStr);
//    Book[] searchAfterInt(Book[] books, int searchedAfterInt);
    Book[] getBooksByQuery(String query);
}
