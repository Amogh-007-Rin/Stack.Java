import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Validator<T> {
    private final Predicate<T> predicate;
    private final String errorMessage;

    private Validator(Predicate<T> predicate, String errorMessage) {
        this.predicate = predicate;
        this.errorMessage = errorMessage;
    }

    public static <T> Validator<T> of(Predicate<T> p, String errorMessage) {
        return new Validator<>(p, errorMessage);
    }

    public Validator<T> and(Predicate<T> other, String errorMessage) {
        Validator<T> outer = this;
        return new Validator<>(
            t -> outer.predicate.test(t) && other.test(t),
            errorMessage
        );
    }

    public Validator<T> or(Predicate<T> other, String errorMessage) {
        Validator<T> outer = this;
        return new Validator<>(
            t -> outer.predicate.test(t) || other.test(t),
            errorMessage
        );
    }

    public boolean isValid(T value) {
        return predicate.test(value);
    }

    public List<String> getErrors(T value) {
        List<String> errors = new ArrayList<>();
        if (!predicate.test(value)) {
            errors.add(errorMessage);
        }
        return errors;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Validator<String> notNull = Validator.of(s -> s != null, "Must not be null");
        Validator<String> notEmpty = Validator.of(s -> !s.isEmpty(), "Must not be empty");
        Validator<String> minLength = Validator.of(s -> s.length() >= 3, "Must be at least 3 chars");
        Validator<String> hasDigit = Validator.of(s -> s.matches(".*\\d.*"), "Must contain a digit");

        List<Validator<String>> validators = List.of(notNull, notEmpty, minLength, hasDigit);

        List<String> testValues = Arrays.asList(null, "", "ab", "abc", "abc1");

        for (String value : testValues) {
            System.out.println("\nTesting: '" + value + "'");
            for (Validator<String> v : validators) {
                List<String> errors = v.getErrors(value);
                for (String err : errors) {
                    System.out.println("  FAIL: " + err);
                }
                if (errors.isEmpty()) {
                    System.out.println("  PASS");
                }
            }
        }
    }
}
