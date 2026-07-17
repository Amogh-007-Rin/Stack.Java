import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();

        printQueue.offer("Doc1.pdf");
        printQueue.offer("Doc2.pdf");
        printQueue.offer("Doc3.pdf");
        System.out.println("Print queue: " + printQueue);

        String next = printQueue.peek();
        System.out.println("Next to print (peek): " + next);

        String printed = printQueue.poll();
        System.out.println("Printed: " + printed);
        System.out.println("Remaining: " + printQueue);

        System.out.println("Empty? " + printQueue.isEmpty());

        printQueue.poll();
        printQueue.poll();
        String emptyPoll = printQueue.poll();
        System.out.println("Poll from empty: " + emptyPoll);

        // printQueue.element();  // throws NoSuchElementException on empty
    }
}
