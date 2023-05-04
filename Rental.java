import java.util.ArrayList;
import java.util.Date;

public class Rental {

    static int id;
    Item item;
    Customer customer;
    Date rentalDate;
    Date returnDate;


    public Rental(Item item,Customer customer,int id){

        this.item=item;
        this.customer=customer;
        this.rentalDate=new Date();
        this.returnDate=new Date();
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double calculateLateFee(int days){

        return days*getItem().rentalfee;
    }
}
