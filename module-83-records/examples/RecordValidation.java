record Rectangle(double width, double height) {

    public Rectangle {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                "Width and height must be positive, got: " + width + ", " + height);
        }
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

public class RecordValidation {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        System.out.println(r1);
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());

        try {
            new Rectangle(-1, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation works: " + e.getMessage());
        }

        try {
            new Rectangle(0, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Zero rejected: " + e.getMessage());
        }
    }
}
