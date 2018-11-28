package com.epam.task61.service.showStrategy;

import com.epam.task61.model.Books;
import com.epam.task61.service.ServiceBooks;
import com.epam.task61.util.InputOutputFile;
import com.epam.task61.util.ResourceManager;

public abstract class StrategyShow {
    protected Books model = new Books();
    protected ResourceManager manager =
            ResourceManager.INSTANCE;
    protected ServiceBooks serviceBooks = new ServiceBooks();

    public StrategyShow() {
        model.setBooks(InputOutputFile.load());
    }

    public abstract String showBooks();
}
