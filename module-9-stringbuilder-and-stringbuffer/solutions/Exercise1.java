public class Exercise1 {
    public static void main(String[] args) {
        String original = "StringBuilder";

        StringBuilder manual = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            manual.append(original.charAt(i));
        }
        System.out.println("Manual reverse: " + manual);

        StringBuilder builtin = new StringBuilder(original);
        builtin.reverse();
        System.out.println("Built-in reverse: " + builtin);
    }
}
