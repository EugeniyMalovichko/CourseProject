import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexeev on 4/20/14.
 */
public abstract class Library implements Serializable {
    protected List<Book> freeBook;
    protected List<Book> books;
    protected List<Rent> rents;
    protected List<Client> clients;
    protected List<Author> authors;

    Library() {
        freeBook= new ArrayList<Book>();
        books = new ArrayList<Book>();
        rents = new ArrayList<Rent>();
        clients = new ArrayList<Client>();
        authors = new ArrayList<Author>();
        
    }
    public abstract boolean returnBook(Book b,Client c);
    public abstract boolean rentBook(Rent r);
    public abstract void addBook(Book b);
    public abstract void addClient(Client c);
}
