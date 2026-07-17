import java.util.List;
import java.util.stream.IntStream;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> squares = IntStream.rangeClosed(1, 100)
            .skip(10)
            .filter(n -> n % 2 == 0)
            .limit(20)
            .map(n -> n * n)
            .boxed()
            .toList();

        System.out.println("Squares: " + squares);

        int sum = squares.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Sum: " + sum);
    }
}
