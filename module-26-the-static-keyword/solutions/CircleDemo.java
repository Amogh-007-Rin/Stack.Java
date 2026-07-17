public class CircleDemo {
    public static void main(String[] args) {
        double[] radii = {1.0, 5.0, 10.0};

        System.out.println("=== Circle Calculations ===");
        System.out.printf("%-10s %-10s %-15s %-15s%n", "Radius", "Diameter", "Circumference", "Area");
        System.out.println("----------------------------------------------------------");

        for (double r : radii) {
            double d = CircleCalculator.diameter(r);
            double c = CircleCalculator.circumference(r);
            double a = CircleCalculator.area(r);
            System.out.printf("%-10.1f %-10.1f %-15.2f %-15.2f%n", r, d, c, a);
        }
    }
}
