public class BoundedTypeDemo {
    public static void main(String[] args) {
        System.out.println("=== Bounded Type Parameters ===");

        NumberBox<Integer> intBox = new NumberBox<>(42);
        System.out.println("Integer box: " + intBox.getValue());
        System.out.println("Double value: " + intBox.doubleValue());

        NumberBox<Double> doubleBox = new NumberBox<>(3.14);
        System.out.println("Double box: " + doubleBox.getValue());
        System.out.println("Double value: " + doubleBox.doubleValue());

        // NumberBox<String> would not compile (String does not extend Number)
        System.out.println("Sum of two numbers: " + sum(10, 20.5));
    }

    static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

class NumberBox<T extends Number> {
    private final T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }
}
