public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        try {
            int index = Integer.parseInt(args[0]);
            try {
                int divisor = Integer.parseInt(args[1]);
                int result = numbers[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner: Cannot divide by zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner: Missing divisor argument.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer: Index out of bounds or missing arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Outer: Invalid number format.");
        }
    }
}
