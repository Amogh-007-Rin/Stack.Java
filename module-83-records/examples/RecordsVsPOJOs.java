import java.util.Objects;

class PersonPOJO {
    private String name;
    private int age;

    public PersonPOJO() {}

    public PersonPOJO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonPOJO that = (PersonPOJO) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonPOJO{name='" + name + "', age=" + age + "}";
    }
}

record PersonRecord(String name, int age) {}

public class RecordsVsPOJOs {
    public static void main(String[] args) {
        PersonPOJO p1 = new PersonPOJO("Alice", 30);
        PersonRecord r1 = new PersonRecord("Alice", 30);

        System.out.println("POJO:   " + p1);
        System.out.println("Record: " + r1);

        System.out.println("POJO getter: " + p1.getName());
        System.out.println("Record accessor: " + r1.name());

        p1.setName("Bob");
        System.out.println("POJO after setName: " + p1);
    }
}
