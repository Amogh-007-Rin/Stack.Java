public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(String msg) {
        System.out.println("[INFO] " + msg);
    }

    public void warn(String msg) {
        System.out.println("[WARN] " + msg);
    }

    public void error(String msg) {
        System.out.println("[ERROR] " + msg);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.info("Application started");
        logger.warn("Low disk space");
        logger.error("NullPointerException occurred");

        Logger another = Logger.getInstance();
        System.out.println("Same logger instance: " + (logger == another));
    }
}
