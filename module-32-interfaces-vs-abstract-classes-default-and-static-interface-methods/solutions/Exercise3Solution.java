interface Shape {
    double area();

    default String description() {
        return "This is a shape";
    }

    static String unit() {
        return "square units";
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String description() {
        return "This is a circle";
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class Exercise3Solution {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);

        System.out.println(circle.description() + " with area " + circle.area() + " " + Shape.unit());
        System.out.println(square.description() + " with area " + square.area() + " " + Shape.unit());
    }
}
