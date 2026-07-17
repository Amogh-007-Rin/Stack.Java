import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() { return name; }
    public int age() { return age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
            new Person("Charlie", 30),
            new Person("Alice", 25),
            new Person("Bob", 35),
            new Person("Diana", 28)
        ));

        System.out.println("Original:");
        people.forEach(System.out::println);

        people.sort(Comparator.comparing(Person::name));
        System.out.println("\nSorted by name:");
        people.forEach(System.out::println);

        people.sort(Comparator.comparing(Person::age));
        System.out.println("\nSorted by age:");
        people.forEach(System.out::println);
    }
}
