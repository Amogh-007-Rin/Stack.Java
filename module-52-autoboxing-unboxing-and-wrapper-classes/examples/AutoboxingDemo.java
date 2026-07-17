import java.util.*;

public class AutoboxingDemo {
    public static void main(String[] args) {
        // Autoboxing: int -> Integer
        Integer boxed = 42;
        System.out.println("Boxed: " + boxed);

        // Unboxing: Integer -> int
        int unboxed = boxed;
        System.out.println("Unboxed: " + unboxed);

        // In collections
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // autobox
        numbers.add(20);
        numbers.add(30);
        System.out.println("List: " + numbers);

        int sum = 0;
        for (Integer n : numbers) {
            sum += n;  // unbox
        }
        System.out.println("Sum: " + sum);

        // Mixed arithmetic
        Integer a = 5;
        Integer b = 3;
        Integer c = a + b;  // unbox, add, autobox result
        System.out.println(a + " + " + b + " = " + c);
    }
}
