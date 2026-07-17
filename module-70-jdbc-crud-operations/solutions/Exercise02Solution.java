import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercise02Solution {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:store";

        try (Connection conn = DriverManager.getConnection(url)) {

            conn.createStatement().execute(
                    "CREATE TABLE orders (id INT PRIMARY KEY, total DECIMAL(10,2))");
            conn.createStatement().execute(
                    "CREATE TABLE inventory (item VARCHAR(50) PRIMARY KEY, qty INT)");
            conn.createStatement().executeUpdate(
                    "INSERT INTO inventory VALUES ('Widget', 10)");

            placeOrder(conn, 1, "Widget", 3);

        } catch (SQLException e) {
            System.err.println("Order failed: " + e.getMessage());
        }
    }

    static void placeOrder(Connection conn, int orderId, String item, int qty)
            throws SQLException {

        conn.setAutoCommit(false);

        try (PreparedStatement checkInv = conn.prepareStatement(
                    "SELECT qty FROM inventory WHERE item = ?");
             PreparedStatement updateInv = conn.prepareStatement(
                    "UPDATE inventory SET qty = qty - ? WHERE item = ?");
             PreparedStatement insertOrder = conn.prepareStatement(
                    "INSERT INTO orders VALUES (?, ?)")) {

            checkInv.setString(1, item);
            try (ResultSet rs = checkInv.executeQuery()) {
                if (!rs.next() || rs.getInt("qty") < qty) {
                    throw new SQLException("Insufficient inventory");
                }
            }

            updateInv.setInt(1, qty);
            updateInv.setString(2, item);
            updateInv.executeUpdate();

            insertOrder.setInt(1, orderId);
            insertOrder.setDouble(2, qty * 19.99);
            insertOrder.executeUpdate();

            conn.commit();
            System.out.println("Order " + orderId + " placed for " + qty + " x " + item);

        } catch (SQLException e) {
            conn.rollback();
            System.out.println("Transaction rolled back: " + e.getMessage());
            throw e;
        }
    }
}
