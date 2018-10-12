package epam.java.controller;

import epam.java.InputUtility;
import epam.java.data.DataSource;
import epam.java.model.Shapes;
import epam.java.model.entity.Cirkle;
import epam.java.model.entity.Rectagle;
import epam.java.model.entity.Triangle;
import epam.java.view.View;

public class Controller {
    private Shapes model = new Shapes();
    private View view = new View();

    public Controller(Shapes model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
    model.setShapes(DataSource.getShapes());
    makeChoice();
    }

    private void makeChoice(){
        outer:
        while(true){
            switch (InputUtility.inputIntValueWithScanner(view, view.CHOICE)){
                case 1: {
                    view.printShapes("All shapes", model.getShapes());
                    break;
                }
                case 2: {
                    model.calcAreaSum();
                    view.printMessage("The total area is " + model.getTotalArea());
                    break;
                }
                case 3:{
                    switch(InputUtility.inputIntValueWithScanner(view, view.CHOOSE_SHAPE)){
                        case 1:{
                            model.getByType(new Triangle());
                            view.printMessageAndValue("The total area of triangles is ", model.getTotalArea());
                            break;
                        }
                        case 2: {
                            model.getByType(new Rectagle());
                            view.printMessageAndValue("The total area of rectagles is ", model.getTotalArea());
                            break;
                        }
                        case 3:{
                            model.getByType(new Cirkle());
                            view.printMessageAndValue("The total area of cirkles is ", model.getTotalArea());
                            break;
                        }
                        case 0:{
                            break outer;
                        }
                        default:{
                            view.printMessage(view.WRONG_INPUT);
                            break;
                        }
                    }

                    break;

                }
                case 4:{
                    model.sortByArea();
                    view.printShapesAndArea("Shapes sorted be area", model.getShapes());
                    break;
                }

                case 5:{
                    model.sortByColor();
                    view.printShapesAndArea("Shapes sorted be color", model.getShapes());
                    break;
                }
                case 0:{
                    break outer;
                }
                default:{
                    view.printMessage(view.WRONG_INPUT);
                    break;
                }
            }
        }
    }
}
