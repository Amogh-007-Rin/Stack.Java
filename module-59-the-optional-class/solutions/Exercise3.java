import java.util.List;
import java.util.Optional;

record UserRecord(String name, Optional<String> email, Optional<String> phone) {}

public class Exercise3 {
    public static Optional<String> findFirstEmailOrPhone(List<UserRecord> users, String name) {
        for (UserRecord user : users) {
            if (user.name().equals(name)) {
                return user.email()
                    .or(() -> user.phone());
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<UserRecord> users = List.of(
            new UserRecord("Alice", Optional.of("alice@example.com"), Optional.of("555-0100")),
            new UserRecord("Bob", Optional.empty(), Optional.of("555-0101")),
            new UserRecord("Charlie", Optional.of("charlie@example.com"), Optional.empty()),
            new UserRecord("Diana", Optional.empty(), Optional.empty())
        );

        String[][] testCases = {{"Alice", "alice@example.com"}, {"Bob", "555-0101"}, {"Charlie", "charlie@example.com"}, {"Diana", "No contact"}, {"Eve", "Not found"}};

        for (String[] tc : testCases) {
            String name = tc[0];
            String expected = tc[1];
            String result = findFirstEmailOrPhone(users, name).orElse("Not found");
            System.out.println(name + " -> " + result + " (expected: " + expected + ")");
        }
    }
}
