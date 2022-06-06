package book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book = new Book("Test with JUnit5", 101, 2022, "A.Tester");

    @Test
    void getTitle() {
        assertEquals("Test with JUnit5", book.getTitle(), () -> "Should return title.");
    }

    @Test
    void setTitle() {
        book.setTitle("Fire is the hole");
        assertEquals("Fire is the hole", book.getTitle(), () -> "Should return title.");
    }

    @Test
    void getNumOfPages() {
        assertEquals(101, book.getNumOfPages(), () -> "Should return number of pages.");
    }

    @Test
    void setNumOfPages() {
        book.setNumOfPages(999);
        assertEquals(999, book.getNumOfPages(), () -> "Should return number of pages.");
    }

    @Test
    void getYear() {
        assertEquals(2022, book.getYear(), () -> "Should return year of publication.");
    }

    @Test
    void setYear() {
        book.setYear(1989);
        assertEquals(1989, book.getYear(), () -> "Should return year of publication.");
    }

    @Test
    void getAuthor() {
        assertEquals("A.Tester", book.getAuthor(), () -> "Should return author.");
    }

    @Test
    void setAuthor() {
        book.setAuthor("B.Rush");
        assertEquals("B.Rush", book.getAuthor(), () -> "Should return author.");
    }
}