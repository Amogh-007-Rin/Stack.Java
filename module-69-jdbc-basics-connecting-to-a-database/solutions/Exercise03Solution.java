import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exercise03Solution {
    public static void main(String[] args) {
        testConnection("jdbc:h2:mem:mydb");
        testConnection("jdbc:h2:file:./testdb");
    }

    static void testConnection(String url) {
        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("SUCCESS: " + url);
        } catch (SQLException e) {
            System.out.println("FAILED: " + url + " — " + e.getMessage());
        }
    }
}
