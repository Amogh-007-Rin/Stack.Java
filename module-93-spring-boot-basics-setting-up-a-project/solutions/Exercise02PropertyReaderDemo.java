import java.io.InputStream;
import java.util.Properties;

public class Exercise02PropertyReaderDemo {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();

        try (InputStream input = Exercise02PropertyReaderDemo.class
                .getClassLoader().getResourceAsStream("application.properties")) {
            if (input != null) {
                props.load(input);
            }
        }

        String name = props.getProperty("app.name", "Unknown");
        String version = props.getProperty("app.version", "0.0.0");
        String description = props.getProperty("app.description", "No description");

        System.out.println("App Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Description: " + description);
    }
}
