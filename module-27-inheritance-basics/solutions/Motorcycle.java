class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        String sidecar = hasSidecar ? "with sidecar" : "no sidecar";
        System.out.println("  Type: Motorcycle, " + sidecar);
    }
}
