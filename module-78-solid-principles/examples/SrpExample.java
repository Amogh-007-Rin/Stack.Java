import java.util.ArrayList;
import java.util.List;

class InvoiceViolation {

    private final List<String> items = new ArrayList<>();
    private double total;

    public void addItem(String item, double price) {
        items.add(item);
        total += price;
    }

    public void printInvoice() {
        System.out.println("=== Invoice ===");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Total: $" + total);
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database...");
    }
}

class Invoice {

    private final List<String> items = new ArrayList<>();
    private double total;

    public void addItem(String item, double price) {
        items.add(item);
        total += price;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }
}

class InvoicePrinter {

    public void print(Invoice invoice) {
        System.out.println("=== Invoice ===");
        for (String item : invoice.getItems()) {
            System.out.println(item);
        }
        System.out.println("Total: $" + invoice.getTotal());
    }
}

class InvoiceRepository {

    public void save(Invoice invoice) {
        System.out.println("Saving invoice to database...");
    }
}

public class SrpExample {

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Laptop", 999.99);
        invoice.addItem("Mouse", 29.99);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);

        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);
    }
}
