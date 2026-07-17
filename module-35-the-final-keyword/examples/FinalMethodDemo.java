class Vehicle {
    public final void start() {
        System.out.println("Vehicle starting...");
    }

    public void move() {
        System.out.println("Vehicle moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car driving on road");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.move();
    }
}
