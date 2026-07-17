interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape createShape(String type) {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Unknown shape type: " + type);
        };
    }
}

public class SimpleFactory {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        Shape square = ShapeFactory.createShape("square");
        Shape rectangle = ShapeFactory.createShape("rectangle");

        circle.draw();
        square.draw();
        rectangle.draw();

        System.out.println("All shapes created via SimpleFactory.");
    }
}
