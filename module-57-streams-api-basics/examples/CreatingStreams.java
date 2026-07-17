import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        // From a List
        List<String> list = List.of("apple", "banana", "cherry");
        Stream<String> fromList = list.stream();
        System.out.println("From list: " + fromList.toList());

        // From an array
        String[] array = {"one", "two", "three"};
        Stream<String> fromArray = Arrays.stream(array);
        System.out.println("From array: " + fromArray.toList());

        // From values
        Stream<Integer> fromValues = Stream.of(10, 20, 30, 40, 50);
        System.out.println("From values: " + fromValues.toList());

        // Empty stream
        Stream<String> empty = Stream.empty();
        System.out.println("Empty stream count: " + empty.count());

        // IntStream from primitive array
        int[] numbers = {5, 3, 8, 1, 9};
        IntStream intStream = Arrays.stream(numbers);
        System.out.println("Sum of int array: " + intStream.sum());

        // Stream of characters from a string
        System.out.print("Chars of 'Java': ");
        "Java".chars().forEach(c -> System.out.print((char) c + " "));
        System.out.println();
    }
}
