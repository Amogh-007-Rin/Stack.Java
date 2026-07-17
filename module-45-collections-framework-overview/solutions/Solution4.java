import java.util.*;

class Library implements Iterable<String> {
    private List<String> books;

    public Library(List<String> books) {
        this.books = new ArrayList<>(books);
    }

    @Override
    public Iterator<String> iterator() {
        return books.iterator();
    }
}

public class Solution4 {
    public static void main(String[] args) {
        Library lib = new Library(List.of("Dune", "Neuromancer", "Snow Crash"));
        System.out.println("Library books:");
        for (String book : lib) {
            System.out.println("  " + book);
        }
    }
}
