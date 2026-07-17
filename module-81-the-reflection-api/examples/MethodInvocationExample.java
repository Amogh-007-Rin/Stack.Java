import java.lang.reflect.Method;

public class MethodInvocationExample {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Diana", 28);

        Method getName = p.getClass().getMethod("getName");
        String name = (String) getName.invoke(p);
        System.out.println("Invoked getName() -> " + name);

        Method getAge = p.getClass().getMethod("getAge");
        int age = (int) getAge.invoke(p);
        System.out.println("Invoked getAge() -> " + age);

        Method sayHello = p.getClass().getDeclaredMethod("sayHello");
        sayHello.setAccessible(true);
        sayHello.invoke(p);
    }
}
