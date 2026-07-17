import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Map<String, Integer> borrows = new TreeMap<>();
        borrows.put("Carol", 3);
        borrows.put("Alice", 5);
        borrows.put("Bob", 2);

        System.out.println("keySet:");
        for (String name : borrows.keySet()) {
            System.out.println("  " + name);
        }

        System.out.println("values:");
        for (int count : borrows.values()) {
            System.out.println("  " + count);
        }

        System.out.println("entrySet:");
        for (Map.Entry<String, Integer> e : borrows.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nNote: TreeMap sorted alphabetically by name.");
    }
}
