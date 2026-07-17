import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueProducerConsumer {
    private static final BlockingQueue<Integer> QUEUE = new LinkedBlockingQueue<>(5);

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    QUEUE.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    int value = QUEUE.take();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}
