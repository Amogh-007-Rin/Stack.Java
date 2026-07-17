public class Exercise2 {
    public static void main(String[] args) {
        String[] items = {"apple", "banana", "cherry", "date"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            sb.append(items[i]);
            if (i < items.length - 1) {
                sb.append(",");
            }
        }

        System.out.println("CSV: " + sb.toString());
    }
}
