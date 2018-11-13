package test.java;

import main.java.epam.model.Books;
import main.java.epam.model.entity.Book;
import org.junit.Before;
import test.java.TestData;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestBooks {
    @Parameterized.Parameter(0)
    public Book[] expectedSearchedByAuthor;
    @Parameterized.Parameter(1)
    public Book[] expectedSearchedByPublisher;
    @Parameterized.Parameter(2)
    public Book[] expectedSearchedByAfterYear;
    @Parameterized.Parameter(3)
    public String author;
    @Parameterized.Parameter(4)
    public String publisher;
    @Parameterized.Parameter(5)
    public int year;

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][]{
                {TestData.getExpectedBooksByAuthorShevchenko(), TestData.getExpectedBooksByPublisherWord(),
                        TestData.getExpectedBooksByAfterYear1990(), "Shevchenko", "Word", 1990},
                {TestData.getExpectedBooksByAuthorFranko(), TestData.getExpectedBooksByPublisherKnyga(),
                        TestData.getExpectedBooksByAfterYear2014(), "Franko", "Knyga", 2014},
                {TestData.getExpectedBooksByAuthorKosachKvitka(), TestData.getExpectedBooksByPublisherRanok(),
                        TestData.getExpectedBooksByAfterYear2001(), "Kosach-Kvitka", "Ranok", 2001}
        });
    }

    private static Books model = new Books();

    @Before
    public void init(){
        model.setBooks(main.java.epam.data.DataSource.getBooks());
    }

    @Test
    public void testGetByAuthor(){
        Book[] result = model.getByAuthor(author);
        Assert.assertArrayEquals(expectedSearchedByAuthor, result);
    }

    @Test
    public void testGetByPublisher(){
        Book[] result = model.getByPublisher(publisher);
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
        Book result[] = model.getAfterYear(year);
        Assert.assertArrayEquals(expectedSearchedByAfterYear, result);
    }

}
