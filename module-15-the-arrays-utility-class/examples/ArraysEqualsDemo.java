import java.util.Arrays;

public class ArraysEqualsDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};

        System.out.println("a == b: " + (a == b));
        System.out.println("Arrays.equals(a, b): " + Arrays.equals(a, b));
        System.out.println("Arrays.equals(a, c): " + Arrays.equals(a, c));

        int[][] deepA = {{1}, {2, 3}};
        int[][] deepB = {{1}, {2, 3}};
        System.out.println("Arrays.equals(deepA, deepB): " + Arrays.equals(deepA, deepB));
        System.out.println("Arrays.deepEquals(deepA, deepB): " + Arrays.deepEquals(deepA, deepB));
    }
}
