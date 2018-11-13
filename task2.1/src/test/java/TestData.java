package test.java;

import main.java.epam.model.entity.Book;

public class TestData {
    public static Book[] getExpectedBooksByAuthorShevchenko(){
        return new Book[]{
                new Book("Title1", "Shevchenko", "BXV", 2010,320,450.0),
                new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0)
        };
    }

    public static Book[] getExpectedBooksByPublisherKnyga(){
        return new Book[]{
                new Book("Title3", "Franko", "Knyga", 1999,210,325.0)
        };
    }

    public static Book[] getExpectedBooksByAfterYear1990(){
        return new Book[]{
                new Book("Title3", "Franko", "Knyga", 1999,210,325.0),
                new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
                new Book("Title6", "Kosach-Kvitka", "Ranok", 2000,240,250.0),
                new Book("Title1", "Shevchenko", "BXV", 2010,320,450.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0),
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0)

        };
    }

    public static Book[] getExpectedBooksByAuthorFranko(){
        return new Book[]{
                new Book("Title3", "Franko", "Knyga", 1999,210,325.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0),
        };
    }

    public static Book[] getExpectedBooksByPublisherRanok(){
        return new Book[]{
                new Book("Title6", "Kosach-Kvitka", "Ranok", 2000,240,250.0)
        };
    }

    public static Book[] getExpectedBooksByAfterYear2014(){
        return new Book[]{
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0)
        };
    }

    public static Book[] getExpectedBooksByAuthorKosachKvitka(){
        return new Book[]{
                new Book("Title6", "Kosach-Kvitka", "Ranok", 2000,240,250.0)
        };
    }

    public static Book[] getExpectedBooksByPublisherWord(){
        return new Book[]{
                new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0)
        };
    }

    public static Book[] getExpectedBooksByAfterYear2001(){
        return new Book[]{
                new Book("Title1", "Shevchenko", "BXV", 2010,320,450.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0),
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0)
        };
    }
}
