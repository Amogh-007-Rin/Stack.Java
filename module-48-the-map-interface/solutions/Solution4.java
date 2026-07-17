import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Map<String, List<Integer>> gradebook = new HashMap<>();

        gradebook.put("Alice", new ArrayList<>(List.of(85, 90, 78)));
        gradebook.put("Bob", new ArrayList<>(List.of(72, 88, 91)));
        gradebook.put("Carol", new ArrayList<>(List.of(95, 93, 97)));

        for (Map.Entry<String, List<Integer>> e : gradebook.entrySet()) {
            double avg = e.getValue().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
            System.out.printf("%s: scores=%s average=%.1f%n", e.getKey(), e.getValue(), avg);
        }
    }
}
