import java.util.Arrays;
import java.util.Comparator;

public class Exercise2 {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";

        long count = Arrays.stream(sentence.split("\\s+"))
            .distinct()
            .filter(w -> w.length() > 3)
            .peek(System.out::println)
            .count();
        System.out.println("Count: " + count);

        String shortest = Arrays.stream(sentence.split("\\s+"))
            .distinct()
            .filter(w -> w.length() > 3)
            .min(Comparator.comparingInt(String::length))
            .orElse("none");
        System.out.println("Shortest: " + shortest);
    }
}
