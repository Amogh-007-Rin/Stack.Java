class Circle {
    private final double PI = 3.14159;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }
}

public class Exercise1Solution {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
