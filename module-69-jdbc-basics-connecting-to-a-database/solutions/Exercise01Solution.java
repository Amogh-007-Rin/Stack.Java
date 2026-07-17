import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exercise01Solution {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:company";

        try (Connection conn = DriverManager.getConnection(url)) {
            boolean valid = conn.isValid(3);
            System.out.println("Connection valid: " + valid);
        } catch (SQLException e) {
            System.err.println("Failed: " + e.getMessage());
        }
    }
}
