import java.util.ArrayList;
import java.util.List;

public class BookMovie {


    public static void main(String[] args) {

        BookMovie bookMovie = new BookMovie();
        bookMovie.initializeMovieLists();
        bookMovie.getMovieCount();


        System.out.println(bookMovie.getFreeFoodOnMovie(new Movie(MovieType.HOLLYWOOD)));

    }


    private String getFreeFoodOnMovie(Movie movie) {
        return movie.getMovieType().getFreeFoodDish();
    }

    private void initializeMovieLists() {

        Movies movies = Movies.getInstance();
        movies.addMovie(new Movie(MovieType.BOLLYWOOD));
        movies.addMovie(new Movie(MovieType.BOLLYWOOD));
        movies.addMovie(new Movie(MovieType.HOLLYWOOD));
        movies.addMovie(new Movie(MovieType.HOLLYWOOD));
        movies.addMovie(new Movie(MovieType.HOLLYWOOD));
        movies.addMovie(new Movie(MovieType.HOLLYWOOD));
        movies.addMovie(new Movie(MovieType.TOLLYWOOD));
        movies.addMovie(new Movie(MovieType.TOLLYWOOD));
        movies.addMovie(new Movie(MovieType.TOLLYWOOD));
        movies.addMovie(new Movie(MovieType.HOLLYWOOD));
        movies.addMovie(new Movie(MovieType.TOLLYWOOD));
        movies.addMovie(new Movie(MovieType.BOLLYWOOD));
    }

    private void getMovieCount() {
        Movies movies = Movies.getInstance();
        System.out.println(movies.getBollyWoodMovieList().size());
        System.out.println(movies.getHollyWoodMovieList().size());
        System.out.println(movies.getTollyWoodMovieList().size());
        System.out.println(movies.getAllMovieList().size());
    }
}