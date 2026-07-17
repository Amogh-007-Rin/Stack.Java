public class FinalVariableDemo {
    public static final int MAX_USERS = 1000;

    public static void main(String[] args) {
        final double taxRate = 0.08;
        final StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println(sb);
        System.out.println("Max users: " + MAX_USERS);
        System.out.println("Tax rate: " + taxRate);
    }
}
