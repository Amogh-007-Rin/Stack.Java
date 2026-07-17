public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        // Traditional switch with break
        switch (day) {
            case 1: dayName = "Monday";    break;
            case 2: dayName = "Tuesday";   break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday";  break;
            case 5: dayName = "Friday";    break;
            case 6: dayName = "Saturday";  break;
            case 7: dayName = "Sunday";    break;
            default: dayName = "Invalid";
        }
        System.out.println("Traditional: " + dayName);

        // Modern switch expression (Java 14+)
        String modern = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend!";
            default -> "Invalid";
        };
        System.out.println("Modern: " + modern);
    }
}
