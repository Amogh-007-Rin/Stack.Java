import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {

    private static final List<byte[]> CACHE = new ArrayList<>();

    static class LeakInducingObject {

        private final byte[] largeData = new byte[1024 * 1024];

        public LeakInducingObject() {
            System.out.println("Allocated 1MB, cache size: " + CACHE.size());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Memory Leak Demo ===");
        System.out.println("Static collection holds references -> memory leak");
        System.out.println("Run with: -Xmx256m to see OutOfMemoryError");
        System.out.println();

        try {
            for (int i = 0; i < 1000; i++) {
                LeakInducingObject obj = new LeakInducingObject();
                CACHE.add(obj.largeData);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
            System.out.println("The static CACHE list prevented GC from reclaiming memory");
        }

        System.out.println();
        System.out.println("Fix: Use WeakHashMap or bounded cache (e.g., LinkedHashMap with eviction)");
    }
}
