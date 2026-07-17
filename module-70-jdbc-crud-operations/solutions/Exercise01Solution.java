import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercise01Solution {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:company";

        try (Connection conn = DriverManager.getConnection(url)) {

            conn.createStatement().execute(
                    "CREATE TABLE employees (id INT PRIMARY KEY, salary DECIMAL(10,2))");
            conn.createStatement().executeUpdate(
                    "INSERT INTO employees VALUES (1, 50000), (2, 60000), (3, 70000)");

            giveRaise(conn, 2, 10.0);

            try (PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM employees WHERE id = ?")) {
                ps.setInt(1, 2);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        System.out.println("Employee " + rs.getInt("id")
                                + " now earns " + rs.getDouble("salary"));
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static void giveRaise(Connection conn, int empId, double percent)
            throws SQLException {

        String sql = "UPDATE employees SET salary = salary * (1 + ? / 100) WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, percent);
            ps.setInt(2, empId);
            int rows = ps.executeUpdate();
            System.out.println("Raise applied to " + rows + " employee(s)");
        }
    }
}
