package com.epam.task61.service.searchStrategy;

import com.epam.task61.model.entity.Book;

public class SearchBooksByAuthor extends StrategySearch {
    @Override
    public String searchBooks(String author){
        Book[] books = model.getByAuthor(author);
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS")
                    + author;
        }
        return manager.getMessage("BOOKS_AUTHOR")
                + author + "\n"
                + serviceBooks.convertBooksInString(books);
    }
}
