import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise2 {
    public static void main(String[] args) {
        List<Function<String, String>> steps = Arrays.asList(
            String::strip,
            String::toUpperCase,
            s -> s.replaceAll("[AEIOU]", "*"),
            s -> s.length() > 5 ? s.substring(0, 5) : s
        );

        List<String> inputs = Arrays.asList("  hello world  ", "Java", "  functional programming  ");

        for (String input : inputs) {
            System.out.println("\nInput: '" + input + "'");
            Function<String, String> pipeline = Function.identity();
            for (Function<String, String> step : steps) {
                pipeline = pipeline.andThen(step);
            }
            System.out.println("Result: '" + pipeline.apply(input) + "'");
        }
    }
}
