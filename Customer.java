import java.util.ArrayList;

public class Customer {

    private final int id;
    private final String name;
    private final String email;
    private final String phone;
    private final String address;
    ArrayList<Rental> rentals;

    public Customer(String name,String email,String phone,String address,int id){

        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.id=id;
        this.rentals=new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public String toString() {
        return this.getName();
    }
}
