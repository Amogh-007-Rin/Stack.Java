import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb";

        try (Connection conn = DriverManager.getConnection(url)) {

            conn.createStatement().execute(
                    "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50))");

            insertUser(conn, 1, "Alice");
            insertUser(conn, 2, "Bob");
            insertUser(conn, 3, "Charlie");

            findByName(conn, "Bob");

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static void insertUser(Connection conn, int id, String name) throws SQLException {
        String sql = "INSERT INTO users VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println("Inserted " + rows + " row(s) for " + name);
        }
    }

    static void findByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM users WHERE name = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Found: id=" + rs.getInt("id")
                            + ", name=" + rs.getString("name"));
                }
            }
        }
    }
}
