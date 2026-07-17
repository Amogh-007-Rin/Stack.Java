import java.util.HashMap;
import java.util.Map;

interface Database {
    void save(String key, String value);
    String find(String key);
}

class MySQLDatabase implements Database {

    @Override
    public void save(String key, String value) {
        System.out.println("MySQL: Saving (" + key + ", " + value + ")");
    }

    @Override
    public String find(String key) {
        System.out.println("MySQL: Finding " + key);
        return "mysql_result";
    }
}

class InMemoryDatabase implements Database {

    private final Map<String, String> store = new HashMap<>();

    @Override
    public void save(String key, String value) {
        store.put(key, value);
        System.out.println("InMemory: Saved (" + key + ", " + value + ")");
    }

    @Override
    public String find(String key) {
        String value = store.get(key);
        System.out.println("InMemory: Found " + key + " -> " + value);
        return value;
    }
}

class UserService {

    private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void createUser(String username, String email) {
        database.save("user:" + username, email);
    }

    public String findUserEmail(String username) {
        return database.find("user:" + username);
    }
}

public class DatabaseDipDemo {

    public static void main(String[] args) {
        UserService productionService = new UserService(new MySQLDatabase());
        productionService.createUser("alice", "alice@example.com");
        productionService.findUserEmail("alice");

        System.out.println("--- Switching to InMemoryDatabase ---");

        UserService testService = new UserService(new InMemoryDatabase());
        testService.createUser("bob", "bob@example.com");
        testService.findUserEmail("bob");
    }
}
