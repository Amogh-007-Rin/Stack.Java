public class Exercise2 {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(year + " is leap year: " + isLeap);
    }
}
