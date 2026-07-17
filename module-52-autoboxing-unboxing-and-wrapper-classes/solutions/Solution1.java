public class Solution1 {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        System.out.println("100 == 100: " + (a == b) + " (cached in -128..127)");

        Integer c = Integer.valueOf(200);
        Integer d = Integer.valueOf(200);
        System.out.println("200 == 200: " + (c == d) + " (NOT cached, different objects)");

        System.out.println("\nLesson: Use .equals() to compare wrapper objects!");
        System.out.println("200.equals(200): " + c.equals(d));
    }
}
