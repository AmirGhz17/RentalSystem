import java.util.Date;

public class Item {

    private  int id;
    private  String title;
    private  String genre;
    private  Date releaseDate;
    boolean isAvailable;
    private double rentalfee;


    public Item(String title,String genre,Date releaseDate,int id , double rentalfee){

        this.title=title;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.isAvailable=true;
        this.id=id;
        this.rentalfee=rentalfee;

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

    public Date getReleaseDate() {
        return releaseDate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRentalfee(double rentalfee) {
        this.rentalfee = rentalfee;
    }

    public String toString() {
        return this.getTitle();
    }
}
