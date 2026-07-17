public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10.0;
        r1.width = 5.0;

        Rectangle r2 = new Rectangle();
        r2.length = 7.0;
        r2.width = 7.0;

        System.out.println("=== Rectangle 1 ===");
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is square? " + r1.isSquare());

        System.out.println("\n=== Rectangle 2 ===");
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Is square? " + r2.isSquare());
    }
}
