import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of(
            "Dune", "Neuromancer", "Foundation", "Hyperion", "Snow Crash"
        ));
        System.out.println("Original: " + books);

        Collections.shuffle(books);
        System.out.println("Shuffled: " + books);

        Collections.reverse(books);
        System.out.println("Reversed: " + books);

        Collections.shuffle(books);
        System.out.println("Shuffled again: " + books);
    }
}
