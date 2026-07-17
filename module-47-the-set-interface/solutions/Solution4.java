import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        List<String> words = List.of(
            "the", "quick", "brown", "fox", "jumps", "over",
            "the", "lazy", "dog", "the", "fox"
        );

        Set<String> unique = new LinkedHashSet<>(words);
        System.out.println("Unique words (insertion order): " + unique);
    }
}
