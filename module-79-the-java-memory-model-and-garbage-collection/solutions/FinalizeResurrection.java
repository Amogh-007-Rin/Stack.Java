import java.util.ArrayList;
import java.util.List;

public class FinalizeResurrection {

    private static final List<FinalizeResurrection> RESURRECTION_LIST = new ArrayList<>();

    private final int id;
    private static int counter = 0;

    public FinalizeResurrection() {
        this.id = counter++;
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() {
        System.out.println("finalize() called for object " + id);
        RESURRECTION_LIST.add(this);
        System.out.println("Object " + id + " resurrected!");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== finalize() Resurrection Demo ===");
        System.out.println("Note: finalize() is deprecated since Java 18");

        FinalizeResurrection obj = new FinalizeResurrection();
        obj = null;

        System.gc();
        Thread.sleep(500);

        if (!RESURRECTION_LIST.isEmpty()) {
            System.out.println("Object " + RESURRECTION_LIST.getFirst().id + " is alive again!");
        }

        RESURRECTION_LIST.clear();
        System.gc();
        Thread.sleep(500);

        System.out.println("finalize() will NOT be called again on the same object");
        System.out.println("This is why finalize() is unreliable and deprecated");
    }
}
