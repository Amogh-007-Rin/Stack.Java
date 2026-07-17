public class WrapperCacheDemo {
    public static void main(String[] args) {
        // Integer cache: -128 to 127
        Integer a = 127;
        Integer b = 127;
        System.out.println("127 == 127: " + (a == b));      // true (cached)

        Integer c = 128;
        Integer d = 128;
        System.out.println("128 == 128: " + (c == d));      // false

        // Always use .equals()
        System.out.println("128.equals(128): " + c.equals(d)); // true

        // Long cache
        Long x = 100L;
        Long y = 100L;
        System.out.println("100L == 100L: " + (x == y));     // true

        Long p = 200L;
        Long q = 200L;
        System.out.println("200L == 200L: " + (p == q));     // false

        // Boolean cache
        Boolean t1 = true;
        Boolean t2 = true;
        System.out.println("true == true: " + (t1 == t2));    // true
    }
}
