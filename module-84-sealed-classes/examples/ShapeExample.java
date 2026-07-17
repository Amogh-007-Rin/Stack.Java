sealed class Shape permits Circle, Rectangle, Triangle {
}

final class Circle extends Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }
    public double radius() { return radius; }
}

sealed class Rectangle extends Shape permits Square {
    private final double width, height;
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    public double width() { return width; }
    public double height() { return height; }
}

final class Square extends Rectangle {
    public Square(double side) { super(side, side); }
}

non-sealed class Triangle extends Shape {
    private final double base, height;
    public Triangle(double base, double height) { this.base = base; this.height = height; }
    public double base() { return base; }
    public double height() { return height; }
}

public class ShapeExample {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.0),
            new Rectangle(4.0, 6.0),
            new Square(3.0),
            new Triangle(4.0, 3.0)
        };

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " → " + describe(s));
        }
    }

    static String describe(Shape s) {
        if (s instanceof Circle c) {
            return "Circle with radius " + c.radius();
        } else if (s instanceof Rectangle r) {
            return "Rectangle " + r.width() + "×" + r.height();
        } else if (s instanceof Triangle t) {
            return "Triangle base=" + t.base() + " height=" + t.height();
        }
        return "Unknown shape";
    }
}
