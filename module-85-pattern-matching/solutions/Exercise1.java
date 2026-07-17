sealed interface Shape permits Circle, Rectangle, Triangle {}
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}
record Triangle(double base, double height) implements Shape {}

public class Exercise1 {

    static double area(Shape s) {
        if (s instanceof Circle c) {
            return Math.PI * c.radius() * c.radius();
        } else if (s instanceof Rectangle r) {
            return r.width() * r.height();
        } else if (s instanceof Triangle t) {
            return 0.5 * t.base() * t.height();
        }
        throw new IllegalArgumentException("Unknown shape");
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4)
        };

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area: " + area(s));
        }
    }
}
