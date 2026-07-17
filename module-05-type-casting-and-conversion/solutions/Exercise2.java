public class Exercise2 {
    public static void main(String[] args) {
        double a = 7.8;
        double b = -3.7;

        int truncA = (int) a;
        int roundA = (int) Math.round(a);
        System.out.println(a + " truncated: " + truncA + ", rounded: " + roundA);

        int truncB = (int) b;
        int roundB = (int) Math.round(b);
        System.out.println(b + " truncated: " + truncB + ", rounded: " + roundB);
    }
}
