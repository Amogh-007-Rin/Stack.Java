import java.util.List;

public class TakeWhileDropWhile {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 9, 10, 12, 14, 15);

        // takeWhile — take while predicate is true (ordered stream)
        List<Integer> evenPrefix = numbers.stream()
            .takeWhile(n -> n % 2 == 0)
            .toList();
        System.out.println("takeWhile even: " + evenPrefix);

        // dropWhile — skip while predicate is true, then take the rest
        List<Integer> afterEvenPrefix = numbers.stream()
            .dropWhile(n -> n % 2 == 0)
            .toList();
        System.out.println("dropWhile even: " + afterEvenPrefix);

        // Practical: process a sorted list until a condition fails
        List<String> sortedNames = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> upToD = sortedNames.stream()
            .takeWhile(name -> !name.equals("David"))
            .toList();
        System.out.println("Names before David: " + upToD);

        // dropWhile — skip names shorter than 4 chars
        List<String> longerNames = sortedNames.stream()
            .dropWhile(name -> name.length() < 5)
            .toList();
        System.out.println("After short names dropped: " + longerNames);
    }
}
