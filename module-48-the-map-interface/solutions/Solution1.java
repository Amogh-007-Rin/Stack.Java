import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Map<String, String> catalog = new HashMap<>();
        catalog.put("978-0-553-59317-0", "Dune");
        catalog.put("978-0-441-56959-5", "Neuromancer");
        catalog.put("978-0-553-38095-4", "Snow Crash");
        catalog.put("978-0-553-26675-3", "Foundation");
        catalog.put("978-0-441-01335-7", "Ender's Game");

        System.out.println("Title for 978-0-553-59317-0: " + catalog.get("978-0-553-59317-0"));
        System.out.println("Contains 978-0-000-00000-0? " + catalog.containsKey("978-0-000-00000-0"));

        catalog.put("978-0-553-59317-0", "Dune (Updated)");
        System.out.println("Updated: " + catalog.get("978-0-553-59317-0"));

        catalog.remove("978-0-441-01335-7");
        System.out.println("After removal: " + catalog);

        System.out.println("\nAll entries:");
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
        }
    }
}
