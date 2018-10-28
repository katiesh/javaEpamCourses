package epam.java.data;

import epam.java.model.entity.Candy;
import epam.java.model.entity.Choсolate;
import epam.java.model.entity.Cookies;
import epam.java.model.entity.Sweet;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<Sweet> getSweets(){
        List<Sweet> sweets = new ArrayList<>();
        sweets.add(new Candy("Roshen", "Romashka",14.5, 8.1,"Chocolate Candy",
                "Chocolate"));
        sweets.add(new Cookies("Milka", "Choco cookie", 100, 42.5, 8,
                "Shortbread"));
        sweets.add(new Choсolate("Korona", "Milk chocolate with raisins and nuts", 100, 45.5,
                40,true,true, false));
        sweets.add(new Candy("Svitoch", "Sparta", 15, 8.1, "Chocolate Candy",
                "Chocolate"));
        sweets.add(new Candy("Svitoch", "Sparta", 14.5, 7.8, "Chocolate Candy",
                "Chocolate"));
        sweets.add(new Candy("Roshen", "Juice Mix", 5.1,3,"Lolly Pop", "Orange"));
        sweets.add(new Candy("Roshen", "Juice Mix", 4.9, 2.9, "Lolly Pop", "Strawberry"));
        sweets.add(new Candy("Roshen", "Juice Mix", 5.0, 3.0,"Lolly Pop", "Apple"));
        sweets.add(new Cookies("Oreo","Oreo Classic", 90, 65, 10, "Shortbread"));
        sweets.add(new Choсolate("Milka", "Milk chocolate with almond", 90, 55, 45, true, false, false));
        sweets.add (new Candy("Roshen", "Candy nut", 11.2, 6.1, "Chocolate Candy", "Nougat"));
        sweets.add (new Candy("Roshen", "Candy nut", 11.0, 6.0, "Chocolate Candy", "Nougat"));
        sweets.add(new Candy("Roshen", "Crazy Bee", 4.7, 3.1, "Jelly", "Apple"));
        sweets.add(new Candy("Roshen", "Crazy Bee", 4.4, 2.9, "Jelly", "Orange"));
        sweets.add(new Candy("Roshen", "Crazy Bee", 4.5, 3, "Jelly", "Strawberry"));
        sweets.add(new Candy("Roshen", "Crazy Bee", 4.7, 3.2, "Jelly", "Chery"));
        sweets.add(new Candy("Roshen", "Crazy Bee", 4.5, 3, "Jelly", "Apple"));
        sweets.add(new Candy("AVK", "Fruto Banda", 85, 57.1, "Jelly", "Watermellon"));
        sweets.add(new Candy("AVK","Trufalie", 9.5, 4.7, "Chocolate Candy", "Chocolate"));
        sweets.add(new Candy("AVK","Trufalie", 9.7, 4.8, "Chocolate Candy", "Chocolate"));
        sweets.add(new Choсolate("Millenium","Chery Dark Chocolate", 100, 40, 55, false,false,true));
        sweets.add(new Cookies("Roshen", "Multi cake strawberry cream", 195, 120, 12, "Shortbread"));
        sweets.add(new Cookies("Roshen", "English club with caramel and nuts", 112, 70, 8, "Sugar Cookies"));
        sweets.add(new Candy ("Mamba", "Fruimarmellads", 70, 40, "Jelly", "Tropic Mix"));
        sweets.add(new Candy("Roshen", "Jollies", 10.2, 7.3, "Jelly", "Chery"));
        sweets.add(new Candy("Roshen", "Jollies", 10.3, 7.5, "Jelly", "Lemon"));
        sweets.add(new Candy("Roshen", "Jollies", 10.1, 7.3, "Jelly", "Raspberry"));
        sweets.add(new Candy("Roshen", "Jollies", 10.4, 7.4, "Jelly", "Pear"));
        sweets.add(new Candy("Roshen", "Lollipops", 15, 9.2, "Lolly Pop", "Orange"));
        sweets.add(new Candy("Roshen", "Lollipops", 15.2, 9.5, "Lolly Pop", "Chery"));
        sweets.add(new Candy("Roshen", "Lollipops", 15.5, 9.7, "Lolly Pop", "Cola"));

        return sweets;
    }
}
