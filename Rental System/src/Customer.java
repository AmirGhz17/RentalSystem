import java.util.ArrayList;

public class Customer {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    ArrayList<Rental> rentals=new ArrayList<>();


    public Customer(int id){
        this.id=id;
    }
    public Customer(String name,String email,String phone,String address,int id){

        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.id=id;


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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }

    public String toString() {
        return this.getName();
    }
}
