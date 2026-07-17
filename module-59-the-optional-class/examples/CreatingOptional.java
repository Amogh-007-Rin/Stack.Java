import java.util.Optional;

public class CreatingOptional {
    public static void main(String[] args) {
        // Optional.empty() — no value
        Optional<String> empty = Optional.empty();
        System.out.println("empty isPresent: " + empty.isPresent());
        System.out.println("empty isEmpty: " + empty.isEmpty());

        // Optional.of() — requires non-null
        Optional<String> nonNull = Optional.of("Hello");
        System.out.println("of isPresent: " + nonNull.isPresent());
        System.out.println("of get: " + nonNull.get());

        // Optional.of() with null — throws NPE
        try {
            Optional.of(null);
        } catch (NullPointerException e) {
            System.out.println("of(null) throws NPE: " + e.getMessage());
        }

        // Optional.ofNullable() — accepts null
        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println("ofNullable(null) isPresent: " + nullable.isPresent());

        Optional<String> withValue = Optional.ofNullable("World");
        System.out.println("ofNullable(value) get: " + withValue.get());

        // Conditional logic
        String name = "Alice";
        Optional<String> maybeName = Optional.ofNullable(name);
        if (maybeName.isPresent()) {
            System.out.println("Name is: " + maybeName.get());
        }

        name = null;
        Optional<String> emptyName = Optional.ofNullable(name);
        if (emptyName.isEmpty()) {
            System.out.println("Name is absent");
        }
    }
}
