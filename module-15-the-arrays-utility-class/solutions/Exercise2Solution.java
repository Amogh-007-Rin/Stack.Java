import java.util.Arrays;

public class Exercise2Solution {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        int charlieIndex = Arrays.binarySearch(names, "Charlie");
        int frankIndex = Arrays.binarySearch(names, "Frank");

        System.out.println("Index of Charlie: " + charlieIndex);
        System.out.println("Index of Frank: " + frankIndex);
    }
}
