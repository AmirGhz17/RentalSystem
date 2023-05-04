import java.util.Date;

public class Main {
    public static void main(String[] args) {

        RentalStore shop=new RentalStore();


        Item book=new Book("Vampire Diaries","Horror & Fantasy",new Date(2009,1,1),1234,"LJ Smith","",10);
        shop.items.add(0,book);
        Item game=new Game("PES","Football",new Date(2001,2,2),9876,"PS4","Konami",10);
        shop.items.add(1,game);
        Item movie=new Movie("Game Of Thrones","Epic",new Date(2011,3,3),3456,"Alan Taylor","1000",10);
        shop.items.add(2,movie);

        
        Item amir = null;
        Customer reza = null;
        shop.rentItem(amir,reza);
    }

}