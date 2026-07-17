public class ArrayDeclarationDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        int[] scores = {95, 87, 91, 78};

        String[] names = new String[]{"Alice", "Bob", "Charlie"};

        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("scores length: " + scores.length);
        System.out.println("names[0]: " + names[0]);
    }
}
