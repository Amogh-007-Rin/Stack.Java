import java.util.*;

public class OptionalAntiPatterns {
    public static void main(String[] args) {
        // Anti-pattern 1: Calling get() without checking
        Optional<String> maybeEmpty = Optional.empty();
        try {
            maybeEmpty.get();  // DON'T — throws NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("Anti-pattern 1: get() on empty throws: " + e.getClass().getSimpleName());
        }

        // Anti-pattern 2: Using Optional for fields (conceptual — won't compile with Serializable)
        // public class Person {
        //     private Optional<String> middleName;  // DON'T — not serializable
        // }

        // Anti-pattern 3: Optional as method parameter (conceptual)
        // public void setName(Optional<String> name) { ... }  // DON'T — caller can pass null anyway

        // Anti-pattern 4: Returning null instead of Optional.empty()
        // public Optional<String> findName() { return null; }  // DON'T

        // Correct way:
        System.out.println("Correct: return Optional.empty()");

        // Anti-pattern 5: Nested Optional
        Map<String, Optional<String>> map = new HashMap<>();
        map.put("key", Optional.of("value"));
        // Optional<Optional<String>> nested = Optional.of(map.get("key"));  // DON'T
        Optional<String> flat = Optional.ofNullable(map.get("key")).flatMap(o -> o);
        System.out.println("flatMap avoids nesting: " + flat.orElse("none"));

        // Anti-pattern 6: Optional.of() with possibly null
        String maybeNull = Math.random() > 0.5 ? "hello" : null;
        try {
            Optional.of(maybeNull);  // DON'T — throws NPE for null
        } catch (NullPointerException e) {
            System.out.println("Anti-pattern 6: use ofNullable() instead");
        }
    }
}
