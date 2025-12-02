import java.util.ArrayList;
import java.util.List;

public class PublicationMain {

    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        // demonstrate using PersonAuthor for more realistic Harvard output
        authors.add(new PersonAuthor("Smith", "J."));
        authors.add(new PersonAuthor("Jones", "S."));
        
        Book book = new Book(authors, "Learning Java", 2020, "O'Reilly Media");
        JournalArticle journal = new JournalArticle(
            authors, "Java Testing", 2021,
            "Journal of Java", 12, 2, 45, 67
        );
        WebPage webpage = new WebPage(
            authors, "Using Java on the Web", 2022,
            "https://example.com/using-java", "12 Dec 2022"
        );
        
        System.out.println("Book reference:");
        System.out.println(book.harvardReference());
        System.out.println();
        
        System.out.println("Journal Article reference:");
        System.out.println(journal.harvardReference());
        System.out.println();
        
        System.out.println("Web Page reference:");
        System.out.println(webpage.harvardReference());
    }
}
