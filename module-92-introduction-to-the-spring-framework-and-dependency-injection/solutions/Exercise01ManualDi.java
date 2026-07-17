interface Database {
    void connect();
}

class MySqlDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class PostgresDatabase implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }
}

class AppService {
    private final Database database;

    AppService(Database database) {
        this.database = database;
    }

    void start() {
        database.connect();
    }
}

public class Exercise01ManualDi {
    public static void main(String[] args) {
        Database db = new MySqlDatabase();
        AppService service = new AppService(db);
        service.start();

        Database db2 = new PostgresDatabase();
        AppService service2 = new AppService(db2);
        service2.start();
    }
}
