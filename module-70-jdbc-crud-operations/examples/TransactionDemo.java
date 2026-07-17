import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb";

        try (Connection conn = DriverManager.getConnection(url)) {

            conn.createStatement().execute(
                    "CREATE TABLE accounts (id INT PRIMARY KEY, balance DECIMAL(10,2))");
            conn.createStatement().executeUpdate(
                    "INSERT INTO accounts VALUES (1, 1000.00), (2, 500.00)");

            transfer(conn, 1, 2, 200.00);

            System.out.println("Transfer completed successfully.");

        } catch (SQLException e) {
            System.err.println("Transfer failed: " + e.getMessage());
        }
    }

    static void transfer(Connection conn, int from, int to, double amount)
            throws SQLException {

        conn.setAutoCommit(false);

        try (PreparedStatement debit = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?");
             PreparedStatement credit = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

            debit.setDouble(1, amount);
            debit.setInt(2, from);
            debit.executeUpdate();

            credit.setDouble(1, amount);
            credit.setInt(2, to);
            credit.executeUpdate();

            conn.commit();

        } catch (SQLException e) {
            conn.rollback();
            System.err.println("Rolled back due to: " + e.getMessage());
            throw e;
        }
    }
}
