public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle bike = new Motorcycle("Harley-Davidson", "Street 750", 2021, false);

        System.out.println("=== Vehicles ===");
        car.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}
