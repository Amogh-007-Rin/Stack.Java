import java.util.LinkedList;
import java.util.Queue;

public class WaitNotifyDemo {
    private static final Queue<Integer> BUFFER = new LinkedList<>();
    private static final int CAPACITY = 5;

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer(), "Producer");
        Thread consumer = new Thread(new Consumer(), "Consumer");

        producer.start();
        consumer.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            int value = 0;
            while (value < 10) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == CAPACITY) {
                        try {
                            BUFFER.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                    BUFFER.add(++value);
                    System.out.println("Produced: " + value);
                    BUFFER.notifyAll();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (BUFFER) {
                    while (BUFFER.isEmpty()) {
                        try {
                            BUFFER.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                    int value = BUFFER.poll();
                    System.out.println("Consumed: " + value);
                    BUFFER.notifyAll();
                }
            }
        }
    }
}
