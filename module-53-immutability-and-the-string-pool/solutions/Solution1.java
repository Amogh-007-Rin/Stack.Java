public class Solution1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1 == s2: " + (s1 == s2) + " (same pool reference)");

        String s3 = new String("hello");
        System.out.println("s1 == s3: " + (s1 == s3) + " (heap vs pool)");

        String s4 = s3.intern();
        System.out.println("s1 == s4: " + (s1 == s4) + " (interned back to pool)");

        String s5 = "hel" + "lo";
        System.out.println("s1 == s5: " + (s1 == s5) + " (compile-time constant)");

        String hel = "hel";
        String s6 = hel + "lo";
        System.out.println("s1 == s6: " + (s1 == s6) + " (runtime concat, new object)");
    }
}
