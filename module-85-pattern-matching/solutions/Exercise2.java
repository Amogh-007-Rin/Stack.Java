public class Exercise2 {

    static String describe(Object obj) {
        return switch (obj) {
            case Integer i when i % 2 == 0 -> "even";
            case Integer i when i % 2 != 0 -> "odd";
            case String s when s.isEmpty() -> "empty";
            case String s when s.length() < 5 -> "short";
            case String s -> "long";
            case null -> "null";
            default -> "unknown";
        };
    }

    public static void main(String[] args) {
        Object[] items = { 42, 13, "", "hi", "hello world", 3.14, null };
        for (Object o : items) {
            System.out.println(o + " -> " + describe(o));
        }
    }
}
