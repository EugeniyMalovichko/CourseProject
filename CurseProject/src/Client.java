
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexeev on 4/20/14.
 */
public class Client extends Human implements Serializable{
    private  String phoneNumber;
    //private List<Rent> rentsList = new ArrayList<Rent>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int id;

    public Client(String name, String lastName, String phoneNumber, int id) {
        super(name,lastName);

        this.phoneNumber = phoneNumber;
        this.id = id;
    }
    //public void addBook
    
    public String getInfo()
    {
         return super.toString() + phoneNumber + "\n Id : " + id ;
    }
    
}
