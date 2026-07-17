import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise3 {
    public static void main(String[] args) {
        int[][] ranges = {{1, 5}, {3, 8}, {10, 15}};

        int sum = Arrays.stream(ranges)
            .flatMapToInt(range -> IntStream.range(range[0], range[1]))
            .distinct()
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);
        System.out.println("Sum of distinct evens: " + sum);

        List<Integer> first10 = Arrays.stream(ranges)
            .flatMapToInt(range -> IntStream.range(range[0], range[1]))
            .distinct()
            .boxed()
            .limit(10)
            .toList();
        System.out.println("First 10 distinct: " + first10);
    }
}
