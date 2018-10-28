package epam.java.services.search;

import epam.java.model.NewYearPresent;
import epam.java.model.entity.Candy;

import java.util.Iterator;

public class SearchCandies extends SearchSweets {
    public SearchCandies(NewYearPresent model) {
        super(model);
        searchCandies();
    }

    public SearchCandies() {
    }

    public void searchByCategorie(String categorie){
        Iterator<Candy> itr = filteredPresent.iterator();
        while (itr.hasNext()){
            if(!(itr.next().getCategorie().equals(categorie))){
                itr.remove();
            }
        }
    }

    public void searchByTaste(String taste){
        Iterator<Candy> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(!(itr.next().getTaste().equals(taste))){
                itr.remove();
            }
        }
    }
}
