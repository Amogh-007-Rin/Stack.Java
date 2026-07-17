import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("Alice");
        queue.addLast("Bob");
        queue.addLast("Carol");
        queue.addLast("Dave");

        String served = queue.removeFirst();
        System.out.println("Served: " + served);

        queue.addLast("Eve");
        queue.addLast("Frank");

        queue.addFirst("VIP - Alice");
        System.out.println("Queue after VIP skip: " + queue);

        System.out.println("Remaining queue:");
        while (!queue.isEmpty()) {
            System.out.println("  " + queue.removeFirst());
        }
    }
}
