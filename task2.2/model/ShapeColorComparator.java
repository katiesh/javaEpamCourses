package epam.java.model;

import epam.java.model.entity.Shape;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        String color1 = ((Shape)o1).getShapeColor();
        String color2 = ((Shape)o2).getShapeColor();
        return color1.compareTo(color2);
    }
}
