
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Alexeev on 4/20/14.
 */
public class Book  implements Serializable{
    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.author);
        hash = 79 * hash + Objects.hashCode(this.bookName);
        hash = 79 * hash + (this.isStock ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (this.isStock != other.isStock) {
            return false;
        }
        return true;
    }
    
    private int id;
    private Author author;
    private String bookName;
    public boolean isStock = true;
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return bookName;
    }
    
    public String getInfo()
    {
        return "Название : "+bookName+"\n"+
                "ID : " +id+"\n"+
                "В наличии : "+ isStock+"\n"+
                "Автор : " + author+"\n";
    }

    public Book(Author author, String bookName,int id) {
        this.id = id;
        this.author = author;
        this.bookName = bookName;
    }
}
