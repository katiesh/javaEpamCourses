package com.epam.task61.service.searchStrategy;

import com.epam.task61.model.entity.Book;

public class SearchBooksByPublisher extends StrategySearch {

    @Override
    public String searchBooks(String publisher) {
        Book[] books = model.getByPublisher(publisher);
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS")
                    + publisher;
        }
        return manager.getMessage("BOOKS_PUBLISH")
                + publisher
                + "\n" + serviceBooks.convertBooksInString(books);
    }
}
