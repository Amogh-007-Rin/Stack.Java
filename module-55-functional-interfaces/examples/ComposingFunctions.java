import java.util.function.Function;
import java.util.function.Predicate;

public class ComposingFunctions {
    public static void main(String[] args) {
        // Function composition with andThen
        Function<String, String> trim = String::strip;
        Function<String, String> upper = String::toUpperCase;
        Function<String, String> exclaim = s -> s + "!";

        Function<String, String> process = trim.andThen(upper).andThen(exclaim);
        System.out.println(process.apply("  hello  "));

        // Function composition with compose (reverse order)
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> addOne = x -> x + 1;

        Function<Integer, Integer> addThenSquare = square.compose(addOne);
        System.out.println("(3+1)^2 = " + addThenSquare.apply(3));

        Function<Integer, Integer> squareThenAdd = square.andThen(addOne);
        System.out.println("3^2 + 1 = " + squareThenAdd.apply(3));

        // Predicate composition
        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> !s.isEmpty();
        Predicate<String> valid = nonNull.and(nonEmpty);

        System.out.println("Valid 'hello': " + valid.test("hello"));
        System.out.println("Valid '': " + valid.test(""));
        System.out.println("Valid null: " + valid.test(null));

        // Predicate negation
        Predicate<String> isNullOrEmpty = nonNull.and(nonEmpty).negate();
        System.out.println("NullOrEmpty '': " + isNullOrEmpty.test(""));

        // Predicate or
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isMultipleOf3 = n -> n % 3 == 0;
        Predicate<Integer> evenOrMultipleOf3 = isEven.or(isMultipleOf3);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " even or %3? " + evenOrMultipleOf3.test(i));
        }
    }
}
