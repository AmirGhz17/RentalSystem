
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

    class  Movie {

        private final int id;
        private final String title;
        private final String genre;
        private final Date releaseDate;
        boolean isAvailable;
        static int rentalfee;
        private final String director;
        private final String cast;

        public Movie(String title, String genre, Date releaseDate, int id, String director, String cast, int rentalfee) {

            this.title=title;
            this.genre=genre;
            this.releaseDate=releaseDate;
            this.isAvailable=true;
            Movie.rentalfee =rentalfee;
            this.id=id;
            this.director=director;
            this.cast=cast;

        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public static int getRentalfee() {
            return rentalfee;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public String getCast() {
            return cast;
        }

        public String getDirector() {
            return director;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        public static void setRentalfee(int rentalfee) {
            Movie.rentalfee = rentalfee;
        }

        public String toString() {
            return this.getTitle();
        }
    }


    //==============================================================
    //==============================================================
    //==============================================================

    class Customer{

        private final int id;
        private final String name;
        private final String email;
        private final String phone;
        private final String address;
        ArrayList<Rental> rentals;

        Customer(int id, String name, String email, String phone, String address) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.address = address;
            this.rentals=new ArrayList<>();

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }

        public ArrayList<Rental> getRentals() {
            return rentals;
        }

        public String toString() {
            return this.getName();
        }
    }

    //==============================================================
    //==============================================================
    //==============================================================

    class Rental{

        static int id;
        private final Movie movie;
        private final Customer customer;
        private final Date rentalDate;
        private Date returnDate;

        public Rental(Movie movie,Customer customer,int id){

            this.movie=movie;
            this.customer=customer;
            this.rentalDate=new Date();
            this.returnDate=new Date(rentalDate.getTime() + TimeUnit.DAYS.toMillis(5));
            Rental.id =id;

        }
        public int getId() {
            return id;
        }

        public Movie getMovie() {
            return movie;
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

            int milliedatedifference = (int) (this.rentalDate.getTime() - this.returnDate.getTime());
            int datediffrence = (int) TimeUnit.DAYS.convert(milliedatedifference, TimeUnit.MILLISECONDS);

            if(datediffrence<=0) {
                return 0;
            }
            //default latefee = 10
            return 10*datediffrence;

        }
        public double calculateLateFee(int days){

            //default latefee = 10
            System.out.println("You have to pay "+days*10+" dollars for renting!!!");

            return days*10;
        }


        public String toString() {
            return this.movie.getTitle()+":"+this.customer.getName();

        }

    }

    //==============================================================
    //==============================================================
    //==============================================================

    class  Rentalstore {

        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Movie> getAvailableMovies = new ArrayList<>();

        public void register(Customer customer) {

            boolean z = false;
            for (int i = 0; i < customers.size(); i++) {
                if (Objects.equals(customer.getId(), customers.get(i).getId())) {
                    z = true;
                    break;
                }
            }

            if (!z) {
                customers.add(customer);
                System.out.println("This customer added successfully!!!");
                System.out.println("Customer ID:" + customer.getId());
            } else {
                System.out.println("We already have this customer!!!");
                System.out.println("Customer ID:" + customer.getId());
            }

        }

        public void addMovie(Movie movie) {

            boolean x = false;
            for (int i = 0; i < movies.size(); i++) {
                if (Objects.equals(movie.getId(), movies.get(i).getId())) {
                    x = true;
                    break;
                }
            }
            if (!x) {
                movies.add(movie);
                getAvailableMovies.add(movie);
                System.out.println("This movie added successfully!!!");
                System.out.println("Movie ID:" + movie.getId());
            } else {
                System.out.println("This movie is already in our store!!!");
                System.out.println("Movie ID:" + movie.getId());
            }
        }

        public void removeMovie(Movie movie) {

            boolean y = false;
            for (int i = 0; i < movies.size(); i++) {
                if (Objects.equals(movie.getId(), movies.get(i).getId())) {
                    y = true;
                    break;
                }
            }
            if (y) {

                movies.remove(movie);
                getAvailableMovies.remove(movie);

                System.out.println("This movie removed successfully!!!");
            } else {
                System.out.println("This movie doesn't exist in our store!!!");
            }

        }

        public void rentItem(Movie movie, Customer customer) {

            boolean x = true;
            boolean y = true;

            for (int k = 0; k < movies.size(); k++) {

                for (int t = 0; t < customers.size(); t++) {

                    if (Objects.equals(movie.getId(), movies.get(k).getId()) && Objects.equals(customer.getId(), customers.get(t).getId()) && movies.get(k).isAvailable()) {

                        String id = Integer.toString(movie.getId());
                        String id2 = Integer.toString(customer.getId());
                        String id3 = id2 + id;
                        int id4 = Integer.parseInt(id3);

                        Rental rental = new Rental(movie, customer, id4);
                        customer.rentals.add(rental);
                        getAvailableMovies.remove(movie);
                        System.out.println("Item rented successfully!!!");
                        System.out.println("Item ID:" + rental.getId());

                        movies.get(k).setAvailable(false);

                        x = false;
                    }
                }

            }
            if (x) {
                System.out.println("=================================================|");
                System.out.println("| Maybe this Item have been rented in past!!!    |");
                System.out.println("| or Maybe these aren't matches to rentallist!!! |");
                System.out.println("=================================================|");
            }
        }

        public void returnItem(Rental rental) {


            boolean x = true;
            for (int z = 0; z < rental.getCustomer().rentals.size(); z++) {
                if (Objects.equals(rental.getId(), rental.getCustomer().rentals.get(z).getId())&&Objects.equals(rental.getCustomer(),rental.getCustomer().getRentals().get(z).getCustomer())&&Objects.equals(rental.getMovie(),rental.getCustomer().getRentals().get(z).getMovie()) && !rental.getMovie().isAvailable) {

                    getAvailableMovies.add(rental.getMovie());

                    rental.getCustomer().rentals.remove(rental.getCustomer().rentals.get(z));

                    System.out.println("Movie returned successfully!!!");
                    rental.getMovie().setAvailable(true);
                    x = false;
                }

            }

            if (x) {
                System.out.println("These aren't matches to rentallist!!!");
            }
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

        public Movie getMovieById(int id) {

            int x = -1;
            for (int i = 0; i < movies.size(); i++) {
                if (id == movies.get(i).getId()) {
                    x = i;

                    return movies.get(x);
                }
            }
            if (x < 0) {
                System.out.println("==============================");
                System.out.println("|   This id doesn't exist!!! |");
                System.out.println("==============================");
            }
            return  null;
        }

        public int rental_id(Movie movie,Customer customer){

            String id = Integer.toString(movie.getId());
            String id2 = Integer.toString(customer.getId());
            String id3 = id2 + id;
            int id4 = Integer.parseInt(id3);
            return  id4;
        }

    }

    //==============================================================
    //==============================================================
    //==============================================================
    public class RentalMovie {
    public static void main(String[] args)  {


        Rentalstore shop=new Rentalstore();

        Customer person=new Customer(11,"Amir","amir@gmail.com","09350000000","Babolsar");
        shop.customers.add(person);

        Movie movie=new Movie("Game Of Thrones","Epic",new Date(2011,3,3),12,"Alan Taylor","1000",10);
        shop.addMovie(movie);


    }
}