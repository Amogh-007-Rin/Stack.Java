public class Exercise1 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
