import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.addLast("Patron A");
        queue.addLast("Patron B");
        queue.addLast("Patron C");
        System.out.println("Queue: " + queue);

        String first = queue.removeFirst();
        System.out.println("Served: " + first);
        System.out.println("Remaining: " + queue);

        queue.addFirst("VIP Patron");
        System.out.println("After VIP skip: " + queue);

        String peek = queue.peekFirst();
        System.out.println("Next to serve: " + peek);
    }
}
