package com.epam.task61.service.showStrategy;

import com.epam.task61.controller.ItemMenu;

public class Show {
    private StrategyShow strategy = null;

    public Show(ItemMenu command) {
        switch (command){
            case SHOW_BOOKS:
                strategy = new ShowWithoutSort();
                break;
            case SORT_PUBLISH:
                strategy = new ShowSortedByPublisher();
                break;
        }
    }

    public String showing(){
            return strategy.showBooks();
    }
}
