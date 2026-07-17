public class Exercise2Solution {

    static String createGreeting(String name, String greeting) {
        if (greeting == null) {
            greeting = "Hello";
        }
        return greeting.toUpperCase() + ", " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(createGreeting("Alice", null));
        System.out.println(createGreeting("Bob", "Hello"));
    }
}
