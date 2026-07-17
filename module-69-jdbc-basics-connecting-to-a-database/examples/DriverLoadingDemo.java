import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverLoadingDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // Historical approach (JDBC 3 and earlier)
        Class.forName("org.h2.Driver");
        System.out.println("Driver manually loaded with Class.forName");

        // JDBC 4+ auto-loading — no call needed if JAR is on classpath.
        // Just attempt a connection:
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:autoload")) {
            System.out.println("Connected without explicit Class.forName. "
                    + "The DriverManager found the H2 driver via service loader.");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
