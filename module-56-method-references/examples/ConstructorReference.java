import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        // ArrayList::new — no-arg constructor
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
        list.add("Hello");
        list.add("World");
        System.out.println("List from constructor ref: " + list);

        // String::new — no-arg constructor
        Supplier<String> emptyString = String::new;
        System.out.println("Empty string: '" + emptyString.get() + "'");

        // String::new with char[] — but let's use a simpler example
        // Integer::new — constructor reference with one arg
        Function<String, Integer> intParser = Integer::new;
        System.out.println("Integer from string: " + intParser.apply("256"));

        // Array constructor reference
        IntFunction<String[]> stringArrayMaker = String[]::new;
        String[] arr = stringArrayMaker.apply(5);
        System.out.println("Array length: " + arr.length);

        // Using constructor ref with stream to collect
        List<String> items = Arrays.asList("a", "b", "c");
        List<String> copy = items.stream()
                                 .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("Copied list: " + copy);
    }
}
