package epam.java.model;

import epam.java.model.entity.Sweet;

import java.util.ArrayList;
import java.util.List;

public class NewYearPresent<T extends Sweet> {
    List <T> present = new ArrayList<>();
    double totalWeight;

    public NewYearPresent(List<T> present) {
        this.present = present;
    }

    public NewYearPresent() {
    }

    public List<T> getPresent() {
        return present;
    }

    public void setPresent(List<T> present) {
        this.present = present;
    }

    public double calcTotalWeight(){
        for (T sweet:present) {
            totalWeight+=sweet.getWeigth();
        }
        return totalWeight;
    }

}
