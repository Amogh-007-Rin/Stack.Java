public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        int n = 10;
        do {
            System.out.println("Will run once, even though " + n + " > 5");
        } while (n < 5);

        int attempts = 0;
        do {
            attempts++;
            System.out.println("Attempt " + attempts);
        } while (attempts < 3);
    }
}
