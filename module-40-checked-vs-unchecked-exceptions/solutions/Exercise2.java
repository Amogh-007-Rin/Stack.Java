public class Exercise2 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two numbers.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
