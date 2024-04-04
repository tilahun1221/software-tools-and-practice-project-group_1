import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieRecordTest {
    private MovieRecord app;

    @BeforeEach
    public void setup() {
        app = new MovieRecord();
    }

    @Test
    public void testCreateMovie() {
        app.createMovie();
         boolean expectedTitle = true;
        Assertions.assertEquals(expectedTitle, app.createMovie());
    }
    /*

    @Test
    public void testReadMovie() {
    	// Try any condition Test here
        app.createMovie();
        app.readMovie();
    }

    @Test
    public void testUpdateMovie() {
    	// Try any condition Test here
        app.createMovie();
        app.updateMovie();
    }

    @Test
    public void testDeleteMovie() {
    	// Try any condition Test here
        app.createMovie();
        app.deleteMovie();
        Assertions.assertEquals(0, app.getTitle());
    }*/
}
