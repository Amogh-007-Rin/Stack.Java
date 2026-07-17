import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionSerialization {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, 3.8));
        students.add(new Student("Bob", 2, 3.5));
        students.add(new Student("Charlie", 3, 4.0));

        String filename = "students.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("Serialized list of " + students.size() + " students");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            @SuppressWarnings("unchecked")
            List<Student> loaded = (List<Student>) ois.readObject();
            System.out.println("Deserialized list:");
            for (Student s : loaded) {
                System.out.println("  " + s);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }

        new java.io.File(filename).delete();
    }
}
