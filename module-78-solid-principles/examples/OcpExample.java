import java.util.List;

class AreaCalculatorViolation {

    public double calculateArea(Object shape) {
        if (shape instanceof Circle c) {
            return Math.PI * c.radius() * c.radius();
        } else if (shape instanceof Rectangle r) {
            return r.width() * r.height();
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}

record Circle(double radius) implements Shape {
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

record Rectangle(double width, double height) implements Shape {
    @Override
    public double area() {
        return width * height;
    }
}

record Triangle(double base, double height) implements Shape {
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

interface Shape {
    double area();
}

class AreaCalculator {

    public double totalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}

public class OcpExample {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8)
        );

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total area: " + calculator.totalArea(shapes));

        Shape newShape = new Circle(10);
        System.out.println("New shape area: " + newShape.area());
    }
}
