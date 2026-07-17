import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

        Runnable player = () -> {
            for (int i = 0; i < 100; i++) {
                scores.merge("player", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(player);
        Thread t2 = new Thread(player);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Player score: " + scores.get("player") + " (expected: 200)");

        // Atomic putIfAbsent
        scores.putIfAbsent("newPlayer", 0);
        System.out.println("New player score: " + scores.get("newPlayer"));
    }
}
