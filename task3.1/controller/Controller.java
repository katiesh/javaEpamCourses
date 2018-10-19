package epam.java.controller;

import epam.java.MenuItems;
import epam.java.ToysTypes;
import epam.java.data.DataSetter;
import epam.java.data.SearchData;
import epam.java.model.GameRoom;
import epam.java.model.Toy;
import epam.java.view.InputUtility;
import epam.java.view.View;


public class Controller {
    private GameRoom model;
    private View view;
    private DataSetter dataSetter = new DataSetter();
    private SearchData searchData = new SearchData(view,model);

    public Controller(GameRoom model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int amount = InputUtility.inputIntValueWithScanner(view, "Enter number of toys in game room");
        switch (ToysTypes.valueOf(InputUtility.inputStringWithScanner(view,"What toys are in game room?(ANIMAL_TOY" +
                "(for animal toys), DOLL(for dolls), CAR(for cars), TOY(for different toys)"))) {
            case ANIMAL_TOY: {
                model.setToys(dataSetter.setAnimalToys(amount, view));
                break;
            }
            case DOLL: {
                model.setToys(dataSetter.setDolls(amount,view));
                break;
            }
            case CAR: {
                model.setToys(dataSetter.setCars(amount,view));
                break;
            }
            case TOY: {
                model.setToys(dataSetter.setToys(amount,view));
            }
        }
        makeChoice();
    }


    public void makeChoice() {
        run:
        while (true) {
            switch (MenuItems.valueOf(InputUtility.inputStringWithScanner(view,
                    "What do you want to do?(Enter SORT to sort toys by materil\nTOTAL_PRICE " +
                            "to calculate total price of all toys in game room\nSEARCH to filter toys by material and price\n" +
                            "EXIT to exit)"))) {
                case SORT: {
                    model.sortToysByMaterial();
                    view.printToys("Sorted toys",model.getToys());
                    break;
                }
                case TOTAL_PRICE: {
                    view.printMessageAndValue("Total price:",model.getTotalPrice());
                    break;
                }
                case SEARCH: {
                    String choice = InputUtility.inputStringWithScanner(view, "Enter MATERIAL to search by material or " +
                                    "PRICE to search by price");
                    Toy [] result = model.getToys() ;
                    search:
                    while(true){
                        if(choice.equals("MATERIAL")){
                            result = searchData.searchByMaterial(InputUtility.inputStringWithScanner(view,"'Enter material"),result);
                        }
                        else if(choice.equals("PRICE")){
                            searchData.seatchByPrice(InputUtility.inputIntValueWithScanner(view,"Enter price from"),
                                    InputUtility.inputIntValueWithScanner(view, "Enter price to"),result);
                        }
                        else {
                            break search;
                        }
                    }

                    break;
                }
                case EXIT:{
                    break run;
                }
                default: {
                    view.printMessage(view.WRONG_INPUT);
                }
            }
        }
    }
}
