import java.lang.reflect.Field;

public class FieldAccessExample {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Bob", 25);
        System.out.println("Before: " + p.getName() + ", " + p.getAge());

        Class<?> clazz = p.getClass();
        Field nameField = clazz.getDeclaredField("name");
        Field ageField = clazz.getDeclaredField("age");

        nameField.setAccessible(true);
        ageField.setAccessible(true);

        System.out.println("  name = " + nameField.get(p));
        System.out.println("  age  = " + ageField.get(p));

        nameField.set(p, "Charlie");
        ageField.set(p, 35);

        System.out.println("After:  " + p.getName() + ", " + p.getAge());
    }
}
