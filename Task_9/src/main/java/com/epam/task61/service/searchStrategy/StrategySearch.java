package com.epam.task61.service.searchStrategy;

import com.epam.task61.model.Books;
import com.epam.task61.service.ServiceBooks;
import com.epam.task61.util.InputOutputFile;
import com.epam.task61.util.ResourceManager;

public abstract class StrategySearch {
    protected Books model = new Books();
    protected ResourceManager manager =
            ResourceManager.INSTANCE;
    protected ServiceBooks serviceBooks = new ServiceBooks();

    public StrategySearch() {
        model.setBooks(InputOutputFile.load());
    }

    public abstract String searchBooks(String parameter);
}
