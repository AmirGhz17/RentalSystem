import java.util.Date;

public class Movie extends Item{

    private final String director;
    private final String cast;

    public Movie(String title, String genre, Date releaseDate, int id,String director,String cast,int rentalfee) {

        super(title, genre, releaseDate, id , rentalfee);
        this.director=director;
        this.cast=cast;

    }
    public String getCast() {
        return cast;
    }

    public String getDirector() {
        return director;
    }
}
