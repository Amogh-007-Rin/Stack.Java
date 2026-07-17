public class Exercise1Solution {

    private static final double ANNUAL_INTEREST_RATE = 0.05;
    private static final int MONTHS_PER_YEAR = 12;

    public static double calculateCompoundInterest(double principal, int years) {
        double monthlyRate = ANNUAL_INTEREST_RATE / MONTHS_PER_YEAR;
        int totalMonths = years * MONTHS_PER_YEAR;
        double futureValue = principal * Math.pow(1 + monthlyRate, totalMonths);
        return futureValue - principal;
    }

    public static void main(String[] args) {
        double result = calculateCompoundInterest(10000, 5);
        System.out.printf("Compound interest on $10,000 over 5 years: $%.2f%n", result);
    }
}
