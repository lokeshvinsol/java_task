import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movies {
    // Singleton class so that movie list can contain only 3 types of movies, which will initialize at the time when this class is loaded
    private static final Movies INSTANCE = new Movies();

    private HashMap<String, List<Movie>> mMovieList;

    public static synchronized Movies getInstance() {
        return INSTANCE;
    }

    //initializing the list with 3 movie types
    private Movies() {
        mMovieList = new HashMap<>();
        mMovieList.put(MovieType.TOLLYWOOD.name(), new ArrayList<Movie>());
        mMovieList.put(MovieType.BOLLYWOOD.name(), new ArrayList<Movie>());
        mMovieList.put(MovieType.HOLLYWOOD.name(), new ArrayList<Movie>());
    }

    //passing the copy of the actual data variable so that no one can able to change the actual data variable.
    public List<Movie> getTollyWoodMovieList() {
        List<Movie> tollywoodMovieList = new ArrayList<>();
        List<Movie> storedTollywoodMovieList = mMovieList.get(MovieType.TOLLYWOOD.name());
        tollywoodMovieList.addAll(storedTollywoodMovieList);
        return tollywoodMovieList;
    }

    //passing the copy of the actual data variable so that no one can able to change the actual data variable.
    public List<Movie> getBollyWoodMovieList() {
        List<Movie> bollywoodMovieList = new ArrayList<>();
        List<Movie> storedBollywoodMovieList = mMovieList.get(MovieType.BOLLYWOOD.name());
        bollywoodMovieList.addAll(storedBollywoodMovieList);
        return bollywoodMovieList;
    }

    //passing the copy of the actual data variable so that no one can able to change the actual data variable.
    public List<Movie> getHollyWoodMovieList() {
        List<Movie> hollywoodMovieList = new ArrayList<>();
        List<Movie> storedHollywoodMovieList = mMovieList.get(MovieType.HOLLYWOOD.name());
        hollywoodMovieList.addAll(storedHollywoodMovieList);
        return hollywoodMovieList;
    }

    //passing the copy of the actual data variable so that no one can able to change the actual data variable.
    public List<Movie> getAllMovieList() {
        List<Movie> mAllMovieList = new ArrayList<>();
        for (Map.Entry<String, List<Movie>> entry : mMovieList.entrySet()) {
            List<Movie> details = entry.getValue();
            mAllMovieList.addAll(details);
        }
        return mAllMovieList;
    }

    //function to add movie of a particular type
    public void addMovie(Movie movie) {
        mMovieList.get(movie.getMovieType().name()).add(movie);
    }
}
