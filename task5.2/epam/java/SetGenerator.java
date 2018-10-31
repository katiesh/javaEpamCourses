package epam.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetGenerator extends Generator {
    private Collection<Integer> set;

    public SetGenerator(int amount, int maxNumber, int minNumber) throws AmountOfElementsOfSetException {
        super(amount, maxNumber, minNumber);
        if((maxNumber-minNumber)<amount){
            throw new AmountOfElementsOfSetException();
        }
        generate();

    }

    public SetGenerator() {
    }

    @Override
    public void generate() {
        set = new HashSet<>();
        while(set.size()!=getAmount()){
            set.add((int)(Math.random()*(getMaxNumber()-getMinNumber()))+getMinNumber());
        }
    }

    public Collection<Integer> getSet() {
        return set;
    }
}
