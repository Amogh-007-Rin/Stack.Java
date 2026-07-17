import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
            "hello world hello",
            "world is beautiful",
            "hello everyone"
        );

        Map<String, Long> wordCounts = sentences.stream()
            .flatMap(s -> Arrays.stream(s.split("\\s+")))
            .collect(Collectors.groupingBy(
                String::toLowerCase,
                Collectors.counting()
            ));

        wordCounts.forEach((word, count) -> {
            if (count > 1) {
                System.out.println(word + "=" + count);
            }
        });
    }
}
