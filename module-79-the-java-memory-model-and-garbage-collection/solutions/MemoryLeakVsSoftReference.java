import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class MemoryLeakVsSoftReference {

    private static final List<byte[]> LEAKY_CACHE = new ArrayList<>();
    private static final List<SoftReference<byte[]>> SOFT_CACHE = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Leaky Cache (strong references) ===");
        try {
            for (int i = 0; i < 1000; i++) {
                LEAKY_CACHE.add(new byte[1024 * 1024]);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: Strong references prevent GC");
        }

        LEAKY_CACHE.clear();

        System.out.println();
        System.out.println("=== SoftReference Cache (GC-friendly) ===");
        for (int i = 0; i < 1000; i++) {
            SOFT_CACHE.add(new SoftReference<>(new byte[1024 * 1024]));
        }

        int liveCount = 0;
        for (SoftReference<byte[]> ref : SOFT_CACHE) {
            if (ref.get() != null) {
                liveCount++;
            }
        }
        System.out.println("Live soft references: " + liveCount + " (some may have been cleared by GC)");
        System.out.println("Soft references are cleared by GC before OutOfMemoryError");
    }
}
