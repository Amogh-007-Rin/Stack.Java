import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Exercise3Solution {

    private static final Logger LOG = Logger.getLogger(Exercise3Solution.class.getName());

    public static void main(String[] args) {
        LOG.setUseParentHandlers(false);
        LOG.setLevel(Level.ALL);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new Formatter() {
            private static final DateTimeFormatter DTF =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            @Override
            public String format(LogRecord record) {
                return String.format("[%s] %s - %s%n",
                    record.getLevel().getName(),
                    LocalDateTime.now().format(DTF),
                    record.getMessage());
            }
        });
        LOG.addHandler(handler);

        LOG.info("Application started");
        LOG.warning("Configuration file not found, using defaults");
        LOG.severe("Unable to connect to database");
    }
}
