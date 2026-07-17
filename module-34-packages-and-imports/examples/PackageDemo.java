public class PackageDemo {
    public static void main(String[] args) {
        com.stackjava.math.Calculator calc = new com.stackjava.math.Calculator();
        System.out.println("Using fully qualified names:");
        System.out.println("100 + 50 = " + calc.add(100, 50));
        System.out.println("100 - 50 = " + calc.subtract(100, 50));
        System.out.println("100 * 50 = " + calc.multiply(100, 50));
        System.out.println("100 / 50 = " + calc.divide(100, 50));
    }
}
