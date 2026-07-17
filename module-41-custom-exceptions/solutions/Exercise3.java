import java.io.*;

public class Exercise3 {
    public static void main(String[] args) {
        Database db = new Database();
        try {
            db.connect("jdbc:mysql://localhost:3306/mydb");
        } catch (DatabaseException e) {
            System.out.println("Database error: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getClass().getSimpleName());
                System.out.println("Cause message: " + e.getCause().getMessage());
            }
        }
    }
}

class Database {
    public void connect(String url) throws DatabaseException {
        try {
            FileReader reader = new FileReader("database.properties");
        } catch (FileNotFoundException e) {
            throw new DatabaseException("Could not connect to database at " + url, e);
        }
    }
}

class DatabaseException extends Exception {
    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(Throwable cause) {
        super(cause);
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
