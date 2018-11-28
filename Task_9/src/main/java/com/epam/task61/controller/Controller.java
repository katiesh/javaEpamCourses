package com.epam.task61.controller;

import com.epam.task61.service.searchStrategy.Search;
import com.epam.task61.service.ServiceBooks;
import com.epam.task61.service.showStrategy.Show;
import com.epam.task61.util.InputUtility;
import com.epam.task61.util.ResourceManager;
import com.epam.task61.view.BookView;

public class Controller {
    ResourceManager manager = ResourceManager.INSTANCE;
    private ServiceBooks serviceBooks = new ServiceBooks();
    private BookView view = new BookView();

    public void run() {
        while (true) {
            view.printMessage(manager.getMessage("mainMenu"));
            int number = InputUtility.inputInt(view, manager);
            ItemMenu command = defineMenuItem(number);
            switch (command) {
                case SHOW_BOOKS:
                case SORT_PUBLISH:
                    view.printMessage(new Show(command).showing());
                    break;
                case FIND_AUTHOR:
                case FIND_YEAR:
                case FIND_PUBLISH:
                    if(command.equals(ItemMenu.FIND_YEAR)){
                        view.printMessage(new Search(command).searching(
                           String.format("%d", InputUtility.inputInt(view, manager))));
                    }
                    else{
                        view.printMessage(new Search(command).searching(
                                InputUtility.inputString(view, manager)));
                    }
                    break;
                case LANG:
                    view.printMessage(
                            manager.getMessage("LANGUARE"));
                    serviceBooks.changeLanguare(
                            InputUtility.inputInt(view, manager));
                    break;
                case EXIT:
                    serviceBooks.saveBooks();
                    System.exit(0);
                    break;
                default:
                    view.printMessage(
                            manager.getMessage("WRONG_INPUT_DATA"));
            }
        }
    }

    private ItemMenu defineMenuItem(int number) {
        ItemMenu[] itemMenus = ItemMenu.values();
        if (number < 0 || number >= itemMenus.length) {
            return ItemMenu.DEFAULT;
        }
        return itemMenus[number];
    }
}
