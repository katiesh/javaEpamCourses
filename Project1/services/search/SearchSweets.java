package epam.java.services.search;

import epam.java.model.NewYearPresent;
import epam.java.model.entity.Candy;
import epam.java.model.entity.Cookies;
import epam.java.model.entity.Sweet;
import epam.java.model.entity.Choсolate;

import java.util.Iterator;
import java.util.List;

public class SearchSweets <T extends  Sweet> {
    private NewYearPresent model;
    protected List <T> filteredPresent;

    public SearchSweets(NewYearPresent model) {
        this.model = model;
        this.filteredPresent = model.getPresent();
    }

    public SearchSweets() {
    }

    public void searchCookies(){
        Iterator <T> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(!(itr.next() instanceof Cookies)){
                itr.remove();
            }
        }
    }

    public void searchChocolate(){
        Iterator <T> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(!(itr.next() instanceof Choсolate)){
                itr.remove();
            }
        }
    }

    public void searchCandies(){
        Iterator <T> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(!(itr.next() instanceof Candy)){
                itr.remove();
            }
        }
    }

    public void searchByProducer( String producer){
        Iterator <T> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(!itr.next().getProducer().equals(producer))
                itr.remove();
        }
    }

    public void searchByName(String name){
        Iterator <T> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            if(!itr.next().getName().equals(name))
                itr.remove();
        }
    }

    public void searchBySugarContent(double minSugarContent, double maxSugarContent){
        Iterator <T> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            double sugarContent = itr.next().getSugarContent();
            if(sugarContent<minSugarContent || sugarContent>maxSugarContent){
                itr.remove();
            }
        }
    }

    public void searchByWeight(double minWeight, double maxWeight){
        Iterator <T> itr = filteredPresent.iterator();
        while(itr.hasNext()){
            double weight = itr.next().getWeigth();
            if(weight<minWeight || weight>maxWeight){
                itr.remove();
            }
        }
    }

    public List<T> getFilteredPresent() {
        return filteredPresent;
    }

    public void setFilteredPresent(List<T> filteredPresent) {
        this.filteredPresent = filteredPresent;
    }
}
