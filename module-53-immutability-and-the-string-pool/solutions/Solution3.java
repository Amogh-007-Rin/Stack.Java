import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        List<String> immutableList = List.of("A", "B", "C");
        Set<String> immutableSet = Set.of("X", "Y", "Z");
        Map<String, Integer> immutableMap = Map.of("one", 1, "two", 2);

        System.out.println("List: " + immutableList);
        System.out.println("Set: " + immutableSet);
        System.out.println("Map: " + immutableMap);

        try {
            immutableList.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("\nList.add() threw: " + e);
        }

        try {
            immutableSet.add("W");
        } catch (UnsupportedOperationException e) {
            System.out.println("Set.add() threw: " + e);
        }

        try {
            immutableMap.put("three", 3);
        } catch (UnsupportedOperationException e) {
            System.out.println("Map.put() threw: " + e);
        }

        // List.copyOf creates separate immutable copy
        List<String> mutable = new ArrayList<>(List.of("Dune"));
        List<String> copy = List.copyOf(mutable);
        mutable.add("Neuromancer");
        System.out.println("\nOriginal: " + mutable);
        System.out.println("Copy (unchanged): " + copy);
    }
}
