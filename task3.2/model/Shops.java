package epam.java.model;

import epam.java.model.entity.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shops {
    private ArrayList <Shop> shops = new ArrayList<>();

    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void sortByShopName(){
        Collections.sort(shops,new ShopNameComparator());
    }

    public void sortByDepartmentName(){
        for (Shop shop:shops) {
            shop.sortByDepartmntName();
        }
    }

    public void sortByDepartmentLocation(){
        for (Shop shop:shops) {
            shop.sortByDepartmntLocation();
        }
    }

    public void sortByDepartmentServices(){
        for (Shop shop:shops) {
            shop.sortByDepartmntServices();
        }
    }

    public void sortByDepartmentTypeOfGoods(){
        for (Shop shop:shops) {
            shop.sortByDepartmntTypeOfGoods();
        }
    }
}
