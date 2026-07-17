public class Exercise1 {
    public static void main(String[] args) {
        int number = -4;

        if (number > 0) {
            System.out.print(number + " is positive");
            if (number % 2 == 0) {
                System.out.println(" and even");
            } else {
                System.out.println(" and odd");
            }
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
    }
}
