interface GreetingService {
    void greet(String name);
}

public class Exercise1Solution {
    public static void main(String[] args) {
        GreetingService hello = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hello, " + name + "!");
            }
        };

        GreetingService goodbye = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Goodbye, " + name + "!");
            }
        };

        hello.greet("Alice");
        goodbye.greet("Bob");
    }
}
