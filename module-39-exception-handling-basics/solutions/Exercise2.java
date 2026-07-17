public class Exercise2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};
        try {
            int index = Integer.parseInt(args[0]);
            System.out.println("Element at index " + index + ": " + fruits[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } finally {
            System.out.println("Operation complete.");
        }
    }
}
