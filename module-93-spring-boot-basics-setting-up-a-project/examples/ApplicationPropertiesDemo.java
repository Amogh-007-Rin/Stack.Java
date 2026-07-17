import java.io.InputStream;
import java.util.Properties;

// Standalone demo: shows how Spring Boot reads application.properties
// Spring uses a similar mechanism via Environment abstraction.
public class ApplicationPropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();

        try (InputStream input = ApplicationPropertiesDemo.class
                .getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                System.out.println("No application.properties found on classpath.");
                System.out.println("Spring Boot would use defaults instead.");
                return;
            }
            props.load(input);
        }

        System.out.println("=== Loaded Properties ===");
        props.forEach((key, value) -> System.out.println(key + " = " + value));

        String serverPort = props.getProperty("server.port", "8080");
        System.out.println("\nServer port: " + serverPort);
    }
}
