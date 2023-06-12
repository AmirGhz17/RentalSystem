//
//import java.util.ArrayList;
//
//import java.util.Date;
//import java.util.Objects;
//import java.util.Random;
//
//public class Test {
//
//    ArrayList<Item> items=new ArrayList<>();
//    ArrayList<Customer> customers=new ArrayList<>();
//    ArrayList<Item> getAvailableItems=new ArrayList<>();
//
//
//    public  void register(Customer customer){
//
//        boolean z=false;
//        for (int i=0;i<customers.size();i++){
//            if (Objects.equals(customer.getId(),customers.get(i).getId())) {
//                z = true;
//                break;
//            }
//        }
//
//        if (!z){
//            customers.add(customer);
//            System.out.println("This customer added successfully!!!");
//            System.out.println("Item ID:"+customer.getId());
//        }
//        else {
//            System.out.println("We already have this customer!!!");
//            System.out.println("Item ID:"+customer.getId());
//        }
//
//    }
//
//    public  void addItem(Item item){
//
//        boolean x=false;
//        for (int i=0;i<items.size();i++){
//            if (Objects.equals(item.getId(), items.get(i).getId())) {
//                x = true;
//                break;
//            }
//        }
//        if (!x){
//            items.add(item);
//            getAvailableItems.add(item);
//            System.out.println("This item added successfully!!!");
//            System.out.println("Item ID:"+item.getId());
//        }
//        else {
//            System.out.println("This item is already in our store!!!");
//            System.out.println("Item ID:"+item.getId());
//        }
//    }
//
//    public void removeItem(Item item){
//
//        boolean y=false;
//        for (int i=0;i<items.size();i++){
//            if (Objects.equals(item.getId(), items.get(i).getId())) {
//                y = true;
//                break;
//            }
//        }
//        if (y){
//
//            items.remove(item);
//            getAvailableItems.remove(item);
//
//            System.out.println("This item removed successfully!!!");
//        }
//        else {
//            System.out.println("This item doesn't exist in our store!!!");
//        }
//
//    }
//    public void rentItem(Item item,Customer customer){
//
//        boolean x=true;
//
//        for (int k=0;k<items.size();k++){
//
//            for (int t=0;t<customers.size();t++){
//
//                if (Objects.equals(item.getId(), items.get(k).getId()) && Objects.equals(customer.getId(),customers.get(t).getId()) && items.get(k).isAvailable()){
//
////                        String id = Integer.toString(item.getId());
////                        String id2 = Integer.toString(customer.getId());
////                        String id3 = id2 + id;
////                        int id4 = Integer.parseInt(id3);
//
//                    Rental rental = new Rental(item, customer, rental_id(item,customer));
//                    customer.rentals.add(rental);
//                    getAvailableItems.remove(item);
//                    System.out.println("Item rented successfully!!!");
//                    System.out.println("Item ID:" + rental.getId());
//
//                    items.get(k).setAvailable(false);
//
//                    x = false;
//                }
//            }
//
//        }
//        if(x){
//            System.out.println("=================================================|");
//            System.out.println("| Maybe this Item have been rented in past!!!    |");
//            System.out.println("| or Maybe these aren't matches to rentallist!!! |");
//            System.out.println("=================================================|");
//        }
//    }
//    public  void returnItem(Rental rental) {
//
//        System.out.println(rental.getCustomer().getRentals().size());
//        boolean x = true;
//        for (Customer customer : customers) {
//            if (customer.getId() == rental.getCustomer().getId()) {
//                for (Item item : items) {
//                    if (item.getId() == rental.getItem().getId()) {
//                        for (Rental rent : customer.rentals) {
//                            if (rental.getId() == rent.getId()) {
//
//                                getAvailableItems.add(rental.getItem());
//                                rental.getCustomer().rentals.remove();
//                                System.out.println("Item returned successfully!!!");
//                                rental.getItem().setAvailable(true);
//                                rental.setReturnDate(new Date());
//                                x = false;
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        if(x){
//            System.out.println("These aren't matches to rentallist!!!");
//        }
//    }
//
//
//
////
////        getAvailableItems.add(rental.getItem());
////
////        rental.getCustomer().rentals.remove(rental.getCustomer().rentals.get(z));
////        System.out.println("Item returned successfully!!!");
////        rental.getItem().setAvailable(true);
////        rental.setReturnDate(new Date());
////        x=false;
////        }
////        }
////        if(x){
////        System.out.println("These aren't matches to rentallist!!!");
////        }
////
//
//
//    public static int rand_id() {
//
//        Random rand = new Random();
//        int id = 1+ rand.nextInt(10);
//        return id;
//
//    }
//
//    public ArrayList<Item> getAvailableItems() {
//        return items;
//    }
//
//    public Customer getCustomerById(int id) {
//
//        int x = -1;
//
//        for (int i = 0; i < customers.size(); i++) {
//            if (id == customers.get(i).getId()) {
//                x = i;
//                return customers.get(x);
//            }
//        }
//        if (x < 0) {
//            System.out.println("==============================");
//            System.out.println("|   This id doesn't exist!!! |");
//            System.out.println("==============================");
//
//        }
//
//        return null;
//    }
//
//    public Item getItemById(int id) {
//
//        int x = -1;
//        for (int i = 0; i < items.size(); i++) {
//            if (id == items.get(i).getId()) {
//                x = i;
//
//                return items.get(x);
//            }
//        }
//        if (x < 0) {
//            System.out.println("==============================");
//            System.out.println("|   This id doesn't exist!!! |");
//            System.out.println("==============================");
//        }
//        return  null;
//    }
//    public int rental_id(Item item,Customer customer){
//
//        String id = Integer.toString(item.getId());
//        String id2 = Integer.toString(customer.getId());
//        String id3 = id2 + id;
//        int id4 = Integer.parseInt(id3);
//        return  id4;
//    }
//
//    public ArrayList<Customer> getCustomers() {
//        return customers;
//    }
//
//    public ArrayList<Item> getGetAvailableItems() {
//        return getAvailableItems;
//    }
//
//    public ArrayList<Item> getItems() {
//        return items;
//    }
//
//    public void setGetAvailableItems(ArrayList<Item> getAvailableItems) {
//        this.getAvailableItems = getAvailableItems;
//    }
//
//    public void setCustomers(ArrayList<Customer> customers) {
//        this.customers = customers;
//    }
//
//    public void setItems(ArrayList<Item> items) {
//        this.items = items;
//    }
//}
//
//
////        System.out.println(rental.getCustomer().rentals.size());
////                boolean x=true;
////                for (int z=0;z<rental.getCustomer().rentals.size();z++){
////
////        if (Objects.equals(rental.getId(), rental.getCustomer().rentals.get(z).getId())&&Objects.equals(rental.getCustomer(),rental.getCustomer().getRentals().get(z).getCustomer())&&Objects.equals(rental.getItem(),rental.getCustomer().getRentals().get(z).getItem()) && !rental.getItem().isAvailable){
////
////        getAvailableItems.add(rental.getItem());
////
////        rental.getCustomer().rentals.remove(rental.getCustomer().rentals.get(z));
////        System.out.println("Item returned successfully!!!");
////        rental.getItem().setAvailable(true);
////        rental.setReturnDate(new Date());
////        x=false;
////        }
////        }
////        if(x){
////        System.out.println("These aren't matches to rentallist!!!");
////        }
