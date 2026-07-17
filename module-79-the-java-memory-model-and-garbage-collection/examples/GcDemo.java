import java.util.ArrayList;
import java.util.List;

public class GcDemo {

    static class GarbageObject {

        private final byte[] data = new byte[1024 * 100];
        private final int id;
        private static int counter = 0;

        public GarbageObject() {
            this.id = counter++;
        }

        @Override
        protected void finalize() {
            System.out.println("GarbageObject " + id + " finalized");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== GC Demo ===");
        System.out.println("Creating and discarding objects...");
        System.out.println("Run with: java -XX:+PrintGCDetails GcDemo");
        System.out.println();

        List<GarbageObject> holder = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            holder.add(new GarbageObject());
        }

        System.out.println("Created 10 objects, clearing list...");
        holder.clear();

        System.gc();
        System.out.println("System.gc() called (it's just a hint)");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Demo completed");
        System.out.println("Note: finalize() is deprecated since Java 18");
    }
}
