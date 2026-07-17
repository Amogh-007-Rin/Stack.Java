public class StringPoolEquals {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");
        String d = "JAVA";

        System.out.println("a == b:          " + (a == b));          // true (pool)
        System.out.println("a == c:          " + (a == c));          // false (new object)
        System.out.println("a.equals(c):     " + a.equals(c));       // true
        System.out.println("a.equals(d):     " + a.equals(d));       // false
        System.out.println("a.equalsIgnoreCase(d): " + a.equalsIgnoreCase(d)); // true

        String interned = c.intern();
        System.out.println("a == c.intern(): " + (a == interned));   // true
    }
}
