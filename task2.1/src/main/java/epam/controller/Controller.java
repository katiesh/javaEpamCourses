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
        model.setBooks(DataSource.getBooksFromFile("books.txt"));
        makeChoice();

    }

    private void searchByAuthor(String author){
        Book[] result = model.getByAuthor(author);
        if(result.length == 0) {
            view.printMessage("No books -  " + author );
        }
        else{
            view.printBooks("\nAuthor - "+author,result);
            view.printResultInFile(author + ".txt", result);
        }
    }

    private void searchByPublisher(String publisher){
        Book[] result = model.getByPublisher(publisher);
        if(result.length == 0) {
            view.printMessage("No books -  " + publisher );
        }
        else{
            view.printBooks("\nAuthor - "+publisher, result);
            view.printResultInFile(publisher + ".txt", result);
        }
    }

    private void makeChoice(){
        outer:
        while(true){
            switch (InputUtility.inputIntValueWithScanner(view, view.CHOICE)){
                case 1: {
                    view.printBooks("All books", model.getBooks());
                    view.printResultInFile("AllBooks.txt", model.getBooks());
                    break;
                }
                case 2:{
                    searchByAuthor(InputUtility.inputAuthorWithScanner(view, view.ENTER_AUTHOR));
                    break;
                }
                case 3:{
                    int year = InputUtility.inputIntValueWithScanner(view,view.ENTER_YEAR);
                    view.printBooks("Books after selected year:",
                            model.getAfterYear(year));
                    view.printResultInFile( "BooksAfterYear" + year + ".txt", model.getAfterYear(year));
                    break;

                }
                case 4:{
                    model.sortByPublisher();
                    view.printBooks("Books ordered by publisher", model.getBooks());
                    view.printResultInFile( "BooksOrderedByPublisher.txt", model.getBooks());
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
