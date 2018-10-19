package epam.java.data;

import epam.java.ToysTypes;
import epam.java.model.AnimalToy;
import epam.java.model.Car;
import epam.java.model.Doll;
import epam.java.model.Toy;
import epam.java.view.InputUtility;
import epam.java.view.View;

public class DataSetter {

    public Doll[] setDolls(int amount, View view){
        Doll[] dolls = new Doll[amount];
        for (int i = 0; i <amount; i++) {
            dolls[i] = InputUtility.inputDollWithScanner(view);
        }
        return dolls;
    }

    public Car[] setCars(int amount, View view){
        Car[] cars = new Car[amount];
        for (int i = 0; i <amount; i++) {
            cars[i] = InputUtility.inputCarWithScanner(view);
        }
        return cars;
    }

    public AnimalToy[] setAnimalToys(int amount, View view){
        AnimalToy[] animalToys = new AnimalToy[amount];
        for (int i = 0; i <amount; i++) {
            animalToys[i] = InputUtility.inputAnimalToyWithScanner(view);
        }
        return animalToys;
    }

    public Toy[] setToys(int amount, View view){
        Toy[] toys = new Toy[amount];
        for (int i = 0; i <amount; i++) {
            switch (ToysTypes.valueOf(InputUtility.inputStringWithScanner(view, "Enter CAR, DOLL or ANIMAL_TOY " +
                    "to add appropriate toy"))){
                case CAR:{
                    toys[i] = InputUtility.inputCarWithScanner(view);
                    break;
                }
                case DOLL:{
                    toys[i] = InputUtility.inputDollWithScanner(view);
                    break;
                }
                case ANIMAL_TOY:{
                    toys[i] = InputUtility.inputAnimalToyWithScanner(view);
                    break;
                }
            }
        }
        return toys;
    }
}
