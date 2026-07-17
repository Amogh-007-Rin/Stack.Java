import java.util.*;

public class MapIterationDemo {
    public static void main(String[] args) {
        Map<String, Integer> ratings = new HashMap<>();
        ratings.put("Dune", 5);
        ratings.put("Neuromancer", 4);
        ratings.put("Foundation", 5);

        System.out.println("keySet iteration:");
        for (String key : ratings.keySet()) {
            System.out.println("  " + key + " -> " + ratings.get(key));
        }

        System.out.println("values iteration:");
        for (int value : ratings.values()) {
            System.out.println("  " + value);
        }

        System.out.println("entrySet iteration (best for both):");
        for (Map.Entry<String, Integer> e : ratings.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
        }

        System.out.println("forEach with lambda:");
        ratings.forEach((k, v) -> System.out.println("  " + k + " -> " + v));
    }
}
