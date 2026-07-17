import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class PublicationReferenceTest {

    private List<Author> sampleAuthors() {
        List<Author> authors = new ArrayList<>();
        authors.add(new PersonAuthor("Smith", "J."));
        authors.add(new PersonAuthor("Jones", "S."));
        return authors;
    }

    @Test
    public void bookHarvardReference() {
        List<Author> authors = sampleAuthors();
        Book book = new Book(authors, "Learning Java", 2020, "O'Reilly Media");
        String expected = "Smith, J. and Jones, S. (2020) Learning Java. O'Reilly Media.";
        assertEquals(expected, book.harvardReference());
    }

    @Test
    public void journalArticleHarvardReference() {
        List<Author> authors = sampleAuthors();
        JournalArticle journal = new JournalArticle(
            authors, "Java Testing", 2021,
            "Journal of Java", 12, 2, 45, 67
        );
        String expected = "Smith, J. and Jones, S. (2021) Java Testing. Journal of Java, 12(2), pp. 45-67.";
        assertEquals(expected, journal.harvardReference());
    }

    @Test
    public void webPageHarvardReference() {
        List<Author> authors = sampleAuthors();
        WebPage webpage = new WebPage(
            authors, "Using Java on the Web", 2022,
            "https://example.com/using-java", "12 Dec 2022"
        );
        String expected = "Smith, J. and Jones, S. (2022) Using Java on the Web. [Online]. Available at: https://example.com/using-java (Accessed: 12 Dec 2022).";
        assertEquals(expected, webpage.harvardReference());
    }

    @Test
    public void personAuthorMethods() {
        PersonAuthor a = new PersonAuthor("Smith", "J.");
        assertEquals("Smith, J.", a.fullName());
        assertEquals("Smith", a.citeName());
    }
}