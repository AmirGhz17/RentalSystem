import java.util.ArrayList;

public class Customer {

    int id;
    String name;
    String email;
    String phone;
    String address;
    ArrayList<Customer> rentals;

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

    public ArrayList<Customer> getRentals() {
        return rentals;
    }
}
