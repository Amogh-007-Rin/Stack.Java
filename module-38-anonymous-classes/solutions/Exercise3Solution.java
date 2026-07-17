abstract class Shape {
    public abstract double area();
}

public class Exercise3Solution {
    public static void main(String[] args) {
        Shape circle = new Shape() {
            private double radius = 5.0;

            @Override
            public double area() {
                return Math.PI * radius * radius;
            }
        };

        Shape rectangle = new Shape() {
            private double width = 4.0;
            private double height = 6.0;

            @Override
            public double area() {
                return width * height;
            }
        };

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
