import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise2Solution {

    private static final Logger LOG = Logger.getLogger(Exercise2Solution.class.getName());

    public static void main(String[] args) {
        LOG.setLevel(Level.ALL);
        LOG.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        LOG.addHandler(handler);

        String[][] transactions = {
            {"T001", "150.00", "COMPLETED"},
            {"T002", "275.50", "PENDING"},
            {"T003", "89.99", "FAILED"},
            {"T004", "1200.00", "COMPLETED"},
            {"T005", "45.00", "COMPLETED"}
        };

        double totalAmount = 0;
        for (String[] txn : transactions) {
            String id = txn[0];
            double amount = Double.parseDouble(txn[1]);
            String status = txn[2];
            totalAmount += amount;

            LOG.log(Level.FINE, "Processing transaction {0}: amount={1}, status={2}",
                new Object[]{id, txn[1], status});
        }

        LOG.log(Level.INFO, "Summary: {0} transactions processed, total amount={1}",
            new Object[]{transactions.length, String.format("%.2f", totalAmount)});
    }
}
