package epam.java.services.search;

import epam.java.model.NewYearPresent;
import epam.java.model.entity.Choсolate;

import java.util.Iterator;

public class SearchChocolate extends SearchSweets {
    public SearchChocolate(NewYearPresent model) {
        super(model);
        searchChocolate();
    }

    public SearchChocolate() {
    }

    public void searchByPercentOfCocoa(double minPercentOfCocoa, double maxPercentOfCocoa){
        Iterator<Choсolate> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            double percentOfCocoa = itr.next().getPercentOfCocoa();
            if(percentOfCocoa<minPercentOfCocoa || percentOfCocoa>maxPercentOfCocoa){
                itr.remove();
            }
        }
    }

    public void searchByRaisins(boolean hasRaisins){
        Iterator<Choсolate> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(itr.next().isContainsRaisins() ^ hasRaisins){
                itr.remove();
            }
        }
    }

    public void searchByNuts(boolean hasNuts){
        Iterator<Choсolate> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(itr.next().isContainsNuts() ^ hasNuts){
                itr.remove();
            }
        }
    }

    public void searchByFruits(boolean hasFruits){
        Iterator<Choсolate> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(itr.next().isContainsFruits() ^ hasFruits){
                itr.remove();
            }
        }
    }
}
