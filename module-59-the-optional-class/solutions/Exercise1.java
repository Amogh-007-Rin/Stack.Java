import java.util.Optional;

public class Exercise1 {
    public static Optional<Integer> divide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of(a / b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y1 = 2;
        String result1 = divide(x, y1)
            .map(r -> x + " / " + y1 + " = " + r)
            .orElse("Division by zero");
        System.out.println(result1);

        int y2 = 0;
        String result2 = divide(x, y2)
            .map(r -> x + " / " + y2 + " = " + r)
            .orElse("Division by zero");
        System.out.println(result2);
    }
}
