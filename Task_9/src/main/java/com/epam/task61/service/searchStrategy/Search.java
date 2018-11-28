package com.epam.task61.service.searchStrategy;

import com.epam.task61.controller.ItemMenu;

public class Search {
    private StrategySearch strategySearch = null;

    public Search(ItemMenu command) {
        switch (command){
            case FIND_AUTHOR:
                strategySearch = new SearchBooksByAuthor();
                break;
            case FIND_PUBLISH:
                strategySearch = new SearchBooksByPublisher();
                break;
            case FIND_YEAR:
                strategySearch = new SearchBooksByAfterYear();
                break;
        }
    }

    public String searching (String parameter){
        if (strategySearch != null) {
            return strategySearch.searchBooks(parameter);
        }
        else return strategySearch.serviceBooks.convertBooksInString(strategySearch.model.getBooks());
    }
}
