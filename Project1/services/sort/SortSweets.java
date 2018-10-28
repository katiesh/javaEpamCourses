package epam.java.services.sort;

import epam.java.model.NewYearPresent;
import epam.java.services.comporator.SweetsNameComporator;
import epam.java.services.comporator.SweetsProducerComparator;
import epam.java.services.comporator.SweetsSugarContentComparator;
import epam.java.services.comporator.SweetsWeightComparator;
import epam.java.services.search.SearchSweets;

import java.util.Collections;

public class SortSweets {
    protected NewYearPresent model;

    public SortSweets(NewYearPresent model) {
        this.model = model;
    }

    public SortSweets() {
    }

    public void sortByWeight(){
        Collections.sort(model.getPresent(), new SweetsWeightComparator());
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
