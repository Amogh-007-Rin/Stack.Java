import java.util.logging.Level;
import java.util.logging.Logger;

public class LogLevelsDemo {
    private static final Logger LOG = Logger.getLogger(LogLevelsDemo.class.getName());

    public static void main(String[] args) {
        LOG.setLevel(Level.ALL);

        System.out.println("=== Level comparison ===");
        System.out.println("FINEST  = " + Level.FINEST.intValue());
        System.out.println("FINER   = " + Level.FINER.intValue());
        System.out.println("FINE    = " + Level.FINE.intValue());
        System.out.println("CONFIG  = " + Level.CONFIG.intValue());
        System.out.println("INFO    = " + Level.INFO.intValue());
        System.out.println("WARNING = " + Level.WARNING.intValue());
        System.out.println("SEVERE  = " + Level.SEVERE.intValue());

        System.out.println("\n=== Default behavior (INFO threshold) ===");
        Logger defaultLogger = Logger.getLogger("DefaultLogger");
        defaultLogger.fine("This will NOT appear");
        defaultLogger.info("This WILL appear");
        defaultLogger.warning("This WILL appear too");
    }
}
