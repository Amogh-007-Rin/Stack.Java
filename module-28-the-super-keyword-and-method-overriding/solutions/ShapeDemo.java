public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        ExRectangle rect = new ExRectangle(4.0, 7.0);

        System.out.println("=== Circle ===");
        circle.display();

        System.out.println("\n=== Rectangle ===");
        rect.display();
    }
}
