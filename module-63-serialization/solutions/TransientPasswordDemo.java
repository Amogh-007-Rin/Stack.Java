import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;
    private transient String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email
            + "', password='" + password + "'}";
    }
}

public class TransientPasswordDemo {
    public static void main(String[] args) {
        User user = new User("alice", "alice@example.com", "p@ssw0rd");
        String filename = "user.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(user);
            System.out.println("Before serialization: " + user);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            User loaded = (User) ois.readObject();
            System.out.println("After deserialization: " + loaded);
            System.out.println("Password is null? " + (loaded.toString().contains("password='null'")));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }

        new java.io.File(filename).delete();
    }
}
