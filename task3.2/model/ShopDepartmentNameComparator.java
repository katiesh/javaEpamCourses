package epam.java.model;

import epam.java.model.entity.Shop;

import java.util.Comparator;

public class ShopDepartmentNameComparator implements Comparator {
    public int compare(Object o1, Object o2){
        String type1 = ((Shop.Department)o1).getName();
        String type2 = ((Shop.Department)o2).getName();
        return type1.compareTo(type2);
    }
}
