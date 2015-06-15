import java.io.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Alexeev on 4/20/14.
 */
public class MyLibrary extends Library implements Serializable{
    @Override
    public boolean rentBook(Rent r) { 
        if(!super.freeBook.remove(r.getBook()))
            return false;
        r.getBook().isStock = false;
        super.rents.add(r);
        return true;
    }
    @Override
    public boolean returnBook(Book b, Client c) {
        for(int i=0;i<super.rents.size();i++)
        {
            if(super.rents.get(i).getBook() == b
                    && super.rents.get(i).getClient() == c)
            {
                super.rents.remove(i);
                super.freeBook.add(b);
                 b.isStock = false;
                return true;
            }
        }
        return false;
    }
    @Override
    public void addBook(Book b) {
        super.freeBook.add(b);
        super.books.add(b);
    }

    @Override
    public void addClient(Client c) {
        super.clients.add(c);
    }

    public List<Client> getClients()
    {
        return super.clients;
    }
    public List<Book> getFreeBooks()
    {
        return super.freeBook;
    }
    public List<Book> getAllBooks()
    {
        return super.books;
    }
    public List<Author> getAuthors()
    {
        return super.authors;
    }
    public List<Rent> getRents()
    {
        return super.rents;
    }
    public void saveToFile(String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(this);
        oos.flush();
        oos.close();
    }
    public void readFromFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois =new ObjectInputStream(fis);
        MyLibrary l = (MyLibrary) ois.readObject();
        this.authors = l.authors;
        this.clients = l.clients;
        this.freeBook = l.freeBook;
        this.rents = l.rents;
        this.books = l.books;
    }

    


}
