import java.util.Date;

public class Game extends Item{

    String platform;
    String publisher;
    public Game(String title, String genre, Date releaseDate, int id,String platform,String publisher,int rentalfee) {

        super(title, genre, releaseDate, id , rentalfee);
        this.platform=platform;
        this.publisher=publisher;

    }

    public String getPublisher() {
        return publisher;
    }

    public String getPlatform() {
        return platform;
    }
}
