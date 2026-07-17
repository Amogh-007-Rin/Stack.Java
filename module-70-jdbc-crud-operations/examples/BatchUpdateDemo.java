import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb";

        try (Connection conn = DriverManager.getConnection(url)) {

            conn.createStatement().execute(
                    "CREATE TABLE logs (id INT PRIMARY KEY, message VARCHAR(200))");

            String sql = "INSERT INTO logs VALUES (?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {

                for (int i = 1; i <= 1000; i++) {
                    ps.setInt(1, i);
                    ps.setString(2, "Log entry #" + i);
                    ps.addBatch();

                    // Execute every 500 rows
                    if (i % 500 == 0) {
                        int[] results = ps.executeBatch();
                        System.out.println("Batch executed: " + results.length + " rows");
                    }
                }
                // Final batch for remainder
                ps.executeBatch();
                System.out.println("All 1000 rows inserted via batch.");
            }

        } catch (SQLException e) {
            System.err.println("Batch error: " + e.getMessage());
        }
    }
}
