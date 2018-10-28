package epam.java.services.comporator;

import epam.java.model.entity.Choсolate;

import java.util.Comparator;

public class ChocolatePercentOfCocoaComparotor implements Comparator<Choсolate> {
    @Override
    public int compare(Choсolate choсolate1 , Choсolate choсolate2){
        if(choсolate1.getPercentOfCocoa()>choсolate2.getPercentOfCocoa()){
            return 1;
        }
        else if(choсolate1.getPercentOfCocoa()<choсolate2.getPercentOfCocoa()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
