import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("LoggerDemo");

        logger.setLevel(Level.ALL);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);

        logger.severe("Disk failure imminent");
        logger.warning("Memory usage above 90%");
        logger.info("Application started successfully");
        logger.config("Configuration loaded from app.properties");
        logger.fine("Processing record 42");
        logger.finer("SQL: SELECT * FROM books");
        logger.finest("Cache hit for key 'user_101'");
    }
}
