import java.util.logging.Level;
import java.util.logging.Logger;

public class BestPracticesDemo {

    private static final Logger LOG = Logger.getLogger(BestPracticesDemo.class.getName());

    public static void main(String[] args) {
        LOG.setLevel(Level.ALL);

        String user = "alice";
        int recordId = 42;

        // BAD: string concatenation — builds the message even if FINE is off
        LOG.fine("User " + user + " viewed record " + recordId);

        // GOOD: parameterized logging — only formats if FINE is enabled
        LOG.log(Level.FINE, "User {0} viewed record {1}", new Object[]{user, recordId});

        // GOOD with exception: pass the Throwable as the last parameter
        try {
            riskyOperation();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Operation failed for user {0}", e);
        }

        System.out.println("Check the console output above. Both FINE messages appear");
        System.out.println("because we set level to ALL. If level were INFO, only the");
        System.out.println("SEVERE message would appear, but the concatenated string in");
        System.out.println("the bad example would still have been built (wasted work).");
    }

    static void riskyOperation() {
        throw new RuntimeException("Connection timeout");
    }
}
