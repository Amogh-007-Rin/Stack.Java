public class Exercise4Solution {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.print("Original: ");
        for (int n : original) System.out.print(n + " ");

        System.out.print("\nCopy:     ");
        for (int n : copy) System.out.print(n + " ");

        System.out.println();
    }
}
