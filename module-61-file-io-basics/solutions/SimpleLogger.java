import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java SimpleLogger <message>");
            return;
        }

        String message = String.join(" ", args);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logLine = "[" + timestamp + "] " + message;

        try (PrintWriter pw = new PrintWriter(new FileWriter("app.log", true))) {
            pw.println(logLine);
            System.out.println("Logged: " + logLine);
        } catch (IOException e) {
            System.out.println("Error writing log: " + e.getMessage());
        }
    }
}
