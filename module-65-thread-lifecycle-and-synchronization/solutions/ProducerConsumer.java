import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private static final Queue<Integer> BUFFER = new LinkedList<>();
    private static final int CAPACITY = 3;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == CAPACITY) {
                        try { BUFFER.wait(); } catch (InterruptedException e) { return; }
                    }
                    BUFFER.add(i);
                    System.out.println("Produced: " + i);
                    BUFFER.notifyAll();
                }
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (BUFFER) {
                    while (BUFFER.isEmpty()) {
                        try { BUFFER.wait(); } catch (InterruptedException e) { return; }
                    }
                    int value = BUFFER.poll();
                    System.out.println("Consumed: " + value);
                    BUFFER.notifyAll();
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}
