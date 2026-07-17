public class GuardedPatternsDemo {

    static String classify(Object obj) {
        return switch (obj) {
            case String s when s.length() == 0          -> "Empty string";
            case String s when s.length() > 10          -> "Long string: " + s;
            case String s                              -> "Short string: " + s;
            case Integer i when i < 0                    -> "Negative: " + i;
            case Integer i when i == 0                   -> "Zero";
            case Integer i                              -> "Positive: " + i;
            case null                                   -> "null value";
            default                                     -> "Other: " + obj.getClass().getSimpleName();
        };
    }

    record Person(String name, int age) {}

    static String describePerson(Object obj) {
        return switch (obj) {
            case Person(String name, int age) when age >= 18 -> name + " (adult)";
            case Person(String name, int age)              -> name + " (minor)";
            case null                                      -> "null";
            default                                        -> "Not a person";
        };
    }

    public static void main(String[] args) {
        Object[] items = { "", "Hello", "A very long string indeed", -5, 0, 42, 3.14, null };

        for (Object o : items) {
            System.out.println(classify(o));
        }

        System.out.println();
        System.out.println(describePerson(new Person("Alice", 30)));
        System.out.println(describePerson(new Person("Bob", 15)));
        System.out.println(describePerson("not a person"));
    }
}
