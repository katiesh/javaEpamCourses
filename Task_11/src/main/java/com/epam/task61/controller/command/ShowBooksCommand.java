package com.epam.task61.controller.command;

import com.epam.task61.dao.BooksDAO;
import com.epam.task61.model.entity.Book;

public class ShowBooksCommand extends Command {
    @Override
    public String execute() {
        view.printMessage(manager.getMessage("listBooks"));
        return serviceBooks.showAllBooks();
    }
}
