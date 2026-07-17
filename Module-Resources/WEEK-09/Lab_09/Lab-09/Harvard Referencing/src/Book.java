import java.util.List;

//This class extends Publication
public class Book extends Publication {
    private final String publisher;
    
    //To create a Book object you need list of authors, title and year
    //The Book constructor calls the constructor of the super class and pass to it the list of authors, title and year
    //The constructor of the Book class sets the publisher of the Book
    public Book(List<Author> authors, String title, int year, String publisher) {
        super(authors, title, year);
        this.publisher = publisher;
    }
   
    public String getPublisher() {
       //return the publisher
       return publisher;
    } 
        
    @Override
    public String harvardReference() {
        //This method returns a call to the harvardReference() method of the super class and prints the publisher for the book
        return super.harvardReference() + " " + publisher + ".";
    }
}
