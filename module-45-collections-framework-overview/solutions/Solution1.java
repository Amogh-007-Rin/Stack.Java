import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        String[] initial = {"Dune", "Neuromancer", "Snow Crash", "Foundation", "Hyperion"};
        List<String> books = new ArrayList<>(Arrays.asList(initial));
        System.out.println("From array: " + books);

        books.add("Altered Carbon");
        books.add("The Martian");
        System.out.println("After adding: " + books);

        books.remove("Foundation");
        System.out.println("After removal: " + books);
    }
}
