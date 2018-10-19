package epam.java.model;

import java.util.Comparator;
import epam.java.model.Toy;

public class ToysMaterialComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        String material1 = ((Toy)o1).getMaterial();
        String material2 = ((Toy)o2).getMaterial();
        return material1.compareTo(material2);
    }

}
