package epam.java.services.comporator;

import epam.java.model.entity.Sweet;

import java.util.Comparator;

public class SweetsWeightComparator implements Comparator<Sweet> {
    @Override
    public int compare(Sweet sweet1, Sweet sweet2){
        if(sweet1.getWeigth()>sweet2.getWeigth()){
            return 1;
        }
        else if(sweet1.getWeigth()<sweet2.getWeigth()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
