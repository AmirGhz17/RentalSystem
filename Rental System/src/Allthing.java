import java.util.ArrayList;

public class Allthing {

    public ArrayList<Book> books;
    public ArrayList<Game> games;
    public ArrayList<Movie> movies;
    public ArrayList<Customer> customers;


    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

}
