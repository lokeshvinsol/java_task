public class Movie {
    private String mName;
    private String mYear;
    private String mLanguage;
    private String mGenre;
    private String mReleaseDate;
    private MovieType mMovieType;
    private Boolean isMovieBlockBuster;

    public Movie(MovieType mMovieType) {
        this.mMovieType = mMovieType;
    }

    public Movie(String mName, String mYear, String mLanguage, String mGenre, String mReleaseDate, MovieType mMovieType) {
        this.mName = mName;
        this.mYear = mYear;
        this.mLanguage = mLanguage;
        this.mGenre = mGenre;
        this.mReleaseDate = mReleaseDate;
        this.mMovieType = mMovieType;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String mYear) {
        this.mYear = mYear;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String mLanguage) {
        this.mLanguage = mLanguage;
    }

    public String getGenre() {
        return mGenre;
    }

    public void setGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }

    public MovieType getMovieType() {
        return mMovieType;
    }

    public void setMovieType(MovieType mMovieType) {
        this.mMovieType = mMovieType;
    }

    public void setMovieBlockBuster(Boolean movieBlockBuster) {
        isMovieBlockBuster = movieBlockBuster;
    }

    public Boolean isMovieBlockBuster() {
        if (isMovieBlockBuster == null) {
            if (Math.random() < 0.5)
                isMovieBlockBuster = false;
            else
                isMovieBlockBuster = true;
        }

        return isMovieBlockBuster;

    }

}
