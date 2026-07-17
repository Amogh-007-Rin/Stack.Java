import java.util.Arrays;
import java.util.List;

public class LambdaComparison {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Anonymous class way
        names.sort(new java.util.Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println("Anonymous class: " + names);

        // Lambda way (equivalent)
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Lambda: " + names);

        // Python equivalent would be: sorted(names)
        // JavaScript equivalent would be: names.sort((a, b) => a.localeCompare(b))

        // Lambda with filter — similar to Python's filter()
        // Python: list(filter(lambda x: x.startsWith('A'), names))
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println("Starts with A: " + name));

        // Lambda with map — similar to Python's map()
        // Python: list(map(lambda x: x.upper(), names))
        // JS: names.map(x => x.toUpperCase())
        names.stream()
             .map(name -> name.toUpperCase())
             .forEach(name -> System.out.println("Uppercase: " + name));
    }
}
