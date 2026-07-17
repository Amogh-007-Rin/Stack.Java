import java.util.concurrent.CopyOnWriteArrayList;

public class SnapshotIterator {
    private static final CopyOnWriteArrayList<String> readings = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Thread sensor = new Thread(() -> {
            int reading = 0;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    readings.add("Reading-" + (++reading));
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Sensor");

        Thread monitor = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Snapshot: " + readings);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Monitor");

        sensor.start();
        monitor.start();

        monitor.join();
        sensor.interrupt();
        sensor.join();

        System.out.println("Final readings: " + readings.size());
    }
}
