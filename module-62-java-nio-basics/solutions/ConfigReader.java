import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigReader {
    public static void main(String[] args) {
        Path config = args.length > 0 ? Paths.get(args[0]) : Paths.get("config.properties");

        if (!Files.exists(config)) {
            // Create sample config
            try {
                Files.write(config, List.of(
                    "db.url=jdbc:mysql://localhost:3306/mydb",
                    "db.user=admin",
                    "db.password=secret",
                    "app.name=MyApp",
                    "app.version=1.0"
                ));
                System.out.println("Created sample config file");
            } catch (IOException e) {
                System.out.println("Error creating config: " + e.getMessage());
                return;
            }
        }

        Map<String, String> props = new HashMap<>();

        try {
            List<String> lines = Files.readAllLines(config);
            for (String line : lines) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;
                int eq = line.indexOf('=');
                if (eq > 0) {
                    String key = line.substring(0, eq).trim();
                    String value = line.substring(eq + 1).trim();
                    props.put(key, value);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading config: " + e.getMessage());
            return;
        }

        System.out.println("Configuration:");
        for (Map.Entry<String, String> entry : props.entrySet()) {
            System.out.println("  " + entry.getKey() + " = " + entry.getValue());
        }
    }
}
