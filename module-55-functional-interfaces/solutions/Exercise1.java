import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

enum LogLevel { INFO, WARN, ERROR }

public class Exercise1 {
    public static void log(Map<LogLevel, Consumer<String>> loggers, LogLevel level, String msg) {
        Consumer<String> logger = loggers.get(level);
        if (logger != null) {
            logger.accept(msg);
        }
    }

    public static void main(String[] args) {
        Map<LogLevel, Consumer<String>> loggers = new HashMap<>();
        loggers.put(LogLevel.INFO,  msg -> System.out.println("[INFO] " + msg));
        loggers.put(LogLevel.WARN,  msg -> System.out.println("[WARN] " + msg));
        loggers.put(LogLevel.ERROR, msg -> System.out.println("[ERROR] " + msg));

        log(loggers, LogLevel.INFO, "Application started");
        log(loggers, LogLevel.WARN, "Low disk space");
        log(loggers, LogLevel.ERROR, "Null pointer exception");
    }
}
