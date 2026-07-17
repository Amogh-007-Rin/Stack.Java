public class Exercise3 {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;
        int years = 10;
        long periodsPerYear = 12L;

        double amount = principal * Math.pow(1 + rate / periodsPerYear, periodsPerYear * years);
        System.out.printf("Amount after %d years: $%.2f%n", years, amount);
    }
}
