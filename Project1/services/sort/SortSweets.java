package epam.java.services.sort;

import epam.java.model.NewYearPresent;
import epam.java.services.comporator.SweetsNameComporator;
import epam.java.services.comporator.SweetsProducerComparator;
import epam.java.services.comporator.SweetsSugarContentComparator;
import epam.java.services.comporator.SweetsWeightComparator;
import epam.java.services.search.SearchSweets;

import java.util.Collections;

public class SortSweets {
    protected SearchSweets searchSweets;
    protected NewYearPresent model;

    public SortSweets(SearchSweets searchSweets, NewYearPresent model) {
        this.model = model;
        this.searchSweets = searchSweets;
    }

    public SortSweets() {
    }

    public void sortByWeight(){
        Collections.sort(searchSweets.getFilteredPresent(), new SweetsWeightComparator());
    }

    public void sortBySugarContent(){
        Collections.sort(model.getPresent(), new SweetsSugarContentComparator());
    }

    public void sortByProducer(){
        Collections.sort(model.getPresent(),new SweetsProducerComparator());
    }

    public void sortByName(){
        Collections.sort(model.getPresent(), new SweetsNameComporator());
    }

}
