import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) {


        RentalStore shop = new RentalStore();

        Gson gson = new Gson();

        try {

            Reader reader = new FileReader("D:\\java\\Rent\\src\\TestYourFork.json");
            Allthing allthing = gson.fromJson(reader, new TypeToken<Allthing>(){}.getType());

            ArrayList<Item> items = new ArrayList<>();

            items.addAll(allthing.getBooks());
            items.addAll(allthing.getGames());
            items.addAll(allthing.getMovies());

            shop.setItems(items);
            shop.setGetAvailableItems(new ArrayList<>(items));
            shop.setCustomers(allthing.getCustomers());

            reader.close();

        }
        catch (IOException exception) {

            exception.printStackTrace();

        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("John:");
        shop.rentItem(shop.getItemById(3), shop.getCustomerById(1));
        shop.rentItem(shop.getItemById(6), shop.getCustomerById(1));
        System.out.println("Emily:");
        shop.rentItem(shop.getItemById(1), shop.getCustomerById(2));
        shop.rentItem(shop.getItemById(7), shop.getCustomerById(2));
        System.out.println("Michael:");
        shop.rentItem(shop.getItemById(9), shop.getCustomerById(3));
        shop.rentItem(shop.getItemById(14), shop.getCustomerById(3));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        Gson gson1 = new Gson();
        StringBuilder json = new StringBuilder();
        for (int i=0 ; i<shop.getCustomers().size() ; i++) {
            json.append(gson1.toJson(shop.getCustomers().get(i).getRentals()));
        }

        String filePath = "D:\\java\\Rent\\customers.json";

        try {

            FileWriter writer = new FileWriter(filePath);
            writer.write(json.toString());
            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}




//          RentalStore shop=new RentalStore();
////
////        Customer person=new Customer("Amir","amir@gmail.com","09350000000","Babolsar",11);
////        shop.customers.add(person);
////        Customer person1=new Customer("Reza","amir@gmail.com","09900000000","Babolsar",12);
////        shop.customers.add(person1);
////
////        Book book=new Book("hassan","Horror & Fantasy",new Date(2009,1,1),22,"LJ Smith","Cengiz",10);
////        shop.addItem(book);
////        Game game=new Game("PES","Football",new Date(2001,2,2),33,"PS4","Konami",10,10,"Very ood");
////        shop.addItem(game);
////        Movie movie=new Movie("Game Of Thrones","Epic",new Date(2011,3,3),44,"Alan Taylor","1000",10);
////        shop.addItem(movie);
////        System.out.println("===================================");
////
////        shop.rentItem(shop.getItemById(22),shop.getCustomerById(11));
////        shop.rentItem(shop.getItemById(33),shop.getCustomerById(12));
////
////        Rental rental=new Rental(shop.getItemById(22),shop.getCustomerById(11), shop.rental_id(shop.getItemById(22),shop.getCustomerById(11)));
////
////        Rental rental1=new Rental(shop.getItemById(33),shop.getCustomerById(12), shop.rental_id(shop.getItemById(33),shop.getCustomerById(12)));
////
////        shop.returnItem(rental);
////
////        System.out.println(shop.getAvailableItems);
////        System.out.println(rental.getCustomer().rentals);
//          System.out.println(rental1.getCustomer().rentals);