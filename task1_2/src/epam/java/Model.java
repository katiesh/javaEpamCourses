package epam.java;

import java.util.ArrayList;

public class Model {
    private int maxNumber;
    private ArrayList <Integer> perfectNumbers;

    public Model() {
        this.maxNumber = 1;
        this.perfectNumbers = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getPerfectNumbers() {
        return perfectNumbers;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    private boolean isPerfectNumber(int number){
        int sum = 1;
        int max = number;
        for(int i=2; i<max; i++){
            if(number%i == 0){
                sum+=i;
                max=number/i;
                sum+=max;
            }
        }
        return number==sum;
    }

    public void searchPerfectNumbers(){
        for(int i=0; i<maxNumber; i++){
            if(isPerfectNumber(i)){
                perfectNumbers.add(i);
            }
        }
    }
}
