record Rectangle(double width, double height) {

    public Rectangle {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                "Width and height must be positive: " + width + ", " + height);
        }
    }

    public double area() {
        return width * height;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4.0, 5.0);
        System.out.println(r + " area = " + r.area());

        try {
            new Rectangle(-1, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation: " + e.getMessage());
        }
    }
}
