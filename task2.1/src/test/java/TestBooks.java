package test.java;

import main.java.epam.model.Books;
import main.java.epam.model.entity.Book;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBooks {

    private static main.java.epam.model.Books model = new Books();

    @BeforeClass
    public static void init(){
        model.setBooks(main.java.epam.data.DataSource.getBooks());
    }

    @Test
    public void testGetByAuthor(){
        Book[] result = model.getByAuthor("Shevchenko");
        Book[] expectedSearchedByAutor = {
                new Book("Title1", "Shevchenko", "BXV", 2010,320,450.0),
                new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0)
        };
        Assert.assertArrayEquals(expectedSearchedByAutor, result);
    }

    @Test
    public void testGetByPublisher(){
        Book[] result = model.getByPublisher("Word");
        Book[] expectedSearchedByPublisher = {
                new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0)
        };
        Assert.assertArrayEquals(expectedSearchedByPublisher, result);
    }

    @Test
    public void testSortByPublisher(){
        model.sortByPublisher();
        Book[] result = model.getBooks();
        Book[] expectedSortedByPublisher = {
                new Book("Title1", "Shevchenko", "BXV", 2010,320,450.0),
                new Book("Title4", "Hohol", "BXV", 1980,450,500.0),
                new Book("Title8", "Hohol", "BXV", 1980,375,500.0),
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0),
                new Book("Title3", "Franko", "Knyga", 1999,210,325.0),
                new Book("Title6", "Kosach-Kvitka", "Ranok", 2000,240,250.0),
                new Book("Title2", "Shevchenko", "Word", 2000,120,250.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0)

        };
        Assert.assertArrayEquals(expectedSortedByPublisher, result);
    }

    @Test
    public void testGetAfterYear(){
        Book result[] = model.getAfterYear(2001);
        Book[] expectedSearchedAfterYear = {
                new Book("Title1", "Shevchenko", "BXV", 2010,320,450.0),
                new Book("Title7", "Franko", "Word", 2012,205,300.0),
                new Book("Title5", "Shevchenko", "Bukva", 2015,180,200.0)
        };
        Assert.assertArrayEquals(expectedSearchedAfterYear, result);
    }

}
