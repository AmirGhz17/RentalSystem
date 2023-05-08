import java.util.Date;

public class Item {

    private final int id;
    private final String title;
    private final String genre;
    private final Date releaseDate;
    boolean isAvailable;
    static int rentalfee;

    public Item(String title,String genre,Date releaseDate,int id , int rentalfee){

        this.title=title;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.isAvailable=true;
        Item.rentalfee =rentalfee;
        this.id=id;

    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public int getRentalfee() {
        return rentalfee;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString() {
        return this.getTitle();
    }
}
