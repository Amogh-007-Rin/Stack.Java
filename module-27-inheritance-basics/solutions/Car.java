class Car extends Vehicle {
    int doors;

    Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("  Type: Car, Doors: " + doors);
    }
}
