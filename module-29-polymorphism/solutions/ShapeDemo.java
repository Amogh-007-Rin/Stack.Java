public class ShapeDemo {
    public static void main(String[] args) {
        ExShape[] shapes = {
            new ExCircle(5.0),
            new ExRectangle(4.0, 7.0),
            new Triangle(6.0, 3.0),
            new ExCircle(2.5),
            new ExRectangle(10.0, 2.0)
        };

        double totalArea = 0;
        System.out.println("=== Shape Areas ===");
        for (ExShape s : shapes) {
            double area = s.getArea();
            totalArea += area;
            System.out.println(s.getClass().getSimpleName() + " area: " + area);
        }

        System.out.println("\nTotal area: " + totalArea);
    }
}
