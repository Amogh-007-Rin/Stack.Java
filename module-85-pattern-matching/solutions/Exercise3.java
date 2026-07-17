record Address(String city, String zip) {}
record Person(String name, Address address) {}

public class Exercise3 {

    static void printCity(Object obj) {
        if (obj instanceof Person(String name, Address(String city, String zip)) && zip.startsWith("10")) {
            System.out.println(name + " lives in " + city + " (zip " + zip + ")");
        } else if (obj instanceof Person(String name, Address addr)) {
            System.out.println(name + " lives elsewhere (zip " + addr.zip() + ")");
        }
    }

    public static void main(String[] args) {
        printCity(new Person("Alice", new Address("New York", "10001")));
        printCity(new Person("Bob", new Address("Los Angeles", "90001")));
        printCity(new Person("Charlie", new Address("Boston", "10101")));
    }
}
