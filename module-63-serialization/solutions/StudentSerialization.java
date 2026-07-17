import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", gpa=" + gpa + "}";
    }
}

public class StudentSerialization {
    public static void main(String[] args) {
        Student student = new Student("Bob", 101, 3.75);
        String filename = "student.ser";

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Serialized: " + student);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return;
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            Student loaded = (Student) ois.readObject();
            System.out.println("Deserialized: " + loaded);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }

        new java.io.File(filename).delete();
    }
}
