import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Alexeev on 4/20/14.
 */
public class Rent  implements Serializable{
    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return   book + "  " + date;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private  Client client;
    private  Book book;
    private  Date date;

    public Rent(Client client, Book book, Date date) {
        this.client = client;
        this.book = book;
        this.date = date;
    }
}
