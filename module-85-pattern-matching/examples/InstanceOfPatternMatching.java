record Point(int x, int y) {}

sealed interface Shape permits Circle, Rectangle {}
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}

public class InstanceOfPatternMatching {

    static double areaOldWay(Shape s) {
        if (s instanceof Circle) {
            Circle c = (Circle) s;
            return Math.PI * c.radius() * c.radius();
        } else if (s instanceof Rectangle) {
            Rectangle r = (Rectangle) s;
            return r.width() * r.height();
        }
        return 0;
    }

    static double areaNewWay(Shape s) {
        if (s instanceof Circle c) {
            return Math.PI * c.radius() * c.radius();
        } else if (s instanceof Rectangle r) {
            return r.width() * r.height();
        }
        return 0;
    }

    static void printLength(Object obj) {
        if (obj instanceof String s) {
            System.out.println("Length of \"" + s + "\": " + s.length());
        } else {
            System.out.println("Not a string: " + obj);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6) };
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName()
                + " area (old): " + areaOldWay(s)
                + ", (new): " + areaNewWay(s));
        }

        printLength("Hello, World!");
        printLength(42);
    }
}
