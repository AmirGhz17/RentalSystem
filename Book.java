import java.util.Date;

public class Book extends Item {

    String auther;
    String publisher;
    public Book(String title, String genre, Date releaseDate, int id,String auther,String publisher ,int rentalfee) {

        super(title, genre, releaseDate, id , rentalfee);
        this.auther=auther;
        this.publisher=publisher;
    }

    public String getAuther() {
        return auther;
    }

    public String getPublisher() {
        return publisher;
    }
}
