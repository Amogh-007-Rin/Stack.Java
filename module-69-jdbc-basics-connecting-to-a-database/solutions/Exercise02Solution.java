import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise02Solution {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.execute("CREATE TABLE products ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "price DECIMAL(10,2))");

            stmt.executeUpdate("INSERT INTO products VALUES (1, 'Laptop', 999.99)");
            stmt.executeUpdate("INSERT INTO products VALUES (2, 'Mouse', 25.50)");
            stmt.executeUpdate("INSERT INTO products VALUES (3, 'Keyboard', 75.00)");

            try (ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM products WHERE price > 10.00")) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | "
                            + rs.getString("name") + " | "
                            + rs.getDouble("price"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
