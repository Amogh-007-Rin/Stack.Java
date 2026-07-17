import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();
        printQueue.offer("Report.pdf");
        printQueue.offer("Essay.docx");
        printQueue.offer("Invoice.pdf");
        printQueue.offer("Poster.png");
        printQueue.offer("Letter.docx");

        System.out.println("Processing print queue:");
        while (!printQueue.isEmpty()) {
            String doc = printQueue.poll();
            System.out.println("  Printing: " + doc);
        }
        System.out.println("Queue empty: " + printQueue.isEmpty());
    }
}
