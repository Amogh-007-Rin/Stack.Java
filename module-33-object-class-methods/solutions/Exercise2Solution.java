import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', gpa=" + gpa + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Double.compare(student.gpa, gpa) == 0 && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gpa);
    }
}

public class Exercise2Solution {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1, "Alice", 3.8));
        students.add(new Student(2, "Bob", 3.5));
        students.add(new Student(1, "Alice", 3.8));

        System.out.println("Set size: " + students.size());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
