public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        int[] data = {2, 4, 6, 8, 10};
        int idx = 0;
        int sum = 0;
        while (idx < data.length) {
            sum += data[idx];
            idx++;
        }
        System.out.println("Sum of array: " + sum);

        int value = 0;
        while (true) {
            value++;
            if (value == 5) {
                break;
            }
        }
        System.out.println("Broke out at value = " + value);
    }
}
