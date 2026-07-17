import java.util.*;

public class WhyCollections {
    public static void main(String[] args) {
        // Array: fixed size
        String[] arr = new String[3];
        arr[0] = "A";
        arr[1] = "B";
        arr[2] = "C";
        // arr[3] = "D";  // ArrayIndexOutOfBoundsException

        System.out.println("Array: " + Arrays.toString(arr));

        // ArrayList: dynamic size
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");  // fine, grows automatically
        System.out.println("ArrayList: " + list);

        // Utility methods
        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        System.out.println("\nCollections win: dynamic size + utility methods.");
    }
}
