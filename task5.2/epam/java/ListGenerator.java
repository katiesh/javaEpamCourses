package epam.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListGenerator extends Generator {
    private Collection <Integer> list;

    public ListGenerator(int amount, int maxNumber, int minNumber) {
        super(amount, maxNumber, minNumber);
        generate();
    }

    public ListGenerator() {
    }

    @Override
    public void generate(){
        list = new ArrayList<>();
        while(list.size()!=getAmount()){
            list.add((int)(Math.random()*(getMaxNumber()-getMinNumber()))+getMinNumber());
        }
    }

    public Collection<Integer> getList() {
        return list;
    }
}
