interface Greeting {
    void sayHello();
}

public class AnonymousInterfaceDemo {
    public static void main(String[] args) {
        Greeting english = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        };

        Greeting french = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Bonjour!");
            }
        };

        english.sayHello();
        french.sayHello();
    }
}
