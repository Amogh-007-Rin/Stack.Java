import java.util.List;

// the WebPage class extends the Publication class
public class WebPage extends Publication {
    private final String url;
    private final String dateAccessed;
    
    public WebPage(
        List<Author> authors, String title, int year,
        String url, String dateAccessed
    ) {
        //use (super) to pass the correct argument for the superclass
        // set the arguments specific to a webpage
        super(authors, title, year);
        this.url = url;
        this.dateAccessed = dateAccessed;
    }
    
    public String getURL() {
        return url;
    }
     
    public String getDateAccessed() {
        return dateAccessed;
    }
    
    @Override
    public String harvardReference() {
        // call the harvardReference() method of the superclass
        String reference = super.harvardReference();
        
        //complete the webpage reference as described in the specification
        // Common Harvard format: add online indicator and available at + accessed date
        reference += " [Online]. Available at: " + url + " (Accessed: " + dateAccessed + ").";
        
        return reference;
    }
}
