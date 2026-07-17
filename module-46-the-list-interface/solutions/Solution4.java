import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        int n = 100_000;

        long start = System.nanoTime();
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, "book" + i);
        }
        long arrayTime = System.nanoTime() - start;
        System.out.println("ArrayList addFirst x" + n + ": " + arrayTime / 1_000_000 + "ms");

        start = System.nanoTime();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, "book" + i);
        }
        long linkedTime = System.nanoTime() - start;
        System.out.println("LinkedList addFirst x" + n + ": " + linkedTime / 1_000_000 + "ms");

        System.out.println("\nLinkedList is dramatically faster for front insertions.");
    }
}
