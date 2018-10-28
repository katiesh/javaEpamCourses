package epam.java.services.comporator;

import epam.java.model.entity.Sweet;

import java.util.Comparator;

public class SweetsProducerComparator implements Comparator<Sweet> {
    @Override
    public int compare(Sweet sweet1, Sweet sweet2){
        return sweet1.getProducer().compareTo(sweet2.getProducer());
    }
}
