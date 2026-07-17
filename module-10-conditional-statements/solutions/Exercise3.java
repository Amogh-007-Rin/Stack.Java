public class Exercise3 {
    public static void main(String[] args) {
        int day = 3;

        String result = switch (day) {
            case 1 -> { yield "Monday (Weekday)"; }
            case 2 -> { yield "Tuesday (Weekday)"; }
            case 3 -> { yield "Wednesday (Weekday)"; }
            case 4 -> { yield "Thursday (Weekday)"; }
            case 5 -> { yield "Friday (Weekday)"; }
            case 6 -> { yield "Saturday (Weekend)"; }
            case 7 -> { yield "Sunday (Weekend)"; }
            default -> { yield "Invalid day"; }
        };

        System.out.println(result);
    }
}
