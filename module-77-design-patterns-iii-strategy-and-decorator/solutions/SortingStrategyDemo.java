import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

    private final String name;
    private final int age;
    private final double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " (age=" + age + ", height=" + height + ")";
    }
}

public class SortingStrategyDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, 165.0));
        people.add(new Person("Bob", 25, 180.0));
        people.add(new Person("Charlie", 35, 175.0));
        people.add(new Person("Diana", 28, 160.0));

        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorted by name: " + people);

        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted by age: " + people);

        people.sort(Comparator.comparingDouble(Person::getHeight));
        System.out.println("Sorted by height: " + people);

        people.sort(Comparator.comparing(Person::getName).reversed());
        System.out.println("Sorted by name (desc): " + people);
    }
}
