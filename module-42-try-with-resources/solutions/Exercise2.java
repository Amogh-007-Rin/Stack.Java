public class Exercise2 {
    public static void main(String[] args) {
        try (Logger logger = new Logger()) {
            logger.log("Application started.");
            logger.log("Processing data...");
            logger.log("Application finished.");
        }
    }
}

class Logger implements AutoCloseable {
    public Logger() {
        System.out.println("Logger opened.");
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    @Override
    public void close() {
        System.out.println("Logger closed.");
    }
}
