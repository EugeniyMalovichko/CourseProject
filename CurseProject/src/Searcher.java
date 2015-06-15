import java.util.List;

/**
 * Created by Alexeev on 4/20/14.
 */
public class Searcher {
    public Searcher(MyLibrary lib) {
        this.lib = lib;
    }

    MyLibrary lib;
    public Client searchClientById(int id)
    {
       List<Client> clientList =lib.getClients();
       for(int i= 0;i<clientList.size();i++)
           if(clientList.get(i).getId() == id)
               return clientList.get(i);
        return null;
    }
    public Client searchClientByName(String name)
    {
        List<Client> clientList =lib.getClients();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getName().equals(name))
                return clientList.get(i);
        return null;
    }
    public Client searchClientByLastName(String lastName)
    {
        List<Client> clientList =lib.getClients();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getLastName().equals(lastName))
                return clientList.get(i);
        return null;
    }
    public Client searchClientByPhoneNumber(String phoneNumber)
    {
        List<Client> clientList =lib.getClients();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getLastName().equals(phoneNumber))
                return clientList.get(i);
        return null;
    }


   
    public Author searchAuthorByName(String name)
    {
        List<Author> clientList =lib.getAuthors();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getName() == name)
                return clientList.get(i);
        return null;
    }
    public Author searchAuthorByLastName(String lastName)
    {
        List<Author> clientList =lib.getAuthors();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getLastName() == lastName)
                return clientList.get(i);
        return null;
    }

    public Book searchBookByID(int id)
    {
        List<Book> clientList =lib.getAllBooks();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getId() == id)
                return clientList.get(i);
        return null;
    }
    public Book searchBookByName(String name)
    {
        List<Book> clientList =lib.getAllBooks();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getBookName().equals(name))
                return clientList.get(i);
        return null;
    }
    public Book searchBookByAuthor(Author a)
    {
        List<Book> clientList =lib.getAllBooks();
        for(int i= 0;i<clientList.size();i++)
            if(clientList.get(i).getAuthor().equals(a))
                return clientList.get(i);
        return null;
    }


}
