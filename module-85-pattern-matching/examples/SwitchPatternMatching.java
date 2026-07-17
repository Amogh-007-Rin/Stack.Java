sealed interface Vehicle permits Car, Bike, Truck {}
record Car(String model, int doors) implements Vehicle {}
record Bike(String type) implements Vehicle {}
record Truck(double cargoCapacity) implements Vehicle {}

public class SwitchPatternMatching {

    static String describe(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s  -> "String of length " + s.length();
            case null      -> "null value";
            default        -> "Unknown: " + obj.getClass().getSimpleName();
        };
    }

    static String describeVehicle(Vehicle v) {
        return switch (v) {
            case Car c    -> "Car: " + c.model() + " (" + c.doors() + " doors)";
            case Bike b   -> "Bike: " + b.type();
            case Truck t  -> "Truck: " + t.cargoCapacity() + "kg capacity";
        };
    }

    public static void main(String[] args) {
        System.out.println(describe("hello"));
        System.out.println(describe(42));
        System.out.println(describe(null));
        System.out.println(describe(3.14));

        System.out.println();
        System.out.println(describeVehicle(new Car("Tesla", 4)));
        System.out.println(describeVehicle(new Bike("Mountain")));
        System.out.println(describeVehicle(new Truck(5000)));
    }
}
