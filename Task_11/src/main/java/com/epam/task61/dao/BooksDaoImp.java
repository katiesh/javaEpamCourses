package com.epam.task61.dao;

import com.epam.task61.model.Books;
import com.epam.task61.model.entity.Book;
import com.epam.task61.view.BookView;

import java.sql.*;

public class BooksDaoImp implements BooksDAO {
    @Override
    public void update(Book book) {
        try(Connection conn = new ConnectionDB().getConn()) {
            PreparedStatement statement = conn.prepareStatement("UPDATE books SET titel = ?, author = ?," +
                    " publish = ?, year = ?, pages = ?, price = ? WHERE id = ?");
            statement.setString(1, book.getTitul());
            statement.setString(2, book.getAuthor());
            statement.setString(3, book.getPublish());
            statement.setInt(4, book.getYear());
            statement.setInt(5, book.getPages());
            statement.setDouble(6, book.getPrice());
            statement.setInt(7,book.getId());
            statement.execute();
        } catch (SQLException e) {
            BookView.printError(e.getMessage());
        }
    }

    @Override
    public void delete(Book book) {
        try (Connection conn = new ConnectionDB().getConn()) {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM books WHERE id=?");
            statement.setInt(1, book.getId());
            statement.execute();
        } catch (SQLException e) {
            BookView.printError(e.getMessage());
        }
    }

        @Override
    public Book read(int id) {
        Book book = null;
        try(Connection conn = new ConnectionDB().getConn()){
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM books WHERE id=?");
            statement.setInt(1,id);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                book = new Book(
                        res.getString("titel"),
                        res.getString("author"),
                        res.getString("publish"),
                        res.getInt("year"),
                        res.getInt("pages"),
                        res.getDouble("price")
                );
            }

        } catch (SQLException e) {
            BookView.printError(e.getMessage());
        }
        return book;
    }

//    @Override
//    public Book[] searchByString(Book[] books, String columnName, String searchedStr) {
//        return new Book[0];
//    }
//
//    @Override
//    public Book[] searchAfterInt(Book[] books, int searchedAfterInt) {
//        return new Book[0];
//    }

    @Override
    public Book[] getBooksByQuery(String query) {
        Books books = new Books();
        try(Connection conn = new ConnectionDB().getConn()) {
            Statement statement = conn.createStatement();
            ResultSet res= statement.executeQuery(query);
            while(res.next()){
                books.addBook(new Book(
                        res.getString("titel"),
                        res.getString("author"),
                        res.getString("publish"),
                        res.getInt("year"),
                        res.getInt("pages"),
                        res.getDouble("price")
                ));
            }
        } catch (SQLException e) {
            BookView.printError(e.getMessage());
        }
        return books.getBooks();
    }

     public void close(){}
}
