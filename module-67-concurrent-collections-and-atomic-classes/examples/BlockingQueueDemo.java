import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    private static final BlockingQueue<Integer> QUEUE = new ArrayBlockingQueue<>(3);

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    QUEUE.put(i);
                    System.out.println("Produced: " + i + " (queue size: " + QUEUE.size() + ")");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int value = QUEUE.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}
