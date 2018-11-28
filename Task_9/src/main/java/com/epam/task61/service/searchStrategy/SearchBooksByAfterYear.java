package com.epam.task61.service.searchStrategy;

import com.epam.task61.model.entity.Book;

public class SearchBooksByAfterYear extends StrategySearch {

    @Override
    public String searchBooks(String year) {
        Book[] books = model.getAfterYear(Integer.parseInt(year));
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS_YEAR")
                    + year;
        }
        return manager.getMessage("BOOKS_AFTER_YEAR")
                + year + "\n"
                + serviceBooks.convertBooksInString(books);
    }
}
