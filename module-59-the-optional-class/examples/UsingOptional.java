import java.util.NoSuchElementException;
import java.util.Optional;

public class UsingOptional {
    public static void main(String[] args) {
        Optional<String> present = Optional.of("Hello");
        Optional<String> empty = Optional.empty();

        // ifPresent — run code if value exists
        present.ifPresent(s -> System.out.println("Present: " + s));
        empty.ifPresent(s -> System.out.println("This won't print"));

        // orElse — return fallback
        System.out.println("orElse on present: " + present.orElse("default"));
        System.out.println("orElse on empty: " + empty.orElse("default"));

        // orElseGet — lazy fallback supplier
        System.out.println("orElseGet: " + empty.orElseGet(() -> computeDefault()));

        // orElseThrow — throw if empty
        System.out.println("orElseThrow on present: " + present.orElseThrow());
        try {
            empty.orElseThrow();
        } catch (NoSuchElementException e) {
            System.out.println("orElseThrow on empty throws: " + e.getClass().getSimpleName());
        }

        // orElseThrow with custom exception
        try {
            empty.orElseThrow(() -> new IllegalStateException("Value required"));
        } catch (IllegalStateException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
    }

    private static String computeDefault() {
        System.out.println("  (computing default)");
        return "computedDefault";
    }
}
