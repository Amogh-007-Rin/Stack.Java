class Vehicle {
    public final void start() {
        System.out.println("Vehicle starting...");
    }

    public void describe() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a car");
    }
}

public class Exercise2Solution {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.describe();
    }
}
