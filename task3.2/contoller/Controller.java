package epam.java.contoller;

import epam.java.InputUtility;
import epam.java.model.Shops;
import epam.java.model.entity.Shop;
import epam.java.view.View;

public class Controller {
    Shops model = new Shops();
    View view = new View();

    public Controller(Shops model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
            model.getShops().add(new Shop(InputUtility.inputStringWithScanner(view, view.ENTER_SHOP_NAME)));
        makeChoice();
    }
    private void makeChoice(){
        outer:
        while(true){
            switch (InputUtility.inputIntValueWithScanner(view, view.CHOICE)){
                case 1: {
                    int indexOfShop = InputUtility.inputIntValueWithScanner(view,"To what shop do you want to add a department?" +
                            "(enter tne number of this shop)");
                    while (indexOfShop < 0) {
                        indexOfShop = InputUtility.inputIntValueWithScanner(view,"To what shop do you want to add a department?" +
                                "(enter tne number of this shop)");
                    }
                    model.getShops().get(indexOfShop).addDepartment(InputUtility.inputStringWithScanner(view,view.ENTER_DEPARTMENT_NAME),
                    InputUtility.inputStringWithScanner(view, view.ENTER_DEPARTMENT_TYPE_OF_GOODS),
                    InputUtility.inputStringWithScanner(view, view.ENTER_DEPARTMENT_SERVICES),
                    InputUtility.inputStringWithScanner(view,view.ENTER_DEPARTMENT_LOCATION));
                    break;
                }
                case 2:{
                    int indexOfShop = InputUtility.inputIntValueWithScanner(view,"Department of what shop do you want to delete?" +
                            "(enter tne number of this shop)");
                    while(indexOfShop<0){
                        indexOfShop = InputUtility.inputIntValueWithScanner(view,"Department of what shop do you want to delete?" +
                                "(enter tne number of this shop)");
                    }
                    int indexOfDepartment = InputUtility.inputIntValueWithScanner(view,
                            "What department do you want to delete?(enter index of this department)");
                    while(indexOfDepartment<0){
                        indexOfDepartment = InputUtility.inputIntValueWithScanner(view,"What department do you want to delete?" +
                                "(enter index of this department)");
                    }
                    model.getShops().get(indexOfShop).deleteDepartment(indexOfDepartment);
                    break;
                }
                case 3:{
                    view.printShops("All shops", model.getShops());
                    break;

                }
                case 4:{
                    model.sortByDepartmentLocation();
                    view.printShops("Shops with departments ordered by location", model.getShops());
                    break;
                }

                case 5:{
                    model.sortByShopName();
                    view.printShops("Shops ordered by name ", model.getShops());
                    break;
                }

                case 6:{
                    model.getShops().add(new Shop(InputUtility.inputStringWithScanner(view, view.ENTER_SHOP_NAME)));
                    break;
                }
                case 0:{
                    view.printMessage("Exit");
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
