package com.epam.task61.service;

import com.epam.task61.dao.BooksDAO;
import com.epam.task61.dao.BooksDaoImp;
import com.epam.task61.exception.UnExistItemMenu;
import com.epam.task61.model.Books;
import com.epam.task61.model.entity.Book;
import com.epam.task61.util.InputOutputFile;
import com.epam.task61.util.ResourceManager;

import java.util.Locale;

public class ServiceBooks {
    private Books model = new Books();
    private ResourceManager manager =
            ResourceManager.INSTANCE;
    private BooksDAO booksDAO = new BooksDaoImp();

    public ServiceBooks() {
//        model.setBooks(DataSource.getBooks());
//        model.setBooks(InputOutputFile.load());
        model.setBooks(booksDAO.getBooksByQuery(BooksDAO.SELECT_ALL));
    }

    public String showAllBooks() {
        return convertBooksInString(model.getBooks());
    }

    private String convertBooksInString(Book[] books) {
        StringBuilder str = new StringBuilder();
        for (Book book : books ) {
            str.append(book);
            str.append("\n");
        }
        return str.toString();
    }

    public String searchBooksByAuthor(String author){
//        Book[] books = model.getByAuthor(author);
        Book[] books = booksDAO.getBooksByQuery(BooksDAO.SELECT_BY_AUTHOR + "\"" + author + "\"");
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS")
                    + author + "\n";
        }
        return manager.getMessage("BOOKS_AUTHOR")
                + author + "\n"
                + convertBooksInString(books);
    }

    public String searchBooksByPublisher(String publisher){
//        Book[] books = model.getByPublisher(publisher);
        Book[] books = booksDAO.getBooksByQuery(BooksDAO.SELECT_BY_PUBLISH + "\"" + publisher + "\"");
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS")
                    + publisher + "\n";
        }
        return manager.getMessage("BOOKS_PUBLISH")
                + publisher
                + "\n" + convertBooksInString(books);
    }

    public String searchBooksAfterYear(int year){
//        Book[] books = model.getAfterYear(year);
        Book[] books = booksDAO.getBooksByQuery(BooksDAO.SELECT_AFTER_YEAR+ "\"" + year + "\"");
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS_YEAR")
                    + year + "\n";
        }
        return manager.getMessage("BOOKS_AFTER_YEAR")
                + year + "\n"
                + convertBooksInString(books);
    }

    public String sortByPublisher() {
//        Book[] books = model.getBooks();
        Book[] books = booksDAO.getBooksByQuery(BooksDAO.SORT_BY_PUBLISH);
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getPublish().compareTo(o2.getPublish());
//            }
//        });
        return convertBooksInString(books);
    }

    public void changeLanguare(int choise) throws UnExistItemMenu {
        manager.changeLocale(defineLocale(choise));
    }

    private Locale defineLocale(int number) throws UnExistItemMenu {
        Languare[] languares = Languare.values();
        if (number <= 0 || number > languares.length) {
            throw new UnExistItemMenu(manager.getMessage("WRONG_INPUT_DATA"));
        }
        return languares[number - 1].getLocale();
    }

    public void saveBooks() {
        InputOutputFile.save(model.getBooks());
    }
}
