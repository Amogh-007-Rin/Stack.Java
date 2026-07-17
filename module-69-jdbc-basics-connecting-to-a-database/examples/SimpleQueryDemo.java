import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleQueryDemo {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.execute("CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(100))");
            stmt.executeUpdate("INSERT INTO employees VALUES (1, 'Alice')");
            stmt.executeUpdate("INSERT INTO employees VALUES (2, 'Bob')");

            try (ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println(id + ": " + name);
                }
            }
        } catch (SQLException e) {
            System.err.println("Query failed: " + e.getMessage());
        }
    }
}
