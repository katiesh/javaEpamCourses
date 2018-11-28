package com.epam.task61.service.showStrategy;

public class ShowWithoutSort extends StrategyShow {
    @Override
    public String showBooks() {
        return manager.getMessage("listBooks") + "\n" + serviceBooks.convertBooksInString(model.getBooks());
    }
}
