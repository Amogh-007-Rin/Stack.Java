class Car extends Vehicle implements Drivable, UtilityInterface {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class InterfaceMethodsDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        car.displayInfo();
        car.start();
        car.drive();
        car.honk();

        car.logInfo("Engine started");
        car.logError("Low fuel");

        System.out.println("Is 5 positive? " + UtilityInterface.isPositive(5));
        System.out.println("Is -3 positive? " + UtilityInterface.isPositive(-3));
    }
}
