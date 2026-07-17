import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StaticMethodReference {
    public static void main(String[] args) {
        // Math::max as BinaryOperator
        BinaryOperator<Integer> max = Math::max;
        System.out.println("Max of 10 and 20: " + max.apply(10, 20));

        // Integer::parseInt as Function
        Function<String, Integer> parser = Integer::parseInt;
        System.out.println("Parsed '42': " + parser.apply("42"));

        // String::valueOf as Function (int overload)
        Function<Integer, String> converter = String::valueOf;
        System.out.println("String value of 100: " + converter.apply(100));

        // Using method reference with streams
        List<String> numbers = Arrays.asList("3", "1", "4", "1", "5");
        numbers.stream()
               .map(Integer::parseInt)
               .map(String::valueOf)
               .forEach(System.out::print);
        System.out.println();

        // UnaryOperator with static method
        UnaryOperator<Double> sqrt = Math::sqrt;
        System.out.println("sqrt(16) = " + sqrt.apply(16.0));
    }
}
