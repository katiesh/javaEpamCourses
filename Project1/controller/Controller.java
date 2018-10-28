package epam.java.controller;

import epam.java.data.DataSource;
import epam.java.model.NewYearPresent;
import epam.java.model.entity.Sweet;
import epam.java.services.search.SearchCandies;
import epam.java.services.search.SearchChocolate;
import epam.java.services.search.SearchCookies;
import epam.java.services.search.SearchSweets;
import epam.java.services.sort.SortSweets;
import epam.java.view.InputUtility;
import epam.java.view.View;

public class Controller {
    private NewYearPresent model;
    private View <Sweet> view;
    private SearchSweets searchSweets;
    private SortSweets sortSweets;

    public Controller(NewYearPresent model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
        model.setPresent(DataSource.getSweets());
        searchSweets = new SearchSweets(model);
        sortSweets = new SortSweets(model);
        String searchedField;
        double searchedValueFrom;
        double searchedValueTo;
        boolean searchedBooleanField;
        makeChoice:
        while (true){
            switch (ChoiceItems.valueOf(InputUtility.inputStringWithScanner(view, View.CHOICE))){
                case PRINT:{
                    view.printList("All sweets:", model.getPresent());
                    break;
                }
                case PRINT_TOTAL_WEIGHT:{
                    view.printMessageAndValue("The total weight is", model.calcTotalWeight());
                    break;
                }
                case SORT_BY_WEIGHT:{
                    sortSweets.sortByWeight();
                    view.printList("Sorted sweets by weight:",  searchSweets.getFilteredPresent());
                    break;
                }
                case SORT_BY_SUGAR_CONTENT:{
                    sortSweets.sortBySugarContent();
                    view.printList("Sorted sweets by sugar content:",  searchSweets.getFilteredPresent());
                    break;
                }
                case SORT_BY_NAME:{
                    sortSweets.sortByName();
                    view.printList("Sorted sweets by name", searchSweets.getFilteredPresent());
                    break;
                }
                case SORT_BY_PRODUCER:{
                    sortSweets.sortByProducer();
                    view.printList("Sorted sweets by producer", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_BY_NAME:{
                    searchedField = InputUtility.inputStringWithScanner(view, "Enter name");
                    searchSweets.searchByName(searchedField);
                    view.printList("Filter \"Name is " + searchedField + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_BY_PRODUCER:{
                    searchedField = InputUtility.inputStringWithScanner(view, "Enter producer");
                    searchSweets.searchByProducer(searchedField);
                    view.printList("Filter \"Producer is " + searchedField + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_BY_SUGAR_CONTENT:{
                    searchedValueFrom = InputUtility.inputIntValueWithScanner(view, "Enter the minimum percent of sugar content");
                    searchedValueTo = InputUtility.inputIntValueWithScanner(view, "Enter the maximum percent of sugar content");
                    searchSweets.searchBySugarContent(searchedValueFrom, searchedValueTo);
                    view.printList("Filter \"Sugar content from " + searchedValueFrom + " to " + searchedValueTo
                            + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_BY_WEIGHT:{
                    searchedValueFrom = InputUtility.inputIntValueWithScanner(view, "Enter the minimum weight");
                    searchedValueTo = InputUtility.inputIntValueWithScanner(view, "Enter the maximum weight");
                    searchSweets.searchByWeight(searchedValueFrom, searchedValueTo);
                    view.printList("Filter \"Weight from " + searchedValueFrom + " to " + searchedValueTo
                            + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_CANDIES:{
                    searchSweets.searchCandies();
                    view.printList("Filter \"Candies\" was added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_CHOCOLATE:{
                    searchSweets.searchChocolate();
                    view.printList("Filter \"Chocolate\" was added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_COOKIES:{
                    searchSweets.searchCookies();
                    view.printList("Filter \"Cookies\" was added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_CANDIES_BY_CATEGORIE:{
                    searchedField = InputUtility.inputStringWithScanner(view, "Enter categorie");
                    searchSweets = new SearchCandies(model);
                    ((SearchCandies)searchSweets).searchByCategorie(searchedField);
                    view.printList("Filter \"categorie is " + searchedField + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_CANDIES_BY_TASTE:{
                    searchedField = InputUtility.inputStringWithScanner(view, "Enter taste");
                    searchSweets = new SearchCandies(model);
                    ((SearchCandies)searchSweets).searchByTaste(searchedField);
                    view.printList("Filter \" taste is " + searchedField + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_CHOCOLATE_BY_PERCENT_OF_COCOA:{
                    searchedValueFrom = InputUtility.inputIntValueWithScanner(view, "Enter the minimum percent of cocoa");
                    searchedValueTo = InputUtility.inputIntValueWithScanner(view, "Enter the maximum percent of cocoa");
                    searchSweets = new SearchChocolate(model);
                    ((SearchChocolate)searchSweets).searchByPercentOfCocoa(searchedValueFrom, searchedValueTo);
                    view.printList("Filter \" Percent of cocoa from " + searchedValueFrom + " to " + searchedValueTo
                    + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_CHOCOLATE_WITH_NUTS:{
                    searchedBooleanField = InputUtility.inputBooleanValue(view, "Enter \"true\" if you want to" +
                            " choose chocolate with nuts or \"false\" otherwise");
                    searchSweets = new SearchChocolate(model);
                    ((SearchChocolate)searchSweets).searchByNuts(searchedBooleanField);
                    view.printList("Filter \" Has nuts? " + searchedBooleanField +
                            "\" is added", searchSweets.getFilteredPresent());
                    break;
                }

                case SELECT_CHOCOLATE_WITH_RAISINS:{
                    searchedBooleanField = InputUtility.inputBooleanValue(view, "Enter \"true\" if you want to" +
                            " choose chocolate with raisins or \"false\" otherwise");
                    searchSweets = new SearchChocolate(model);
                    ((SearchChocolate)searchSweets).searchByRaisins(searchedBooleanField);
                    view.printList("Filter \" Has raisins? " + searchedBooleanField +
                            "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_CHOCOLATE_WITH_FRUITS:{
                    searchedBooleanField = InputUtility.inputBooleanValue(view, "Enter \"true\" if you want to" +
                            " choose chocolate with fruits or \"false\" otherwise");
                    searchSweets = new SearchChocolate(model);
                    ((SearchChocolate)searchSweets).searchByFruits(searchedBooleanField);
                    view.printList("Filter \" Has fruits? " + searchedBooleanField +
                            "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_COOKIES_BY_QUANTITY:{
                    searchedValueFrom = InputUtility.inputIntValueWithScanner(view, "Enter the minimum quantity of cookies");
                    searchedValueTo = InputUtility.inputIntValueWithScanner(view, "Enter the maximum quantity of cookies");
                    searchSweets = new SearchCookies(model);
                    ((SearchCookies)searchSweets).searchByQuantity((int)searchedValueFrom, (int)searchedValueTo);
                    view.printList("Filter \"Quantity of cookies from " + searchedValueFrom + " to " + searchedValueTo
                            + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case SELECT_COOKIES_BY_CATEGORIE:{
                    searchedField = InputUtility.inputStringWithScanner(view, "Enter categorie");
                    searchSweets = new SearchCookies(model);
                    ((SearchCookies)searchSweets).searchByCategorie(searchedField);
                    view.printList("Filter \"categorie is " + searchedField + "\" is added", searchSweets.getFilteredPresent());
                    break;
                }
                case DELETE_FILTERS:{
                    model.setPresent(DataSource.getSweets());
                    searchSweets.setFilteredPresent(DataSource.getSweets());
                    view.printList("All filters was deleted", searchSweets.getFilteredPresent());
                    break;
                }
                case EXIT:{
                    view.printMessage("EXIT");
                    break makeChoice;
                }
            }
        }
    }

}
