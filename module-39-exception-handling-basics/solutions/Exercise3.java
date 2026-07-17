public class Exercise3 {
    public static void main(String[] args) {
        int value;
        try {
            value = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, using default value: 0");
            value = 0;
        } finally {
            System.out.println("Parsing attempt finished.");
        }
        System.out.println("Value: " + value);
    }
}
