import java.util.Date;

public class Game extends Item{

    private String platform;
    private String publisher;
    private double gameRate;
    private String aboutGame;

    public Game(String title, String genre, Date releaseDate, int id, String platform, String publisher, int rentalfee, double gameRate, String aboutGame) {

        super(title, genre, releaseDate, id , rentalfee);
        this.platform=platform;
        this.publisher=publisher;
        this.gameRate = gameRate;
        this.aboutGame = aboutGame;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public double getGameRate() {
        return gameRate;
    }

    public String getAboutGame() {
        return aboutGame;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setGameRate(double gameRate) {
        this.gameRate = gameRate;
    }

    public void setAboutGame(String aboutGame) {
        this.aboutGame = aboutGame;
    }
}
