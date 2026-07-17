import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        String[] words = {"dune", "neuromancer", "dune", "snow", "crash", "snow", "dune"};

        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.println("  " + e.getKey() + ": " + e.getValue());
        }
    }
}
