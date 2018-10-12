package epam.java.model;

import epam.java.model.entity.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;
        return (int)(shape1.getArea()-shape2.getArea());
    }
}
