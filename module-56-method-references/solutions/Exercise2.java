import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise2 {
    public static void main(String[] args) {
        List<Function<String, String>> pipeline = Arrays.asList(
            String::strip,
            String::toUpperCase,
            s -> s.repeat(2),
            s -> s.concat("!")
        );

        Function<String, String> composed = pipeline.stream()
            .reduce(Function.identity(), Function::andThen);

        String result = composed.apply("  hello  ");
        System.out.println("Result: '" + result + "'");
    }
}
