import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class SimpleFormatterDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SimpleFormatterDemo.class.getName());
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("[%s] %s: %s%n",
                    record.getLevel().getName(),
                    record.getSourceClassName(),
                    record.getMessage());
            }
        });
        logger.addHandler(handler);

        logger.info("Custom formatter active");
        logger.warning("Something needs attention");
        logger.severe("Critical error occurred");
    }
}
