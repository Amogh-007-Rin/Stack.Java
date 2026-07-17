import java.lang.reflect.Method;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Secret", 42);

        Method sayHello = p.getClass().getDeclaredMethod("sayHello");
        sayHello.setAccessible(true);
        sayHello.invoke(p);
    }
}
