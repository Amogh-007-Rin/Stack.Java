import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface IntPredicate {
    boolean test(int n);
}

public class Exercise2 {
    public static List<Integer> filter(List<Integer> values, IntPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int n : values) {
            if (predicate.test(n)) {
                result.add(n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 10, 7, 15, 22, 8, 1);

        IntPredicate even = n -> n % 2 == 0;
        IntPredicate greaterThanTen = n -> n > 10;
        IntPredicate betweenFiveAndFifteen = n -> n >= 5 && n <= 15;

        System.out.println("Original: " + numbers);
        System.out.println("Even: " + filter(numbers, even));
        System.out.println("> 10: " + filter(numbers, greaterThanTen));
        System.out.println("5-15: " + filter(numbers, betweenFiveAndFifteen));
    }
}
