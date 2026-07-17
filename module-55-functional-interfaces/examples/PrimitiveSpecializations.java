import java.util.function.BooleanSupplier;
import java.util.function.DoubleConsumer;
import java.util.function.IntPredicate;

public class PrimitiveSpecializations {
    public static void main(String[] args) {
        // IntPredicate — avoids Integer boxing
        IntPredicate isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        // DoubleConsumer — consumes primitive doubles
        DoubleConsumer show = d -> System.out.printf("Value: %.2f%n", d);
        show.accept(3.14159);
        show.accept(2.71828);

        // BooleanSupplier — supplies a boolean
        BooleanSupplier isReady = () -> {
            double rand = Math.random();
            return rand > 0.5;
        };
        System.out.println("Ready? " + isReady.getAsBoolean());

        // Performance comparison conceptual (not benchmarked)
        // Boxing version: Predicate<Integer> p = n -> n % 2 == 0;
        // Primitive:      IntPredicate p = n -> n % 2 == 0;
        // Primitive avoids creating Integer objects for each test
        long sum = 0;
        IntPredicate multipleOfThree = n -> n % 3 == 0;
        for (int i = 0; i < 1_000; i++) {
            if (multipleOfThree.test(i)) {
                sum++;
            }
        }
        System.out.println("Multiples of 3 under 1000: " + sum);
    }
}
