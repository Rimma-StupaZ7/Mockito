import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void MoviesTest() {
        Movie movies = new Movie();
        movies.add("film 1");
        movies.add("film 2");
        movies.add("film 3");

        String[] expected = {"film 1", "film 2", "film 3",};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesZeroTest() {
        Movie movies = new Movie();
        movies.add("film 0");

        String[] expected = {"film 0"};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesOneTest() {
        Movie movies = new Movie();
        movies.add("film 1");

        String[] expected = {"film 1"};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesEightTest() {
        Movie movies = new Movie();
        movies.add("film 1");
        movies.add("film 2");
        movies.add("film 3");
        movies.add("film 4");
        movies.add("film 5");
        movies.add("film 6");
        movies.add("film 7");
        movies.add("film 8");

        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 6", "film 7", "film 8"};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesThreeTest() {
        Movie movies = new Movie();
        movies.add("film 1");
        movies.add("film 2");
        movies.add("film 3");

        String[] expected = {"film 3", "film 2", "film 1",};
        String[] actual = movies.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesZeroTest() {
        Movie movies = new Movie();
        movies.add("film 0");

        String[] expected = {"film 0"};
        String[] actual = movies.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesEightTest() {
        Movie movies = new Movie();
        movies.add("film 1");
        movies.add("film 2");
        movies.add("film 3");
        movies.add("film 4");
        movies.add("film 5");
        movies.add("film 6");
        movies.add("film 7");
        movies.add("film 8");

        String[] expected = {"film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1",};
        String[] actual = movies.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesOneTest() {
        Movie movies = new Movie();
        movies.add("film 8");

        String[] expected = {"film 8"};
        String[] actual = movies.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindLastMoviesWhithParamTest() {
        Movie movies = new Movie(5);
        movies.add("film 1");
        movies.add("film 2");
        movies.add("film 3");
        movies.add("film 4");
        movies.add("film 5");
        movies.add("film 6");
        movies.add("film 7");
        movies.add("film 8");
        movies.add("film 9");
        movies.add("film 10");

        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6"};
        String[] actual = movies.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindLastMoviesWhithParamThreeTest() {
        Movie movies = new Movie(3);
        movies.add("film 1");
        movies.add("film 2");
        movies.add("film 3");
        movies.add("film 4");
        movies.add("film 5");
        movies.add("film 6");
        movies.add("film 7");
        movies.add("film 8");
        movies.add("film 9");
        movies.add("film 10");

        String[] expected = {"film 10", "film 9", "film 8"};
        String[] actual = movies.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }
}





