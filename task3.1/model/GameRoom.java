package epam.java.model;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;

public class GameRoom <T extends Toy>{
    private T toys[];
    private int totalPrice;

    public void setToys( T[] toys) {
        this.toys = toys;
    }

    public T[] getToys() {
        return toys;
    }

    public void sortToysByMaterial(){
        Arrays.sort(toys,new ToysMaterialComparator());
    }

    public int getTotalPrice(){
        totalPrice = 0;
        for (int i = 0; i <toys.length ; i++) {
            totalPrice+=toys[i].getPrice();
        }
        return totalPrice;
    }

    public T[] getByMaterial(String material, T[] searchedToys){
        T[] temp = searchedToys;
        int counter = 0;
        for (int i = 0; i < searchedToys.length ; i++) {
            if(searchedToys[i].getMaterial().equals(material)){
                temp[counter++] = toys[i];
            }
        }
        return Arrays.copyOf(temp,counter);
    }

    public T[] getByPrice(int priceFrom,int priceTo, T[] searchedToys){
        T[] temp = searchedToys;
        int counter = 0;
        for (int i = 0; i < searchedToys.length ; i++) {
            if(searchedToys[i].getPrice()>=priceFrom && searchedToys[i].getPrice()<=priceTo){
                temp[counter++] = toys[i];
            }
        }
        return Arrays.copyOf(temp,counter);
    }

}
