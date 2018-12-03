package com.epam.task61.controller.command;

import com.epam.task61.dao.BooksDAO;
import com.epam.task61.dao.BooksDaoImp;
import com.epam.task61.service.ServiceBooks;
import com.epam.task61.util.ResourceManager;
import com.epam.task61.view.BookView;

abstract public class Command {
    protected ServiceBooks serviceBooks = new ServiceBooks();
    protected BooksDAO booksDAO = new BooksDaoImp();
    protected BookView view = new BookView();
    protected ResourceManager manager = ResourceManager.INSTANCE;
    public abstract String execute();
}
