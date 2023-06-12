import java.util.Date;

public class Movie extends Item{

    private  String director;
    private  String cast;

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

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
}
