import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        List<String> result = names.stream()
            .filter(n -> n.startsWith("A") || n.startsWith("B"))
            .map(String::toUpperCase)
            .sorted()
            .toList();

        System.out.println("Filtered names: " + result);
    }
}
