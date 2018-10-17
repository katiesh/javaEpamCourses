package epam.java.model;

import epam.java.model.entity.Shop;

import java.util.Comparator;

public class ShopDepartmentTypeOfGoodsComparator implements Comparator {
    public int compare(Object o1, Object o2){
        String type1 = ((Shop.Department)o1).getTypeOfGoods();
        String type2 = ((Shop.Department)o2).getTypeOfGoods();
        return type1.compareTo(type2);
    }
}
