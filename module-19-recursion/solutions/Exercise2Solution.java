public class Exercise2Solution {

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println("2^10 = " + power(2, 10));
        System.out.println("3^4 = " + power(3, 4));
        System.out.println("5^0 = " + power(5, 0));
    }
}
