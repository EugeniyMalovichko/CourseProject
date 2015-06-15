
import java.io.Serializable;

/**
 * Created by Alexeev on 4/20/14.
 */
public class Author extends Human implements Serializable{
   
    public String getInfo()
    {
         return super.toString() +
                "Description : " + description;
    }

    private  String description;

   

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;


        if (description != null ? !description.equals(author.description) : author.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        return result;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author(String name, String lastName, String description) {
        super(name,lastName);

        this.description = description;
    }
}
