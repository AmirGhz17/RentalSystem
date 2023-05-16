import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {

    static int id;
    private final Item item;
    private final Customer customer;
    private final Date rentalDate;
    private Date returnDate;


    public Rental(Item item,Customer customer,int id){

        this.item=item;
        this.customer=customer;
        this.rentalDate=new Date();
        this.returnDate=new Date();
        Rental.id =id;
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

    public double calculateLateFee(Customer customer){

        long milliedatedifference = Math.abs(this.rentalDate.getTime() - this.returnDate.getTime());
//        long datediffrence =TimeUnit.DAYS.convert(milliedatedifference, TimeUnit.MILLISECONDS);
//
//        if(datediffrence<=0) {
//            return 0;
//        }

        System.out.println("Days(seconds) between " + this.returnDate + " and " + this.rentalDate + ": " + milliedatedifference);
        //default latefee = 10
        System.out.println("Fee:");
        return 10*milliedatedifference;

    }
    public double calculateLateFee(int days){

        //default latefee = 10
        System.out.println("You have to pay "+days*10+" dollars for renting!!!");

        return days*10;
    }


    public String toString() {
        return this.item.getTitle()+":"+this.customer.getName();

    }
}
