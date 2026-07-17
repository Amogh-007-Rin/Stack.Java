import java.io.*;

public class CustomExceptionWithCause {
    public static void main(String[] args) {
        System.out.println("=== Custom Exception with Cause ===");
        try {
            readConfig("missing.properties");
        } catch (ConfigLoadException e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getClass().getSimpleName());
            System.out.println("Cause message: " + e.getCause().getMessage());
        }
    }

    static void readConfig(String path) throws ConfigLoadException {
        try {
            FileReader reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new ConfigLoadException("Failed to load config: " + path, e);
        }
    }
}

class ConfigLoadException extends Exception {
    public ConfigLoadException(String message) {
        super(message);
    }

    public ConfigLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
