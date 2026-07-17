import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class WordCounter {
    public static void main(String[] args) throws InterruptedException {
        List<String> words = List.of(
            "apple", "banana", "apple", "cherry", "banana", "apple",
            "date", "cherry", "banana", "apple"
        );

        ConcurrentHashMap<String, Integer> freq = new ConcurrentHashMap<>();

        Runnable countTask = () -> {
            for (String word : words) {
                freq.merge(word, 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(countTask);
        Thread t2 = new Thread(countTask);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Word frequencies:");
        freq.forEach((word, count) -> System.out.println("  " + word + ": " + count));
    }
}
