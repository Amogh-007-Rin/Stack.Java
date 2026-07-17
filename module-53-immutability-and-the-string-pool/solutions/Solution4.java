import java.util.*;

final class ImmutableBook {
    private final String title;
    private final Date publishDate;

    ImmutableBook(String title, Date publishDate) {
        this.title = title;
        this.publishDate = new Date(publishDate.getTime());  // defensive copy
    }

    public String getTitle() { return title; }

    public Date getPublishDate() {
        return new Date(publishDate.getTime());  // defensive copy in getter
    }
}

public class Solution4 {
    public static void main(String[] args) {
        Date originalDate = new Date(100_000_000_000L);
        ImmutableBook book = new ImmutableBook("Dune", originalDate);

        System.out.println("Before: " + book.getPublishDate());

        originalDate.setTime(999_999_999_999L);
        System.out.println("After mutating original date: " + book.getPublishDate());

        System.out.println("The book's date is unchanged - defensive copies work.");
    }
}
