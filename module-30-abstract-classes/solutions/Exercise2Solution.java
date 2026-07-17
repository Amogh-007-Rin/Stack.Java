abstract class Logger {
    protected String level;

    public Logger(String level) {
        this.level = level;
    }

    public abstract void log(String message);

    public void info(String message) {
        log("[INFO] " + message);
    }

    public void error(String message) {
        log("[ERROR] " + message);
    }
}

class ConsoleLogger extends Logger {
    public ConsoleLogger() {
        super("INFO");
    }

    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}

class FileLogger extends Logger {
    public FileLogger() {
        super("INFO");
    }

    @Override
    public void log(String message) {
        System.out.println("Writing to file: " + message);
    }
}

public class Exercise2Solution {
    public static void main(String[] args) {
        Logger console = new ConsoleLogger();
        Logger file = new FileLogger();

        console.info("Application started");
        console.error("Null pointer encountered");

        file.info("Data saved");
        file.error("Disk full");
    }
}
