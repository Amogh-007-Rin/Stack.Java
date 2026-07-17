import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // Current date/time
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Today: " + today);
        System.out.println("Time now: " + now);
        System.out.println("Current: " + current);

        // Specific date
        LocalDate independenceDay = LocalDate.of(1776, Month.JULY, 4);
        System.out.println("Independence Day: " + independenceDay);

        // Specific time
        LocalTime lunchTime = LocalTime.of(12, 30, 0);
        System.out.println("Lunch: " + lunchTime);

        // Specific date-time
        LocalDateTime meeting = LocalDateTime.of(2025, 3, 15, 14, 30);
        System.out.println("Meeting: " + meeting);

        // Manipulation (returns new instances)
        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Next week: " + nextWeek);

        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Last month: " + lastMonth);

        LocalTime inTwoHours = now.plusHours(2);
        System.out.println("In 2 hours: " + inTwoHours);

        // Getting components
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day of week: " + today.getDayOfWeek());
        System.out.println("Day of year: " + today.getDayOfYear());

        // Comparing
        LocalDate earlier = LocalDate.of(2025, 1, 1);
        LocalDate later = LocalDate.of(2025, 12, 31);
        System.out.println("earlier before later: " + earlier.isBefore(later));
        System.out.println("later after earlier: " + later.isAfter(earlier));
    }
}
