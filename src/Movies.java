import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movies {
    private static final Movies INSTANCE = new Movies();

    private HashMap<String, List<Movie>> mMovieList;

    public static synchronized Movies getInstance() {
        return INSTANCE;
    }

    private Movies() {
        mMovieList = new HashMap<>();
        mMovieList.put(MovieType.TOLLYWOOD.name(), new ArrayList<Movie>());
        mMovieList.put(MovieType.BOLLYWOOD.name(), new ArrayList<Movie>());
        mMovieList.put(MovieType.HOLLYWOOD.name(), new ArrayList<Movie>());
    }

    public List<Movie> getTollyWoodMovieList() {
        List<Movie> tollywoodMovieList = new ArrayList<>();
        List<Movie> storedTollywoodMovieList = mMovieList.get(MovieType.TOLLYWOOD.name());
        for (int i = 0; i < storedTollywoodMovieList.size(); i++) {
            tollywoodMovieList.add(storedTollywoodMovieList.get(i));
        }
        return tollywoodMovieList;
    }

    public List<Movie> getBollyWoodMovieList() {
        List<Movie> bollywoodMovieList = new ArrayList<>();
        List<Movie> storedBollywoodMovieList = mMovieList.get(MovieType.BOLLYWOOD.name());
        for (int i = 0; i < storedBollywoodMovieList.size(); i++) {
            bollywoodMovieList.add(storedBollywoodMovieList.get(i));
        }
        return bollywoodMovieList;
    }

    public List<Movie> getHollyWoodMovieList() {
        List<Movie> hollywoodMovieList = new ArrayList<>();
        List<Movie> storedHollywoodMovieList = mMovieList.get(MovieType.HOLLYWOOD.name());
        for (int i = 0; i < storedHollywoodMovieList.size(); i++) {
            hollywoodMovieList.add(storedHollywoodMovieList.get(i));
        }
        return hollywoodMovieList;
    }

    public List<Movie> getAllMovieList() {
        List<Movie> mAllMovieList = new ArrayList<>();
        for (Map.Entry<String, List<Movie>> entry : mMovieList.entrySet()) {
            List<Movie> details = entry.getValue();
            mAllMovieList.addAll(details);
        }
        return mAllMovieList;
    }

    public void addMovie(Movie movie) {
        mMovieList.get(movie.getMovieType().name()).add(movie);
    }
}
