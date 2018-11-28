package com.epam.task61.service.showStrategy;

import com.epam.task61.model.entity.Book;

import java.util.Arrays;
import java.util.Comparator;

public class ShowSortedByPublisher extends StrategyShow {

    @Override
    public String showBooks() {
        Book[] books = model.getBooks();
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublish().compareTo(o2.getPublish());
            }
        });
        return manager.getMessage("SORTED_BOOKS") + "\n" + serviceBooks.convertBooksInString(books);
    }
}
