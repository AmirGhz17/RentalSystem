import java.util.Date;

public class Book extends Item {

    private String author;
    private String publisher;
    public Book(String title, String genre, Date releaseDate, int id,String author,String publisher ,int rentalfee) {

        super(title, genre, releaseDate, id ,rentalfee);
        this.author=author;
        this.publisher=publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
