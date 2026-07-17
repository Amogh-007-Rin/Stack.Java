import java.util.*;

public final class ImmutableClassDemo {
    private final String title;
    private final List<String> authors;
    private final int year;

    public ImmutableClassDemo(String title, List<String> authors, int year) {
        this.title = title;
        this.authors = List.copyOf(authors);
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        List<String> authorList = new ArrayList<>(List.of("Frank Herbert"));
        ImmutableClassDemo book = new ImmutableClassDemo("Dune", authorList, 1965);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Authors: " + book.getAuthors());
        System.out.println("Year: " + book.getYear());

        // Try to modify the original list
        authorList.add("Someone Else");
        System.out.println("Book authors after external modification: " + book.getAuthors());

        // Verify immutability
        System.out.println("\nImmutableBook is immutable: title=" + book.getTitle());
    }
}
