public class Precedence {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;

        int result1 = a + b * c;     // 2 + 12 = 14
        int result2 = (a + b) * c;   // 5 * 4 = 20

        System.out.println("a + b * c     = " + result1 + "  (multiplication first)");
        System.out.println("(a + b) * c   = " + result2 + "  (parentheses override)");

        boolean flag = a > b && b < c || c == 4;
        boolean withParens = (a > b && b < c) || (c == 4);

        System.out.println("flag:      " + flag);
        System.out.println("withParens: " + withParens);
    }
}
