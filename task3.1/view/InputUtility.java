package epam.java.view;

import epam.java.model.AnimalToy;
import epam.java.model.Car;
import epam.java.model.Doll;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(View view,String message) {
        view.printMessage(message);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT + message);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String inputStringWithScanner(View view, String message) {
        view.printMessage(message);
        return sc.next();
    }

    public static Doll inputDollWithScanner(View view){
        view.printMessage("Enter doll");
        Doll doll = new Doll();
        doll.setName(inputStringWithScanner(view,"Enter name"));
        doll.setMaterial(inputStringWithScanner(view,"Enter material"));
        doll.setPrice(inputIntValueWithScanner(view,"Enter price"));
        return doll;
    }

    public static Car inputCarWithScanner(View view){
        view.printMessage("Enter car");
        Car car = new Car();
        car.setModel(inputStringWithScanner(view,"Enter model"));
        car.setColor(inputStringWithScanner(view,"Enter color"));
        car.setMaterial(inputStringWithScanner(view,"Enter material"));
        car.setPrice(inputIntValueWithScanner(view,"Enter price"));
        return car;
    }

    public static AnimalToy inputAnimalToyWithScanner(View view){
        view.printMessage("Enter animal toy");
        AnimalToy animalToy = new AnimalToy();
        animalToy.setAnimal(inputStringWithScanner(view,"Enter animal"));
        animalToy.setMaterial(inputStringWithScanner(view,"Enter material"));
        animalToy.setPrice(inputIntValueWithScanner(view,"Enter price"));
        return animalToy;
    }
}
