package movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie movie = new Movie("Best film ever", 120, "B.Director");

    @Test
    void getTitle() {
        assertEquals("Best film ever", movie.getTitle(), () -> "Should return title.");
    }

    @Test
    void setTitle() {
        movie.setTitle("Newest best film ever");
        assertEquals("Newest best film ever", movie.getTitle(), () -> "Should return title.");
    }

    @Test
    void getDuration() {
        assertEquals(120, movie.getDuration(), () -> "Should return duration.");
    }

    @Test
    void setDuration() {
        movie.setDuration(200);
        assertEquals(200, movie.getDuration(), () -> "Should return duration.");
    }

    @Test
    void getDirector() {
        assertEquals("B.Director", movie.getDirector(), () -> "Should return name of director.");
    }

    @Test
    void setDirector() {
        movie.setDirector("S.Hole");
        assertEquals("S.Hole", movie.getDirector(), () -> "Should return name of director.");
    }
}