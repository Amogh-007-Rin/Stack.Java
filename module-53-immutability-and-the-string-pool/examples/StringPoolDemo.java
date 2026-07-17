public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = s3.intern();

        System.out.println("s1 == s2: " + (s1 == s2));     // true (same pool reference)
        System.out.println("s1 == s3: " + (s1 == s3));     // false (heap vs pool)
        System.out.println("s1 == s4: " + (s1 == s4));     // true (interned to pool)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (content same)

        // Concatenation with literals is interned
        String s5 = "hel" + "lo";
        System.out.println("s1 == s5: " + (s1 == s5));     // true (compile-time constant)

        // Concatenation with variable is NOT interned
        String hel = "hel";
        String s6 = hel + "lo";
        System.out.println("s1 == s6: " + (s1 == s6));     // false (runtime, new object)
        System.out.println("s1 == s6.intern(): " + (s1 == s6.intern())); // true
    }
}
