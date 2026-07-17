import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> bookRatings = new HashMap<>();

        bookRatings.put("Dune", 5);
        bookRatings.put("Neuromancer", 4);
        bookRatings.put("Snow Crash", 4);
        bookRatings.put("Dune", 5);  // overwrite with same

        System.out.println("Map: " + bookRatings);
        System.out.println("Rating for Dune: " + bookRatings.get("Dune"));
        System.out.println("Rating for Unknown: " + bookRatings.get("Unknown"));

        System.out.println("Contains 'Dune'? " + bookRatings.containsKey("Dune"));
        System.out.println("Contains rating 5? " + bookRatings.containsValue(5));

        bookRatings.remove("Snow Crash");
        System.out.println("After remove: " + bookRatings);
        System.out.println("Size: " + bookRatings.size());
    }
}
