import java.util.Arrays;
import java.util.List;

public class BuiltInAnnotationsDemo {

    @FunctionalInterface
    interface Greeter {
        String greet(String name);
    }

    @Deprecated
    static class OldClass {
        @Deprecated
        public void oldMethod() {
            System.out.println("This method is deprecated.");
        }
    }

    static class ChildClass extends OldClass {
        @Override
        public void oldMethod() {
            System.out.println("Overridden method.");
        }
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    static <T> List<T> asList(T... items) {
        return Arrays.asList(items);
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.oldMethod();

        Greeter greeter = name -> "Hello, " + name;
        System.out.println(greeter.greet("Alice"));

        List<String> list = asList("a", "b", "c");
        System.out.println("List: " + list);
    }
}
