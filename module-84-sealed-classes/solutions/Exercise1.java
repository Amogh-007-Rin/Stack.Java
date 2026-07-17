sealed class Vehicle permits Car, Truck, Motorcycle {
}

final class Car extends Vehicle {
    private final int doors;
    public Car(int doors) { this.doors = doors; }
    public int doors() { return doors; }
}

sealed class Truck extends Vehicle permits PickupTruck {
    private final double cargoCapacity;
    public Truck(double cargoCapacity) { this.cargoCapacity = cargoCapacity; }
    public double cargoCapacity() { return cargoCapacity; }
}

final class PickupTruck extends Truck {
    public PickupTruck(double cargoCapacity) { super(cargoCapacity); }
}

non-sealed class Motorcycle extends Vehicle {
    private final int engineCC;
    public Motorcycle(int engineCC) { this.engineCC = engineCC; }
    public int engineCC() { return engineCC; }
}

public class Exercise1 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(4),
            new Truck(2000),
            new PickupTruck(1500),
            new Motorcycle(600)
        };

        for (Vehicle v : vehicles) {
            System.out.println(v.getClass().getSimpleName() + " created");
        }
    }
}
