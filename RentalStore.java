import java.util.ArrayList;
import java.util.Objects;

public class RentalStore {

    ArrayList<Rental> rentlist;
    ArrayList<Item> items;
    ArrayList<Customer> customers;
    ArrayList<Item> getAvailableItems;

    public  void register(Customer customer){

        boolean z=false;
        for (int i=0;i<customer.getId();i++){
            if (Objects.equals(customer, customers.get(i))) {
                z = true;
                break;
            }
        }
        if (!z){
            customers.add(customer);
            System.out.println("This customer added successfully!!!");
        }
        else {
            System.out.println("We already have this customer!!!");
        }

    }

    public  void addItem(Item item){

        boolean x=false;
        for (int i=0;i<item.getId();i++){
            if (Objects.equals(item, items.get(i))) {
                x = true;
                break;
            }
        }
        if (!x){
            items.add(item);
            getAvailableItems.add(item);
            System.out.println("This item added successfully!!!");
        }
        else {
            System.out.println("This item is already in our store!!!");
        }
    }

    public void removeItem(Item item){

        boolean y=false;
        for (int i=0;i<item.getId();i++){
            if (Objects.equals(item, items.get(i))) {
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

        for (int k=0;k<items.size();k++){
            for (int t=0;t<customers.size();t++){
                if (Objects.equals(item, items.get(k)) && Objects.equals(customer,customers.get(t))){

                    Rental rental=new Rental(item,customer,Rental.id);
                    rentlist.add(rental);
                    customer.rentals.add(customer);
                    getAvailableItems.remove(item);
                    System.out.println("Item rented successfully!!!");

                    x=false;
                }
            }
        }

        if(x){
            System.out.println("These aren't matches to rentlist!!!");
        }
    }
    public  void returnItem(Rental rental){

        boolean x=false;
        for (int z=0;z<rentlist.size();z++){
            if (Objects.equals(rental,rentlist.get(z))){
                rentlist.remove(rental);
                getAvailableItems.add(rental.getItem());

                rental.getCustomer().rentals.remove(rental.getCustomer());
                System.out.println("Item returned successfully!!!");
                x=false;
            }
        }

        if(x){
            System.out.println("These aren't matches to rentlist!!!");
        }
    }

    public ArrayList<Item> getAvailableItems() {
        return items;
    }

    public Customer getCustomerById(int id) {

        int x=0;

        for (int i=0;i<customers.size();i++){
            if(id== customers.get(i).getId()){

                x=i;
            }
        }
        return customers.get(x);
    }
    public Item getItemById(int id) {

        int x = 0;

        for (int i = 0; i < items.size(); i++) {
            if (id == items.get(i).getId()) {
                x = i;

            }
        }
        return items.get(x);
    }

}
