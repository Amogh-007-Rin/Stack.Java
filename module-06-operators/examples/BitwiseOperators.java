public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 0b1100;  // 12
        int y = 0b1010;  // 10

        System.out.println("x     = " + Integer.toBinaryString(x));
        System.out.println("y     = " + Integer.toBinaryString(y));
        System.out.println("x & y = " + Integer.toBinaryString(x & y));   // 1000
        System.out.println("x | y = " + Integer.toBinaryString(x | y));   // 1110
        System.out.println("x ^ y = " + Integer.toBinaryString(x ^ y));   // 0110
        System.out.println("~x    = " + Integer.toBinaryString(~x));

        int value = 8;  // 1000
        System.out.println("\nShift:");
        System.out.println(value + " << 2 = " + (value << 2) + " (" + Integer.toBinaryString(value << 2) + ")");
        System.out.println(value + " >> 2 = " + (value >> 2) + " (" + Integer.toBinaryString(value >> 2) + ")");

        int neg = -8;
        System.out.println(neg + " >>> 2 = " + (neg >>> 2) + " (unsigned right shift)");
    }
}
