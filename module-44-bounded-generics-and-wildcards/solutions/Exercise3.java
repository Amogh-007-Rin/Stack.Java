import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addAll(numbers, 5, 10);
        System.out.println("Numbers: " + numbers);

        List<Integer> ints = new ArrayList<>();
        addAll(ints, 1, 5);
        System.out.println("Integers: " + ints);
    }

    static void addAll(List<? super Integer> dest, int start, int end) {
        for (int i = start; i <= end; i++) {
            dest.add(i);
        }
    }
}
