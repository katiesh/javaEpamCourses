package main.java.epam.controller;

import main.java.epam.InputUtility;
import main.java.epam.data.DataSource;
import main.java.epam.model.Books;
import main.java.epam.model.entity.Book;
import main.java.epam.view.BooksView;

public class Controller {
    private Books  model= new Books();
    private BooksView view = new BooksView();

    public void run(){
        model.setBooks(DataSource.getBooks());
        makeChoice();

    }

    private void searchByAuthor(String author){
        Book[] result = model.getByAuthor(author);
        if(result.length == 0) {
            view.printMessage("No books -  " + author );
        }
        else{
            view.printBooks("\nAuthor - "+author,result);
        }
    }

    private void searchByPublisher(String publisher){
        Book[] result = model.getByPublisher(publisher);
        if(result.length == 0) {
            view.printMessage("No books -  " + publisher );
        }
        else{
            view.printBooks("\nAuthor - "+publisher, result);
        }
    }

    private void makeChoice(){
        outer:
        while(true){
            switch (InputUtility.inputIntValueWithScanner(view, view.CHOICE)){
                case 1: {
                    view.printBooks("All books", model.getBooks());
                    break;
                }
                case 2:{
                    searchByAuthor(InputUtility.inputAuthorWithScanner(view, view.ENTER_AUTHOR));
                    break;
                }
                case 3:{
                    view.printBooks("Books after selected year:",
                            model.getAfterYear(InputUtility.inputIntValueWithScanner(view,view.ENTER_YEAR)));
                    break;

                }
                case 4:{
                    model.sortByPublisher();
                    view.printBooks("Books ordered by publisher", model.getBooks());
                    break;
                }

                case 5:{
                    searchByPublisher(InputUtility.inputAuthorWithScanner(view, view.ENTER_PUBLISHER));
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
