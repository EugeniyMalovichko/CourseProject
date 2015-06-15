
import java.io.Serializable;

/**
 * Created by Alexeev on 4/20/14.
 */
public class Human implements Serializable{
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return name + " " + lastName+"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
