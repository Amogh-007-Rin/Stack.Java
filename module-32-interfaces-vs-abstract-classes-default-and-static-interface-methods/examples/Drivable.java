interface Drivable {
    void drive();

    default void honk() {
        System.out.println("Honking horn!");
    }
}
