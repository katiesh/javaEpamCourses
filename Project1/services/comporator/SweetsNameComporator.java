package epam.java.services.comporator;

import epam.java.model.entity.Sweet;

import java.util.Comparator;

public class SweetsNameComporator implements Comparator <Sweet> {
    @Override
    public int compare(Sweet sweet1, Sweet sweet2){
        return sweet1.getName().compareTo(sweet2.getName());
    }
}
