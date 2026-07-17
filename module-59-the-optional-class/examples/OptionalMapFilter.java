import java.util.Optional;

public class OptionalMapFilter {
    public static void main(String[] args) {
        // map — transform value if present
        Optional<String> name = Optional.of("Alice");
        Optional<Integer> length = name.map(String::length);
        System.out.println("Length of 'Alice': " + length.orElse(0));

        Optional<String> empty = Optional.empty();
        Optional<Integer> emptyLength = empty.map(String::length);
        System.out.println("Length of empty: " + emptyLength.orElse(-1));

        // Chaining maps
        String result = Optional.of("  Hello  ")
            .map(String::strip)
            .map(String::toUpperCase)
            .map(s -> s + "!")
            .orElse("default");
        System.out.println("Chained map: " + result);

        // filter — keep value if predicate matches
        Optional<String> filtered = name.filter(s -> s.startsWith("A"));
        System.out.println("Filtered (starts with A): " + filtered.orElse("none"));

        Optional<String> filtered2 = name.filter(s -> s.length() > 10);
        System.out.println("Filtered (len > 10): " + filtered2.orElse("none"));

        // flatMap — avoid Optional<Optional<T>>
        Optional<String> upper = name.flatMap(s -> Optional.of(s.toUpperCase()));
        System.out.println("flatMap upper: " + upper.orElse("none"));

        // Realistic: find email domain
        Optional<String> email = Optional.of("alice@example.com");
        String domain = email
            .filter(e -> e.contains("@"))
            .map(e -> e.substring(e.indexOf("@") + 1))
            .orElse("unknown");
        System.out.println("Domain: " + domain);
    }
}
