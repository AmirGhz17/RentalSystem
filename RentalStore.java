import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class RentalStore {

    ArrayList<Item> items=new ArrayList<>();
    ArrayList<Customer> customers=new ArrayList<>();
    ArrayList<Item> getAvailableItems=new ArrayList<>();


    public  void register(Customer customer){

        boolean z=false;
        for (int i=0;i<customers.size();i++){
            if (Objects.equals(customer.getId(),customers.get(i).getId())) {
                z = true;
                break;
            }
        }

        if (!z){
            customers.add(customer);
            System.out.println("This customer added successfully!!!");
            System.out.println("Customer ID:"+customer.getId());
        }
        else {
            System.out.println("We already have this customer!!!");
            System.out.println("Customer ID:"+customer.getId());
        }

    }

    public  void addItem(Item item){

        boolean x=false;
        for (int i=0;i<items.size();i++){
            if (Objects.equals(item.getId(), items.get(i).getId())) {
                x = true;
                break;
            }
        }
        if (!x){
            items.add(item);
            getAvailableItems.add(item);
            System.out.println("This item added successfully!!!");
            System.out.println("Item ID:"+item.getId());
        }
        else {
            System.out.println("This item is already in our store!!!");
            System.out.println("Item ID:"+item.getId());
        }
    }

    public void removeItem(Item item){

        boolean y=false;
        for (int i=0;i<items.size();i++){
            if (Objects.equals(item.getId(), items.get(i).getId())) {
                y = true;
                break;
            }
        }
        if (y){

            items.remove(item);
            getAvailableItems.remove(item);

            System.out.println("This item removed successfully!!!");
        }
        else {
            System.out.println("This item doesn't exist in our store!!!");
        }

    }
    public void rentItem(Item item,Customer customer){

        boolean x=true;
        boolean y=true;

        for (int k=0;k<items.size();k++){

            for (int t=0;t<customers.size();t++){

                if (Objects.equals(item.getId(), items.get(k).getId()) && Objects.equals(customer.getId(),customers.get(t).getId()) && items.get(k).isAvailable()){

                        String id = Integer.toString(item.getId());
                        String id2 = Integer.toString(customer.getId());
                        String id3 = id2 + id;
                        int id4 = Integer.parseInt(id3);

                        Rental rental = new Rental(item, customer, id4);
                        customer.rentals.add(rental);
                        getAvailableItems.remove(item);
                        System.out.println("Item rented successfully!!!");
                        System.out.println("Item ID:" + rental.getId());

                        items.get(k).setAvailable(false);

                        x = false;
                }
            }

        }
        if(x){
            System.out.println("=================================================|");
            System.out.println("| Maybe this Item have been rented in past!!!    |");
            System.out.println("| or Maybe these aren't matches to rentallist!!! |");
            System.out.println("=================================================|");
        }
    }
    public  void returnItem(Rental rental){


        boolean x=true;
        for (int z=0;z<rental.getCustomer().rentals.size();z++){
            if (Objects.equals(rental.getId(),rental.getCustomer().rentals.get(z).getId())){

                getAvailableItems.add(rental.getItem());

                rental.getCustomer().rentals.remove(rental.getCustomer().rentals.get(z));
                System.out.println("Item returned successfully!!!");
                rental.getItem().setAvailable(true);
                x=false;
            }

        }

        if(x){
            System.out.println("These aren't matches to rentallist!!!");
        }
    }

    public static int rand_id() {

        Random rand = new Random();
        int id = 1+ rand.nextInt(10);
        return id;

    }

    public ArrayList<Item> getAvailableItems() {
        return items;
    }

    public Customer getCustomerById(int id) {

        int x = -1;

        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getId()) {
                x = i;
                return customers.get(x);
            }
        }
        if (x < 0) {
            System.out.println("==============================");
            System.out.println("|   This id doesn't exist!!! |");
            System.out.println("==============================");

        }

        return null;
    }

    public Item getItemById(int id) {

        int x = -1;
        for (int i = 0; i < items.size(); i++) {
            if (id == items.get(i).getId()) {
                x = i;

                return items.get(x);
            }
        }
        if (x < 0) {
            System.out.println("==============================");
            System.out.println("|   This id doesn't exist!!! |");
            System.out.println("==============================");
        }
        return  null;
    }
    
    public int rental_id(Item item,Customer customer){

        String id = Integer.toString(item.getId());
        String id2 = Integer.toString(customer.getId());
        String id3 = id2 + id;
        int id4 = Integer.parseInt(id3);
        return  id4;
    }
}
