public class MagicNumbersDemo {

    // BAD: magic numbers everywhere
    static double calculateBad(double amount) {
        return amount * 0.08 + 5.0;
    }

    // GOOD: named constants
    static final double TAX_RATE = 0.08;
    static final double SHIPPING_FLAT_FEE = 5.0;

    static double calculateGood(double amount) {
        return amount * TAX_RATE + SHIPPING_FLAT_FEE;
    }

    // BAD: another magic number
    static String greetBad(int hour) {
        if (hour < 12) return "Good morning";
        else if (hour < 18) return "Good afternoon";
        else return "Good evening";
    }

    // GOOD: named constants
    static final int NOON = 12;
    static final int EVENING = 18;

    static String greetGood(int hour) {
        if (hour < NOON) return "Good morning";
        else if (hour < EVENING) return "Good afternoon";
        else return "Good evening";
    }

    public static void main(String[] args) {
        System.out.println("Bad  : $" + calculateBad(100.0));
        System.out.println("Good : $" + calculateGood(100.0));

        System.out.println(greetGood(10));
        System.out.println(greetGood(14));
        System.out.println(greetGood(20));
    }
}
