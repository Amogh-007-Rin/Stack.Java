public class NarrowingCasting {
    public static void main(String[] args) {
        double d = 3.14159;
        int i = (int) d;                     // truncation: 3
        System.out.println("double " + d + " → int " + i);

        long big = 1_000_000_000_000L;
        int overflowed = (int) big;           // overflow
        System.out.println("long " + big + " → int " + overflowed);

        int large = 300;
        byte b = (byte) large;                // overflow: 300 - 256 = 44
        System.out.println("int " + large + " → byte " + b);

        float f = 9.99f;
        int truncated = (int) f;
        System.out.println("float " + f + " → int " + truncated);
    }
}
