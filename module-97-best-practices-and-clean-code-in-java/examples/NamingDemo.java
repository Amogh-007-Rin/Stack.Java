import java.util.List;

public class NamingDemo {

    // BAD naming
    int i;             // what is i?
    int d;             // days? dollars? distance?
    String x;          // meaningless
    void proc() {}     // what does it process?

    // GOOD naming
    int daysOverdue;
    double totalAmountDue;
    String customerEmail;
    void sendOverdueNotice() {}

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // BAD loop variable
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // GOOD loop variable
        for (int index = 0; index < names.size(); index++) {
            System.out.println(names.get(index));
        }

        // Even better with enhanced for
        for (String name : names) {
            System.out.println(name);
        }
    }
}
