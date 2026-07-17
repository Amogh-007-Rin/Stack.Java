import java.util.*;

public class PECSDemo {
    public static void main(String[] args) {
        System.out.println("=== PECS: Producer Extends, Consumer Super ===");

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        // Producer: we read from ints via ? extends Number
        double sum = sumProducer(ints);
        System.out.println("Sum: " + sum);

        // Consumer: we write to a list via ? super Integer
        List<Number> numbers = new ArrayList<>();
        addIntegers(numbers);
        System.out.println("Numbers list: " + numbers);

        // Both producer and consumer in action
        List<Object> objects = new ArrayList<>();
        copy(ints, objects);
        System.out.println("Copied to objects: " + objects);
    }

    // Producer: read from source
    static double sumProducer(List<? extends Number> source) {
        double sum = 0;
        for (Number n : source) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Consumer: write to destination
    static void addIntegers(List<? super Integer> dest) {
        dest.add(10);
        dest.add(20);
        dest.add(30);
    }

    // Copy with PECS: source is producer, dest is consumer
    static <T> void copy(List<? extends T> source, List<? super T> dest) {
        for (T item : source) {
            dest.add(item);
        }
    }
}
