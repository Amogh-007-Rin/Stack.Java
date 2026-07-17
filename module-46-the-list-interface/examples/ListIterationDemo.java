import java.util.*;

public class ListIterationDemo {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of("Dune", "Neuromancer", "Snow Crash"));

        System.out.println("1. For loop with index:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("  [" + i + "] " + books.get(i));
        }

        System.out.println("2. For-each loop:");
        for (String book : books) {
            System.out.println("  " + book);
        }

        System.out.println("3. Iterator (safe removal):");
        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            String book = it.next();
            if (book.equals("Neuromancer")) {
                it.remove();
            }
        }
        System.out.println("  After removal: " + books);
    }
}
