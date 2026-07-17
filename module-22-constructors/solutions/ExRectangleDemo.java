public class ExRectangleDemo {
    public static void main(String[] args) {
        ExRectangle r1 = new ExRectangle();
        System.out.println("=== No-Arg Constructor (default 1x1) ===");
        r1.display();

        ExRectangle r2 = new ExRectangle(5.0);
        System.out.println("\n=== Square (side=5) ===");
        r2.display();

        ExRectangle r3 = new ExRectangle(10.0, 4.0);
        System.out.println("\n=== Rectangle (10x4) ===");
        r3.display();
    }
}
