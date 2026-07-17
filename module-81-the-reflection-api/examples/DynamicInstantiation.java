import java.lang.reflect.Constructor;

public class DynamicInstantiation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Person");

        Constructor<?> noArgCons = clazz.getDeclaredConstructor();
        Person p1 = (Person) noArgCons.newInstance();
        System.out.println("No-arg: " + p1.getName() + ", " + p1.getAge());

        Constructor<?> paramCons = clazz.getDeclaredConstructor(String.class, int.class);
        Person p2 = (Person) paramCons.newInstance("Eve", 22);
        System.out.println("Param:  " + p2.getName() + ", " + p2.getAge());
    }
}
