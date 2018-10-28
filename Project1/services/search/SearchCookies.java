package epam.java.services.search;

import epam.java.model.NewYearPresent;
import epam.java.model.entity.Cookies;

import java.util.Iterator;

public class SearchCookies extends SearchSweets {
    public SearchCookies(NewYearPresent model) {
        super(model);
        searchCookies();
    }

    public SearchCookies() {
    }

    public void searchByQuantity(int minQuantity, int maxQuantity){
        Iterator<Cookies> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            double quantity = itr.next().getQuintity();
            if(quantity<minQuantity || quantity>maxQuantity){
                itr.remove();
            }
        }
    }

    public void searchByCategorie(String categorie){
        Iterator<Cookies> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(!itr.next().getCategorie().equals(categorie))
                itr.remove();
        }
    }
}
