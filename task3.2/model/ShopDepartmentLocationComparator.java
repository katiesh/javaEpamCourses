package epam.java.model;

import epam.java.model.entity.Shop;
import epam.java.model.entity.Shop;

import java.util.Comparator;

public class ShopDepartmentLocationComparator implements Comparator {
    public int compare(Object o1, Object o2){
        String type1 = ((Shop.Department)o1).getLocation();
        String type2 = ((Shop.Department)o2).getLocation();
        return type1.compareTo(type2);
    }
}
