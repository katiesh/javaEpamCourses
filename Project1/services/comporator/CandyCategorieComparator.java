package epam.java.services.comporator;

import epam.java.model.entity.Candy;

import java.util.Comparator;

public class CandyCategorieComparator implements Comparator<Candy> {
    @Override
    public int compare(Candy candy1, Candy candy2){
        return candy1.getCategorie().compareTo(candy2.getCategorie());
    }
}
