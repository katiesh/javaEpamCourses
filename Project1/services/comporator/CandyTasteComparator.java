package epam.java.services.comporator;

import epam.java.model.entity.Candy;

import java.util.Comparator;

public class CandyTasteComparator implements Comparator<Candy> {
    @Override
    public int compare(Candy candy1, Candy candy2){
        return candy1.getTaste().compareTo(candy2.getTaste());
    }
}
