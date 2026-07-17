import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise03Solution {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:sessions_db";

        try (Connection conn = DriverManager.getConnection(url)) {

            conn.createStatement().execute(
                    "CREATE TABLE sessions (id INT PRIMARY KEY, active BOOLEAN)");

            for (int i = 1; i <= 100; i++) {
                boolean active = i % 3 != 0;
                conn.createStatement().executeUpdate(
                        "INSERT INTO sessions VALUES (" + i + ", " + active + ")");
            }

            String sql = "DELETE FROM sessions WHERE id = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {

                for (int i = 1; i <= 100; i++) {
                    ps.setInt(1, i);
                    ps.addBatch();

                    if (i % 50 == 0) {
                        ps.executeBatch();
                    }
                }
                ps.executeBatch();
                System.out.println("Batch delete completed.");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
